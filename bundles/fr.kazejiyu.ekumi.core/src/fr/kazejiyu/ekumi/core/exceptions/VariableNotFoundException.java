/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.exceptions;

import fr.kazejiyu.ekumi.core.workflow.Variable;

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
