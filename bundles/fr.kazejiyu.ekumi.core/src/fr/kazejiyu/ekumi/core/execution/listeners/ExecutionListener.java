package fr.kazejiyu.ekumi.core.execution.listeners;

public interface ExecutionListener extends OnExecutionStarted, 
										   OnExecutionSucceeded, 
										   OnExecutionPaused,
										   OnExecutionResumed,
										   OnExecutionTerminated {

}
