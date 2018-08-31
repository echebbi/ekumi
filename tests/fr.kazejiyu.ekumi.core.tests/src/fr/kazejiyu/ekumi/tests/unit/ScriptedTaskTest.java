package fr.kazejiyu.ekumi.tests.unit;

import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.ScriptedTask;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;
import fr.kazejiyu.ekumi.tests.mocks.BrokenRunner;
import fr.kazejiyu.ekumi.tests.mocks.FakeRunner;

/**
 * Tests the behaviour of {@link ScriptedTask} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("A Scripted Task")
public class ScriptedTaskTest {
	
	private ScriptedTask task;
	
	@Mock
	private Context context;
	
	@Nested
	@DisplayName("without runner")
	class Empty {
		
		@BeforeEach
		void initialize() {
			task = EkumiFactory.eINSTANCE.createScriptedTask();
		}
		
		// getScript()
		
		@Test @DisplayName("has a null script")
		void is_empty() {
			assertThat(task.getScript()).isNull();
		}
		
		// run()
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			task.run(context);
			assertThat(task.getStatus()).isEqualTo(SUCCEEDED);
		}
	}
	
	@Nested
	@DisplayName("with a runner")
	class NonEmpty {
		
		private FakeRunner script;
		
		@BeforeEach
		void initialize() {
			script = new FakeRunner();
			task = EkumiFactory.eINSTANCE.createScriptedTask();
			task.setScript(script);
		}
		
		// isEmpty()
		
		@Test @DisplayName("has the expected script")
		void is_not_empty() {
			assertThat(task.getScript()).isEqualTo(script);
		}
		
		// run()
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			task.run(context);
			assertThat(task.getStatus()).isEqualTo(SUCCEEDED);
		}
		
		@Nested @DisplayName("during the execution")
		class DuringTheExecution {
		
			@Test @DisplayName("gives the right context to its script")
			void gives_the_rigth_context_to_its_script() {
				task.run(context);
				assertThat(script.getContextOnRun()).isSameAs(context);
			}
			
			@Test @DisplayName("executes its script")
			void executes_its_script() {
				task.run(context);
				assertThat(script.hasBeenRunOnce()).isTrue();
			}
			
		}
	}
	
	@Nested
	@DisplayName("with a broken runner")
	class WhenContainingABrokenActivity {
		private ScriptedTask corrupted;
		
		@BeforeEach
		void initialize() {
			corrupted = EkumiFactory.eINSTANCE.createScriptedTask();
			corrupted.setScript(new BrokenRunner());
		}
		
		@Test @DisplayName("do not throw when run")
		void do_not_throw_when_run() {
			corrupted.run(context);
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
	}

}
