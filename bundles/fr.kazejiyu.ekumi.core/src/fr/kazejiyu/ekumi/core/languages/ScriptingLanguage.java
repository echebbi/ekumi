package fr.kazejiyu.ekumi.core.languages;

import fr.kazejiyu.ekumi.core.ekumi.Condition;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Execution;
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
	 * @param context
	 * 			The context of the {@link Execution}. Can be null if the execution
	 * 			does not provide any context, or if the Runner is not resolved in
	 * 			the context of an execution.
	 * 
	 * @return a runner that can be handled by EKumi.
	 * 
	 * @throws ScriptLoadingFailureException if the script cannot be loaded.
	 */
	Runner resolveRunner(String identifier, Context context);

	/**
	 * Turns a condition written with the language into a EKumi {@link Condition}.
	 *  
	 * @param identifier
	 * 			Uniquely identifies the runner to resolve.
	 * 			Must not be {@code null}.
	 * @param context
	 * 			The context of the {@link Execution}. Can be null if the execution
	 * 			does not provide any context, or if the Runner is not resolved in
	 * 			the context of an execution.
	 * 
	 * @return a condition that can be handled by EKumi.
	 * 
	 * @throws ScriptLoadingFailureException if the script cannot be loaded.
	 */
	Condition resolveCondition(String identifier, Context context);

}
