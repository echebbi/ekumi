package fr.kazejiyu.ekumi.model.datatypes;

import fr.kazejiyu.ekumi.model.datatypes.exceptions.DataTypeSerializationException;
import fr.kazejiyu.ekumi.model.datatypes.exceptions.DataTypeUnserializationException;
import fr.kazejiyu.ekumi.model.workflow.Variable;

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
	String getId();
	
	/**
	 * Returns the name of the type.
	 * @return the name of the type.
	 */
	String getName();

	/**
	 * Returns the Java class corresponding to this type.
	 * @return the Java class corresponding to this type.
	 */
	Class<T> getJavaClass();
	
	/**
	 * Returns the default value of a new instance of this type.
	 * @return the default value of a new instance of this type.
	 */
	T getDefaultValue();
	
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
