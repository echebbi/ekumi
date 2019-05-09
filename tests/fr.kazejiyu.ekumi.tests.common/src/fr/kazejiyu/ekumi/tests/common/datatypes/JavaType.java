/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.tests.common.datatypes;

import fr.kazejiyu.ekumi.core.datatypes.DataType;

public class JavaType<T> implements DataType<T> {
	
	private final Class<T> clazz;

	public JavaType(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public String id() {
		return "javatype";
	}

	@Override
	public String name() {
		return "Java Type (" + clazz + ")";
	}

	@Override
	public Class<T> toJavaClass() {
		return clazz;
	}

	@Override
	public T defaultValue() {
		return null;
	}

	@Override
	public boolean handles(Object object) {
		return false;
	}

	@Override
	public String serialize(T instance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T unserialize(String representation) {
		// TODO Auto-generated method stub
		return null;
	}

}
