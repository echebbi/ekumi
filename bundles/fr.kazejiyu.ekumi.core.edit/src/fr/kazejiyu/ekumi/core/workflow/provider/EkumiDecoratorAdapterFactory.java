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

import org.eclipse.emf.edit.provider.DecoratorAdapterFactory;
import org.eclipse.emf.edit.provider.IItemProviderDecorator;

import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.gen.provider.WorkflowItemProviderAdapterFactory;

public class EkumiDecoratorAdapterFactory extends DecoratorAdapterFactory {
	
	public EkumiDecoratorAdapterFactory() {
		super(new WorkflowItemProviderAdapterFactory());
	}

	@Override
	protected IItemProviderDecorator createItemProviderDecorator(Object target, Object type) {
		// Delegate to custom item providers
		if (target instanceof Execution)
			return new ExecutionItemProviderDecorator(this);
		if (target instanceof Activity)
			return new ActivityItemProviderDecorator(this);
		
		// Use default, generated item providers
		return new ForwardingItemProviderAdapterDecorator(this);
	}

}
