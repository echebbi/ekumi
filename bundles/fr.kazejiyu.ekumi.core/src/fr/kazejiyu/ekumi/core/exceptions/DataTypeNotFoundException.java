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

import fr.kazejiyu.ekumi.core.datatypes.DataType;

/**
 * Thrown when a specific {@link DataType} cannot be found.
 * <p>
 * This can happen when, for example, a registry is searched for a datatype
 * with a given name. 
 */
public class DataTypeNotFoundException extends EKumiRuntimeException {

	/**
	 * Generated serial UID
	 */
	private static final long serialVersionUID = -1920855809645877020L;

	public DataTypeNotFoundException() {
		super();
	}

	public DataTypeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataTypeNotFoundException(String message) {
		super(message);
	}

	public DataTypeNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
