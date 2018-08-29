package fr.kazejiyu.ekumi.tests.unit;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.execution.BasicExecution;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;
import fr.kazejiyu.ekumi.tests.mocks.FakeActivity;
import fr.kazejiyu.ekumi.tests.mocks.WaitFor;

@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicExecution")
public class BasicExecutionTest implements WithAssertions {

	private BasicExecution execution;
	
	private Context context;
	
	private FakeActivity activity;
	
	@BeforeEach
	void setupSUT() {
		context = EkumiFactory.eINSTANCE.createContext();
		activity = new FakeActivity();
		
		execution = new BasicExecution();
		execution.setContext(context);
		execution.setActivity(activity);
	}
	
	@Nested @DisplayName("when launched")
	class WhenLaunched {
		
		@Test @DisplayName("runs its activity")
		void runs_its_activity() throws InterruptedException {
			execution.start();
			execution.join();
			
			assertThat(activity.hasBeenRun()).isTrue();
		}
		
		@Test @DisplayName("runs its activity in background") 
		void runs_its_activity_in_background() {
			execution.setActivity(new WaitFor(4000));
			
			long before = System.currentTimeMillis();
			execution.start();
			long after = System.currentTimeMillis();
			
			assertThat(after - before).isLessThan(4000);
		}
		
	}
	
}
