/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Activity;

/**
 * A listener that is notified when an {@link Activity} fails. 
 */
@FunctionalInterface
public interface OnActivityFailed {
	
	/**
	 * Called when an activity fails.
	 * 
	 * @param failed
	 * 			The activity that failed. Must not be {@code null}.
	 */
	void onActivityFailed(Activity failed);

}
