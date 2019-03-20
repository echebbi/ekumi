/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.catalog.internal;

import static java.util.Arrays.asList;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;

import fr.kazejiyu.ekumi.core.EKumiExtensions;
import fr.kazejiyu.ekumi.core.EKumiPlugin;
import fr.kazejiyu.ekumi.core.catalog.Catalog;
import fr.kazejiyu.ekumi.core.catalog.Catalogs;
import fr.kazejiyu.ekumi.core.catalog.Category;

/**
 * An OSGI Declarative Service making a {@link Catalogs} instance available for injection.<br>
 * <br>
 * This instance is filled with {@link Catalog} and {@link Category} instances provided via extensions.<br>
 * <br>
 * The corresponding extension point is {@link EKumiPlugin#CATALOGS_EXTENSION_ID}.
 * 
 * @author Emmanuel CHEBBI
 */
public class CatalogsCreationFunction implements IContextFunction {
	
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		IExtensionRegistry extensions = context.get(IExtensionRegistry.class);
		
		ExtensionToCatalogsAdapter adapter = new ExtensionToCatalogsAdapter();
		
		Catalogs catalogs = adapter.adapt(
			asList(
				extensions.getConfigurationElementsFor(EKumiExtensions.CATALOGS_EXTENSION_ID)
			)
		);

		ContextInjectionFactory.inject(catalogs, context);
		return catalogs;
	}
	
}
