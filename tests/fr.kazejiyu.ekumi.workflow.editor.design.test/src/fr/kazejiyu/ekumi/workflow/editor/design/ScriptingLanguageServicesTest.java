package fr.kazejiyu.ekumi.workflow.editor.design;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.model.EKumiExtensions;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.spec.ExternalTask;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A ScriptingLanguageServices")
public class ScriptingLanguageServicesTest implements WithAssertions {

	// Object to test
	ScriptingLanguageServices services;
	
	ExternalTask task;
	
	@BeforeEach
	void setup() {
		services = new ScriptingLanguageServices();
		task = SpecFactory.eINSTANCE.createExternalTask();
	}
	
	@Test @DisplayName("knows the name of a language")
	void knows_the_name_of_a_language(@Mock ScriptingLanguage language) {
		when (language.name()) .thenReturn("Piou");
		assertThat(services.name(language)).isEqualTo("Piou");
	}
	
	@ParameterizedTest 
	@MethodSource("emptyLanguageId")
	@DisplayName("does not know the type of a variable without a typeId")
	void does_not_know_the_language_of_a_task_without_a_languageId(String languageId) {
		task.setLanguageId(languageId);
		
		assertThat(services.getScriptingLanguage(task)).isNull();
	}
	
	@Test @DisplayName("can set the language of a task")
	void can_set_the_language_of_a_task(@Mock ScriptingLanguage language) {
		when (language.id()) .thenReturn ("languages.Piou");
		
		services.setScriptingLanguage(task, language);
		
		assertThat(task.getLanguageId()).isEqualTo("languages.Piou");
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<String> emptyLanguageId() {
		return Stream.of("", null);
	}
	
	@Nested @DisplayName("when asked for the language of an ExternalTask")
	class WhenAskedForTheLanguageOfAnExternalTask {
		
		private ScriptingLanguage java;

		@BeforeEach
		void setup(@Mock IExtensionRegistry extensions) throws CoreException {
			// Create languages
			
			java = Mockito.mock(ScriptingLanguage.class);
			when (java.id()) .thenReturn("language.java");
			
			ScriptingLanguage python = Mockito.mock(ScriptingLanguage.class);
			
			// Create configuration elements
			
			IConfigurationElement javaConfiguration = Mockito.mock(IConfigurationElement.class);
			when (javaConfiguration.createExecutableExtension("class")) .thenReturn(java);
			
			IConfigurationElement pythonConfiguration = Mockito.mock(IConfigurationElement.class);
			when (pythonConfiguration.createExecutableExtension("class")) .thenReturn(python);
			
			// should be ignored by the adapter
			IConfigurationElement nullConfiguration = Mockito.mock(IConfigurationElement.class);
			when (nullConfiguration.createExecutableExtension("class")) .thenReturn(null);
			
			// should be ignored as well
			IConfigurationElement throwingConfiguration = Mockito.mock(IConfigurationElement.class);
			when (nullConfiguration.createExecutableExtension("class")) .thenThrow(CoreException.class);
			
			IConfigurationElement[] configurationElements = new IConfigurationElement[] {
				javaConfiguration, pythonConfiguration, nullConfiguration, throwingConfiguration
			};
			
			when (extensions.getConfigurationElementsFor(EKumiExtensions.LANGUAGES_EXTENSION_ID))
				.thenReturn(configurationElements);
			services.setExtensionRegistry(extensions);
		}
		
		@Test @DisplayName("finds the language if it exists")
		void finds_the_language_if_it_exists() {
			task.setLanguageId(java.id());
			assertThat (services.getScriptingLanguage(task)) .isEqualTo(java);
		}
		
		@Test @DisplayName("returns null if the language does not exist")
		void returns_null_if_the_language_does_not_exist() {
			task.setLanguageId("dfhgkfdjhg");
			assertThat (services.getScriptingLanguage(task)).isNull();
		}
		
	}
	
}
