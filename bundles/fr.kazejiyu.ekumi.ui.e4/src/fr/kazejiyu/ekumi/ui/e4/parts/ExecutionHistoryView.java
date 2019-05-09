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

import java.text.DateFormat;
import java.util.Objects;
import java.util.function.Function;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.IElementComparer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import fr.kazejiyu.ekumi.core.catalog.Identifiable;
import fr.kazejiyu.ekumi.core.execution.FrozenExecution;
import fr.kazejiyu.ekumi.core.execution.History;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.provider.FrozenExecutionItemProvider;
import fr.kazejiyu.ekumi.core.workflow.provider.FrozenExecutionLabelProvider;
import fr.kazejiyu.ekumi.core.workflow.provider.label.DynamicStyledLabelProvider;
import fr.kazejiyu.ekumi.ide.events.EKumiEvents;

/**
 * A view displaying an {@link ExecutionHistory} within a Table Tree viewer.
 *
 * @author Emmanuel CHEBBI
 */
public class ExecutionHistoryView {
	
	@Inject
	private History history;
	
	@Inject
	IEventBroker events;
	
	private TreeViewer viewer;

	@PostConstruct
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.BORDER | SWT.H_SCROLL);
		Tree tree = viewer.getTree();
		tree.setLinesVisible(true);
		tree.setHeaderVisible(true);
		
		viewer.setContentProvider(new FrozenExecutionItemProvider());
		viewer.setComparator(new NewExecutionsFirst());
		viewer.setComparer(new ById());
		
		Function<FrozenExecution,String> showExecutionState = ex -> ex.state().toString();
		Function<FrozenExecution,String> showExecutionStartDate= ex -> DateFormat.getInstance().format(ex.startDate());
		
		addColumn(viewer, new DelegatingStyledCellLabelProvider(new FrozenExecutionLabelProvider()), "Name", 180);
		addColumn(viewer, new DelegatingStyledCellLabelProvider(new DynamicStyledLabelProvider<>(FrozenExecution.class, showExecutionState)), "State", 90);
		addColumn(viewer, new DelegatingStyledCellLabelProvider(new DynamicStyledLabelProvider<>(FrozenExecution.class, showExecutionStartDate)), "Start Date", 120);
		
		viewer.setInput(history);
		PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_REMOVEALL);
	}
	
	/** Creates a new column and adds it to the given viewer */
	private static void addColumn(TreeViewer viewer, CellLabelProvider labelProvider, String name, int width) {
		TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.NONE);
        column.getColumn().setWidth(width);
        column.getColumn().setText(name);
        column.setLabelProvider(labelProvider);
	}
	
	@Inject @Optional
	void onModified(@UIEventTopic(EKumiEvents.HISTORY_EXECUTION_CHANGED) FrozenExecution modifiedExecution) {
	    viewer.refresh();
	}
	
	@Inject @Optional
	void onAdd(@UIEventTopic(EKumiEvents.HISTORY_EXECUTION_STARTED) FrozenExecution newExecution) {
		// TODO Find a better solution ? Not sure this is the good way to update the TreeViewer:
		// icons are not set for new items
	    viewer.add(history, newExecution);
	}
	
	/** Compares two Execution by putting the one with the most recent start date first */
	private static class NewExecutionsFirst extends ViewerComparator {

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			if (e1 instanceof FrozenExecution && e2 instanceof FrozenExecution) {
				FrozenExecution ex1 = (FrozenExecution) e1;
				FrozenExecution ex2 = (FrozenExecution) e2;
				
				return ex2.startDate().compareTo(ex1.startDate());
			}
			return super.compare(viewer, e1, e2);
		}
		
	}
	
	/** Compares Activities by their id.
	 *  Helps to refresh the TreeViewer properly. */
	private static class ById implements IElementComparer {

		@Override
		public boolean equals(Object a, Object b) {
			if (a instanceof Activity && b instanceof Activity)
				return ((Activity) a).id().equals(((Activity) b).id());
			
			if (a instanceof Execution && b instanceof Execution)
				return ((Execution) a).id().equals(((Execution) b).id());
			
			if (a instanceof History && b instanceof History)
				// Assumes that the view only shows one history
				return true;
			
			return false;
		}

		@Override
		public int hashCode(Object element) {
			if (element instanceof Identifiable)
				return ((Identifiable) element).getId().hashCode();
			
			return Objects.hash(element);
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
