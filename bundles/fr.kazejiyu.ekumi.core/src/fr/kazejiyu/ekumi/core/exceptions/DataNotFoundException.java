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

import fr.kazejiyu.ekumi.core.workflow.Data;

/**
 * Thrown when a specific {@link Data} cannot be found.
 * <p>
 * This can happen when, for example, a registry is searched for a data
 * with a specific name. 
 */
public class DataNotFoundException extends EKumiRuntimeException {

	/**
	 * Generated serial UID
	 */
	private static final long serialVersionUID = -1920855809645877020L;

	public DataNotFoundException() {
		super();
	}

	public DataNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataNotFoundException(String message) {
		super(message);
	}

	public DataNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
