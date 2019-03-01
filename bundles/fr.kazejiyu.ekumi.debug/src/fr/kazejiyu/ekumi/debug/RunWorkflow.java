/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.debug;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.ide.history.PersistExecution;
import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;

/**
 * <p>Executes a given {@link Activity}</p>
 * 
 * <p>In order to be executed, an Activity must belong to a {@link Resource}
 * and the resource's URI must be specified in the {@link ILaunchConfiguration configuration}
 * with an attribute called {@value EKumiRunConfiguration#EKUMI_MODEL_URI}
 */
public final class RunWorkflow extends LaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		String uri = configuration.getAttribute(EKumiRunConfiguration.EKUMI_MODEL_URI, "");
		
		if (uri.isEmpty()) {
			EKumiPlugin.error("Unable to launch the workflow: the model URI is empty."); 
			return;
		}
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(uri));
		
		try {
			resource.load(Collections.emptyMap());
			
			Activity activity = (Activity) resource.getContents().get(0);
			
			Execution execution = WorkflowFactory.eINSTANCE.createExecution();
			
			// Ensure execution history is persisted in workspace's metadata
			execution.getContext().getEvents().onExecutionEvent(new PersistExecution(EKumiPlugin.getStateLocationURI().appendSegment("executions")));
			
			execution.setId(new Date().hashCode() + "." + activity.getId());
			execution.setName(activity.getName());
			execution.setActivity(activity);
			execution.start();
			
		} catch (IOException e) {
			EKumiPlugin.error(e, "An error occurred while executing " + uri);
		}
	}

}
