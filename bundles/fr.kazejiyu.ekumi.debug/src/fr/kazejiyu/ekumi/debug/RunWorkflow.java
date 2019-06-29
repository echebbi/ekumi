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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
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
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.execution.impl.JobsExecution;
import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionHook;
import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionHookFactory;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguageFactory;
import fr.kazejiyu.ekumi.core.specs.ActivityAdapter;
import fr.kazejiyu.ekumi.core.specs.ActivityAdapterFactory;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicSequence;
import fr.kazejiyu.ekumi.ide.common.datatypes.ExtensionToDatatypeFactory;
import fr.kazejiyu.ekumi.ide.common.execution.ExtensionToExecutionHookFactory;
import fr.kazejiyu.ekumi.ide.common.languages.ExtensionToLanguageFactory;
import fr.kazejiyu.ekumi.ide.common.spec.ExtensionToActivityAdapterFactory;
import fr.kazejiyu.ekumi.ide.history.PersistExecution;

/**
 * Executes a given {@link Activity}.
 * <p>
 * In order to be executed, an Activity must belong to a {@link Resource}
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
			Activity activity = loadActivityFrom(resource);
			
			// If the activity has a successor, we must wrap it under a Sequence
			// otherwise activity's successor won't be executed
			if (activity.successor().isPresent()) {
				activity = new BasicSequence(activity.id(), activity.name(), activity);
			}
			Execution execution = new JobsExecution(activity);
			
			// Ensure execution history is persisted in workspace's metadata
			execution.context()
					 .events()
					 .onExecutionEvent(new PersistExecution(EKumiPlugin.getStateLocationPath().resolve("executions")));
			
			// Register execution hooks provided via extension points
			Set<String> idsOfActivatedExecutionHooks = executionHooksIds(configuration);
			registerExecutionHooks(idsOfActivatedExecutionHooks, execution.context().events());
			
			execution.start();
		} 
		catch (Exception e) {
			Activator.error(e, "An error occurred while executing " + uri);
		}
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///    ACTIVITY-RELATED UTILITY FUNCTIONS /////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Loads an activity from the given resource by:
	 * <ol>
	 * 	<li>Loading an EObject from the resource
	 * 	<li>Finding an adapter able to turn this EOject into an Activity
	 * 	<li>Using the adapter to create an Activity
	 * </ol>
	 */
	private static Activity loadActivityFrom(Resource resource) throws IOException {
		resource.load(Collections.emptyMap());
		
		Object specification = resource.getContents().get(0);
		Optional<ActivityAdapter> adapter = findAdapterFor(specification);
		
		if (! adapter.isPresent()) {
			throw new IllegalArgumentException("Unable to launch the workflow: no activity adapter found for the specification " + specification); 
		}
		Optional<Activity> activity = adapter.flatMap(adapt(specification));
		if (! activity.isPresent()) {
			throw new IllegalArgumentException("Unable to launch the workflow: the adapter " + adapter.get() + " is unable to create an activity from " + specification); 
		}
		return activity.get();
	}
	
	private static Optional<ActivityAdapter> findAdapterFor(Object specification) {
		if (specification == null) {
			return Optional.empty();
		}
		ActivityAdapterFactory adapters = new ExtensionToActivityAdapterFactory(configurationElementsFor(EKumiExtensions.SPECS_EXTENSION_ID));
		return adapters.findAdapterFor(specification);
	}
	
	private static Function<ActivityAdapter, Optional<Activity>> adapt(Object specification) {
		return adapter -> {
			DataTypeFactory datatypes = new ExtensionToDatatypeFactory(configurationElementsFor(EKumiExtensions.DATATYPES_EXTENSION_ID));
			ScriptingLanguageFactory languages = new ExtensionToLanguageFactory(configurationElementsFor(EKumiExtensions.LANGUAGES_EXTENSION_ID));
			
			return adapter.adapt(specification, datatypes, languages);
		};
	}

	private static Supplier<List<IConfigurationElement>> configurationElementsFor(String extensionPointId) {
		return () -> asList(Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPointId));
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///    EXECUTION HOOKS RELATED UTILITY FUNCTIONS //////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private static void registerExecutionHooks(Set<String> idsOfActivatedExecutionHooks, Events events) {
		List<ExecutionHook> activatedHooks = findHooks(idsOfActivatedExecutionHooks);
		for (ExecutionHook hook : activatedHooks) {
			events.onActivityEvent(hook);
			events.onExecutionEvent(hook);
		}
	}
	
	private static Set<String> executionHooksIds(ILaunchConfiguration launchConfiguration) throws CoreException {
		String commaSeparatedExecutionHooksIds = launchConfiguration.getAttribute(EKumiRunConfiguration.COMMA_SEPARATED_HOOKS_ID, "");
		List<String> hooksIds = Arrays.asList(commaSeparatedExecutionHooksIds.split(","));
		return new HashSet<>(hooksIds);
	}
	
	private static List<ExecutionHook> findHooks(Set<String> activatedHooksIds) {
		List<ExecutionHook> activatedHooks = new ArrayList<>();
		
		ExecutionHookFactory availableHooks = new ExtensionToExecutionHookFactory(configurationElementsFor(EKumiExtensions.EXECUTION_EXTENSION_ID));
		for (String activatedHookId : activatedHooksIds) {
			availableHooks.find(activatedHookId).ifPresent(activatedHooks::add);
		}
		return activatedHooks;
	}
	
}
