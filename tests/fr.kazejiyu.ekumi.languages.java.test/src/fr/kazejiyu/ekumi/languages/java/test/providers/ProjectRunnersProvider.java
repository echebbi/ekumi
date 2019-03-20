package fr.kazejiyu.ekumi.languages.java.test.providers;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import fr.kazejiyu.ekumi.core.workflow.Runner;

/**
 * Provides {@link Arguments} that can be used to test the resolving of {@link Runner}s
 * defined in a workspace project.
 * 
 * @author Emmanuel CHEBBI
 */
public class ProjectRunnersProvider implements ArgumentsProvider, ProjectProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.of(
			Arguments.of(createIdFor("RunnerDefinedInProject"), "some.workspace.project.RunnerDefinedInProject"),
			Arguments.of(createIdFor("InjectableRunnerDefinedInProject"), "some.workspace.project.InjectableRunnerDefinedInProject")
		);
	}
	
}
