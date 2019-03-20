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

/**
 * A runtime exception that can be thrown by EKumi components.<br>
 * <br>
 * All the runtime exceptions declared by the framework inherit from this class, 
 * so that it is easier to filter out all the exceptions related to EKumi.
 *
 * @author Emmanuel CHEBBI
 */
public class EKumiRuntimeException extends RuntimeException {

	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = 3896127527002513732L;

	public EKumiRuntimeException() {
		super();
	}

	public EKumiRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public EKumiRuntimeException(String message) {
		super(message);
	}

	public EKumiRuntimeException(Throwable cause) {
		super(cause);
	}

}
