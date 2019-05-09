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

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.workflow.Output;

public class BasicOutput extends AbstractData implements Output {

	public BasicOutput(String name, DataType<?> type) {
		this(name, type, type.defaultValue());
	}
	
	public BasicOutput(String name, DataType<?> type, Object value) {
		super(name, type, value);
	}

	@Override
	public void set(Object value) {
		if (! type().handles(value)) {
			throw new IllegalArgumentException(value + " is not managed by the type " + type());
		}
		this.value = value;
	}

	@Override
	public String toString() {
		return "BasicOutput [name=" + name() + ", type=" + type() + ", value=" + value() + "]";
	}

}
