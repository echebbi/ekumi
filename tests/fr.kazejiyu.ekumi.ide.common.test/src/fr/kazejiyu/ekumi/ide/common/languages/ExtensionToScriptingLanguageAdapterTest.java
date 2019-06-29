package fr.kazejiyu.ekumi.ide.common.languages;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.ide.common.Activator;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ExtensionToScriptingLanguageAdapter")
public class ExtensionToScriptingLanguageAdapterTest implements WithAssertions {

	// Object to test
	ExtensionToScriptingLanguageAdapter adapter;
	
	// The configuration elements given to the adapter
	List<IConfigurationElement> configurationElements;
	
	// The languages that should be returned by the adapter
	List<ScriptingLanguage> expectedLanguages;
	
	@BeforeEach
	void setup() throws CoreException {
		adapter = new ExtensionToScriptingLanguageAdapter();
		
		// Create languages
		
		ScriptingLanguage java = Mockito.mock(ScriptingLanguage.class);
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
		CoreException coreException = new CoreException(new Status(IStatus.ERROR, Activator.ID, "no class attribute"));
		when (nullConfiguration.createExecutableExtension("class")) .thenThrow(coreException);
		
		configurationElements = Arrays.asList(
			javaConfiguration, pythonConfiguration, nullConfiguration, throwingConfiguration
		);
	}
	
	@Nested @DisplayName("when there are no configuration elements")
	class WhenThereAreNoConfigurationElements {
		
		@Test @DisplayName("returns no language")
		void returns_no_language() {
			assertThat(adapter.adapt(Collections.emptyList())).isEmpty();
		}
		
	}
	
	@Test @DisplayName("creates the expected languages")
	void creates_the_expected_languages() {
		assertThat(adapter.adapt(configurationElements)).containsExactlyInAnyOrderElementsOf(expectedLanguages);
	}
	
}
