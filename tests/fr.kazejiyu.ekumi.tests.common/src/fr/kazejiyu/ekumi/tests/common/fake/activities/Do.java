/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

public final class Do extends AbstractActivityWithStateManagement {
	
	private final Runnable runnable;
	
	public Do(Runnable runnable) {
		super("id", "Do " + runnable);
		this.runnable = runnable;
	}
	
	@Override
	protected void doRun(Context context) {
		runnable.run();
	}

}
