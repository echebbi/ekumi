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

import java.util.Optional;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.datatypes.exceptions.DataTypeSerializationException;
import fr.kazejiyu.ekumi.core.workflow.Data;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.exceptions.IncompatibleDataTypesException;

/**
 * A simple implementation of {@link Input}. 
 */
public final class BasicInput extends AbstractData implements Input {
	/**
	 * The data to which this input is bound. Used to update the value of this instance.
	 * May be null if this instance is not bound to anything.
	 */
	private Data bounded;
	
	/**
	 * Creates a new input with a default value.
	 * <p>
	 * The value of the input is initialized to {@link DataType#defaultValue() type.defaultValue()}.
	 * 
	 * @param name
	 * 			The name of the input. Must not be empty.
	 * @param type
	 * 			The type of the values handled by the input.
	 * 
	 * @throws IllegalArgumentException if name is empty.
	 */
	public BasicInput(String name, DataType<?> type) {
		this(name, type, type.defaultValue());
	}

	/**
	 * Creates a new input with the specified value.
	 * 
	 * @param name
	 * 			The name of the input.
	 * @param type
	 * 			The type of values handled by the input.
	 * @param value
	 * 			The initial value of the input. May be null.
	 * 
	 * @throws IllegalArgumentException if name is empty.
	 * @throws DataTypeSerializationException if the specified value is not handled by the type
	 */
	public BasicInput(String name, DataType<?> type, Object value) {
		super(name, type, value);
	}
	
	@Override
	public Optional<Data> binding() {
		return Optional.ofNullable(bounded);
	}

	@Override
	public void bind(Data output) {
		if (output == this) {
			throw new IllegalArgumentException("cannot be bound to itself");
		}
		if (output != null && !this.type().equals(output.type())) {
			throw new IncompatibleDataTypesException(this.type(), output.type());
		}
		bounded = output;
	}

	@Override
	public void resolve() {
		if (bounded != null) {
			this.value = bounded.value();
		}
	}

	@Override
	public String toString() {
		return "BasicInput [name=" + name() + ", type=" + type() + ", value=" + value() + ", bounded=" + bounded + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bounded == null) ? 0 : bounded.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof BasicInput)) {
			return false;
		}
		BasicInput other = (BasicInput) obj;
		if (bounded == null) {
			if (other.bounded != null) {
				return false;
			}
		} else if (!bounded.equals(other.bounded)) {
			return false;
		}
		return true;
	}
	
}
