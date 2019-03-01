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
 * An object that listens for the status of an {@link Activity} to change. 
 */
public interface ActivityListener extends OnActivityStarted,
										  OnActivitySucceeded,
										  OnActivityFailed {

	@Override
	default void onActivityFailed(Activity failed) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onActivitySucceeded(Activity succeeded) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onActivityStarted(Activity started) {
		// in case the implementing class is not interested in this event
	}

}
