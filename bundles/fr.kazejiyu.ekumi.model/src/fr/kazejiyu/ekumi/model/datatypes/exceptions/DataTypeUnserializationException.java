package fr.kazejiyu.ekumi.model.datatypes.exceptions;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.exceptions.EKumiRuntimeException;

/**
 * Thrown when a {@link DataType} cannot be unserialized. 
 */
public class DataTypeUnserializationException extends EKumiRuntimeException {

	/**
	 * Generated serial UID
	 */
	private static final long serialVersionUID = 2768708360267452731L;

	public DataTypeUnserializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataTypeUnserializationException(String message) {
		super(message);
	}

	public DataTypeUnserializationException(Throwable cause) {
		super(cause);
	}

}