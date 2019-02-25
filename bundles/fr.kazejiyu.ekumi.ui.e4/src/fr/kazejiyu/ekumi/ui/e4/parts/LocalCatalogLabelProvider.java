package fr.kazejiyu.ekumi.ui.e4.parts;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.navigator.IDescriptionProvider;

import fr.kazejiyu.ekumi.model.catalog.provider.CatalogDecoratorAdapterFactory;

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
