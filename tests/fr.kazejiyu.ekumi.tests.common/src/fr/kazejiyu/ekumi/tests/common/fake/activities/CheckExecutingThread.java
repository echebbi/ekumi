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

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * A stub activity that checks the thread on which it is executed.
 */
public final class CheckExecutingThread extends AbstractActivityWithStateManagement {
	
	public CheckExecutingThread() {
		super("" + new Date().hashCode(), "Check Executing Thread");
	}

	private Thread executingThread;
	
	private boolean hasRun = false;
	
	private Context contextOnRun;
	
	@Override
	protected void doRun(Context context) {
		executingThread = Thread.currentThread();
		hasRun = true;
		contextOnRun = context;
	}
	
	public Thread getExecutingThread() {
		return executingThread;
	}
	
	public boolean hasRun() {
		return hasRun;
	}
	
	public Context getContextOnRun() {
		return contextOnRun;
	}

}
