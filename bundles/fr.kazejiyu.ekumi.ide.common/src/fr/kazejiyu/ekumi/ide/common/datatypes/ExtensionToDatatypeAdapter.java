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

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.ide.common.Activator;
import fr.kazejiyu.ekumi.model.catalog.Catalogs;
import fr.kazejiyu.ekumi.model.datatypes.DataType;

/**
 * <p>An adapter creating {@link DataType} instances from {@link IConfigurationElement}s.</p>
 * 
 * <p>This adapter is used to create a {@link DataType} from the contributions to the 
 * {@link EKumiPlugin#DATATYPES_EXTENSION_ID} extension point.</p>
 * 
 * <p>This class can be used as follows:
 * <pre>IExtensionRegistry extensions = Platform.getExtensionRegistry();
 *ExtensionToDatatypeAdapter adapter = new ExtensionToDatatypeAdapter();
 *List&lt;DataType&lt;?&gt;&gt; datatypes = adapter.adapt(asList(
 *    extensions.getConfigurationElementsFor(EKumiExtensions.DATATYPES_EXTENSION_ID)
 *));</pre></p>
 * 
 * @author Emmanuel CHEBBI
 */
public class ExtensionToDatatypeAdapter {
	
	/**
	 * Creates a new {@link Catalogs} according to the given configuration elements.
	 * 
	 * @param configurationElements
	 * 			The configuration elements describing user extensions.
	 * 
	 * @return a new Catalogs instance.
	 */
	public List<DataType<?>> adapt(List<IConfigurationElement> configurationElements) {
		requireNonNull(configurationElements, "Cannot adapt null configuration elements");
		
		return configurationElements.stream()
									.map(toDataType())
									.filter(Objects::nonNull)
									.map(DataType.class::cast)
									.collect(toList());
	}
	
	private static Function<IConfigurationElement, DataType<?>> toDataType() {
		return conf -> {
			try {
				return (DataType<?>) conf.createExecutableExtension("class");
				
			} catch (CoreException e) {
				Activator.warn(e, "An error occured while creating an executable extension of property 'class' for configuration: " + conf);
				return null;
			}
		};
	}

}
