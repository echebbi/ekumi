/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.provider;

import org.eclipse.jface.viewers.ITreeContentProvider;

import fr.kazejiyu.ekumi.core.execution.History;
import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * A custom item provider dedicated to {@link Execution} instances.
 * 
 * @author Emmanuel CHEBBI
 */
public class FrozenExecutionItemProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		History history = (History) inputElement;
		return history.executions().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		return new Object[] {};
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return false;
	}
	

}
