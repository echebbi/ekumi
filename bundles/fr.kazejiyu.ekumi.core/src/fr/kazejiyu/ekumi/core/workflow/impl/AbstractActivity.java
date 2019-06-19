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
import static fr.kazejiyu.ekumi.core.workflow.State.IDLE;
import static fr.kazejiyu.ekumi.core.workflow.State.SKIPPED;
import static java.util.Objects.requireNonNull;

import java.util.Optional;

import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Inputs;
import fr.kazejiyu.ekumi.core.workflow.Outputs;
import fr.kazejiyu.ekumi.core.workflow.State;

public abstract class AbstractActivity implements Activity {
	/**
	 * Uniquely identifies this activity.
	 */
	private final String id;
	/**
	 * A human-readable name..
	 */
	private final String name;
	/**
	 * The current execution state.
	 */
	// FIXME replace by a protected setter
	protected State state = IDLE;
	/**
	 * Manages inputs.
	 */
	private final Inputs inputs = new BasicInputs();
	/**
	 * Manages outputs.
	 */
	private final Outputs outputs = new BasicOutputs();
	/**
	 * The activity that should be run before this.
	 */
	private Activity predecessor;
	/**
	 * The activity that should be run after this.
	 */
	private Activity successor;

	public AbstractActivity(String id, String name) {
		this.id = requireNonNull(id, "id");
		this.name = requireNonNull(name, "name");
	}
	
	@Override
	public String id() {
		return id;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public State state() {
		return state;
	}

	@Override
	public Inputs inputs() {
		return inputs;
	}

	@Override
	public Outputs outputs() {
		return outputs;
	}
	
	@Override
	public Optional<Activity> predecessor() {
		return Optional.ofNullable(predecessor);
	}
	
	@Override
	public void precede(Activity successor) {
		Activity oldSuccessor = this.successor;
		this.successor = successor;
		
		if (oldSuccessor != null && oldSuccessor.succeeds(this)) {
			oldSuccessor.succeed(null);
		}
		if (successor != null && !successor.succeeds(this)) {
			successor.succeed(this);
		}
	}
	
	@Override
	public Optional<Activity> successor() {
		return Optional.ofNullable(successor);
	}
	
	@Override
	public void succeed(Activity predecessor) {
		Activity oldPredecessor = this.predecessor;
		this.predecessor = predecessor;

		if (oldPredecessor != null && oldPredecessor.precedes(this)) {
			oldPredecessor.precede(null);
		}
		if (predecessor != null && !predecessor.precedes(this)) {
			predecessor.precede(this);
		}
	}
	
	@Override
	public void skip() {
		this.state = SKIPPED;
	}
	
	@Override
	public void cancel() {
		this.state = CANCELLED;
	}

}
