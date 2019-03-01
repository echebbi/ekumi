/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.datatypes;

import fr.kazejiyu.ekumi.model.datatypes.DataType;

/**
 * An EKumi {@link DataType datatype} corresponding to the Java {@link String} class. 
 */
public class StringType implements DataType<String> {
	
	@Override
	public String getId() {
		return "fr.kazejiyu.ekumi.datatypes.string";
	}

	@Override
	public String getName() {
		return "String";
	}

	@Override
	public Class<String> getJavaClass() {
		return String.class;
	}

	@Override
	public String getDefaultValue() {
		return "";
	}

	@Override
	public String serialize(String instance) {
		return instance;
	}

	@Override
	public String unserialize(String representation) {
		return representation;
	}
	
	@Override
	public String toString() {
		return "String Type";
	}
	
	@Override
	public boolean equals(Object other) {
		return other instanceof StringType;
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

}
