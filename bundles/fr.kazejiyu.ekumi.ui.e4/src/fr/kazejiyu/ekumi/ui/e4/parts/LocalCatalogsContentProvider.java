/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ui.e4.parts;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

import fr.kazejiyu.ekumi.core.catalog.provider.CatalogDecoratorAdapterFactory;

public class LocalCatalogsContentProvider implements ITreeContentProvider {
	
	private final AdapterFactoryContentProvider contentProvider;

	public LocalCatalogsContentProvider() {
		AdapterFactory adapterFactory = new CatalogDecoratorAdapterFactory();
		contentProvider = new AdapterFactoryContentProvider(adapterFactory);
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return contentProvider.getElements(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		return contentProvider.getChildren(parentElement);
	}

	@Override
	public Object getParent(Object element) {
		return contentProvider.getParent(element);
	}

	@Override
	public boolean hasChildren(Object element) {
		return contentProvider.hasChildren(element);
	}

}
