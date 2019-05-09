/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.exceptions;

/**
 * Thrown when ask to create a variable that already exists. 
 */
public class VariableAlreadyExistException extends IllegalArgumentException {

	/**
	 * Generated serial UID.
	 */
	private static final long serialVersionUID = 8355891344547022230L;

	public VariableAlreadyExistException() {
		super();
	}

	public VariableAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public VariableAlreadyExistException(String s) {
		super(s);
	}

	public VariableAlreadyExistException(Throwable cause) {
		super(cause);
	}

}
