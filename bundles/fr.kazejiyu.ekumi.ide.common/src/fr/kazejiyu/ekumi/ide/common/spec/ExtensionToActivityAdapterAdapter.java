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

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.core.EKumiExtensions;
import fr.kazejiyu.ekumi.core.catalog.Catalogs;
import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.specs.ActivityAdapter;
import fr.kazejiyu.ekumi.ide.common.Activator;

/**
 * An adapter creating {@link ActivityAdapter} instances from {@link IConfigurationElement}s.
 * <p>
 * This adapter is used to create a {@link DataType} from the contributions to the 
 * {@link EKumiExtensions#SPECS_EXTENSION_ID} extension point.
 * <p>
 * This class can be used as follows:
 * <pre>IExtensionRegistry extensions = Platform.getExtensionRegistry();
 *ExtensionToActivityAdapterAdapter adapter = new ExtensionToActivityAdapterAdapter();
 *List&lt;ActivityAdapter&lt;?&gt;&gt adapters = adapter.adapt(asList(
 *    extensions.getConfigurationElementsFor(EKumiExtensions.SPECS_EXTENSION_ID)
 *));</pre>
 * 
 * @author Emmanuel CHEBBI
 */
public class ExtensionToActivityAdapterAdapter {
	
	/**
	 * Creates a new {@link Catalogs} according to the given configuration elements.
	 * 
	 * @param configurationElements
	 * 			The configuration elements describing user extensions.
	 * 
	 * @return a new Catalogs instance.
	 */
	public List<ActivityAdapter> adapt(List<IConfigurationElement> configurationElements) {
		requireNonNull(configurationElements, "Cannot adapt null configuration elements");
		
		return configurationElements.stream()
									.map(toActivityAdapter())
									.filter(Objects::nonNull)
									.collect(toList());
	}
	
	private static Function<IConfigurationElement, ActivityAdapter> toActivityAdapter() {
		return conf -> {
			try {
				return (ActivityAdapter) conf.createExecutableExtension("adapter");
				
			} catch (CoreException e) {
				Activator.warn(e, "An error occured while creating an executable extension of property 'class' for configuration: " + conf);
				return null;
			}
		};
	}

}
