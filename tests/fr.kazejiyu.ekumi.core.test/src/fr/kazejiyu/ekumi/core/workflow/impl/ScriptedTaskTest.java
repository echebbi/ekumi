package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.model.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.model.workflow.Status.SUCCEEDED;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.when;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Runner;
import fr.kazejiyu.ekumi.model.workflow.ScriptedTask;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;
import fr.kazejiyu.ekumi.tests.common.fake.activities.BrokenRunner;
import fr.kazejiyu.ekumi.tests.common.fake.activities.FakeRunner;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

/**
 * Tests the behaviour of {@link ScriptedTask} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("A Scripted Task")
public class ScriptedTaskTest implements WithAssertions {
	
	private ScriptedTask task;
	
	@Mock
	private Context context;
	
	@Nested
	@DisplayName("without runner")
	class Empty {
		
		@BeforeEach
		void initialize() {
			task = WorkflowFactory.eINSTANCE.createScriptedTask();
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
		void initialize(@Mock ScriptingLanguage language) {
			script = new FakeRunner();
			String scriptIdentifier = "MockRunner";
			
			when (language.resolveRunner(eq(scriptIdentifier), any(Context.class))) .thenReturn(script);
			
			task = WorkflowFactory.eINSTANCE.createScriptedTask();
			task.setLanguage(language);
			task.setScriptPath(scriptIdentifier);
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
		void initialize(@Mock ScriptingLanguage language) {
			Runner script = new BrokenRunner();
			String scriptIdentifier = "BrokenRunner";
			
			when (language.resolveRunner(scriptIdentifier, context)) .thenReturn(script);
			
			corrupted = WorkflowFactory.eINSTANCE.createScriptedTask();
			corrupted.setLanguage(language);
			corrupted.setScriptPath(scriptIdentifier);
		}
		
		@Test @DisplayName("do not throw when run")
		void do_not_throw_when_run() {
			assertThatCode(() -> corrupted.run(context)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
	}

}
