package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.State.SUCCEEDED;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.func.Try;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Outputs;
import fr.kazejiyu.ekumi.core.workflow.RunnableScript;
import fr.kazejiyu.ekumi.core.workflow.ScriptedActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.BrokenRunner;
import fr.kazejiyu.ekumi.tests.common.fake.activities.FakeRunner;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

/**
 * Tests the behaviour of {@link ScriptedActivity} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("A Basic Scripted Activity")
public class BasicScriptedActivityTest implements WithAssertions {
	
	private ScriptedActivity task;
	
	@Mock
	private Context context;
	
	@Nested @DisplayName("when initialized")
	class WhenInitialized {
		
		@Test @DisplayName("throws if the language is null")
		void throws_if_the_language_is_null() {
			assertThatNullPointerException().isThrownBy(()-> 
				new BasicScriptedActivity("id", "name", null, "")
			);
		}
		
		@Test @DisplayName("throws if the script identifier is null")
		void throws_if_the_script_identifier_is_null(@Mock ScriptingLanguage language) {
			assertThatNullPointerException().isThrownBy(()-> 
				new BasicScriptedActivity("id", "name", language, null)
			);
		}
		
	}
	
	@Nested @DisplayName("when executed")
	class WhenExecuted {
		
		private FakeRunner script;
		
		@BeforeEach
		void initialize(@Mock ScriptingLanguage language) {
			script = new FakeRunner();
			String scriptIdentifier = "MockRunner";
			
			when (language.resolveRunner(eq(scriptIdentifier), any(Context.class))) .thenReturn(script);
			
			task = new BasicScriptedActivity("id", "name", language, scriptIdentifier);
			context = new NullContext();
		}
		
		// run()
		
		@Test @DisplayName("runs successfully")
		void runs_successfully() {
			Try<Outputs> result = task.run(context);
			assertThat(result).isEqualTo(Try.success(new BasicOutputs()));
		}
		
		@Test @DisplayName("is in the 'succeeded' state after run")
		void is_in_the_succeeded_state_after_run() {
			task.run(context);
			assertThat(task.state()).isEqualTo(SUCCEEDED);
		}
		
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
	
	@Nested @DisplayName("when containing a broken activity")
	class WhenContainingABrokenActivity {
		
		private ScriptedActivity corrupted;
		
		@BeforeEach
		void initialize(@Mock ScriptingLanguage language) {
			context = new NullContext();
			
			RunnableScript script = new BrokenRunner();
			String scriptIdentifier = "BrokenRunner";
			
			when (language.resolveRunner(scriptIdentifier, context)) .thenReturn(script);
			
			corrupted = new BasicScriptedActivity("id", "name", language, scriptIdentifier);
		}
		
		@Test @DisplayName("do not throw when run")
		void do_not_throw_when_run() {
			assertThatCode(() -> corrupted.run(context)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.state()).isEqualTo(FAILED);
		}
	}
	
	@Nested @DisplayName("when containing a non resolvable runner")
	class WhenContainingANonResolvableRunner {
		
		private ScriptedActivity empty;
		
		@BeforeEach
		void initialize(@Mock ScriptingLanguage language) {
			when (language.resolveRunner(any(String.class), any(Context.class))) .thenReturn(null);
			
			context = new NullContext();
			empty = new BasicScriptedActivity("id", "name", language, "");
		}
		
		@Nested @DisplayName("when run")
		class WhenRun {
			
			@Test @DisplayName("does not throw")
			void does_not_throw() {
				assertThatCode(() -> empty.run(context)).doesNotThrowAnyException();
			}
			
			@Test @DisplayName("enters the succeeded state")
			void enters_the_succeeded_state() {
				empty.run(context);
				assertThat(empty.state()).isEqualTo(SUCCEEDED);
			}
			
		}
		
	}

}
