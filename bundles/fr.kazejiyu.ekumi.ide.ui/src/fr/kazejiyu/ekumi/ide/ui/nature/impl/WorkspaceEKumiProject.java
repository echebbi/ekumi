package fr.kazejiyu.ekumi.ide.ui.nature.impl;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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

import fr.kazejiyu.ekumi.ide.nature.EKumiProject;
import fr.kazejiyu.ekumi.ide.nature.EKumiProjectNature;
import fr.kazejiyu.ekumi.model.spec.Activity;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.workflow.editor.design.api.EKumiViewpoints;

/**
 * An EKumi project located in the workspace.
 */
// ChangeViewpointSelectionCommand is not API but even Obeo guys
// advise to use it since there are no strong alternatives
@SuppressWarnings("restriction")
public class WorkspaceEKumiProject implements EKumiProject {
	
	/** The workspace containing the project */
	private final IWorkspace workspace;
	
	/** Used to set up the project as a Modeling one */
	private final ModelingProjectManager modeling;
	
	/**
	 * Creates a new instance.
	 * 
	 * @param workspace
	 * 			The workspace containing the project.
	 * @param modeling
	 * 			The manager used to set up the project as a Modeling one.
	 */
	public WorkspaceEKumiProject(IWorkspace workspace, ModelingProjectManager modeling) {
		this.workspace = workspace;
		this.modeling = modeling;
	}

	@Override
	public IProject create(String name, IPath path, String activityName, IProgressMonitor monitor) throws CoreException {
		IWorkspaceRunnable createProject = projectMonitor -> {
			try {
				IProject project = createProject(name, path, projectMonitor);
                
                Activity workflow = createProjectModel(activityName, project);
                
                createRepresentation(workflow, project, projectMonitor);
            } 
			finally {
            	monitor.done();
            }
		};
		workspace.run(createProject, monitor);
		return workspace.getRoot().getProject(name);
	}

	/**
	 * Creates a project with the EKumi and Modeling natures.
	 * 
	 * @param name
	 * 			The name of the project to create.
	 * @param path
	 * 			The location of the project to create.
	 * @param monitor
	 * 			The monitor used to show progression of the creation.
	 * 
	 * @return the new project
	 * 
	 * @throws CoreException if an error occurs while creating the project
	 */
	private IProject createProject(String name, IPath path, IProgressMonitor monitor) throws CoreException {
		// First add the Modeling nature to the project
		IProject project = modeling.createNewModelingProject(name, path, true, monitor);
		
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);

		// Add EKumi project nature
		newNatures[natures.length] = EKumiProjectNature.NATURE_ID;
		IStatus status = workspace.validateNatureSet(newNatures);

		// Only apply new natures if the workspace allows it
		if (status.getCode() == IStatus.OK) {
		    description.setNatureIds(newNatures);
		    project.setDescription(description, null);
		}
		return project;
	}

	/**
	 * Creates a new Activity model and saves it under the given project's location.
	 * @param activityName
	 * 			The name of the model to create.
	 * @param project
	 * 			The project in which the model is persisted.
	 * 
	 * @return the new model
	 * 
	 * @throws CoreException if the new model cannot be persisted
	 */
	private static Activity createProjectModel(String activityName, IProject project) throws CoreException {
		// Create the Activity representing the workflow
		Activity workflow = SpecFactory.eINSTANCE.createActivity();
		workflow.setId(project.getName() + "." + activityName);
		workflow.setName(activityName);
		workflow.setStart(SpecFactory.eINSTANCE.createStart());
		
		// Save the Activity in a resource 'model/activity.spec'
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource workflowResource = resourceSet.createResource(URI.createURI(project.getFile("model/" + activityName + ".spec").getLocationURI().toString()));
		workflowResource.getContents().add(workflow);
		
		try {
			workflowResource.save(Collections.emptyMap());
		} 
		catch (IOException e) {
			Status error = new Status(IStatus.ERROR, "fr.kazejiyu.ekumi.ide", "An error occured while creating " + workflowResource.getURI(), e);
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
	private void createRepresentation(Activity model, IProject project, IProgressMonitor monitor) throws CoreException {
		// Create a new Sirius session to handle the representation
		Session session = ModelingProject.asModelingProject(project).get().getSession();
		
		// Allow to create a representation for the activity thereafter
		session.getTransactionalEditingDomain().getCommandStack()
			   .execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
				   @Override
				   protected void doExecute() {
					   session.addSemanticResource(model.eResource().getURI(), monitor);
				   }
			   });
		
		Viewpoint workflowViewpoint = workflowViewpoint();
		
		ChangeViewpointSelectionCommand cc = new ChangeViewpointSelectionCommand(session, new ViewpointSelectionCallback(), new HashSet<>(asList(workflowViewpoint)), Collections.emptySet(), monitor);
		session.getTransactionalEditingDomain().getCommandStack().execute(cc);
		
		session.getTransactionalEditingDomain().getCommandStack()
			   .execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {
						session.createView(workflowViewpoint, asList(model), true, monitor);
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
			Status error = new Status(IStatus.ERROR, "fr.kazejiyu.ekumi.ide", "Cannot find EKumi's workflow editor viewpoint. Check that fr.kazejiyu.ekumi.workflow.editor.design plug-in is available.");
			throw new CoreException(error);
		}
		return workflowViewpoint.get();
	}

}
