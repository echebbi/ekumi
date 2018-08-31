package fr.kazejiyu.ekumi.core.execution;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;

import fr.kazejiyu.ekumi.core.ekumi.Execution;
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
	
	@Override
	public void start() {
		Adapter adapter = new StatusToEventAdapter(getContext().events());
		getActivity().eAdapters().add(adapter);
		
		runActivityInBackground();                          
	}

	private void runActivityInBackground() {
		job = Job.create("Executing " + getActivity().getName(), (ICoreRunnable) monitor -> { 
			getActivity().run(context);
		});
		job.schedule();
	}
	
	@Override
	public void join() throws InterruptedExecutionException {
		try {
			if (job != null)
				job.join();
			
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new InterruptedExecutionException("The execution has been interrupted while joinin", e);
		}
	}
	
}
