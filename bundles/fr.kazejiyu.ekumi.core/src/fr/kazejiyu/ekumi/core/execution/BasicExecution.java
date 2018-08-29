package fr.kazejiyu.ekumi.core.execution;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;

import fr.kazejiyu.ekumi.core.ekumi.impl.ExecutionImpl;
import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.execution.events.impl.StatusToEventAdapter;

public class BasicExecution extends ExecutionImpl {
	
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
	public void join() {
		try {
			job.join();
			
		} catch (InterruptedException e) {
			throw new EKumiRuntimeException(e);
		}
	}
	
}
