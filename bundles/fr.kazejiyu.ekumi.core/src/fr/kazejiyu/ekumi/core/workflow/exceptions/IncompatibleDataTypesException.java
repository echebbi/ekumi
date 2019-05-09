/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.exceptions;

import fr.kazejiyu.ekumi.core.datatypes.DataType;

/**
 * <p>
 * Thrown when asked to bind two data which datatypes are not compatibles.
 * <p>
 * In other words, when the input could not consume the ouput's value.
 */
public class IncompatibleDataTypesException extends IllegalArgumentException {

	/**
	 * Generated serial UID.
	 */
	private static final long serialVersionUID = -270997898460712865L;
	
	private final DataType<?> type1;
	
	public DataType<?> getType1() {
		return type1;
	}

	public DataType<?> getType2() {
		return type2;
	}

	private final DataType<?> type2;

	public IncompatibleDataTypesException(DataType<?> type1, DataType<?> type2) {
		super("<" + type1 + "> ; <" + type2 + ">");
		this.type1 = type1;
		this.type2 = type2;
	}
	
	public IncompatibleDataTypesException(DataType<?> type1, DataType<?> type2, Throwable cause) {
		super("<" + type1 + "> ; <" + type2 + ">", cause);
		this.type1 = type1;
		this.type2 = type2;
	}

	public IncompatibleDataTypesException(DataType<?> type1, DataType<?> type2, String message) {
		super(message);
		this.type1 = type1;
		this.type2 = type2;
	}

	public IncompatibleDataTypesException(DataType<?> type1, DataType<?> type2, String message, Throwable cause) {
		super(message, cause);
		this.type1 = type1;
		this.type2 = type2;
	}

}
