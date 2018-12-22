package fr.kazejiyu.ekumi.workflow.editor.design;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.spec.ExternalTask;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A ScriptingLanguageServices")
public class ScriptingLanguageServicesTest implements WithAssertions {

	// Object to test
	ScriptingLanguageServices services;
	
	@BeforeEach
	void setup() {
		services = new ScriptingLanguageServices();
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
		ExternalTask task = SpecFactory.eINSTANCE.createExternalTask();
		task.setLanguageId(languageId);
		
		assertThat(services.getScriptingLanguage(task)).isNull();
	}
	
	@Test @DisplayName("can set the language of a task")
	void can_set_the_language_of_a_task(@Mock ScriptingLanguage language) {
		ExternalTask task = SpecFactory.eINSTANCE.createExternalTask();
		when (language.id()) .thenReturn ("languages.Piou");
		
		services.setScriptingLanguage(task, language);
		
		assertThat(task.getLanguageId()).isEqualTo("languages.Piou");
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<String> emptyLanguageId() {
		return Stream.of("", null);
	}
	
}
