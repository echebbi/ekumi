/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.languages.java.ui.test;

/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.kazejiyu.ekumi.ide.project.customization.Representation;

/**
 * A stub Representation, that does nothing, for testing purposes.
 * 
 * @author Emmanuel CHEBBI
 */
public class StubRepresentation implements Representation {

	@Override
	public String id() {
		return this.getClass().getCanonicalName();
	}

	@Override
	public String name() {
		return "Stub Representation";
	}

	@Override
	public String description() {
		return "Does nothing";
	}
	
	@Override
	public void customize(String activityName, IWorkspace workspace, IProject project, IProgressMonitor monitor) {
		// does nothing
	}

}
