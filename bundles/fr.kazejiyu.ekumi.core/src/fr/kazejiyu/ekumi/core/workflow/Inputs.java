/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow;

import java.util.Optional;
import java.util.stream.StreamSupport;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.datatypes.exceptions.DataTypeSerializationException;
import fr.kazejiyu.ekumi.core.exceptions.DataNotFoundException;
import fr.kazejiyu.ekumi.core.workflow.exceptions.VariableAlreadyExistException;

/**
 * A set of data required by an {@link Activity} before that it can be run. 
 */
public interface Inputs extends Iterable<Input> {
	
	/**
	 * Resolves the values of all inputs from the output their
	 * are connected to.
	 */
	void resolve();
	
	/**
	 * Creates a new input which value is set to type's default.
	 * 
	 * @param name
	 * 			The name of the new input.
	 * @param type
	 * 			The type of the input.
	 * 
	 * @return the new input
	 * 
	 * @throws VariableAlreadyExistException if a variable with the specified name already exists
	 * @throws DataTypeSerializationException if the specified type does not handled null
	 */
	default Input create(String name, DataType<?> type) {
		return create(name, type, type.defaultValue());
	}
	
	/**
	 * Creates a new input with an initial value.
	 * 
	 * @param name
	 * 			The name of the new input.
	 * @param type
	 * 			The type of the values handled by the new input.
	 * @param value
	 * 			The initial value of the new input.
	 * 
	 * @return the new input
	 * 
	 * @throws VariableAlreadyExistException if a variable with the specified name already exists
	 * @throws DataTypeSerializationException if the specified value is not handled by the type
	 */
	Input create(String name, DataType<?> type, Object value);
	
	/**
	 * <p>
	 * Creates a new input if no one with the specified name already exists.
	 * <p>
	 * The value of the new input is set to type's default.
	 * <p>
	 * Has no effect if a variable with the specified name and type already exist.
	 * 
	 * @param name
	 * 			The name of the new input.
	 * @param type
	 * 			The type of the new input.
	 * 
	 * @return the new input if one has been created, or the one that already exists
	 * 
	 * @throws _ if a variable with the specified name already exists but does not have
	 * 			the expected type
	 * @throws DataTypeSerializationException if the specified value is not handled by the type
	 */
	default Input createIfAbsent(String name, DataType<?> type) {
		return createIfAbsent(name, type, type.defaultValue());
	}
	
	/**
	 * Creates a new input if no one with the specified name already exists.
	 * <p>
	 * Has no effect if a variable with the specified name and type already exist.
	 * 
	 * @param name
	 * 			The name of the new input.
	 * @param type
	 * 			The type of the new input.
	 * @param value
	 * 			The value of the new input.
	 * 
	 * @return the new input if one has been created, or the one that already exists
	 * 
	 * @throws _ if a variable with the specified name already exists but does not have
	 * 			the expected type
	 * @throws DataTypeSerializationException if the specified value is not handled by the type
	 */
	default Input createIfAbsent(String name, DataType<?> type, Object value) {
		return find(name).orElseGet(() -> create(name, type, value));
	}
	
	/**
	 * Creates a new input based on the name, type and value of the given data.
	 * 
	 * @param data
	 * 			The data to copy as an input.
	 * 
	 * @return the new input
	 */
	default Input add(Data data) {
		return create(data.name(), data.type(), data.value());
	}
	
	/**
	 * Returns {@code true} if an input with the specified name exists,
	 * {@code false} otherwise.
	 * 
	 * @param name
	 * 			The name of the input to look for.
	 * 
	 * @return whether an input with the specified name exists
	 */
	default boolean contains(String name) {
		return find(name).isPresent();
	}
	
	/**
	 * Returns a specific input.
	 * 
	 * @param name
	 * 			The name of the input to look for.
	 * 
	 * @return the input called {@code name}
	 * 
	 * @throws DataNotFoundException if no input called {@code name} can be found
	 */
	default Input get(String name) {
		return find(name).orElseThrow(() -> new DataNotFoundException(name));
	}

	/**
	 * Finds a specific input.
	 * 
	 * @param name
	 * 			The name of the input to look for.
	 * 
	 * @return the input called {@code name}, if found
	 */
	default Optional<Input> find(String name) {
		return StreamSupport.stream(this.spliterator(), false)
							.filter(input -> input.name().equals(name))
							.findAny();
	}

}
