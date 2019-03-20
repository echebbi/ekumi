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
import fr.kazejiyu.ekumi.core.workflow.Status;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.ActivityImpl;

public class CheckExecutingThread extends ActivityImpl {
	
	private Thread executingThread;
	
	private boolean hasRun = false;
	
	private Context contextOnRun;
	
	@Override
	public void run(Context context) {
		executingThread = Thread.currentThread();
		hasRun = true;
		contextOnRun = context;
		
		setStatus(Status.SUCCEEDED);
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
