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

import fr.kazejiyu.ekumi.core.workflow.Activity;

/**
 * A custom item provider dedicated to {@link Activity} instances.
 * 
 * @author Emmanuel CHEBBI
 */
public class ActivityItemProviderDecorator extends ItemProviderAdapterDecorator {
	
	public ActivityItemProviderDecorator(EkumiDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Activity activity = (Activity) object;
		return activity.name();
	}

}
