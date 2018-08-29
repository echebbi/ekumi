package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

/**
 * An object that listens for the status of an {@link Execution} to change.
 */
public interface ExecutionListener extends OnExecutionStarted, 
										   OnExecutionSucceeded, 
										   OnExecutionPaused,
										   OnExecutionResumed,
										   OnExecutionTerminated {

	@Override
	default void onExecutionTerminated(Execution terminated) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onExecutionResumed(Execution execution) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onExecutionPaused(Execution paused) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onExecutionSucceeded(Execution succeeded) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onExecutionStarted(Execution execution) {
		// in case the implementing class is not interested in this event
	}

}
