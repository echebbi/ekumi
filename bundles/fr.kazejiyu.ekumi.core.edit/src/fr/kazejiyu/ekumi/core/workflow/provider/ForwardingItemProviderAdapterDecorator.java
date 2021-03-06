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

/**
 * A decorator that forwards any method call to the item provider generated by EMF.
 * 
 * @author Emmanuel CHEBBI
 */
public class ForwardingItemProviderAdapterDecorator extends ItemProviderAdapterDecorator {

	public ForwardingItemProviderAdapterDecorator(EkumiDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
}
