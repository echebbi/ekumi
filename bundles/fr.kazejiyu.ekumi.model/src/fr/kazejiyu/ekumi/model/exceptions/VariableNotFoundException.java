package fr.kazejiyu.ekumi.model.exceptions;

import fr.kazejiyu.ekumi.model.workflow.Variable;

/**
 * Thrown when a specific {@link Variable} cannot be found (when searched
 * by name, for instance). 
 */
public class VariableNotFoundException extends EKumiRuntimeException {

	/**
	 * Generated serial UID
	 */
	private static final long serialVersionUID = -1920855809645877020L;

	public VariableNotFoundException() {
		super();
	}

	public VariableNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public VariableNotFoundException(String message) {
		super(message);
	}

	public VariableNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
