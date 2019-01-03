package fr.kazejiyu.ekumi.model.datatypes.exceptions;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.exceptions.EKumiRuntimeException;

/**
 * Thrown when a {@link DataType} cannot be serialized. 
 */
public class DataTypeSerializationException extends EKumiRuntimeException {

	/**
	 * Generated serial UID
	 */
	private static final long serialVersionUID = -2672697652408359051L;

	public DataTypeSerializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataTypeSerializationException(String message) {
		super(message);
	}

	public DataTypeSerializationException(Throwable cause) {
		super(cause);
	}

}
