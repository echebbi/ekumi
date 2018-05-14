package fr.kazejiyu.ekumi.tests.unit;

import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.ScriptedTask;
import fr.kazejiyu.ekumi.tests.mocks.BrokenRunner;
import fr.kazejiyu.ekumi.tests.mocks.SetVariableRunner;

/**
 * Tests the behaviour of {@link ScriptedTask} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@DisplayName("A Scripted Task")
public class ScriptedTaskTest {
	
	@Nested
	@DisplayName("without runner")
	class Empty {
		private ScriptedTask task;
		private Context context;
		
		@BeforeEach
		void initialize() {
			context = EkumiFactory.eINSTANCE.createContext();
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
		private ScriptedTask task;
		private Context context;
		
		@BeforeEach
		void initialize() {
			context = EkumiFactory.eINSTANCE.createContext();
			task = EkumiFactory.eINSTANCE.createScriptedTask();
			task.setScript(new SetVariableRunner("piou", "loulou"));
		}
		
		// isEmpty()
		
		@Test @DisplayName("has a non null script")
		void is_not_empty() {
			assertThat(task.getScript()).isNotNull();
		}
		
		// run()
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			task.run(context);
			assertThat(task.getStatus()).isEqualTo(SUCCEEDED);
		}
		
		@Test @DisplayName("gives the right context to its script")
		void gives_the_rigth_context_to_its_script() {
			task.run(context);
			assertThat(context.get("piou")).isPresent();
			assertThat(context.get("piou").get().getValue()).isEqualTo("loulou");
		}
	}
	
	@Nested
	@DisplayName("with a broken runner")
	class WhenContainingABrokenActivity {
		private ScriptedTask corrupted;
		private Context context;
		
		@BeforeEach
		void initialize() {
			context = EkumiFactory.eINSTANCE.createContext();
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
