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
import java.util.Iterator;
import java.util.List;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Inputs;
import fr.kazejiyu.ekumi.core.workflow.exceptions.VariableAlreadyExistException;

/**
 * A simple implementation of {@link Inputs}.
 */
public final class BasicInputs implements Inputs {

	/**
	 * The actual inputs held by this instance.
	 */
	private final List<Input> variables = new ArrayList<>();
	
	@Override
	public void resolve() {
		variables.forEach(Input::resolve);
	}
	
	@Override
	public Input create(String name, DataType<?> type, Object value) {
		if (contains(name)) {
			throw new VariableAlreadyExistException(name);
		}
		Input input = new BasicInput(name, type, value);
		variables.add(input);
		return input;
	}

	@Override
	public Iterator<Input> iterator() {
		return new ArrayList<>(variables).iterator();
	}

	@Override
	public String toString() {
		return "BasicInputs " + variables;
	}

}
