/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution;

import static fr.kazejiyu.ekumi.model.workflow.Status.CANCELLED;
import static fr.kazejiyu.ekumi.model.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.model.workflow.Status.RUNNING;
import static fr.kazejiyu.ekumi.model.workflow.Status.SUCCEEDED;

import java.util.Date;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;

import fr.kazejiyu.ekumi.core.execution.events.impl.StatusToEventAdapter;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicSequence;
import fr.kazejiyu.ekumi.model.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.workflow.Sequence;
import fr.kazejiyu.ekumi.model.workflow.impl.ExecutionImpl;

/**
 * An {@link Execution} that relies on {@link Job Jobs} 
 * to run its activity in background. 
 */
public class BasicExecution extends ExecutionImpl {
	
	/** The background process that executes the activity */
	private Job job;
	
	public BasicExecution() {
		setContext(new BasicUnsafeContext());
	}
	
	@Override
	public boolean isRunning() {
		return getStatus() == RUNNING;
	}
	
	@Override
	public boolean isCancelled() {
		return getStatus() == CANCELLED;
	}
	
	@Override
	public void start() {
		Adapter adapter = new StatusToEventAdapter(getContext().getEvents());
		getActivity().eAdapters().add(adapter);
		
		setStartDate(new Date());
		
		setStatus(RUNNING);
		runActivityInBackground();                          
	}

	private void runActivityInBackground() {
		job = Job.create("Executing " + getActivity().getName(), (ICoreRunnable) monitor -> {
			context.setExecutionStatus(new BasicExecutionStatus(this, monitor));
			context.getEvents().hasStarted(this);
			
			// TODO Properly handle monitor of sub tasks
			monitor.beginTask("Starting the execution", IProgressMonitor.UNKNOWN);
			
			try {
				Sequence s = new BasicSequence();
				s.setRoot(getActivity());
				s.run(context.safe());
				
				if (status != CANCELLED) {
					setStatus(SUCCEEDED);
					context.getEvents().hasSucceeded(this);
				}
			} 
			catch (Exception e) {
				setStatus(FAILED);
			} 
			finally {
				monitor.done();
			}
			
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
