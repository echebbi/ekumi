package fr.kazejiyu.ekumi.core.languages.exceptions;

import fr.kazejiyu.ekumi.core.ekumi.Script;
import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.languages.ScriptingLanguage;

/**
 * Thrown when a {@link Script} cannot be {@link ScriptingLanguage resolved} because the
 * given identifier is not properly formatted.
 * 
 * @author Emmanuel CHEBBI
 */
public class IllegalScripIdentifierException extends EKumiRuntimeException {

	/**
	 * Generated serial ID 
	 */
	private static final long serialVersionUID = 4099699524062874661L;

	public IllegalScripIdentifierException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalScripIdentifierException(String message) {
		super(message);
	}

	public IllegalScripIdentifierException(Throwable cause) {
		super(cause);
	}

}
