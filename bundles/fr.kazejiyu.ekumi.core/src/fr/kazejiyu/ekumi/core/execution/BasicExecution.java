package fr.kazejiyu.ekumi.core.execution;

import static fr.kazejiyu.ekumi.core.ekumi.Status.CANCELLED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.IDLE;
import static fr.kazejiyu.ekumi.core.ekumi.Status.RUNNING;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;

import java.util.Date;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;

import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.impl.ExecutionImpl;
import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.core.execution.events.impl.StatusToEventAdapter;

/**
 * An {@link Execution} that relies on {@link Job Jobs} 
 * to run its activity in background. 
 */
public class BasicExecution extends ExecutionImpl {
	
	/** The background process that executes the activity */
	private Job job;
	
	/** The current status of the execution */
	private Status status = IDLE;
	
	public BasicExecution() {
		setContext(new BasicUnsafeContext());
	}
	
	@Override
	public boolean isRunning() {
		return status == RUNNING;
	}
	
	@Override
	public boolean isCancelled() {
		return status == CANCELLED;
	}
	
	@Override
	public void start() {
		Adapter adapter = new StatusToEventAdapter(getContext().getEvents());
		getActivity().eAdapters().add(adapter);
		
		startDate = new Date();
		
		status = RUNNING;
		runActivityInBackground();                          
	}

	private void runActivityInBackground() {
		job = Job.create("Executing " + getActivity().getName(), (ICoreRunnable) monitor -> {
			context.setExecutionStatus(new BasicExecutionStatus(this, monitor));
			
			getActivity().run(context.safe());
			
			status = SUCCEEDED;
		});
		job.schedule();
	}
	
	@Override
	public void cancel() {
		status = CANCELLED;
	}
	
	@Override
	public void join() throws InterruptedExecutionException {
		try {
			if (job != null)
				job.join();
			
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new InterruptedExecutionException("The execution has been interrupted while joining", e);
		}
	}
	
}
