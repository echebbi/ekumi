package fr.kazejiyu.ekumi.core.languages;

import org.eclipse.core.resources.IProject;

import fr.kazejiyu.ekumi.core.ekumi.RunnableScript;
import fr.kazejiyu.ekumi.core.ekumi.TestableScript;
import fr.kazejiyu.ekumi.core.languages.exceptions.ScriptLoadingFailureException;

/**
 * Defines a scripting language that can be used by EKumi. 
 * 
 * @author Emmanuel CHEBBI
 */
public interface ScriptingLanguage {

	/**
	 * Turn a runnable written with the language into a EKumi runnable.
	 *  
	 * @param path
	 * 			The path locating the runnable written with the language.
	 * 			Must not be {@code null}.
	 * @param project
	 * 			The project that contains the file identified by {@code path}.
	 * 
	 * @return a runnable that can be handled by EKumi.
	 * 
	 * @throws ScriptLoadingFailureException if the script cannot be loaded.
	 */
	RunnableScript resolveRunnable(String path, IProject project) throws ScriptLoadingFailureException;

	/**
	 * Turn a testable written with the language into a EKumi runnable.
	 *  
	 * @param path
	 * 			The path locating the testable written with the language.
	 * 			Must not be {@code null}.
	 * @param project
	 * 			The project that contains the file identified by {@code path}.
	 * 
	 * @return a testable that can be handled by EKumi.
	 * 
	 * @throws ScriptLoadingFailureException if the script cannot be loaded.
	 */
	TestableScript resolveTestable(String path, IProject project) throws ScriptLoadingFailureException;

}
