package fr.kazejiyu.ekumi.core.languages;

import fr.kazejiyu.ekumi.core.ekumi.RunnableScript;
import fr.kazejiyu.ekumi.core.ekumi.TestableScript;

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
	 * 
	 * @return a runnable that can be handled by EKumi.
	 */
	RunnableScript resolveRunnable(String path);

	/**
	 * Turn a testable written with the language into a EKumi runnable.
	 *  
	 * @param path
	 * 			The path locating the testable written with the language.
	 * 			Must not be {@code null}.
	 * 
	 * @return a testable that can be handled by EKumi.
	 */
	TestableScript resolveTestable(String path);

}
