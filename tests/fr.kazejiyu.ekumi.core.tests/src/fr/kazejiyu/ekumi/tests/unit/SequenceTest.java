package fr.kazejiyu.ekumi.tests.unit;

import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.Sequence;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;
import fr.kazejiyu.ekumi.tests.mocks.BrokenActivity;
import fr.kazejiyu.ekumi.tests.mocks.HopelessActivity;
import fr.kazejiyu.ekumi.tests.mocks.SetNameInList;

/**
 * Tests the behaviour of {@link Sequence} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("A Sequence")
public class SequenceTest {
	
	@Mock
	private Context context;
	
	@Nested
	@DisplayName("when empty")
	class Empty {
		private Sequence empty;
		
		@BeforeEach
		void initialize() {
			empty = EkumiFactory.eINSTANCE.createSequence();
		}
		
		// getActivities()
		
		@Test @DisplayName("has no activity")
		void has_no_activity() {
			assertThat(empty.getActivities()).isEmpty();
		}
		
		// isSetActivities()
		
		@Test @DisplayName("has its activites set")
		void has_its_activities_set() {
			assertThat(empty.isSetActivities()).isTrue();
		}
		
		// run()
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			empty.run(context);
			assertThat(empty.getStatus()).isEqualTo(SUCCEEDED);
		}
	}
	
	@Nested
	@DisplayName("when not empty")
	class NonEmpty {
		
		private Sequence seq;
		private List<SetNameInList> activities;
		private List<String> names;
		
		@BeforeEach
		void initialize() {
			names = new ArrayList<String>();
			
			seq = EkumiFactory.eINSTANCE.createSequence();
			activities = new ArrayList<>();
			
			activities.add(new SetNameInList("A", names));
			activities.add(new SetNameInList("B", names));
			activities.add(new SetNameInList("C", names));
			
			seq.setRoot(activities.get(0));
			seq.getRoot().setSuccessor(activities.get(1));
			seq.getRoot().getSuccessor().setSuccessor(activities.get(2));
		}
		
		// isSetActivities()
		
		@Test @DisplayName("has its activites set")
		void has_its_activities_set() {
			assertThat(seq.isSetActivities()).isTrue();
		}
		
		// getActivities()
		
		@Test @DisplayName("provides its activities in order")
		void provides_its_activities_in_order() {
			assertThat(seq.getActivities()).containsExactlyElementsOf(activities);
		}
		
		// run()
		
		@Test @DisplayName("executes all its tasks")
		void execute_all_its_tasks() {
			seq.run(context);
			assertThat(seq.getActivities()).allMatch(activity -> ((SetNameInList) activity).hasRun());
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
			assertThat(seq.getStatus()).isEqualTo(SUCCEEDED);
		}
	
		@Disabled
		@Test @DisplayName("updates the inputs of a task before running it") 
		void update_the_inputs_of_a_task_before_running_it() {
			seq.run(context);
		}
	}
	
	@Nested
	@DisplayName("when containing an activity that throws")
	class WhenContainingABrokenActivity {

		private Sequence corrupted;
		private List<String> activities;
		
		@BeforeEach
		void initialize() {
			activities = new ArrayList<String>();
			
			corrupted = EkumiFactory.eINSTANCE.createSequence();
			corrupted.setRoot(new SetNameInList("A", activities));
			corrupted.getRoot().setSuccessor(new SetNameInList("B", activities));
			corrupted.getRoot().getSuccessor().setSuccessor(new BrokenActivity());
			corrupted.getRoot().getSuccessor().getSuccessor().setSuccessor(new SetNameInList("C", activities));
		}
		
		@Test @DisplayName("does not throw when run")
		void do_not_throw_when_run() {
			corrupted.run(context);
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
		
		@Test @DisplayName("stops its execution when an activity fails")
		void stop_its_execution_when_an_activity_fails() {
			corrupted.run(context);
			assertThat(activities).containsExactly("A", "B");
		}
	}
	
	@Nested
	@DisplayName("when containing an activity that fails")
	class WhenContainingAnHopelessActivity {

		private Sequence corrupted;
		private List<String> activities;
		
		@BeforeEach
		void initialize() {
			activities = new ArrayList<String>();
			
			corrupted = EkumiFactory.eINSTANCE.createSequence();
			corrupted.setRoot(new SetNameInList("A", activities));
			corrupted.getRoot().setSuccessor(new SetNameInList("B", activities));
			corrupted.getRoot().getSuccessor().setSuccessor(new HopelessActivity());
			corrupted.getRoot().getSuccessor().getSuccessor().setSuccessor(new SetNameInList("C", activities));
		}
		
		@Test @DisplayName("does not throw when run")
		void do_not_throw_when_run() {
			corrupted.run(context);
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
		
		@Test @DisplayName("stops its execution when an activity fails")
		void stop_its_execution_when_an_activity_fails() {
			corrupted.run(context);
			assertThat(activities).containsExactly("A", "B");
		}
	}

}
