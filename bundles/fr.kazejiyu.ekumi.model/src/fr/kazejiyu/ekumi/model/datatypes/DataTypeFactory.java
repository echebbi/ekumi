/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.model.datatypes;

import java.util.Optional;

/**
 * Creates {@link DataType} instances.
 */
@FunctionalInterface
public interface DataTypeFactory {
	
	/**
	 * Creates a new type according to the given id.
	 *  
	 * @param id
	 * 			The id of the type to find.
	 * 
	 * @return the type if it has been found
	 */
	Optional<DataType<?>> find(String id);

}
