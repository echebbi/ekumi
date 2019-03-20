/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.datatypes.exceptions;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;

/**
 * Thrown when a {@link DataType} cannot be unserialized. 
 */
public class DataTypeUnserializationException extends EKumiRuntimeException {

	/**
	 * Generated serial UID
	 */
	private static final long serialVersionUID = 2768708360267452731L;

	public DataTypeUnserializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataTypeUnserializationException(String message) {
		super(message);
	}

	public DataTypeUnserializationException(Throwable cause) {
		super(cause);
	}

}
