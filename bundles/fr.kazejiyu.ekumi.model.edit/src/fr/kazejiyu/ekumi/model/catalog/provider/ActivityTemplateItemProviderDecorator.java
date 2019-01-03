package fr.kazejiyu.ekumi.model.catalog.provider;

import fr.kazejiyu.ekumi.model.catalog.ActivityTemplate;
import fr.kazejiyu.ekumi.model.catalog.Category;
import fr.kazejiyu.ekumi.model.workflow.provider.ItemProviderAdapterDecorator;

/**
 * A custom item provider dedicated to {@link Category} instances.
 * 
 * @author Emmanuel CHEBBI
 */
public class ActivityTemplateItemProviderDecorator extends ItemProviderAdapterDecorator {
	
	public ActivityTemplateItemProviderDecorator(CatalogDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return ((ActivityTemplate) object).getName();
	}
	
}