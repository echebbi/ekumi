package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

@FunctionalInterface
public interface OnExecutionPaused {
	
	void onExecutionPaused(Execution paused);

}
