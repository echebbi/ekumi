package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

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
