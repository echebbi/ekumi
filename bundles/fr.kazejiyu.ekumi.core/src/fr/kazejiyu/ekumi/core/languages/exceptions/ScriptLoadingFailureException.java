package fr.kazejiyu.ekumi.core.languages.exceptions;

import fr.kazejiyu.ekumi.core.ekumi.Script;
import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.languages.ScriptingLanguage;

/**
 * Thrown when a {@link Script} failed to be loaded by a {@link ScriptingLanguage}.
 */
public class ScriptLoadingFailureException extends EKumiRuntimeException {

	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = 5759617264903215148L;

	public ScriptLoadingFailureException() {
		super();
	}

	public ScriptLoadingFailureException(String message, Throwable cause) {
		super(message, cause);
	}

	public ScriptLoadingFailureException(String message) {
		super(message);
	}

	public ScriptLoadingFailureException(Throwable cause) {
		super(cause);
	}

}
