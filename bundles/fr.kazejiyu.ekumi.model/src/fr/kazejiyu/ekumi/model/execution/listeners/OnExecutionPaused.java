package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Execution;

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
