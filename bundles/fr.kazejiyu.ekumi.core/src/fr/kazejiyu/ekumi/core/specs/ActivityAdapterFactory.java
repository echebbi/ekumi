/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.specs;

import java.util.Optional;

/**
 * Creates {@link DataType} instances.
 */
@FunctionalInterface
public interface ActivityAdapterFactory {
	
	/**
	 * Finds an adapter able to turn the given specification into an Activity.
	 * 
	 * @param specification
	 *  		The specification to adapt.
	 *  
	 * @return the adapter if it has been found
	 */
	Optional<ActivityAdapter> findAdapterFor(Object specification);

}
