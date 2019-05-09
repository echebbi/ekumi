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

import static fr.kazejiyu.ekumi.core.workflow.State.CANCELLED;
import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.State.IDLE;
import static fr.kazejiyu.ekumi.core.workflow.State.SUCCEEDED;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Outputs;
import fr.kazejiyu.ekumi.core.workflow.ParallelSplit;
import fr.kazejiyu.ekumi.core.workflow.State;

/**
 * An implementation of {@link ParallelSplit} that relies on {@link Executor}
 * instances to executes its activities in background.
 */
public final class BasicParallelSplit extends AbstractActivityWithStateManagement implements ParallelSplit {

	/**
	 * The activities to execute concurrently.
	 */
	private final ImmutableList<Activity> roots;

	/**
	 * Creates a new instance with no activity.
	 * 
	 * @param id
	 * 			The string uniquely identifying this activity.
	 * @param name
	 * 			The human-readable name of this activity.
	 */
	public BasicParallelSplit(String id, String name) {
		this(id, name, Collections.emptyList());
	}
	
	/**
	 * Creates a new instance able to execute given activities concurrently.
	 * 
	 * @param id
	 * 			The string uniquely identifying this activity.
	 * @param name
	 * 			The human-readable name of this activity.
	 * @param roots
	 * 			The activities to execute concurrently.
	 */
	public BasicParallelSplit(String id, String name, Iterable<? extends Activity> roots) {
		super(id, name);
		this.roots = Lists.immutable.ofAll(roots);
	}
	
	@Override
	public ImmutableList<Activity> branches() {
		return roots;
	}
	
	@Override
	public void doRun(Context context) {
		try {
			// FIXME Context is not thread-safe here
			executeAndWait(concurrentBranches(context));
			updateState();
		} 
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new EKumiRuntimeException(e);
		}
	}
	
	@Override
	public Outputs outputs() {
		return new BasicOutputs(roots.flatCollect(Activity::outputs));
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
	private List<Callable<Outputs>> concurrentBranches(Context context) {
		List<Callable<Outputs>> branches = new ArrayList<>();
		
		for (Activity branch : roots) {
			branches.add(() -> run(branch, context));
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
		Set<State> branchesStatus = roots.stream().map(Activity::state).collect(toSet());
		
		if (branchesStatus.contains(FAILED)) {
			state = FAILED;
		}
		else if (branchesStatus.contains(CANCELLED)) {
			state = CANCELLED;
		}
		else {
			state = SUCCEEDED;
		}
	}

	/**
	 * Tags this instance and its branches as cancelled.
	 */
	@Override
	public void cancel() {
		state = CANCELLED;
		
		for (Activity root : roots) {
			if (root.state() == IDLE) {
				root.skip();
			}
		}
	}
	
}
