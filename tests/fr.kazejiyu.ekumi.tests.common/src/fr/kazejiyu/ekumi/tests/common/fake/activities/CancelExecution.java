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

/**
 * An activity that cancels the execution when run 
 */
public class CancelExecution extends AbstractActivityWithStateManagement {

	public CancelExecution() {
		super("", "");
	}

	@Override
	protected void doRun(Context context) throws Exception {
		if (! context.execution().isCancelled()) {
			context.execution().cancel();
		}
	}

}
