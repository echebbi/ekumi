package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.core.workflow.Status.CANCELLED;
import static fr.kazejiyu.ekumi.core.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.Status.SUCCEEDED;
import static java.util.stream.Collectors.toList;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
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

import fr.kazejiyu.ekumi.core.execution.ExecutionStatus;
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
@DisplayName("A BasicParallelSplit")
public class BasicParallelSplitTest implements WithAssertions {
	
	@Mock
	private Context context;
	
	@Mock 
	private ExecutionStatus status;
	
	@BeforeEach
	void initContext() {
		when (context.execution()) .thenReturn(status);
		when (status.isCancelled()) .thenReturn(false);
	}
	
	@Nested @DisplayName("when empty")
	class Empty {
		private BasicParallelSplit empty;
		
		@BeforeEach
		void initialize(@Mock ExecutionStatus status) {
			empty = new BasicParallelSplit();
		}
		
		// getBranches()
		
		@Test @DisplayName("has no branch")
		void has_no_branch() {
			assertThat(empty.getBranches()).isEmpty();
		}
		
		// run()
		
		@Test @DisplayName("has 'succeeded' status after run")
		void has_succeeded_status_after_run() {
			empty.run(context);
			assertThat(empty.getStatus()).isEqualTo(SUCCEEDED);
		}
	}
	
	@Nested @DisplayName("when not empty")
	class NonEmpty {
		
		private final static int NBR_BRANCHES = 3;
		
		private BasicParallelSplit split;
		private List<CheckExecutingThread> branches;
		
		@BeforeEach
		void initialize() {
			split = new BasicParallelSplit();
			
			branches = new ArrayList<>();
			for (int i = 0 ; i < NBR_BRANCHES ; ++i) 
				branches.add(new CheckExecutingThread());
			
			split.getBranches().addAll(branches);
		}
		
		// getBranches()
		
		@Test @DisplayName("knowns its branches")
		void knows_its_branches() {
			assertThat(split.getBranches()).containsExactlyInAnyOrderElementsOf(branches);
		}
		
		// run()
		
		@Test @DisplayName("executes all its tasks")
		void execute_all_its_tasks() {
			split.run(context);
			assertThat(split.getBranches()).allMatch(activity -> ((CheckExecutingThread) activity).hasRun());
		}
		
		@Test @DisplayName("executes all its tasks in different threads")
		void execute_all_its_tasks_in_different_threads() {
			split.run(context);
			
			List<Thread> distinctExecutingThreads = split.getBranches().stream()
														 .map(CheckExecutingThread.class::cast)
														 .map(activity -> activity.getExecutingThread())
														 .distinct()
														 .collect(toList());
			
			List<Thread> allExecutingThreads = split.getBranches().stream()
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
			
			for (CheckExecutingThread branch : branches)
				softly.assertThat(branch.getContextOnRun()).isSameAs(context);
			
			softly.assertAll();
		}
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			split.run(context);
			assertThat(split.getStatus()).isEqualTo(SUCCEEDED);
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
			
			@Test @DisplayName("does not execute all its tasks")
			void does_not_execute_all_its_tasks() {
				split.run(context);
				assertThat(split.getBranches()).anyMatch(activity -> ! ((CheckExecutingThread) activity).hasRun());
			}
			
			@Test @DisplayName("has the cancelled status")
			void has_the_cancel_status() {
				split.run(context);
				assertThat(split.getStatus()).isEqualTo(CANCELLED);
			}
			
			@Test @DisplayName("cancel its branches")
			void cancels_its_branches() {
				split.run(context);
				assertThat(split.getBranches()).allMatch(activity -> activity.getStatus() == CANCELLED);
			}
		}
	}
	
	@Nested @DisplayName("when containing an activity that throws")
	class WhenContainingAnActivityThatThrows {

		private BasicParallelSplit corrupted;
		private List<String> activities;
		
		@BeforeEach
		void initialize() {
			activities = new CopyOnWriteArrayList<String>();
			
			corrupted = new BasicParallelSplit();
			corrupted.getBranches().add(new SetNameInList("A", activities));
			corrupted.getBranches().add(new SetNameInList("B", activities));
			corrupted.getBranches().add(new BrokenActivity());
			corrupted.getBranches().add(new SetNameInList("C", activities));
		}
		
		@Test @DisplayName("does not throw when run")
		void do_not_throw_when_run() {
			assertThatCode(() -> corrupted.run(context)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
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
			activities = new ArrayList<String>();
			
			corrupted = new BasicParallelSplit();
			corrupted.getBranches().add(new SetNameInList("A", activities));
			corrupted.getBranches().add(new SetNameInList("B", activities));
			corrupted.getBranches().add(new HopelessActivity());
			corrupted.getBranches().add(new SetNameInList("C", activities));
		}
		
		@Test @DisplayName("does not throw when run")
		void does_not_throw_when_run() {
			assertThatCode(() -> corrupted.run(context)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
		
		@Test @DisplayName("executes all other activities")
		void executes_all_other_activities() {
			corrupted.run(context);
			assertThat(activities).containsExactlyInAnyOrder("A", "B", "C");
		}
	}

}
