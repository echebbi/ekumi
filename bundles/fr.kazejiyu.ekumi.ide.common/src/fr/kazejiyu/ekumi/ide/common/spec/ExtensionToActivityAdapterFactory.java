/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.common.spec;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.core.specs.ActivityAdapter;
import fr.kazejiyu.ekumi.core.specs.ActivityAdapterFactory;

/**
 * Creates new {@link ActivityAdapter} from given configuration elements
 */
public class ExtensionToActivityAdapterFactory implements ActivityAdapterFactory {
	
	private final Supplier<List<IConfigurationElement>> elements;

	public ExtensionToActivityAdapterFactory(Supplier<List<IConfigurationElement>> elements) {
		this.elements = elements;
	}

	@Override
	public Optional<ActivityAdapter> findAdapterFor(Object specification) {
		ExtensionToActivityAdapterAdapter adapter = new ExtensionToActivityAdapterAdapter();
		return adapter.adapt(elements.get()).stream()
					  .filter(candidate -> candidate.canAdapt(specification))
					  .findAny();
	}
	
}
