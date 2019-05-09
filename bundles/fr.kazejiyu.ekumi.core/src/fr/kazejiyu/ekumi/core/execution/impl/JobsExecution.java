/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution.impl;

import static fr.kazejiyu.ekumi.core.workflow.State.CANCELLED;
import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.State.IDLE;
import static fr.kazejiyu.ekumi.core.workflow.State.RUNNING;
import static fr.kazejiyu.ekumi.core.workflow.State.SKIPPED;
import static fr.kazejiyu.ekumi.core.workflow.State.SUCCEEDED;
import static java.util.Objects.requireNonNull;

import java.util.Date;
import java.util.Optional;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.core.execution.events.impl.BasicEvents;
import fr.kazejiyu.ekumi.core.func.Try;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.Outputs;
import fr.kazejiyu.ekumi.core.workflow.State;

/**
 * An {@link Execution} that relies on {@link Job Jobs} 
 * to run its activity in background.
 * <p>
 * A {@code JobsExecution} can only be started once.
 * <p>
 * A {@code JobsExecution} cannot be started after being {@link #skip() skipped} 
 * or {@link #cancel() cancelled}. 
 */
public final class JobsExecution implements Execution {
	
	/** 
	 * The background process that executes the activity.
	 */
	private Job job;
	/**
	 * Indicates whether the execution is started, on going or finished.
	 */
	private State state = IDLE;
	/**
	 * The date at which the execution has started;
	 */
	private Date startDate;
	/**
	 * The date at which the execution has ended.
	 */
	private Date endDate;
	/**
	 * The activity to run.
	 */
	private final Activity activity;
	/**
	 * The context providing environment variables and execution state
	 * to the executed activities.
	 */
	private final BasicContext context;
	
	public JobsExecution(Activity activity) {
		this.activity = requireNonNull(activity, "activity parameter");
		this.context = new BasicContext(new BasicEvents(), new BasicExecutionStatus(this, new NullProgressMonitor()));
	}
	
	@Override
	public void start() {
		startDate = new Date();
		
		if (state == IDLE) {
			state = RUNNING;
			runActivityInBackground();
		}
	}

	private void runActivityInBackground() {
		job = Job.create("Executing " + activity.name(), (ICoreRunnable) monitor -> {
			context.setExecutionState(new BasicExecutionStatus(this, monitor));
			context.events().hasStarted(this);
			
			// TODO Properly handle monitor of sub tasks
			monitor.beginTask("Starting the execution", IProgressMonitor.UNKNOWN);
			
			try {
				Try<Outputs> result = activity.run(context);
				updateState(result);
			} 
			catch (Exception e) {
				state = FAILED;
				// TODO log the exception; add a logger to the context?
				context.events().hasFailed(this);
			} 
			finally {
				endDate = new Date();
				monitor.done();
			}
			
		});
		job.schedule();
	}

	@SuppressWarnings("squid:S00112")
	private void updateState(Try<Outputs> result) throws Exception {
		if (result.exception().isPresent()) {
			// Let the catch statement handle runtime errors
			throw result.exception().get();
		}
		if (state != CANCELLED) {
			state = SUCCEEDED;
			context.events().hasSucceeded(this);
		}
	}
	
	@Override
	public void cancel() {
		state = CANCELLED;
	}
	
	@Override
	public void skip() {
		state = SKIPPED;
		activity.skip();
	}
	
	@Override
	public void join() throws InterruptedExecutionException {
		try {
			if (job != null) {
				job.join();
			}
		} 
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new InterruptedExecutionException("The execution has been interrupted while joining", e);
		}
	}

	@Override
	public String id() {
		return activity.id();
	}

	@Override
	public String name() {
		return activity.name();
	}

	@Override
	public State state() {
		return state;
	}
	
	@Override
	public boolean isRunning() {
		return state == RUNNING;
	}
	
	@Override
	public boolean isCancelled() {
		return state == CANCELLED;
	}
	
	@Override
	public Context context() {
		return context;
	}
	
	@Override
	public Optional<Date> startDate() {
		return Optional.ofNullable(startDate);
	}
	
	@Override
	public Optional<Date> endDate() {
		return Optional.ofNullable(endDate);
	}
	
}
