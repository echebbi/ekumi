package fr.kazejiyu.ekumi.core.execution;

import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.ekumi.UnsafeContext;

/**
 * The status of an {@link Execution}.<br>
 * <br>
 * Instances of this class are aimed to be given to an {@link UnsafeContext}
 * in order to be injected into running activities.
 */
public interface ExecutionStatus {

	/**
	 * Returns whether the execution has been cancelled
	 * @return whether the execution has been cancelled
	 */
	boolean isCancelled();
	
}
