package fr.kazejiyu.ekumi.ui.e4.parts;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

import fr.kazejiyu.ekumi.model.catalog.provider.CatalogDecoratorAdapterFactory;

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
