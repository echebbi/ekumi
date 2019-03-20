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

import static java.util.Arrays.asList;

import java.util.Collections;
import java.util.Date;
import java.util.Optional;
import java.util.function.Function;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.kazejiyu.ekumi.core.EKumiExtensions;
import fr.kazejiyu.ekumi.core.EKumiPlugin;
import fr.kazejiyu.ekumi.core.datatypes.DataTypeFactory;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguageFactory;
import fr.kazejiyu.ekumi.core.specs.ActivityAdapter;
import fr.kazejiyu.ekumi.core.specs.ActivityAdapterFactory;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.WorkflowFactory;
import fr.kazejiyu.ekumi.ide.common.datatypes.ExtensionToDatatypeFactory;
import fr.kazejiyu.ekumi.ide.common.languages.ExtensionToLanguageFactory;
import fr.kazejiyu.ekumi.ide.common.spec.ExtensionToActivityAdapterFactory;
import fr.kazejiyu.ekumi.ide.history.PersistExecution;

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
			Activator.error("Unable to launch the workflow: the model URI is empty."); 
			return;
		}
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(uri));
		
		try {
			resource.load(Collections.emptyMap());
			
			Object specification = resource.getContents().get(0);
			Optional<ActivityAdapter> adapter = findAdapterFor(specification);
			
			if (! adapter.isPresent()) {
				Activator.error("Unable to launch the workflow: no activity adapter found for the specification " + specification); 
				return;
			}
			Optional<Activity> maybeActivity = adapter.flatMap(adapt(specification));
			if (! maybeActivity.isPresent()) {
				Activator.error("Unable to launch the workflow: the adapter " + adapter.get() + " is unable to create an activity from " + specification); 
				return;
			}
			Activity activity = maybeActivity.get();
			Execution execution = WorkflowFactory.eINSTANCE.createExecution();
			
			// Ensure execution history is persisted in workspace's metadata
			execution.getContext().getEvents().onExecutionEvent(new PersistExecution(EKumiPlugin.getStateLocationURI().appendSegment("executions")));
			
			execution.setId(new Date().hashCode() + "." + activity.getId());
			execution.setName(activity.getName());
			execution.setActivity(activity);
			execution.start();
			
		} catch (Exception e) {
			Activator.error(e, "An error occurred while executing " + uri);
		}
	}
	
	private static Optional<ActivityAdapter> findAdapterFor(Object specification) {
		if (specification == null)
			return Optional.empty();
		
		ActivityAdapterFactory adapters = new ExtensionToActivityAdapterFactory(() -> asList(Platform.getExtensionRegistry().getConfigurationElementsFor(EKumiExtensions.SPECS_EXTENSION_ID)));
		return adapters.findAdapterFor(specification);
	}
	
	private static Function<ActivityAdapter, Optional<Activity>> adapt(Object specification) {
		return adapter -> {
			DataTypeFactory datatypes = new ExtensionToDatatypeFactory(() -> asList(Platform.getExtensionRegistry().getConfigurationElementsFor(EKumiExtensions.DATATYPES_EXTENSION_ID)));
			ScriptingLanguageFactory languages = new ExtensionToLanguageFactory(() -> asList(Platform.getExtensionRegistry().getConfigurationElementsFor(EKumiExtensions.LANGUAGES_EXTENSION_ID)));
			
			return adapter.adapt(specification, datatypes, languages);
		};
	}
	
}
