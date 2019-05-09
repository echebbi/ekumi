package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.core.workflow.State.CANCELLED;
import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.State.SKIPPED;
import static fr.kazejiyu.ekumi.core.workflow.State.SUCCEEDED;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Sequence;
import fr.kazejiyu.ekumi.tests.common.fake.activities.BrokenActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Do;
import fr.kazejiyu.ekumi.tests.common.fake.activities.FakeActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.HopelessActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.SetNameInList;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

/**
 * Tests the behaviour of {@link Sequence} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicSequence")
public class BasicSequenceTest implements WithAssertions {
	
	@Mock
	private Context context;
	
	@Mock 
	private ExecutionState status;
	
	@BeforeEach
	void initContext(@Mock Events events) {
		when (context.events()) .thenReturn(events);
		when (context.execution()) .thenReturn(status);
		when (status.isCancelled()) .thenReturn(false);
	}
	
	@Nested @DisplayName("when empty")
	class Empty {
		private Sequence empty;
		
		@BeforeEach
		void initialize(@Mock ExecutionState status) {
			empty = new BasicSequence("id", "name");
		}
		
		// getActivities()
		
		@Test @DisplayName("has no activity")
		void has_no_activity() {
			assertThat(empty.activities()).isEmpty();
		}
		
		@Test @DisplayName("has a size of 0")
		void has_a_size_of_0() {
			assertThat(empty.size()).isEqualTo(0);
		}
		
		// run()
		
		@Test @DisplayName("has 'succeeded' status after run")
		void has_succeeded_status_after_run() {
			empty.run(context);
			assertThat(empty.state()).isEqualTo(SUCCEEDED);
		}
	}
	
	@Nested @DisplayName("when not empty")
	class NonEmpty {
		
		private Sequence seq;
		private List<SetNameInList> activities;
		private List<String> names;
		
		@BeforeEach
		void initialize() {
			names = new ArrayList<>();
			
			SetNameInList setA = new SetNameInList("A", names);
			SetNameInList setB = new SetNameInList("B", names);
			SetNameInList setC = new SetNameInList("C", names);
			activities = Arrays.asList(setA, setB, setC);
			
			seq = new BasicSequence("id", "name", setA);
			setA.precede(setB);
			setB.precede(setC);
		}
		
		// size()
		
		@Test @DisplayName("has the expected size")
		void has_the_expected_size() {
			assertThat(seq.size()).isEqualTo(3);
		}
		
		// getActivities()
		
		@Test @DisplayName("provides its activities in order")
		void provides_its_activities_in_order() {
			assertThat(seq.activities()).containsExactlyElementsOf(activities);
		}
		
		// run()
		
		@Test @DisplayName("executes all its tasks")
		void execute_all_its_tasks() {
			seq.run(context);
			assertThat(seq.activities()).allMatch(activity -> ((SetNameInList) activity).hasRun());
		}
		
		@Test @DisplayName("executes all its tasks in order")
		void execute_all_its_tasks_in_order() {
			seq.run(context);
			assertThat(names).containsExactly("A", "B", "C");
		}
		
		@Test @DisplayName("provides the right context to its tasks")
		void provides_the_right_context_to_its_tasks() {
			seq.run(context);
			
			SoftAssertions softly = new SoftAssertions();
			
			for (SetNameInList activity : activities)
				softly.assertThat(activity.getContextOnRun()).isSameAs(context);
			
			softly.assertAll();
		}
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			seq.run(context);
			assertThat(seq.state()).isEqualTo(SUCCEEDED);
		}
	
		@Disabled
		@Test @DisplayName("updates the inputs of a task before running it") 
		void update_the_inputs_of_a_task_before_running_it() {
			assertThat(true).isFalse();
		}
		
		@Nested @DisplayName("when the execution is cancelled")
		class WhenTheExecutionIsCancelled {
			
			@BeforeEach
			void cancelExecution() {
				when (status.isCancelled()) .thenReturn(true);
			}
			
			@Test @DisplayName("does not execute all its tasks")
			void does_not_execute_all_its_tasks() {
				seq.run(context);
				assertThat(seq.activities()).anyMatch(activity -> ! ((SetNameInList) activity).hasRun());
			}
			
			@Test @DisplayName("has the cancelled status")
			void has_the_cancel_status() {
				seq.run(context);
				assertThat(seq.state()).isEqualTo(CANCELLED);
			}
			
		}
	}
	
	@Nested @DisplayName("when containing an activity that throws")
	class WhenContainingABrokenActivity {

		private Sequence corrupted;
		private List<String> activities;
		
		@BeforeEach
		void initialize() {
			activities = new ArrayList<>();
			
			Activity setA = new SetNameInList("A", activities);
			Activity setB = new SetNameInList("B", activities);
			Activity broken = new BrokenActivity();
			Activity setC = new SetNameInList("C", activities);

			corrupted = new BasicSequence("id", "name", setA);
			
			// setA -> setB -> broken -> setC
			setA.precede(setB);
			setB.precede(broken);
			broken.precede(setC);
		}
		
		@Test @DisplayName("does not throw when run")
		void do_not_throw_when_run() {
			assertThatCode(() -> corrupted.run(context)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.state()).isEqualTo(FAILED);
		}
		
		@Test @DisplayName("stops its execution when an activity fails")
		void stops_its_execution_when_an_activity_fails() {
			corrupted.run(context);
			assertThat(activities).containsExactly("A", "B");
		}
	}
	
	@Nested @DisplayName("when containing an activity that fails")
	class WhenContainingAnHopelessActivity {

		private Sequence corrupted;
		private List<String> activities;
		
		@BeforeEach
		void initialize() {
			activities = new ArrayList<>();
			
			Activity setA = new SetNameInList("A", activities);
			Activity setB = new SetNameInList("B", activities);
			Activity broken = new HopelessActivity();
			Activity setC = new SetNameInList("C", activities);

			// setA -> setB -> broken -> setC
			setA.precede(setB);
			setB.precede(broken);
			broken.precede(setC);
			corrupted = new BasicSequence("id", "name", setA);
		}
		
		@Test @DisplayName("does not throw when run")
		void does_not_throw_when_run() {
			assertThatCode(() -> corrupted.run(context)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.state()).isEqualTo(FAILED);
		}
		
		@Test @DisplayName("stops its execution when an activity fails")
		void stop_its_execution_when_an_activity_fails() {
			corrupted.run(context);
			assertThat(activities).containsExactly("A", "B");
		}
	}
	
	@Nested @DisplayName("when cancelled")
	class WhenCancelled {
		
		private Sequence seq;
		private List<FakeActivity> skippedActivities;
		
		@BeforeEach
		void createSequence() {
			Activity cancelExecution = new Do(() -> when (status.isCancelled()) .thenReturn(true));
			FakeActivity dumb1 = new FakeActivity();
			FakeActivity dumb2 = new FakeActivity();
			FakeActivity dumb3 = new FakeActivity();
			skippedActivities = asList(dumb2, dumb3);
			
			// dumb1 -> cancelExecution -> dumb2 -> dumb3
			dumb1.precede(cancelExecution);
			cancelExecution.precede(dumb2);
			dumb2.precede(dumb3);
			
			seq = new BasicSequence("id", "name", cancelExecution);
		}
		
		@Test @DisplayName("does not execute remaining activities")
		void does_not_execute_remaining_activities() {
			seq.run(context);
			assertThat(skippedActivities).noneMatch(FakeActivity::hasBeenRun);
		}
		
		@Test @DisplayName("tags remaining activies as skipped")
		void tags_remaining_activities_as_skipped() {
			seq.run(context);
			assertThat(skippedActivities).as("have 'skipped' status")
										 .allMatch(a -> a.state() == SKIPPED);
		}
		
	}
	
	@Nested @DisplayName("when traversed")
	class WhenTraversed {
		
		private BasicSequence seq;
		private ListIterator<Activity> iterator;
		private ImmutableList<Activity> activities;
		
		@BeforeEach
		void createSequence() {
			FakeActivity dumb1 = new FakeActivity();
			FakeActivity dumb2 = new FakeActivity();
			FakeActivity dumb3 = new FakeActivity();
			
			activities = Lists.immutable.of(dumb1, dumb2, dumb3);
			
			// dumb1 -> dumb2 -> dumb3
			dumb3.succeed(dumb2);
			dumb2.succeed(dumb1);
			
			seq = new BasicSequence("id", "name", dumb1);
			iterator = seq.iterator();
		}
		
		@Test @DisplayName("returns all its activities in order")
		void returns_all_its_activities_in_order() {
			for (Activity activity : activities) {
				assertThat(iterator.next()).isSameAs(activity);
			}
		}
		
		@Test @DisplayName("knows when activities remain")
		void knows_when_activities_remain() {
			SoftAssertions softly = new SoftAssertions();
			
			for (int i = 0; i < activities.size(); i++) {
				boolean isLastElement = (i == activities.size() - 1);
				iterator.next();
				
				if (isLastElement) {
					softly.assertThat(iterator).isExhausted();
				}
				else {
					softly.assertThat(iterator.hasNext());
				}
			}
			softly.assertAll();
		}
		
		@Test @DisplayName("knows the index of the next activity")
		void knows_the_index_of_the_next_activity() {
			SoftAssertions softly = new SoftAssertions();
			
			for (int i = 0; i < activities.size(); i++) {
				softly.assertThat(iterator.nextIndex()).isEqualTo(i);
				iterator.next();
			}
			softly.assertAll();
		}
		
		@Test @DisplayName("throws when asked for the next activity although no one remains")
		void throws_when_asked_for_the_next_activity_although_no_one_remains() {
			while (iterator.hasNext()) {
				iterator.next();
			}
			assertThrows(NoSuchElementException.class, iterator::next);
		}
		
		@Test @DisplayName("knows when activities have been browsed")
		void knows_when_activities_have_been_browsed() {
			SoftAssertions softly = new SoftAssertions();
			
			for (int i = 0; i < activities.size(); i++) {
				boolean isFirstElement = (i == 0);
				
				if (isFirstElement) {
					softly.assertThat(iterator.hasPrevious()).isFalse();
				}
				else {
					softly.assertThat(iterator.hasPrevious()).isTrue();
				}
				iterator.next();
			}
			softly.assertAll();
		}
		
		@Test @DisplayName("can be browsed from the end")
		void can_be_browsed_from_the_end() {
			while (iterator.hasNext()) {
				iterator.next();
			}
			for (Activity activity : activities.toReversed()) {
				assertThat(iterator.previous()).isSameAs(activity);
			}
		}
		
		@Test @DisplayName("knows the index of the previous activity")
		void knows_the_index_of_the_previous_activity() {
			SoftAssertions softly = new SoftAssertions();
			
			for (int i = 0; i < activities.size(); i++) {
				iterator.next();
				softly.assertThat(iterator.previousIndex()).isEqualTo(i);
			}
			softly.assertAll();
		}
		
		@Test @DisplayName("throws when asked for the previous activity altough no one has been browsed")
		void throws_when_asked_for_the_previous_activity_altough_no_one_has_been_browsed() {
			assertThrows(NoSuchElementException.class, iterator::previous);
		}
		
		@Test @DisplayName("does not support removal yet")
		void does_not_support_removal_yet() {
			assertThrows(UnsupportedOperationException.class, iterator::remove);
		}
		
		@Test @DisplayName("does not support set yet")
		void does_not_support_set_yet() {
			assertThrows(UnsupportedOperationException.class, () -> iterator.set(null));
		}
		
		@Test @DisplayName("does not support addition yet")
		void does_not_support_addition_yet() {
			assertThrows(UnsupportedOperationException.class, () -> iterator.add(null));
		}
	}

}
