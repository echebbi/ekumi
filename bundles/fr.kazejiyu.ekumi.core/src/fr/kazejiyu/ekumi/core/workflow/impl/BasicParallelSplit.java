/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.impl;

import static java.util.stream.Collectors.toSet;

import static fr.kazejiyu.ekumi.model.workflow.Status.CANCELLED;
import static fr.kazejiyu.ekumi.model.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.model.workflow.Status.SUCCEEDED;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Status;
import fr.kazejiyu.ekumi.model.workflow.impl.ParallelSplitImpl;

public final class BasicParallelSplit extends ParallelSplitImpl {

	@Override
	public void run(Context context) {
		if (context.execution().isCancelled()) {
			cancel();
			return;
		}
		
		try {
			// FIXME Context is not thread-safe here
			executeAndWait(concurrentBranches(context));
			updateState();
		} 
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			setStatus(FAILED);
		}
	}

	/**
	 * <p>Creates a list of Callable, each corresponding to the execution of one branch.</p>
	 * 
	 * <p>Each Callable returns whether the execution succeeded.</p>.
	 * 
	 * @param context
	 * 			The context of the execution.
	 * 
	 * @return a list of Callable, each corresponding to the execution of one branch
	 */
	private List<Callable<Void>> concurrentBranches(Context context) {
		List<Callable<Void>> branches = new ArrayList<>();
		
		for (Activity branch : getBranches()) {
			branches.add(() -> runSafely(branch, context));
		}
		return branches;
	}

	/**
	 * Executes the given callables in background and wait for their termination.
	 * 
	 * @param branches
	 * 			The callables to execute.
	 * 
	 * @param <T>
	 * 			The type returned by the execution of a branch.
	 * 
	 * @return a list of Futures representing the execution of the given branches, all finished.
	 * 
	 * @throws InterruptedException if interrupted while waiting, in which case unfinished tasks are cancelled
	 * @throws ExecutionException if one callable threw an Exception
	 */
	private static <T> List<Future<T>> executeAndWait(List<Callable<T>> branches) throws InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		return executor.invokeAll(branches);
	}
	
	/**
	 * Updates the current state according to branches' status.
	 */
	private void updateState() {
		Set<Status> branchesStatus = getBranches().stream().map(Activity::getStatus).collect(toSet());
		
		if (branchesStatus.contains(FAILED)) {
			setStatus(FAILED);
		}
		else if (branchesStatus.contains(CANCELLED)) {
			setStatus(CANCELLED);
		}
		else {
			setStatus(SUCCEEDED);
		}
	}
	
	/**
	 * Runs an activity and catch any exception that may be thrown.
	 * 
	 * @param activity
	 * 			The activity to run.
	 * @param context
	 * 			The context of the execution.
	 * 
	 * @return null
	 */
	private static Void runSafely(Activity activity, Context context) {
		try {
			activity.getFlows().resolveInputs();
			activity.run(context);
			
		} catch (Exception e) {
			EKumiPlugin.error(e, "Unable to run " + activity);
			activity.setStatus(FAILED);
		}
		return null;
	}

	/**
	 * Tags this instance and its branches as cancelled.
	 */
	private void cancel() {
		setStatus(CANCELLED);
		
		for (Activity branch : branches)
			branch.setStatus(CANCELLED);
	}
	
}
