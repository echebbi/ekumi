/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.impl;

import static java.util.Objects.requireNonNull;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.workflow.Data;

public abstract class AbstractData implements Data {
	
	/**
	 * The human-readable name of the instance.
	 */
	private final String name;
	/**
	 * The type defining the values that can be handled by the instance.
	 */
	private final DataType<?> type;
	/**
	 * The value held by the instance. Allowed depend on {@code type}.
	 */
	protected Object value;

	public AbstractData(String name, DataType<?> type, Object value) {
		this.name = requireNonNull(name, "name");
		this.type = requireNonNull(type, "type");
		this.value = value;
		
		if (name.isEmpty()) {
			throw new IllegalArgumentException("name must not be empty");
		}
		this.type.assertHandles(value);
	}
	
	@Override
	public Object value() {
		return value;
	}
	
	@Override
	public String id() {
		return name;
	}
	
	@Override
	public String name() {
		return name;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> DataType<T> type() {
		return (DataType<T>) type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AbstractData)) {
			return false;
		}
		AbstractData other = (AbstractData) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}

}
