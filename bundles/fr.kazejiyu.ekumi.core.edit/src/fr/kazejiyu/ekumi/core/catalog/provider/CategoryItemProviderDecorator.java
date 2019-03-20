/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.catalog.provider;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.kazejiyu.ekumi.core.catalog.Category;
import fr.kazejiyu.ekumi.core.workflow.provider.ItemProviderAdapterDecorator;

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
