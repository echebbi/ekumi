 
package fr.kazejiyu.ekumi.ui.e4.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

import fr.kazejiyu.ekumi.model.catalog.Catalogs;
import fr.kazejiyu.ekumi.model.catalog.Group;
import fr.kazejiyu.ekumi.model.catalog.provider.CatalogDecoratorAdapterFactory;

/**
 * A view displaying an {@link Catalogs} within a Tree viewer.
 * 
 * @author Emmanuel CHEBBI
 */
public class CatalogsView {
	
	@Inject
	private Catalogs catalogs;
	
	private TreeViewer viewer;

	@PostConstruct
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.BORDER);
		Tree tree = viewer.getTree();
		tree.setLinesVisible(true);
		tree.setHeaderVisible(true);
		
		AdapterFactory adapterFactory = new CatalogDecoratorAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		viewer.setLabelProvider(labelProvider);
		viewer.setInput(catalogs);
		viewer.setComparator(new AlphabeticalOrder());
	}
	
	/** Compares two Execution by putting the one with the most recent start date first */
	private static class AlphabeticalOrder extends ViewerComparator {

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			if (e1 instanceof Group && e2 instanceof Group) {
				Group g1 = (Group) e1;
				Group g2 = (Group) e2;

				return g1.getName().compareTo(g2.getName());
			}
			
			return super.compare(viewer, e1, e2);
		}
		
	}

	@Focus
	public void setFocus() {
		viewer.getControl().setFocus();

	}

	/**
	 * This method is kept for E3 compatibility. You can remove it if you do not
	 * mix E3 and E4 code. <br/>
	 * With E4 code you will set directly the selection in ESelectionService and
	 * you do not receive a ISelection
	 * 
	 * @param s
	 *            the selection received from JFace (E3 mode)
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ISelection s) {
		if (s==null || s.isEmpty())
			return;

		if (s instanceof IStructuredSelection) {
			IStructuredSelection iss = (IStructuredSelection) s;
			if (iss.size() == 1)
				setSelection(iss.getFirstElement());
			else
				setSelection(iss.toArray());
		}
	}

	/**
	 * This method manages the selection of your current object. In this example
	 * we listen to a single Object (even the ISelection already captured in E3
	 * mode). <br/>
	 * You should change the parameter type of your received Object to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current object received
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {
		// Remove the 2 following lines in pure E4 mode, keep them in mixed mode
		if (o instanceof ISelection) // Already captured
			return;
		
		// we're not interested in selection for now
	}

	/**
	 * This method manages the multiple selection of your current objects. <br/>
	 * You should change the parameter type of your array of Objects to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current array of objects received in case of multiple selection
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object[] selectedObjects) {
		// we're not interested in selection for now
	}
}