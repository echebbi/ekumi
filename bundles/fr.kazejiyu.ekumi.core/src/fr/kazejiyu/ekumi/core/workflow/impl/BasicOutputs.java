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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.Outputs;
import fr.kazejiyu.ekumi.core.workflow.exceptions.VariableAlreadyExistException;

/**
 * A simple implementation of {@link Outputs}. 
 */
public final class BasicOutputs implements Outputs {

	/**
	 * The actual outputs held by this instance.
	 */
	private final List<Output> variables;
	
	/**
	 * Creates a new instance with no input.
	 */
	public BasicOutputs() {
		this(Collections.emptyList());
	}
	
	/**
	 * Creates a new instance initialized with the elements of the given iterable.
	 * 
	 * @param elements
	 * 			The initial outputs.
	 */
	public BasicOutputs(Iterable<Output> elements) {
		this.variables = new LinkedList<>();
		elements.forEach(variables::add);
	}

	@Override
	public Output create(String name, DataType<?> type, Object value) {
		if (contains(name)) {
			throw new VariableAlreadyExistException(name);
		}
		Output output = new BasicOutput(name, type, value);
		variables.add(output);
		return output;
	}

	@Override
	public Iterator<Output> iterator() {
		return new ArrayList<>(variables).iterator();
	}

	@Override
	public String toString() {
		return "BasicOutputs " + variables;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((variables == null) ? 0 : variables.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BasicOutputs)) {
			return false;
		}
		BasicOutputs other = (BasicOutputs) obj;
		if (variables == null) {
			if (other.variables != null) {
				return false;
			}
		} else if (!variables.equals(other.variables)) {
			return false;
		}
		return true;
	}

}
