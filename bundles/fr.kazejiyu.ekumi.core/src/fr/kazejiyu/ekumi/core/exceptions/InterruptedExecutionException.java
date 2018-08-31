package fr.kazejiyu.ekumi.core.exceptions;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

/**
 * Thrown when an {@link Execution} is interrupted while waiting.
 * 
 * @author Emmanuel CHEBBI
 */
public class InterruptedExecutionException extends EKumiCheckedException {

	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = -2415986723434467131L;

	public InterruptedExecutionException() {
		super();
	}

	public InterruptedExecutionException(String message, Throwable cause) {
		super(message, cause);
	}

	public InterruptedExecutionException(String message) {
		super(message);
	}

	public InterruptedExecutionException(Throwable cause) {
		super(cause);
	}

}
