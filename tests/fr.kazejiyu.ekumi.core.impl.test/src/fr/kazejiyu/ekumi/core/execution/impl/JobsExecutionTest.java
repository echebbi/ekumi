package fr.kazejiyu.ekumi.core.execution.impl;

import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.State.SKIPPED;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.core.workflow.State;
import fr.kazejiyu.ekumi.tests.common.fake.activities.BrokenActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.FakeActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.LoopUntilCancelled;
import fr.kazejiyu.ekumi.tests.common.fake.activities.LoopUntilEnded;
import fr.kazejiyu.ekumi.tests.common.fake.activities.WaitFor;

@DisplayName("A Jobs Execution")
public class JobsExecutionTest implements WithAssertions {

	private JobsExecution execution;
	
	private FakeActivity activity;
	
	@BeforeEach
	void setupSUT() {
		activity = new FakeActivity();
		
		execution = new JobsExecution(activity);
	}
	
	@Nested @DisplayName("before launch")
	class BeforeLaunch {
		
		@Test @DisplayName("can be joined")
		void can_be_joined() {
			assertThatCode(execution::join).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("is not running")
		void is_not_running() {
			assertThat(execution.isRunning()).isFalse();
		}
		
		@Test @DisplayName("is not cancelled")
		void is_not_cancelled() {
			assertThat(execution.isCancelled()).isFalse();
		}
		
		@Test @DisplayName("has a non-null context")
		void has_a_valid_context() {
			assertThat(execution.context()).isNotNull();
		}
		
		@Test @DisplayName("accepts new events")
		void accepts_new_events() {
			assertThat(execution.context().events()).isNotNull();
		}
		
		@Test @DisplayName("has no start date")
		void has_no_start_date() {
			assertThat(execution.startDate()).isEmpty();
		}
		
		@Test @DisplayName("has no end date")
		void has_no_end_date() {
			assertThat(execution.endDate()).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when launched")
	class WhenLaunched {
		
		// Prevents the execution from ending too early during tests
		private LoopUntilEnded activity;
		
		@BeforeEach
		void createExecution() {
			activity = new LoopUntilEnded();
			execution = new JobsExecution(activity);
		}
		
		@AfterEach
		void preventActivityFromRunningForever() {
			activity.ends();
		}
		
		@Test @DisplayName("runs its activity")
		void runs_its_activity() throws InterruptedException, InterruptedExecutionException {
			execution.start();
			activity.ends();
			execution.join();
			
			assertThat(activity.state()).isEqualTo(State.SUCCEEDED);
		}
		
		@Test @DisplayName("runs its activity in background") 
		void runs_its_activity_in_background() {
			execution = new JobsExecution(new WaitFor(4000));
			
			long before = System.currentTimeMillis();
			execution.start();
			long after = System.currentTimeMillis();
			
			assertThat(after - before).isLessThan(4000);
		}
		
		@Test @DisplayName("is running")
		void is_running() {
			execution.start();
			assertThat(execution.isRunning()).isTrue();
		}
		
		@Test @DisplayName("is not cancelled")
		void is_not_cancelled() {
			execution.start();
			assertThat(execution.isCancelled()).isFalse();
		}
		
		@Test @DisplayName("has a start date")
		void has_a_start_date() {
			execution.start();
			assertThat(execution.startDate()).isNotEmpty();
		}
		
		@Test @DisplayName("has a start date set to now")
		void has_a_start_date_set_to_now() {
			Date beforeStartDate = new Date();
			execution.start();
			Date afterStartDate = new Date();
			
			Date startDate = execution.startDate().get();
			
			SoftAssertions softly = new SoftAssertions();
			softly.assertThat(startDate).isAfterOrEqualsTo(beforeStartDate);
			softly.assertThat(startDate).isBeforeOrEqualsTo(afterStartDate);
			softly.assertAll();
		}
		
		@Test @DisplayName("does not have a end date")
		void does_not_have_a_end_date() throws InterruptedExecutionException {
			execution.start();
			
			assertThat(execution.endDate()).isEmpty();
			
			activity.ends();
			execution.join();
		}
		
	}
	
	@Nested @DisplayName("when finished")
	class WhenFinished {
		
		private FakeActivity activity;
		
		@BeforeEach
		void executeSuccessfully() throws InterruptedExecutionException {
			activity = new FakeActivity();
			execution = new JobsExecution(activity);
			
			execution.start();
			execution.join();
		}
		
		@Test @DisplayName("cannot be started again")
		void cannot_be_started_again() throws InterruptedExecutionException {
			execution.start();
			execution.join();
			
			assertThat(activity.hasBeenRunOnce()).isTrue();
		}
		
	}
	
	
	@Nested @DisplayName("when cancelled")
	class WhenCancelled {
		
		private LoopUntilCancelled activity;
		
		@BeforeEach
		void prepareToLoop() {
			activity = new LoopUntilCancelled();
			execution = new JobsExecution(activity);
		}
		
		@Test @DisplayName("indicates to its activities to stop")
		void indicates_to_its_activities_to_stop() throws InterruptedExecutionException {
			execution.start();
			execution.cancel();
			execution.join();
			
			assertThat(activity.state()).isEqualTo(State.CANCELLED);
		}
		
		@Test @DisplayName("is not running")
		void is_not_running() throws InterruptedExecutionException {
			SoftAssertions softly = new SoftAssertions();
			
			execution.start();
			execution.cancel();
			
			softly.assertThat(execution.isRunning()).isFalse();
			
			execution.join();
			
			softly.assertThat(execution.isRunning()).isFalse();
			
			softly.assertAll();
		}
		
		@Test @DisplayName("is cancelled")
		void is_cancelled() throws InterruptedExecutionException {
			SoftAssertions softly = new SoftAssertions();
			
			execution.start();
			execution.cancel();
			
			softly.assertThat(execution.isCancelled()).as("Execution is cancelled before joining")
				  .isTrue();
			
			execution.join();
			
			softly.assertThat(execution.isCancelled()).as("Execution is still cancelled after joining")
				  .isTrue();
			
			softly.assertAll();
		}
		
	}
	
	@Nested @DisplayName("when skipped")
	class WhenSkipped {
		
		@BeforeEach
		void createExecution() {
			activity = new FakeActivity();
			execution = new JobsExecution(activity);
		}
		
		@Nested @DisplayName("before being started")
		class BeforeBeingStarted {
			
			@BeforeEach
			void skip() {
				execution.skip();
			}
			
			@Test @DisplayName("is in the skipped state")
			void is_in_the_skipped_state() {
				assertThat(execution.state()).isEqualTo(SKIPPED);
			}
			
			@Nested @DisplayName("when launched")
			class WhenLaunched {
				
				@BeforeEach
				void launch() throws InterruptedExecutionException {
					execution.start();
					execution.join();
				}
				
				@Test @DisplayName("does not execute its activity")
				void does_not_execute_its_activity() {
					assertThat(activity.hasBeenRun()).isFalse();
				}
				
				@Test @DisplayName("put its activity in the skipped state")
				void put_its_activity_in_the_skipped_state() {
					assertThat(activity.state()).isEqualTo(SKIPPED);
				}
				
				@Test @DisplayName("does not have an end date")
				void does_not_have_an_end_date() {
					assertThat(execution.endDate()).isEmpty();
				}
			}
		}
		
	}
	
	@Nested @DisplayName("when its activity is broken")
	class WhenStartedWithABrokenActivity {
		
		private AtomicBoolean executionHasFailed;
		
		@BeforeEach
		void initWithABrokenActivity() {
			executionHasFailed = new AtomicBoolean(false);
			
			execution = new JobsExecution(new BrokenActivity());
			execution.context().events().onExecutionFailed(exec -> executionHasFailed.set(true));
		}
		
		@Nested @DisplayName("after being run")
		class AfterBeingRun{
			
			@Test @DisplayName("does not throw any exception")
			void does_not_throw_any_exception() {
				assertThatCode(() -> {
					execution.start();
					execution.join();
					
				}).doesNotThrowAnyException();
			}
			
			@Test @DisplayName("is in the failed state")
			void is_in_the_failed_state() throws InterruptedExecutionException {
				execution.start();
				execution.join();
				
				assertThat(execution.state()).isEqualTo(FAILED);
			}
			
			@Test @DisplayName("has broadcasted an 'execution failed' event")
			void has_broadcasted_an_execution_failed_event() throws InterruptedExecutionException {
				execution.start();
				execution.join();
				
				assertThat(executionHasFailed).isTrue();
			}
			
			@Test @DisplayName("has an end date")
			void has_an_end_date() throws InterruptedExecutionException {
				execution.start();
				execution.join();

				assertThat(execution.startDate()).isNotEmpty();
			}
		}
	}
	
}
