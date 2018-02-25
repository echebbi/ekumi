package fr.kazejiyu.ekumi.core.exceptions;

/**
 * A runtime exception that can be thrown by EKumi.<br>
 * <br>
 * All the exceptions declared by the framework inherit from class, so that it is easier
 * to filter out all the exceptions related to EKumi.
 *
 * @author Emmanuel CHEBBI
 */
public class EKumiRuntimeException extends RuntimeException {

	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = 3896127527002513732L;

	public EKumiRuntimeException() {
		super();
	}

	public EKumiRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public EKumiRuntimeException(String message) {
		super(message);
	}

	public EKumiRuntimeException(Throwable cause) {
		super(cause);
	}

}
