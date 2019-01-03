package fr.kazejiyu.ekumi.core.execution;

import static java.util.Objects.requireNonNull;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;

/**
 * An {@link ExecutionStatus} relying on {@link IProgressMonitor}
 * in order to work with {@link BasicExecution}. 
 */
public class BasicExecutionStatus implements ExecutionStatus {
	
	/** The execution which status is represented by the current instance */
	private final BasicExecution execution;
	
	/** Monitors the job launched in background by this.execution */
	private final IProgressMonitor monitor;
	
	/**
	 * Creates a new status for the given execution.
	 * 
	 * @param execution
	 * 			The execution which status is represented by this instance.
	 * @param monitor
	 * 			The instance monitoring the job launched in background by execution.
	 */
	public BasicExecutionStatus(BasicExecution execution, IProgressMonitor monitor) {
		this.execution = requireNonNull(execution, "Cannot be the status of a null execution");
		this.monitor = requireNonNull(monitor, "Cannot rely on a null monitor");
	}

	@Override
	public boolean isCancelled() {
		return monitor.isCanceled() || execution.isCancelled();
	}

}
