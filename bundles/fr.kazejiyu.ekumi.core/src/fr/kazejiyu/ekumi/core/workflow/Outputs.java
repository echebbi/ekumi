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
 * A set of data produced by an {@link Activity} during its execution. 
 */
public interface Outputs extends Iterable<Output> {
	
	/**
	 * Creates a new output which value is set to type's default.
	 * 
	 * @param name
	 * 			The name of the new output.
	 * @param type
	 * 			The type of the output.
	 * 
	 * @return the new output
	 * 
	 * @throws VariableAlreadyExistException if a variable with the specified name already exists
	 * @throws DataTypeSerializationException if the specified type does not handled null
	 */
	default Output create(String name, DataType<?> type) {
		return create(name, type, type.defaultValue());
	}
	
	/**
	 * Creates a new output with an initial value.
	 * 
	 * @param name
	 * 			The name of the new output.
	 * @param type
	 * 			The type of the values handled by the new output.
	 * @param value
	 * 			The initial value of the new output.
	 * 
	 * @return the new output
	 * 
	 * @throws VariableAlreadyExistException if a variable with the specified name already exists
	 * @throws DataTypeSerializationException if the specified value is not handled by the type
	 */
	Output create(String name, DataType<?> type, Object value);
	
	/**
	 * <p>
	 * Creates a new output if no one with the specified name already exists.
	 * <p>
	 * The new output is created with a null value.
	 * <p>
	 * Has no effect if a variable with the specified name and type already exist.
	 * 
	 * @param name
	 * 			The name of the new output.
	 * @param type
	 * 			The type of the new output.
	 * 
	 * @return the new output if one has been created, or the one that already exists
	 * 
	 * @throws _ if a variable with the specified name already exists but does not have
	 * 			the expected type
	 * @throws DataTypeSerializationException if the specified value is not handled by the type
	 */
	default Output createIfAbsent(String name, DataType<?> type) {
		return createIfAbsent(name, type, type.defaultValue());
	}
	
	/**
	 * Creates a new output if no one with the specified name already exists.
	 * <p>
	 * Has no effect if a variable with the specified name and type already exist.
	 * 
	 * @param name
	 * 			The name of the new output.
	 * @param type
	 * 			The type of the new output.
	 * @param value
	 * 			The value of the new output.
	 * 
	 * @return the new output if one has been created, or the one that already exists
	 * 
	 * @throws _ if a variable with the specified name already exists but does not have
	 * 			the expected type
	 * @throws DataTypeSerializationException if the specified value is not handled by the type
	 */
	default Output createIfAbsent(String name, DataType<?> type, Object value) {
		return find(name).orElseGet(() -> create(name, type, value));
	}
	
	/**
	 * Creates a new output based on the name, type and value of the given data.
	 * 
	 * @param data
	 * 			The data to copy as an output.
	 * 
	 * @return the new output
	 */
	default Output add(Data data) {
		return create(data.name(), data.type(), data.value());
	}
	
	/**
	 * Returns {@code true} if an output with the specified name exists,
	 * {@code false} otherwise.
	 * 
	 * @param name
	 * 			The name of the output to look for.
	 * 
	 * @return whether an output with the specified name exists
	 */
	default boolean contains(String name) {
		return find(name).isPresent();
	}
	
	/**
	 * Returns a specific output.
	 * 
	 * @param name
	 * 			The name of the output to look for.
	 * 
	 * @return the output called {@code name}
	 * 
	 * @throws DataNotFoundException if no output called {@code name} can be found
	 */
	default Output get(String name) {
		return find(name).orElseThrow(() -> new DataNotFoundException(name));
	}

	/**
	 * Finds a specific output.
	 * 
	 * @param name
	 * 			The name of the output to look for.
	 * 
	 * @return the output called {@code name}, if found
	 */
	default Optional<Output> find(String name) {
		return StreamSupport.stream(this.spliterator(), false)
							.filter(output -> output.name().equals(name))
							.findAny();
	}

}
