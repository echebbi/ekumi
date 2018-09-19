package fr.kazejiyu.ekumi.catalog.provider;

import org.eclipse.emf.edit.provider.DecoratorAdapterFactory;
import org.eclipse.emf.edit.provider.IItemProviderDecorator;

import fr.kazejiyu.ekumi.catalog.Catalog;
import fr.kazejiyu.ekumi.catalog.Category;

public class CatalogDecoratorAdapterFactory extends DecoratorAdapterFactory {
	
	public CatalogDecoratorAdapterFactory() {
		super(new CatalogItemProviderAdapterFactory());
	}

	@Override
	protected IItemProviderDecorator createItemProviderDecorator(Object target, Object type) {
		// Delegate to custom item providers
		if (target instanceof Catalog)
			return new CatalogItemProviderDecorator(this);
		if (target instanceof Category)
			return new CategoryItemProviderDecorator(this);
		
		// Use default, generated item providers
		return new ForwardingItemProviderAdapterDecorator(this);
	}

}
