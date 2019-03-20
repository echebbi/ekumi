package fr.kazejiyu.ekumi.languages.java.test.providers;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import fr.kazejiyu.ekumi.core.workflow.Runner;
import fr.kazejiyu.ekumi.languages.java.test.fake.InjectableCondition;
import fr.kazejiyu.ekumi.languages.java.test.fake.InjectableRunner;

/**
 * Provides {@link Arguments} that can be used to test the resolving of {@link Runner}s
 * defined in a workspace project.
 * 
 * @author Emmanuel CHEBBI
 */
public class BundleInjectablesProvider implements ArgumentsProvider, BundleProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.of(
			Arguments.of(createIdFor("InjectableRunner"), InjectableRunner.class),
			Arguments.of(createIdFor("InjectableCondition"), InjectableCondition.class)
		);
	}
	
}
