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

import java.util.Optional;

import fr.kazejiyu.ekumi.core.workflow.exceptions.IncompatibleDataTypesException;

/**
 * A data consumed by an activity.
 */
public interface Input extends Data {
	
	/**
	 * Updates its value with the value of the data
	 * it is bound to.
	 * <p>
	 * Has no effect if this is not bind to any data.
	 * 
	 * @see #bind(Data)
	 */
	void resolve();
	
	/**
	 * Sets this as a consumer of another data's value.
	 * <p>
	 * That means that calling {@link #resolve()} thereafter will
	 * sets its value to the value of the other data.
	 * <p>
	 * If this is already bound to another data, then the
	 * previous binding is discarded.
	 * <p>
	 * Passing {@code null} as a parameter discards any existing
	 * binding.
	 * 
	 * @param output
	 * 			The data producer to bind, or null to unbind.
	 * 
	 * @throws IncompatibleDataTypesException if the two data cannot be connected
	 * @throws IllegalArgumentException if output == this
	 * 
	 * @see #unbind()
	 */
	void bind(Data output);
	
	/**
	 * Sets this as a consumer of no other data's value.
	 * <p>
	 * Same as calling {@code bind(null)}.
	 * @see #bind(Data)
	 */
	default void unbind() {
		bind(null);
	}
	
	/**
	 * Returns the data to which this is bound, if any.
	 * @return the data to which this is bound, if any
	 */
	Optional<Data> binding();

}
