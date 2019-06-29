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

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.core.EKumiExtensions;
import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionHook;
import fr.kazejiyu.ekumi.ide.common.Activator;

/**
 * An adapter creating {@link ExecutionHook} instances from {@link IConfigurationElement}s.
 * 
 * <p>This adapter is used to create an execution hook from the contributions to the 
 * {@link EKumiExtensions#EXECUTION_EXTENSION_ID} extension point.
 * <p>
 * This class can be used as follows:
 * <pre>IExtensionRegistry extensions = Platform.getExtensionRegistry();
 *ExtensionToExecutionHookAdapter adapter = new ExtensionToExecutionHookAdapter();
 *List&lt;ExecutionHook&lt;?&gt;&gt; hooks = adapter.adapt(asList(
 *    extensions.getConfigurationElementsFor(EKumiExtensions.EXECUTION_EXTENSION_ID)
 *));</pre>
 * 
 * @author Emmanuel CHEBBI
 */
public class ExtensionToExecutionHookAdapter {
	
	/**
	 * Creates new {@link ExecutionHook} instances according to the given configuration elements.
	 * 
	 * @param configurationElements
	 * 			The configuration elements describing user extensions.
	 * 
	 * @return a new Catalogs instance.
	 */
	public List<ExecutionHook> adapt(List<IConfigurationElement> configurationElements) {
		requireNonNull(configurationElements, "Cannot adapt null configuration elements");
		
		return configurationElements.stream()
									.filter(keepIfProvidesHook())
									.map(toActivityAdapter())
									.filter(Objects::nonNull)
									.collect(toList());
	}
	
	private static Function<IConfigurationElement, ExecutionHook> toActivityAdapter() {
		return conf -> {
			try {
				return (ExecutionHook) conf.createExecutableExtension("class");
			} 
			catch (CoreException e) {
				Activator.warn(e, "An error occurred while creating an executable extension of property 'class' for configuration: " + conf);
				return null;
			}
		};
	}
	
	private static Predicate<IConfigurationElement> keepIfProvidesHook() {
		return conf -> "hook".equals(conf.getName());
	}

}
