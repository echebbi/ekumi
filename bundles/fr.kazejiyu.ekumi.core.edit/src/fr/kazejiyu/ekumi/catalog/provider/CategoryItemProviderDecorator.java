package fr.kazejiyu.ekumi.catalog.provider;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.kazejiyu.ekumi.core.ekumi.provider.ItemProviderAdapterDecorator;
import fr.kazejiyu.ekumi.model.catalog.Category;

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
		Category category = ((Category) object);
		
		return Stream.concat(category.getCategories().stream(),
							 category.getActivityTemplates().stream())
					 .collect(Collectors.toList());
	}

}