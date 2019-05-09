/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;

/**
 * A task which behavior is defined with a script.
 * <p>
 * The word scripts refers to a piece of code which may be written in any
 * programming languages and which is evaluated at runtime.
 */
public interface ScriptedActivity extends Activity {

	/**
	 * Returns the language used to execute the script.
	 * @return the language used to execute the script
	 */
	ScriptingLanguage language();

}
