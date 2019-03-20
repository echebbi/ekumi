package fr.kazejiyu.ekumi.ide.common.languages;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ExtensionToScriptingLanguageAdapter")
public class ExtensionToLanguageFactoryTest implements WithAssertions {

	// Object to test
	ExtensionToLanguageFactory factory;
	
	// The configuration elements given to the adapter
	List<IConfigurationElement> configurationElements;
	
	// The datatypes that should be returned by the adapter
	List<ScriptingLanguage> expectedLanguages;

	private ScriptingLanguage java;
	
	@BeforeEach
	void setup() throws CoreException {
		// Create languages
		
		java = Mockito.mock(ScriptingLanguage.class);
		when (java.id()) .thenReturn("language.java");
		
		ScriptingLanguage python = Mockito.mock(ScriptingLanguage.class);
		
		expectedLanguages = Arrays.asList(java, python);
		
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
		
		configurationElements = Arrays.asList(
			javaConfiguration, pythonConfiguration, nullConfiguration, throwingConfiguration
		);
		
		factory = new ExtensionToLanguageFactory(() -> configurationElements);
	}
	
	@Nested @DisplayName("when the ID matches no extension")
	class WhenTheIDMatchesNoExtension {
		
		@Test @DisplayName("returns no language")
		void returns_no_language() {
			assertThat(factory.find("shfdfh")).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when the ID matches an extension")
	class WhenTheIDMatchesAnExtension {
	
		@Test @DisplayName("creates the expected languages")
		void creates_the_expected_languages() {
			assertThat(factory.find(java.id())).contains(java);
		}
		
	}
	
}
