package fr.kazejiyu.ekumi.core.execution;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.model.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.model.workflow.Status;
import fr.kazejiyu.ekumi.tests.common.fake.activities.FakeActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.LoopUntilCancelled;
import fr.kazejiyu.ekumi.tests.common.fake.activities.LoopUntilEnded;
import fr.kazejiyu.ekumi.tests.common.fake.activities.WaitFor;

@DisplayName("A BasicExecution")
public class BasicExecutionTest implements WithAssertions {

	private BasicExecution execution;
	
	private FakeActivity activity;
	
	@BeforeEach
	void setupSUT() {
		activity = new FakeActivity();
		
		execution = new BasicExecution();
		execution.setActivity(activity);
	}
	
	@Nested @DisplayName("before launch")
	class BeforeLaunch {
		
		@Test @DisplayName("can be joined")
		void can_be_joined() throws InterruptedExecutionException {
			execution.join();
		}
		
		@Test @DisplayName("is not running")
		void is_not_running() {
			assertThat(execution.isRunning()).isFalse();
		}
		
		@Test @DisplayName("is not cancelled")
		void is_not_cancelled() {
			assertThat(execution.isCancelled()).isFalse();
		}
		
	}
	
	@Nested @DisplayName("when launched")
	class WhenLaunched {
		
		// Prevents the execution from ending too early during tests
		private LoopUntilEnded activity;
		
		@BeforeEach
		void createExecution() {
			activity = new LoopUntilEnded();
			
			execution = new BasicExecution();
			execution.setActivity(activity);
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
			
			assertThat(activity.getStatus()).isEqualTo(Status.SUCCEEDED);
		}
		
		@Test @DisplayName("runs its activity in background") 
		void runs_its_activity_in_background() {
			execution.setActivity(new WaitFor(4000));
			
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
		
	}
	
	@Nested @DisplayName("when cancelled")
	class WhenCancelled {
		
		private LoopUntilCancelled activity;
		
		@BeforeEach
		void prepareToLoop() {
			activity = new LoopUntilCancelled();
			
			execution = new BasicExecution();
			execution.setActivity(activity);
		}
		
		@Test @DisplayName("indicates to its activities to stop")
		void indicates_to_its_activities_to_stop() throws InterruptedExecutionException {
			execution.start();
			execution.cancel();
			execution.join();
			
			assertThat(activity.getStatus()).isEqualTo(Status.CANCELLED);
		}
		
		@Test @DisplayName("is not running")
		void is_not_running() throws InterruptedExecutionException {
			SoftAssertions softly = new SoftAssertions();
			
			execution.start();
			execution.cancel();
			
			softly.assertThat(execution.isRunning()).isFalse();
			
			execution.join();
			
			softly.assertThat(execution.isRunning()).isFalse();
		}
		
		@Test @DisplayName("is cancelled")
		void is_cancelled() throws InterruptedExecutionException {
			SoftAssertions softly = new SoftAssertions();
			
			execution.start();
			execution.cancel();
			
			softly.assertThat(execution.isCancelled()).isTrue();
			
			execution.join();
			
			softly.assertThat(execution.isCancelled()).isTrue();
		}
		
	}
	
}
