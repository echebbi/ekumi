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
