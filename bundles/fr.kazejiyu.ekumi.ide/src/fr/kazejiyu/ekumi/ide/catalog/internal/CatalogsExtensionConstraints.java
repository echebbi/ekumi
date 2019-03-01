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

import org.eclipse.core.runtime.IConfigurationElement;

/**
 * Ensures that the extensions of the 'catalogs' extension point
 * provide correct data.
 * 
 * @author Emmanuel CHEBBI
 */
class CatalogsExtensionConstraints {

	private static final String CATALOG = "catalog";
	private static final String CATEGORY = "category";
	private static final String ID = "id";
	private static final String NAME = "name";
	private static final String PARENT = "parent";

	/** @return whether the configuration element provides correct information */
	boolean isAValidCatalogElement(IConfigurationElement configurationElement) {
		if (! configurationElement.getName().equals(CATALOG))
			return false;
		
		if (configurationElement.getAttribute(ID) == null || configurationElement.getAttribute(ID).isEmpty())
			return false;
		
		if (configurationElement.getAttribute(NAME) == null || configurationElement.getAttribute(NAME).isEmpty())
			return false;
		
		return true;
	}
	
	/** @return whether the configuration element provides correct information */
	boolean isAValidCategoryElement(IConfigurationElement configurationElement) {
		if (! configurationElement.getName().equals(CATEGORY))
			return false;
		
		if (configurationElement.getAttribute(ID) == null || configurationElement.getAttribute(ID).isEmpty())
			return false;
		
		if (configurationElement.getAttribute(NAME) == null || configurationElement.getAttribute(NAME).isEmpty())
			return false;
		
		if (configurationElement.getAttribute(PARENT) == null || configurationElement.getAttribute(PARENT).isEmpty())
			// ignore them for the moment, but will be added to a default category later
			return false;
		
		return true;
	}
	
	/** @return whether the configuration element provides correct information */
	boolean isAValidActivityElement(IConfigurationElement configurationElement) {
		if (! configurationElement.getName().equals("activity"))
			return false;
		
		if (configurationElement.getAttribute(ID) == null || configurationElement.getAttribute(ID).isEmpty())
			return false;
		
		if (configurationElement.getAttribute(NAME) == null || configurationElement.getAttribute(NAME).isEmpty())
			return false;
		
		if (configurationElement.getAttribute("model") == null || configurationElement.getAttribute("model").isEmpty())
			return false;
		
		if (configurationElement.getAttribute(CATEGORY) == null || configurationElement.getAttribute(CATEGORY).isEmpty())
			// ignore them for the moment, but will be added to a default category later
			return false;
		
		return true;
	}
	
}
