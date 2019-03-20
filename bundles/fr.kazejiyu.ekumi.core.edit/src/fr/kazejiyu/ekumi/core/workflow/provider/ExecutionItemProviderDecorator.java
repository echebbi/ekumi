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

import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * A custom item provider dedicated to {@link Execution} instances.
 * 
 * @author Emmanuel CHEBBI
 */
public class ExecutionItemProviderDecorator extends ItemProviderAdapterDecorator {
	
	public ExecutionItemProviderDecorator(EkumiDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Execution execution = (Execution) object;
		return execution.getStartDate().toString();
	}

}
