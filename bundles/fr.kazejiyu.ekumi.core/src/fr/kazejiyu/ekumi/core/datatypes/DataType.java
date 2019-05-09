/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.datatypes;

import fr.kazejiyu.ekumi.core.datatypes.exceptions.DataTypeSerializationException;
import fr.kazejiyu.ekumi.core.datatypes.exceptions.DataTypeUnserializationException;

/**
 * Defines the type of a {@link Variable}.
 * 
 * @param <T> The Java class of the type.
 * 
 * @author Emmanuel CHEBBI
 */
public interface DataType<T> {
	
	/**
	 * Returns an identifier for this type.
	 * @return an identifier for this type.
	 */
	String id();
	
	/**
	 * Returns the name of the type.
	 * @return the name of the type.
	 */
	String name();

	/**
	 * Returns the Java class corresponding to this type.
	 * @return the Java class corresponding to this type.
	 */
	Class<T> toJavaClass();
	
	/**
	 * Returns the default value of a new instance of this type.
	 * @return the default value of a new instance of this type.
	 */
	T defaultValue();
	
	/**
	 * Returns {@code true} if this can serialize the given object,
	 * {@code false} otherwise.
	 * 
	 * @param object
	 * 			The object to check.
	 * 
	 * @return whether this can serialize the given object
	 * 
	 * @see #assertHandles(Object)
	 */
	default boolean handles(Object object) {
		return toJavaClass().isInstance(object);
	}
	
	/**
	 * Asserts that this can serialize the given object.
	 * 
	 * @param object
	 * 			The object to check.
	 * 
	 * @throws DataTypeSerializationException if the object cannot be serialized
	 * 
	 * @see #handles(Object)
	 */
	default void assertHandles(Object object) {
		if (! handles(object)) {
			throw new DataTypeSerializationException("Cannot serialize " + null);
		}
	}
	
	/**
	 * Returns a String representation of the type.<br>
	 * <br>
	 * For any type {@code type}, the following assertion must be {@code true}:
	 * <pre>{@code instance.equals( type.unserialize(type.serialize(instance)) );}</pre>
	 * 
	 * @return a String representation of the type.
	 * 
	 * @throws DataTypeSerializationException if T cannot be turned into a String
	 * 
	 * @see #unserialize(String)
	 */
	String serialize(T instance);
	
	/**
	 * Returns a new instance of the type from a given representation.<br>
	 * <br>
	 * For any type {@code type}, the following assertion must be {@code true}:
	 * <pre>{@code instance.equals( type.unserialize(type.serialize(instance)) );}</pre>
	 * 
	 * @param representation
	 * 			The string representation of the type.
	 * 
	 * @throws DataTypeUnserializationException if representation cannot be turned into an instance of T
	 * 
	 * @see #serialize()
	 */
	T unserialize(String representation);
}
