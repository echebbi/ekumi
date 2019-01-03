package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Execution;

/**
 * A listener that is notified when an {@link Execution} is cancelled.
 */
@FunctionalInterface
public interface OnExecutionTerminated {

	/**
	 * Called when an execution is cancelled.
	 * 
	 * @param terminated
	 * 			The cancelled execution.
	 * 			Must not be {@code null}.
	 */
	void onExecutionTerminated(Execution terminated);
	
}
