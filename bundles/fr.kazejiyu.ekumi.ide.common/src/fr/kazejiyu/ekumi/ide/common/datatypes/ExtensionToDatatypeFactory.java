/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.common.datatypes;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.datatypes.DataTypeFactory;

/**
 * <p>Creates new datatypes from given configuration elements</p>
 */
public class ExtensionToDatatypeFactory implements DataTypeFactory {
	
	private final Supplier<List<IConfigurationElement>> elements;

	public ExtensionToDatatypeFactory(Supplier<List<IConfigurationElement>> elements) {
		this.elements = elements;
	}

	@Override
	public Optional<DataType<?>> find(String id) {
		ExtensionToDatatypeAdapter adapter = new ExtensionToDatatypeAdapter();
		return adapter.adapt(elements.get()).stream()
					  .filter(type -> id.equals(type.getId()))
					  .findAny();
	}
	
}
