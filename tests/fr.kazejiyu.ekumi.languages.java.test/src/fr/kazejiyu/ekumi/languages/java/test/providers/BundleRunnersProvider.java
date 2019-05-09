package fr.kazejiyu.ekumi.languages.java.test.providers;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import fr.kazejiyu.ekumi.core.workflow.RunnableScript;
import fr.kazejiyu.ekumi.languages.java.test.fake.DumbRunner;
import fr.kazejiyu.ekumi.languages.java.test.fake.InjectableRunner;

/**
 * Provides {@link Arguments} that can be used to test the resolving of {@link RunnableScript}s
 * defined in a bundle installed within Eclipse IDE.
 * 
 * @author Emmanuel CHEBBI
 */
public class BundleRunnersProvider implements ArgumentsProvider, BundleProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.of(
			Arguments.of(createIdFor("DumbRunner"), DumbRunner.class),
			Arguments.of(createIdFor("InjectableRunner"), InjectableRunner.class)
		);
	}
	
}
