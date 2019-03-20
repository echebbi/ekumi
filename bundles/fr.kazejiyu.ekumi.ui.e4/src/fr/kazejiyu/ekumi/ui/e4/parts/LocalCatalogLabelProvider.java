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
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.navigator.IDescriptionProvider;

import fr.kazejiyu.ekumi.core.catalog.provider.CatalogDecoratorAdapterFactory;

public class LocalCatalogLabelProvider extends LabelProvider implements IDescriptionProvider {


	private final AdapterFactoryLabelProvider labelProvider;
	
	public LocalCatalogLabelProvider() {
		AdapterFactory adapterFactory = new CatalogDecoratorAdapterFactory();
		labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
	}
	
	@Override
	public String getText(Object element) {
		return labelProvider.getText(element);
	}
	
	@Override
	public String getDescription(Object element) {
		return "<description>";
	}
	
	@Override
	public Image getImage(Object element) {
		return null;
	}

}
