/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.model.exceptions;

/**
 * A checked exception that can be thrown by EKumi components.<br>
 * <br>
 * All the checked exceptions declared by the framework inherit from this class,
 * so that it is easier to filter out all the exceptions related to EKumi.
 * 
 * @author Emmanuel CHEBBI
 */
public class EKumiCheckedException extends Exception implements EKumiException {

	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = 3697384876612766515L;

	public EKumiCheckedException() {
		super();
	}

	public EKumiCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public EKumiCheckedException(String message) {
		super(message);
	}

	public EKumiCheckedException(Throwable cause) {
		super(cause);
	}

}
