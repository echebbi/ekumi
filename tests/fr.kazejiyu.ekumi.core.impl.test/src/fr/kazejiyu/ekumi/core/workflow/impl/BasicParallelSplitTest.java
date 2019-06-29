package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.core.workflow.State.CANCELLED;
import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.State.SKIPPED;
import static fr.kazejiyu.ekumi.core.workflow.State.SUCCEEDED;
import static java.util.stream.Collectors.toList;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
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
import fr.kazejiyu.ekumi.tests.common.fake.activities.BrokenActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.CheckExecutingThread;
import fr.kazejiyu.ekumi.tests.common.fake.activities.HopelessActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.SetNameInList;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

/**
 * Tests the behaviour of {@link BasicParallelSplit} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("A Basic Parallel Split")
public class BasicParallelSplitTest implements WithAssertions {
	
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
		private BasicParallelSplit empty;
		
		@BeforeEach
		void initialize(@Mock ExecutionState status) {
			empty = new BasicParallelSplit("id", "name'");
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
		
		private static final int NBR_BRANCHES = 3;
		
		private BasicParallelSplit split;
		private List<CheckExecutingThread> branches;
		
		@BeforeEach
		void initialize() {
			branches = new ArrayList<>();
			for (int i = 0 ; i < NBR_BRANCHES ; ++i) { 
				branches.add(new CheckExecutingThread());
			}
			split = new BasicParallelSplit("id", "name", branches);
		}
		
		// run()
		
		@Test @DisplayName("executes all its tasks")
		void execute_all_its_tasks() {
			split.run(context);
			assertThat(branches).allMatch(CheckExecutingThread::hasRun);
		}
		
		@Test @DisplayName("executes all its tasks in different threads")
		void execute_all_its_tasks_in_different_threads() {
			split.run(context);
			
			List<Thread> distinctExecutingThreads = branches.stream()
														    .map(CheckExecutingThread.class::cast)
														    .map(activity -> activity.getExecutingThread())
														    .distinct()
														    .collect(toList());
			
			List<Thread> allExecutingThreads = branches.stream()
													   .map(CheckExecutingThread.class::cast)
													   .map(activity -> activity.getExecutingThread())
													   .distinct()
													   .collect(toList());
			
			assertThat(allExecutingThreads).containsExactlyInAnyOrderElementsOf(distinctExecutingThreads);
		}
		
		@Test @DisplayName("provides the right context to its tasks")
		void provides_the_right_context_to_its_tasks() {
			split.run(context);
			
			SoftAssertions softly = new SoftAssertions();
			
			for (CheckExecutingThread branch : branches) {
				softly.assertThat(branch.getContextOnRun()).isSameAs(context);
			}
			softly.assertAll();
		}
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			split.run(context);
			assertThat(split.state()).isEqualTo(SUCCEEDED);
		}
	
		@Disabled
		@Test @DisplayName("updates the inputs of a task before running it") 
		void update_the_inputs_of_a_task_before_running_it() {
			
		}
		
		@Nested @DisplayName("when the execution is cancelled")
		class WhenTheExecutionIsCancelled {
			
			@BeforeEach
			void cancelExecution() {
				when (status.isCancelled()) .thenReturn(true);
			}
			
			@Test @DisplayName("does not execute its tasks")
			void does_not_execute_its_tasks() {
				split.run(context);
				assertThat(branches).noneMatch(CheckExecutingThread::hasRun);
			}
			
			@Test @DisplayName("tag its tasks as skipped")
			void tag_its_tasks_as_skipped() {
				split.run(context);
				assertThat(branches).allMatch(b -> b.state() == SKIPPED);
			}
			
			@Test @DisplayName("has the cancelled status")
			void has_the_cancel_status() {
				split.run(context);
				assertThat(split.state()).isEqualTo(CANCELLED);
			}
			
		}
	}
	
	@Nested @DisplayName("when containing an activity that throws")
	class WhenContainingAnActivityThatThrows {

		private BasicParallelSplit corrupted;
		private List<String> activities;
		
		@BeforeEach
		void initialize() {
			activities = new CopyOnWriteArrayList<>();
			
			List<Activity> roots = new ArrayList<>();
			roots.add(new SetNameInList("A", activities));
			roots.add(new SetNameInList("B", activities));
			roots.add(new BrokenActivity());
			roots.add(new SetNameInList("C", activities));
			
			corrupted = new BasicParallelSplit("id", "name", roots);
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
		
		@Test @DisplayName("executes all other activities")
		void executes_all_other_activities() {
			corrupted.run(context);
			assertThat(activities).containsExactlyInAnyOrder("A", "B", "C");
		}
	}
	
	@Nested @DisplayName("when containing an activity that fails")
	class WhenContainingAnActivityThatFails {

		private BasicParallelSplit corrupted;
		private List<String> activities;
		
		@BeforeEach
		void initialize() {
			activities = new Vector<>();
			
			List<Activity> roots = new ArrayList<>();
			roots.add(new SetNameInList("A", activities));
			roots.add(new SetNameInList("B", activities));
			roots.add(new HopelessActivity());
			roots.add(new SetNameInList("C", activities));
			
			corrupted = new BasicParallelSplit("id", "name", roots);
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
		
		@Test @DisplayName("executes all other activities")
		void executes_all_other_activities() {
			corrupted.run(context);
			assertThat(activities).containsExactlyInAnyOrder("A", "B", "C");
		}
	}

}
