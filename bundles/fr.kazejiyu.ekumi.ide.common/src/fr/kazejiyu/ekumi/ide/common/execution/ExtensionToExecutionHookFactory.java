/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.common.execution;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionHook;
import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionHookFactory;

/**
 * Creates new {@link ExecutionHook} from given configuration elements
 */
public class ExtensionToExecutionHookFactory implements ExecutionHookFactory {
	
	private final Supplier<List<IConfigurationElement>> elements;

	public ExtensionToExecutionHookFactory(Supplier<List<IConfigurationElement>> elements) {
		this.elements = elements;
	}

	@Override
	public Optional<ExecutionHook> find(String id) {
		ExtensionToExecutionHookAdapter adapter = new ExtensionToExecutionHookAdapter();
		return adapter.adapt(elements.get()).stream()
					  .filter(hook -> id.equals(hook.id()))
					  .findAny();
	}
	
}
