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

import static java.lang.Double.parseDouble;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.datatypes.exceptions.DataTypeUnserializationException;

/**
 * An EKumi {@link DataType datatype} corresponding to the Java {@link Double} class.
 */
public class DoubleType implements DataType<Double> {
	
	@Override
	public String getId() {
		return "fr.kazejiyu.ekumi.datatypes.double";
	}

	@Override
	public String getName() {
		return "Double";
	}

	@Override
	public Class<Double> getJavaClass() {
		return Double.class;
	}

	@Override
	public Double getDefaultValue() {
		return 0d;
	}

	@Override
	public String serialize(Double instance) {
		return instance.toString();
	}

	@Override
	public Double unserialize(String representation) {
		try {
			return parseDouble(representation);
			
		} catch(NumberFormatException e) {
			throw new DataTypeUnserializationException("Unable to create a Double from the representation: \"" + representation + "\"", e);
		}
	}
	
	@Override
	public String toString() {
		return "Double Type";
	}
	
	@Override
	public boolean equals(Object other) {
		return other instanceof DoubleType;
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
	
}
