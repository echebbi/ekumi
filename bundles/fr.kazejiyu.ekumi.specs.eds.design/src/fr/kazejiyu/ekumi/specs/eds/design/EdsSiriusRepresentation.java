/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.specs.eds.design;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import fr.kazejiyu.ekumi.ide.project.customization.Representation;
import fr.kazejiyu.ekumi.specs.eds.Activity;
import fr.kazejiyu.ekumi.specs.eds.EdsFactory;
import fr.kazejiyu.ekumi.specs.eds.design.api.EKumiViewpoints;

/**
 * <p>A visual representation of the EKumi Default Specification based on Sirius.</p>
 * 
 * <p>This representation is a BPMN-inspired workflow diagram editor.</p>
 */
//ChangeViewpointSelectionCommand is not API but even Obeo guys
//advise to use it since there are no strong alternatives
@SuppressWarnings("restriction")
public class EdsSiriusRepresentation implements Representation {
	
	@Override
	public String id() {
		return getClass().getCanonicalName();
	}

	@Override
	public String name() {
		return "EKumi Default Representation";
	}

	@Override
	public String description() {
		return "A BPMN-inspired workflow diagram editor";
	}

	/**
	 * <p>Customizes the project by adding a Sirius representation of the specification's model.</p>
	 * 
	 * <p>In order to be customized, the project must:
	 * 	<ul>
	 * 		<li>contain an EDS model under {@code model/*.eds}</li>
	 * 	</ul>
	 * <p>
	 * 
	 * <p>If the project does not have the Sirius' Modeling nature, then the nature is added.</p>
	 */
	@Override
	public void customize(String activityName, IWorkspace workspace, IProject project, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, 3);
		
		ensureHasModelingNature(project, subMonitor.split(1));
		Activity activity = createActivity(activityName, project, subMonitor.split(1));
		createRepresentation(activity, project, subMonitor.split(1));
	}

	/**
	 * Creates a new Activity model and saves it under the given project's location.
	 * 
	 * @param activityName
	 * 			The name of the model to create.
	 * @param project
	 * 			The project in which the model is persisted.
	 * @param monitor
	 * 			The instance monitor the execution. 
	 * 
	 * @return the new activity
	 * 
	 * @throws CoreException if the new model cannot be persisted
	 */
	private static Activity createActivity(String activityName, IProject project, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		subMonitor.setTaskName("Creating the workflow model");
		
		// Create the Activity representing the workflow
		Activity workflow = EdsFactory.eINSTANCE.createActivity();
		workflow.setId(project.getName() + "." + activityName);
		workflow.setName(activityName);
		workflow.setStart(EdsFactory.eINSTANCE.createStart());
		
		// Save the Activity in a resource 'model/activity.spec'
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource workflowResource = resourceSet.createResource(URI.createURI(project.getFile("model/" + activityName + ".eds").getLocationURI().toString()));
		workflowResource.getContents().add(workflow);
		
		try {
			workflowResource.save(Collections.emptyMap());
		} 
		catch (IOException e) {
			Status error = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "An error occured while creating " + workflowResource.getURI(), e);
			throw new CoreException(error);
		}
		return workflow;
	}

	/**
	 * Create a diagram representation of the given activity.
	 * 
	 * @param model
	 * 			The semantic model of the presentation.
	 * @param project
	 * 			The project in which the representation is created.
	 * @param monitor
	 * 			The monitor used to show progression of the creation. 
	 * 
	 * @throws CoreException
	 */
	private static void createRepresentation(Activity model, IProject project, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		subMonitor.setTaskName("Creating the diagram");
		
		// Create a new Sirius session to handle the representation
		Session session = ModelingProject.asModelingProject(project).get().getSession();
		
		// Allow to create a representation for the activity thereafter
		session.getTransactionalEditingDomain().getCommandStack()
			   .execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
				   @Override
				   protected void doExecute() {
					   SubMonitor commandMonitor = SubMonitor.convert(subMonitor);
					   session.addSemanticResource(model.eResource().getURI(), commandMonitor);
				   }
			   });
		
		Viewpoint workflowViewpoint = workflowViewpoint();
		
		ChangeViewpointSelectionCommand cc = new ChangeViewpointSelectionCommand(session, new ViewpointSelectionCallback(), new HashSet<>(asList(workflowViewpoint)), Collections.emptySet(), monitor);
		session.getTransactionalEditingDomain().getCommandStack().execute(cc);
		
		session.getTransactionalEditingDomain().getCommandStack()
			   .execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {
						SubMonitor commandMonitor = SubMonitor.convert(subMonitor);
						session.createView(workflowViewpoint, asList(model), true, commandMonitor);
					}
			   });
	}

	/**
	 * Returns the 'EKumi Workflow' viewpoint.
	 * 
	 * @return the viewpoint defining representations for workflows
	 * 
	 * @throws CoreException if the viewpoint cannot be found
	 */
	private static Viewpoint workflowViewpoint() throws CoreException {
		// Find the 'EKumi Workflow' viewpoint
		Optional<Viewpoint> workflowViewpoint = EKumiViewpoints.workflow();
		
		if ( ! workflowViewpoint.isPresent()) {
			Status error = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot find EKumi's workflow editor viewpoint. Check that fr.kazejiyu.ekumi.specs.eds.design plug-in is available.");
			throw new CoreException(error);
		}
		return workflowViewpoint.get();
	}
	
	/**
	 * Adds the Modeling nature to the given project, if it does not have it yet.
	 * 
	 * @param project
	 * 			The project that requires the Modeling nature.
	 * @param monitor
	 * 			The instance monitoring the execution.
	 * 
	 * @throws CoreException if an error occurs while adding the nature
	 */
	private static void ensureHasModelingNature(IProject project, IProgressMonitor monitor) throws CoreException {
		if (! ModelingProject.hasModelingProjectNature(project)) {
			ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
		}
	}

}
