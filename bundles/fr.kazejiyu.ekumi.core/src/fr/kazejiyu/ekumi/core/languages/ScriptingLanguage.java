package fr.kazejiyu.ekumi.core.languages;

import fr.kazejiyu.ekumi.core.ekumi.Condition;
import fr.kazejiyu.ekumi.core.ekumi.Runner;
import fr.kazejiyu.ekumi.core.languages.exceptions.ScriptLoadingFailureException;

/**
 * Defines a scripting language that can be used by EKumi. 
 * 
 * @author Emmanuel CHEBBI
 */
public interface ScriptingLanguage {

	/**
	 * Turns a runner written with the language into a EKumi {@link Runner}.
	 *  
	 * @param identifier
	 * 			Uniquely identifies the runner to resolve.
	 * 			Must not be {@code null}.
	 * 
	 * @return a runner that can be handled by EKumi.
	 * 
	 * @throws ScriptLoadingFailureException if the script cannot be loaded.
	 */
	Runner resolveRunner(String identifier);

	/**
	 * Turns a condition written with the language into a EKumi {@link Condition}.
	 *  
	 * @param identifier
	 * 			Uniquely identifies the runner to resolve.
	 * 			Must not be {@code null}.
	 * 
	 * @return a condition that can be handled by EKumi.
	 * 
	 * @throws ScriptLoadingFailureException if the script cannot be loaded.
	 */
	Condition resolveCondition(String identifier);

}
