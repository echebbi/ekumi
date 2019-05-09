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

import fr.kazejiyu.ekumi.core.datatypes.DataType;

/**
 * An object which own a value.
 */
public interface Valuable {
	
	/**
	 * Computes the value of this variable.
	 * @return the value of this variable
	 */
	Object value();

	/**
	 * Returns the type of the value owned.
	 * 
	 * @param <T>
	 * 			The Java type of the value owned.
	 * 
	 * @return the type of the value owned
	 * 
	 * @throws ClassCastException if the type does not hold instances of T
	 */
	<T> DataType<T> type();

}
