package fr.kazejiyu.ekumi.ui.e4.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

import fr.kazejiyu.ekumi.core.activities.impl.BasicSequence;
import fr.kazejiyu.ekumi.core.activities.impl.BasicStructuredLoop;
import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.ekumi.History;
import fr.kazejiyu.ekumi.core.ekumi.provider.EkumiItemProviderAdapterFactory;
import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.core.execution.BasicExecution;
import fr.kazejiyu.ekumi.ide.history.PersistExecutionInWorkspace;

/**
 * A view displaying an {@link ExecutionHistory} within a {@link TableTreeViewer}.
 *
 * @author Emmanuel CHEBBI
 */
public class ExecutionHistoryView {
	
	@Inject
	private History history;
	
	private TreeViewer viewer;

	@PostConstruct
	public void createPartControl(Composite parent) throws InterruptedExecutionException {
		BasicSequence a = new BasicSequence();
		a.setId("myId");
		a.setName("a Sequence");
		
		Activity b = new BasicStructuredLoop();
		b.setId("m");
		b.setName("a Loop");
		
		a.setRoot(b);

		Execution ex = new BasicExecution();
		ex.setActivity(a);
		
		ex.getContext().getEvents().onExecutionEvent(new PersistExecutionInWorkspace());
		ex.start();
		ex.join();
		
		
		viewer = new TreeViewer(parent, SWT.BORDER);
		Tree tree = viewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		
		EkumiItemProviderAdapterFactory adapterFactory = new EkumiItemProviderAdapterFactory();
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setInput(history);
	}

	@Focus
	public void setFocus() {
		viewer.getControl().setFocus();

	}

	/**
	 * This method is kept for E3 compatiblity. You can remove it if you do not
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

		System.out.println("Selected: " + o);
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

		// Test if label exists (inject methods are called before PostConstruct)
		System.out.println("Selected " + selectedObjects.length);
	}
}
