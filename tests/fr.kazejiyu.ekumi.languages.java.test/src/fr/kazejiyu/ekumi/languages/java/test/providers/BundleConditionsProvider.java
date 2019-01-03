package fr.kazejiyu.ekumi.languages.java.test.providers;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import fr.kazejiyu.ekumi.model.workflow.Condition;
import fr.kazejiyu.ekumi.languages.java.test.fake.DumbCondition;
import fr.kazejiyu.ekumi.languages.java.test.fake.InjectableCondition;

/**
 * Provides {@link Arguments} that can be used to test the resolving of {@link Condition}s
 * defined in a bundle installed in Eclipse IDE.
 * 
 * @author Emmanuel CHEBBI
 */
public class BundleConditionsProvider implements ArgumentsProvider, BundleProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		return Stream.of(
			Arguments.of(createIdFor("DumbCondition"), DumbCondition.class),
			Arguments.of(createIdFor("InjectableCondition"), InjectableCondition.class)
		);
	}
	
}
