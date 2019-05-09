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

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;

import fr.kazejiyu.ekumi.core.execution.FrozenExecution;

public class FrozenExecutionLabelProvider extends LabelProvider implements IStyledLabelProvider {

	@Override
    public StyledString getStyledText(Object element) {
        if(element instanceof FrozenExecution) {
			FrozenExecution execution = (FrozenExecution) element;
        	return new StyledString(execution.name());
        }
        return null;
    }
	
}
