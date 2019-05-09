/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow;

public interface Output extends Data {

	/**
	 * Sets this value.
	 * 
	 * @param value
	 * 			The new value of this.
	 * 
	 * @throws IllegalArgumentException if value is not coherent with this datatype
	 */
	void set(Object value);
}
