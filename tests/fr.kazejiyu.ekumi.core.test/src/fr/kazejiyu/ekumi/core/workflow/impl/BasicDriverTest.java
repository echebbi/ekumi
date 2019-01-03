package fr.kazejiyu.ekumi.core.workflow.impl;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.workflow.impl.BasicDriver;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Driver;
import fr.kazejiyu.ekumi.model.workflow.Status;
import fr.kazejiyu.ekumi.tests.common.fake.activities.BrokenActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.DoNothing;
import fr.kazejiyu.ekumi.tests.common.fake.activities.DumbDriverRunner;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicDriver")
public class BasicDriverTest implements WithAssertions {
	
	private Driver driver;
	
	@Mock
	private Context context;
	
	@BeforeEach
	void createDriver() {
		driver = new BasicDriver();
	}
	
	@Nested
	@DisplayName("with neither a script nor a driven")
	class WithNeitherAScriptNorADriven {
		
		@Test @DisplayName("runs successfully")
		void runs_successfully() {
			driver.run(context);
			assertThat(driver.getStatus()).isEqualTo(Status.SUCCEEDED);
		}
		
	}
	
	@Nested
	@DisplayName("with a script but no driven")
	class WithAScriptButNoDriven {
		
		@Test @DisplayName("runs successfully")
		void runs_successfully() {
			// given
			driver.setScript(new DumbDriverRunner());
			
			// when
			driver.run(context);
			
			// then
			assertThat(driver.getStatus()).isEqualTo(Status.SUCCEEDED);
		}
		
	}
	
	@Nested
	@DisplayName("with a broken script")
	class WithABrokenScript {
		
		@BeforeEach
		void createDriver() {
			driver = new BasicDriver();
			driver.setDriven(new BrokenActivity());
			driver.setScript(new DumbDriverRunner());
		}
		
		@Test @DisplayName("runs without throwing")
		void runs_without_throwing() {
			driver.run(context);
		}
		
		@Test @DisplayName("has the status FAILED after a run")
		void has_the_status_FAILED_after_a_run() {
			driver.run(context);
			assertThat(driver.getStatus()).isEqualTo(Status.FAILED);
		}
		
	}
	
	@Nested
	@DisplayName("with a functional script")
	class WithAFunctionalScript {
		
		@BeforeEach
		void createDriver() {
			driver = new BasicDriver();
			driver.setDriven(new DoNothing());
			driver.setScript(new DumbDriverRunner());
		}
		
		@Test @DisplayName("has the status SUCCEEDED after a run")
		void has_the_status_SUCCEEDED_after_a_run() {
			driver.run(context);
			assertThat(driver.getStatus()).isEqualTo(Status.SUCCEEDED);
		}
		
	}
	
}
