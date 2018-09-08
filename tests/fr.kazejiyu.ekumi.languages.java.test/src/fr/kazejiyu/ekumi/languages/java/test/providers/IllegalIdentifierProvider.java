package fr.kazejiyu.ekumi.languages.java.test.providers;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import fr.kazejiyu.ekumi.core.ekumi.Condition;

/**
 * Provides {@link Arguments} that can be used to test the resolving of {@link Condition}s
 * defined in a workspace project.
 * 
 * @author Emmanuel CHEBBI
 */
public class IllegalIdentifierProvider implements ArgumentsProvider, ProjectProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.of(
			Arguments.of(""),
			Arguments.of(";;"),
			Arguments.of("bundle;;"),
			Arguments.of("bundle;project-name;"),
			Arguments.of("bundle;;com.domain.MyClass"),
			Arguments.of(";project-name;com.domain.MyClass"),
			Arguments.of("project;project-name;"),
			Arguments.of("bundle;project-name;"),
			Arguments.of("illegalType;project-name;com.domain.MyClass")
		);
	}
	
}
