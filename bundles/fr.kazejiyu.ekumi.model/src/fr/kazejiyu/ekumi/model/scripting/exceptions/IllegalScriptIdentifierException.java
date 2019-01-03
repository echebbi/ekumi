package fr.kazejiyu.ekumi.model.scripting.exceptions;

import fr.kazejiyu.ekumi.model.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.workflow.Script;

/**
 * Thrown when a {@link Script} cannot be {@link ScriptingLanguage resolved} because the
 * given identifier is not properly formatted.
 * 
 * @author Emmanuel CHEBBI
 */
public class IllegalScriptIdentifierException extends EKumiRuntimeException {

	/**
	 * Generated serial ID 
	 */
	private static final long serialVersionUID = 4099699524062874661L;

	public IllegalScriptIdentifierException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalScriptIdentifierException(String message) {
		super(message);
	}

	public IllegalScriptIdentifierException(Throwable cause) {
		super(cause);
	}

}
