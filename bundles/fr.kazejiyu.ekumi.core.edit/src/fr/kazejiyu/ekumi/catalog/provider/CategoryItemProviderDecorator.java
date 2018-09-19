package fr.kazejiyu.ekumi.catalog.provider;

import java.util.Collection;

import fr.kazejiyu.ekumi.catalog.Category;
import fr.kazejiyu.ekumi.core.ekumi.provider.ItemProviderAdapterDecorator;

/**
 * A custom item provider dedicated to {@link Category} instances.
 * 
 * @author Emmanuel CHEBBI
 */
public class CategoryItemProviderDecorator extends ItemProviderAdapterDecorator {
	
	public CategoryItemProviderDecorator(CatalogDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return ((Category) object).getName();
	}
	
	@Override
	public boolean hasChildren(Object object) {
		return ! getChildren(object).isEmpty();
	}

	@Override
	public Collection<?> getChildren(Object object) {
		return ((Category) object).getCategories();
	}

}