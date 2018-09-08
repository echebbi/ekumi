package fr.kazejiyu.ekumi.languages.java;

import static org.mockito.Mockito.when;

import java.io.File;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.CoreException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.ekumi.Condition;
import fr.kazejiyu.ekumi.core.ekumi.Runner;
import fr.kazejiyu.ekumi.core.ekumi.Script;
import fr.kazejiyu.ekumi.core.ekumi.impl.ContextImpl;
import fr.kazejiyu.ekumi.core.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.languages.exceptions.IllegalScripIdentifierException;
import fr.kazejiyu.ekumi.core.languages.exceptions.ScriptLoadingFailureException;
import fr.kazejiyu.ekumi.languages.java.test.ImportableProject;
import fr.kazejiyu.ekumi.languages.java.test.providers.BundleConditionsProvider;
import fr.kazejiyu.ekumi.languages.java.test.providers.BundleInjectablesProvider;
import fr.kazejiyu.ekumi.languages.java.test.providers.BundleRunnersProvider;
import fr.kazejiyu.ekumi.languages.java.test.providers.IllegalIdentifierProvider;
import fr.kazejiyu.ekumi.languages.java.test.providers.ProjectConditionsProvider;
import fr.kazejiyu.ekumi.languages.java.test.providers.ProjectInjectablesProvider;
import fr.kazejiyu.ekumi.languages.java.test.providers.ProjectProvider;
import fr.kazejiyu.ekumi.languages.java.test.providers.ProjectRunnersProvider;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Injectable;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@Tag("requires-Eclipse-runtime")
@ExtendWith(MockitoExtension.class)
@DisplayName("A JavaLanguage")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JavaLanguageTest implements WithAssertions {
	
	private JavaLanguage language;
	
	@Mock
	private ContextImpl context;
	
	@BeforeEach
	void createJavaLanguage(@Mock Events events, @Mock ExecutionStatus status) {
		language = new JavaLanguage();
		when(context.events()).thenReturn(events);
		when(context.execution()).thenReturn(status);
	}
	
	@Nested @DisplayName("when resolving from a bundle")
	class WhenResolvingFromABundle {
	
		@Nested @DisplayName("with a context")
		class WithAContext {
			
			@ParameterizedTest
			@ArgumentsSource(BundleRunnersProvider.class)
			@DisplayName("can resolve a runner") 
			void can_resolve_a_runner(String identifier, Class<?> expectedClass) {
				Runner runner = language.resolveRunner(identifier, context);
				assertThat(runner).isInstanceOf(expectedClass);
			}
			
			@ParameterizedTest
			@ArgumentsSource(BundleConditionsProvider.class)
			@DisplayName("can resolve a condition") 
			void can_resolve_a_condition(String identifier, Class<?> expectedClass) {
				Condition condition = language.resolveCondition(identifier, context);
				assertThat(condition).isInstanceOf(expectedClass);
			}
			
			@ParameterizedTest
			@ArgumentsSource(BundleInjectablesProvider.class)
			@DisplayName("injects resolved scripts") 
			void injects_resolved_scripts(String identifier, Class<?> expectedClass) {
				Script script = null;
				
				// Ugly for a test, but avoids the need of a new Provider
				if (Runner.class.isAssignableFrom(expectedClass))
					script = language.resolveRunner(identifier, context);
				else 
					script = language.resolveCondition(identifier, context);
				
				assertThat((Injectable) script).matches(r -> r.hasBeenInjected());
			}
			
			@Nested @DisplayName("when the bundle does not exist")
			class WhenTheBundleDoesNotExist {
				
				@Test @DisplayName("throws on resolveRunner")
				void throws_on_resolveRunner() {
					String identifier = "bundle;i.do.not.exist.here;some.qualified.Runner";
					
					assertThatExceptionOfType(ScriptLoadingFailureException.class)
						.isThrownBy(() -> language.resolveRunner(identifier, context));
				}
				
				@Test @DisplayName("throws on resolveCondition")
				void throws_on_resolveCondition() {
					String identifier = "bundle;i.do.not.exist.here;some.qualified.Condition";
					
					assertThatExceptionOfType(ScriptLoadingFailureException.class)
						.isThrownBy(() -> language.resolveCondition(identifier, context));
				}
				
			}
			
			@Nested @DisplayName("when the class does not exist")
			class WhenTheClassDoesNotExist {
				
				@Test @DisplayName("throws on resolveRunner")
				void throws_on_resolveRunner() {
					String identifier = "bundle;fr.kazejiyu.ekumi.languages.java.test;some.nonexistent.Class";
					
					assertThatExceptionOfType(ScriptLoadingFailureException.class)
						.isThrownBy(() -> language.resolveRunner(identifier, context))
						.withCauseInstanceOf(ClassNotFoundException.class);
				}
				
				@Test @DisplayName("throws on resolveCondition")
				void throws_on_resolveCondition() {
					String identifier = "bundle;fr.kazejiyu.ekumi.languages.java.test;some.nonexistent.Class";
					
					assertThatExceptionOfType(ScriptLoadingFailureException.class)
						.isThrownBy(() -> language.resolveCondition(identifier, context))
						.withCauseInstanceOf(ClassNotFoundException.class);
				}
				
			}
			
		}
		
		@Nested @DisplayName("without a context")
		class WithoutAContext {
			
			@ParameterizedTest
			@ArgumentsSource(BundleRunnersProvider.class)
			@DisplayName("can resolve a runner") 
			void can_resolve_a_runner(String identifier, Class<?> expectedClass) {
				Runner runner = language.resolveRunner(identifier, null);
				assertThat(runner).isInstanceOf(expectedClass);
			}
			
			@ParameterizedTest
			@ArgumentsSource(BundleConditionsProvider.class)
			@DisplayName("can resolve a condition") 
			void can_resolve_a_condition(String identifier, Class<?> expectedClass) {
				Condition condition = language.resolveCondition(identifier, null);
				assertThat(condition).isInstanceOf(expectedClass);
			}
			
			@ParameterizedTest
			@ArgumentsSource(BundleInjectablesProvider.class)
			@DisplayName("does not inject resolved scripts") 
			void does_not_inject_resolved_scripts(String identifier, Class<?> expectedClass) {
				Script script = null;
				
				// Ugly for a test, but avoids the need of a new Provider
				if (Runner.class.isAssignableFrom(expectedClass))
					script = language.resolveRunner(identifier, null);
				else 
					script = language.resolveCondition(identifier, null);
				
				assertThat((Injectable) script).matches(r -> ! r.hasBeenInjected(), "has not been injected");
			}
			
		}
		
	}
	
	@TestInstance(Lifecycle.PER_CLASS)
	@Nested @DisplayName("when resolving from a workspace project")
	class WhenResolvingFromAWorkspaceProject implements ProjectProvider { // ProjectProvider provides some constants
		
		@BeforeEach
		void createJavaLanguage(@Mock Events events, @Mock ExecutionStatus status) {
			language = new JavaLanguage();
			when(context.events()).thenReturn(events);
			when(context.execution()).thenReturn(status);
		}
		
		@BeforeAll
		void importFakeProjectInWorkspace() throws CoreException {
			File fakeProjectPath = new File("./rsc/some.workspace.project/");
			ImportableProject fakeProject = new ImportableProject(fakeProjectPath);
			
			// Causes exceptions at runtime, but I don't know how to avoid them
			fakeProject.importInWorkspace();
		}
		
		@Nested @DisplayName("with a context")
		class WithAContext {
			
			@ParameterizedTest
			@ArgumentsSource(ProjectRunnersProvider.class)
			@DisplayName("can resolve a runner") 
			void can_resolve_a_runner(String identifier, String expectedClass) {
				Runner runner = language.resolveRunner(identifier, context);
				assertThat(runner.getClass().getName()).isEqualTo(expectedClass);
			}
			
			@ParameterizedTest
			@ArgumentsSource(ProjectConditionsProvider.class)
			@DisplayName("can resolve a condition") 
			void can_resolve_a_condition(String identifier, String expectedClass) {
				Condition condition = language.resolveCondition(identifier, context);
				assertThat(condition.getClass().getName()).isEqualTo(expectedClass);
			}
			
			@ParameterizedTest
			@ArgumentsSource(ProjectInjectablesProvider.class)
			@DisplayName("injects resolved scripts") 
			void injects_resolved_scripts(String identifier, String expectedClass) {
				Script script = null;
				
				// Ugly for a test, but avoids the need of a new Provider
				if (expectedClass.contains("Runner"))
					script = language.resolveRunner(identifier, context);
				else 
					script = language.resolveCondition(identifier, context);
				
				assertThat((Injectable) script).matches(r -> r.hasBeenInjected());
			}
			
			@Nested @DisplayName("when the project does not exist")
			class WhenTheProjectDoesNotExist {
				
				@Test @DisplayName("throws on resolveRunner")
				void throws_on_resolveRunner() {
					String identifier = "project;i.do.not.exist.here;some.qualified.Runner";
					
					assertThatExceptionOfType(ScriptLoadingFailureException.class)
						.isThrownBy(() -> language.resolveRunner(identifier, context));
				}
				
				@Test @DisplayName("throws on resolveCondition")
				void throws_on_resolveCondition() {
					String identifier = "project;i.do.not.exist.here;some.qualified.Condition";
					
					assertThatExceptionOfType(ScriptLoadingFailureException.class)
						.isThrownBy(() -> language.resolveCondition(identifier, context));
				}
				
			}
			
			@Nested @DisplayName("when the class does not exist")
			class WhenTheClassDoesNotExist implements ProjectProvider { // allows to create ids
				
				@Test @DisplayName("throws on resolveRunner")
				void throws_on_resolveRunner() {
					String identifier = createIdFor("nonexistent.Runner");
					
					assertThatExceptionOfType(ScriptLoadingFailureException.class)
						.isThrownBy(() -> language.resolveRunner(identifier, context))
						.withCauseInstanceOf(ClassNotFoundException.class);
				}
				
				@Test @DisplayName("throws on resolveCondition")
				void throws_on_resolveCondition() {
					String identifier = createIdFor("nonexistent.Condition");
					
					assertThatExceptionOfType(ScriptLoadingFailureException.class)
						.isThrownBy(() -> language.resolveCondition(identifier, context))
						.withCauseInstanceOf(ClassNotFoundException.class);
				}
				
			}
			
		}
		
		@Nested @DisplayName("without a context")
		class WithoutAContext {
			
			@ParameterizedTest
			@ArgumentsSource(ProjectRunnersProvider.class)
			@DisplayName("can resolve a runner") 
			void can_resolve_a_runner(String identifier, String expectedClass) {
				Runner runner = language.resolveRunner(identifier, null);
				assertThat(runner.getClass().getName()).isEqualTo(expectedClass);
			}
			
			@ParameterizedTest
			@ArgumentsSource(ProjectConditionsProvider.class)
			@DisplayName("can resolve a condition") 
			void can_resolve_a_condition(String identifier, String expectedClass) {
				Condition condition = language.resolveCondition(identifier, null);
				assertThat(condition.getClass().getName()).isEqualTo(expectedClass);
			}
			
			@ParameterizedTest
			@ArgumentsSource(ProjectInjectablesProvider.class)
			@DisplayName("does not inject resolved scripts") 
			void does_not_inject_resolved_scripts(String identifier, String expectedClass) {
				Script script = null;
				
				// Ugly for a test, but avoids the need of a new Provider
				if (expectedClass.contains("Runner"))
					script = language.resolveRunner(identifier, null);
				else 
					script = language.resolveCondition(identifier, null);
				
				assertThat((Injectable) script).matches(r -> ! r.hasBeenInjected());
			}
			
		}
		
	}
	
	@Nested @DisplayName("when provided with an illegal identifier")
	class WhenAskedForAnIllegalIdentifier {
		
		@ParameterizedTest
		@ArgumentsSource(IllegalIdentifierProvider.class)
		@DisplayName("throws instead of resolving a Runner")
		void throws_instead_of_resolving_a_Runner(String illegalIdentifier) {
			assertThatExceptionOfType(IllegalScripIdentifierException.class)
				.isThrownBy(() -> language.resolveRunner(illegalIdentifier, context));
		}
		
		@ParameterizedTest
		@ArgumentsSource(IllegalIdentifierProvider.class)
		@DisplayName("throws instead of resolving a Condition")
		void throws_instead_of_resolving_a_Condition(String illegalIdentifier) {
			assertThatExceptionOfType(IllegalScripIdentifierException.class)
				.isThrownBy(() -> language.resolveCondition(illegalIdentifier, context));
		}
		
	}
	
}
