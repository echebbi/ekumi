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
import static fr.kazejiyu.ekumi.core.workflow.State.SUCCEEDED;

import java.util.Collections;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Outputs;
import fr.kazejiyu.ekumi.core.workflow.Sequence;
import fr.kazejiyu.ekumi.core.workflow.State;

/**
 * A {@link Sequence} based on an activity's successor.
 * <p>
 * An instance of this class only holds a reference to its first activity
 * When executed, it starts with executing this first activity, then the
 * activity's successor, then the successor's successor and so on.
 * <p>
 * When the execution is cancelled during the execution, all the remaining
 * activities are {@link Activity#skip() skipped} and the sequence's state
 * is set to {@link State#CANCELLED}.
 * <p>
 * When an activity fails, the execution is stopped and the sequence's state
 * is set to {@link State#FAILED}.
 */
public final class BasicSequence extends AbstractActivityWithStateManagement implements Sequence {
	/**
	 * The root of the sequence.
	 */
	private final Activity root;
	
	/**
	 * Creates an empty sequence.
	 * 
	 * @param id
	 * 			Uniquely identifies this sequence.
	 * @param name
	 * 			A human-readable name of the sequence.
	 */
	public BasicSequence(String id, String name) {
		this(id, name, null);
	}
	
	/**
	 * Creates a sequence with the given root.
	 * 
	 * @param id
	 * 			Uniquely identifies this sequence.
	 * @param name
	 * 			A human-readable name of the sequence.
	 * @param root
	 * 			The first task that will be executed by the sequence.
	 */
	public BasicSequence(String id, String name, Activity root) {
		super(id, name);
		this.root = root;
	}

	@Override
	public ListIterator<Activity> iterator() {
		if (root == null) {
			return Collections.emptyListIterator();
		}
		return new BasicSequenceIterator(root);
	}

	@Override
	protected void doRun(Context context) {
		boolean oneActivityHasFailed = false;
		
		for (Activity activity : this) {
			if (context.execution().isCancelled()) {
				activity.skip();
			}
			else {
				run(activity, context);
				oneActivityHasFailed = activity.state() == FAILED;
				
				if (oneActivityHasFailed) {
					break;
				}
			}
		}
		if (context.execution().isCancelled()) {
			state = CANCELLED;
		}
		else if (oneActivityHasFailed) {
			state = FAILED;
		}
		else {
			state = SUCCEEDED;
		}
	}
	
	@Override
	public Outputs outputs() {
		return new BasicOutputs(activities().flatCollect(Activity::outputs));
	}
	
	public static final class BasicSequenceIterator implements ListIterator<Activity> {
		/**
		 * The index of the current activity.
		 */
		private int index;
		/**
		 * The last activity returned.
		 */
		private Activity previous;
		/**
		 * The next activity to returned.
		 */
		private Activity current;
		
		BasicSequenceIterator(Activity current) {
			this.index = 0;
			this.current = current;
			this.previous = null;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Activity next() {
			if (! hasNext()) {
				throw new NoSuchElementException();
			}
			++index;
			previous = current;
			current = current.successor().orElse(null);
			return previous;
		}

		@Override
		public boolean hasPrevious() {
			return previous != null;
		}

		@Override
		public Activity previous() {
			if (previous == null) {
				throw new NoSuchElementException();
			}
			--index;
			current = previous;
			previous = current.predecessor().orElse(null);
			return current;
		}

		@Override
		public int nextIndex() {
			return index;
		}

		@Override
		public int previousIndex() {
			return index-1;
		}

		@Override
		public void remove() {
			// TODO should call precede(null) / succeed(null)
			throw new UnsupportedOperationException("not implemented yet");
		}

		@Override
		public void set(Activity e) {
			// TODO should call precede(e) / succeed(e)
			throw new UnsupportedOperationException("not implemented yet");
		}

		@Override
		public void add(Activity e) {
			// TODO should call precede(e) / succeed(e)
			throw new UnsupportedOperationException("not implemented yet");
		}
		
	}

}
