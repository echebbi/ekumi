package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

/**
 * A listener that is notified when an {@link Execution} succeeds.
 */
@FunctionalInterface
public interface OnExecutionSucceeded {

	/**
	 * Called when an execution succeeds.
	 * 
	 * @param succeeded
	 * 			The successful execution.
	 * 			Must not be {@code null}.
	 */
	void onExecutionSucceeded(Execution succeeded);
	
}
