package fr.kazejiyu.ekumi.core.languages;

import org.eclipse.core.resources.IProject;

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
	 * @param path
	 * 			The path locating the runner written with the language.
	 * 			Must not be {@code null}.
	 * @param project
	 * 			The project that contains the file identified by {@code path}.
	 * 
	 * @return a runner that can be handled by EKumi.
	 * 
	 * @throws ScriptLoadingFailureException if the script cannot be loaded.
	 */
	Runner resolveRunner(String path, IProject project);

	/**
	 * Turns a condition written with the language into a EKumi {@link Condition}.
	 *  
	 * @param path
	 * 			The path locating the condition written with the language.
	 * 			Must not be {@code null}.
	 * @param project
	 * 			The project that contains the file identified by {@code path}.
	 * 
	 * @return a condition that can be handled by EKumi.
	 * 
	 * @throws ScriptLoadingFailureException if the script cannot be loaded.
	 */
	Condition resolveCondition(String path, IProject project);

}
