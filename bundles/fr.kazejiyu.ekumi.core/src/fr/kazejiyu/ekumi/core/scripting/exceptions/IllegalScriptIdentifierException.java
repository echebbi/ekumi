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
