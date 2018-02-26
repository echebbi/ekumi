package fr.kazejiyu.ekumi.core.datatypes;

import fr.kazejiyu.ekumi.core.ekumi.Data;

/**
 * Defines the type of a {@link Data}.
 * 
 * @author Emmanuel CHEBBI
 */
public interface DataType<T> {
	
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
	 * For any type {@code t}, the following assertion must be {@code true}:
	 * <pre>{@code t.unserialize(
	 * 
	 * @return a String representation of the type.
	 * 
	 * @see #unserialize(String)
	 */
	String serialize(T object);
	
	/**
	 * 
	 * @param representation
	 * 
	 * @see #serialize()
	 */
	T unserialize(String representation);
}
