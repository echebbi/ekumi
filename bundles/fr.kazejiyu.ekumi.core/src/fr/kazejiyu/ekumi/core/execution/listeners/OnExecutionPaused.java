package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

/**
 * A listener that is notified when an {@link Execution} is paused.
 */
@FunctionalInterface
public interface OnExecutionPaused {
	
	/**
	 * Called when an execution is paused.
	 * 
	 * @param paused
	 * 			The execution which activity is suspended.
	 * 			Must not be {@code null}.
	 */
	void onExecutionPaused(Execution paused);

}
