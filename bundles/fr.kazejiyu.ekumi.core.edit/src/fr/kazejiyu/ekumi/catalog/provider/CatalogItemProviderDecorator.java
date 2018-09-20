package fr.kazejiyu.ekumi.catalog.provider;

import java.util.Collection;

import fr.kazejiyu.ekumi.core.ekumi.provider.ItemProviderAdapterDecorator;
import fr.kazejiyu.ekumi.model.catalog.Catalog;

/**
 * A custom item provider dedicated to {@link Catalog} instances.
 * 
 * @author Emmanuel CHEBBI
 */
public class CatalogItemProviderDecorator extends ItemProviderAdapterDecorator {
	
	public CatalogItemProviderDecorator(CatalogDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return ((Catalog) object).getName();
	}

	@Override
	public boolean hasChildren(Object object) {
		return ! getChildren(object).isEmpty();
	}

	@Override
	public Collection<?> getChildren(Object object) {
		return ((Catalog) object).getCategories();
	}
	
}