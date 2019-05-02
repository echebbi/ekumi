/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.specs.eds.debug.ui;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;

import fr.kazejiyu.ekumi.debug.ui.LaunchWorkflowFromFileShortcut;
import fr.kazejiyu.ekumi.specs.eds.Activity;

/**
 * <p>Launches the execution of an EDS {@link Activity}.</p>
 * 
 * <p>The {@link #launch(org.eclipse.jface.viewers.ISelection, String) launch} method
 * is supposed to be called from Eclipse IDE's contextual menu on a _*.eds_ model file.
 * It then creates a new launch configuration and runs it.</p>
 */
public class LaunchEdsModelShortcut extends LaunchWorkflowFromFileShortcut {

	@Override
	protected String configurationNameFor(URI fileURI) throws IOException {
		Activity activity = load(fileURI);
		return activity.getName();
	}

}
