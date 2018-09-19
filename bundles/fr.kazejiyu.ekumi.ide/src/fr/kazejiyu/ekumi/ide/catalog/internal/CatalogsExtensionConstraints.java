package fr.kazejiyu.ekumi.ide.catalog.internal;

import org.eclipse.core.runtime.IConfigurationElement;

/**
 * Ensures that the extensions of the 'catalogs' extension point
 * provide correct data.
 * 
 * @author Emmanuel CHEBBI
 */
class CatalogsExtensionConstraints {

	/** @return whether the configuration element provides correct information */
	boolean isAValidCatalogElement(IConfigurationElement configurationElement) {
		if (! configurationElement.getName().equals("catalog"))
			return false;
		
		if (configurationElement.getAttribute("id") == null || configurationElement.getAttribute("id").isEmpty())
			return false;
		
		if (configurationElement.getAttribute("name") == null || configurationElement.getAttribute("name").isEmpty())
			return false;
		
		return true;
	}
	
	/** @return whether the configuration element provides correct information */
	boolean isAValidCategoryElement(IConfigurationElement configurationElement) {
		if (! configurationElement.getName().equals("category"))
			return false;
		
		if (configurationElement.getAttribute("id") == null || configurationElement.getAttribute("id").isEmpty())
			return false;
		
		if (configurationElement.getAttribute("name") == null || configurationElement.getAttribute("name").isEmpty())
			return false;
		
		if (configurationElement.getAttribute("parent") == null || configurationElement.getAttribute("parent").isEmpty())
			// ignore them for the moment, but will be added to a default category later
			return false;
		
		return true;
	}
	
}
