/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.scripting.exceptions;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.workflow.Script;

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
