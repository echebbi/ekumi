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

import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * Thrown when an {@link Execution} is interrupted while waiting.
 * 
 * @author Emmanuel CHEBBI
 */
public class InterruptedExecutionException extends EKumiCheckedException {

	/**
	 * Generated serial version ID
	 */
	private static final long serialVersionUID = -2415986723434467131L;

	public InterruptedExecutionException() {
		super();
	}

	public InterruptedExecutionException(String message, Throwable cause) {
		super(message, cause);
	}

	public InterruptedExecutionException(String message) {
		super(message);
	}

	public InterruptedExecutionException(Throwable cause) {
		super(cause);
	}

}
