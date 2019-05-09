/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import fr.kazejiyu.ekumi.core.func.Try;

/**
 * Produces {@link Outputs outputs} when executed in a given {@link Context context}.
 */
@FunctionalInterface
public interface Task {
	
	/**
	 * Executes the object within a specific context.
	 * 
	 * @param context
	 * 			The context within which the object is executed.
	 */
	Try<Outputs> run(Context context);

}
