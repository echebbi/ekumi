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

/**
 * Thrown when asked for a scripting language that does not exist. 
 */
public class ScriptingLanguageNotFoundException extends IllegalArgumentException {

	/**
	 * Generated serial UID.
	 */
	private static final long serialVersionUID = -2927444219512579551L;

	public ScriptingLanguageNotFoundException() {
		super();
	}

	public ScriptingLanguageNotFoundException(String s) {
		super(s);
	}

	public ScriptingLanguageNotFoundException(Throwable cause) {
		super(cause);
	}

	public ScriptingLanguageNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
