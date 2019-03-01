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

import javax.inject.Inject;

import org.eclipse.ui.navigator.CommonNavigator;

import fr.kazejiyu.ekumi.model.catalog.Catalogs;

public class CatalogsNavigator extends CommonNavigator {
	
	@Inject
	private Catalogs catalogs;

	@Override
	protected Catalogs getInitialInput() {
		return catalogs;
	}
	
}
