package fr.kazejiyu.ekumi.languages.java.test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;

/**
 * Represents an Eclipse project that can be imported in the workspace.
 * 
 * @author Emmanuel CHEBBI
 */
public class ImportableProject {

	private final File location;

	/**
	 * Creates a new importable project.
	 * 
	 * @param location
	 * 			The path of the project's root directory.
	 */
	public ImportableProject(File location) {
		this.location = location;
	}

	/**
	 * Imports the project in the workspace.
	 * 
	 * @throws CoreException if the project cannot be imported.
	 * @throws InterruptedException 
	 * @throws InvocationTargetException 
	 */
	public void importInWorkspace() throws CoreException, InvocationTargetException, InterruptedException {
		IProjectDescription description = ResourcesPlugin
				   .getWorkspace()
				   .loadProjectDescription(projectFile());
		
		IProject project = ResourcesPlugin
				   .getWorkspace()
				   .getRoot()
				   .getProject(description.getName());

		// Prevent runtime errors when importing the project
		System.out.println("IMPORT PROJECT PATH: " + project.getFullPath());
		System.out.println("WORKSPACE PATH: " + ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getAbsolutePath());
		description.setLocation(project.getFullPath());
		
		// Create the project in the workspace
		project.create(description, null);
		project.open(null);

		// Import the content of the project
		IOverwriteQuery overwriteQuery = file -> IOverwriteQuery.ALL;

		ImportOperation importOperation = new ImportOperation(
				project.getFullPath(), 
				new File(location.getAbsolutePath()),
				FileSystemStructureProvider.INSTANCE, 
				overwriteQuery
		);
		
		importOperation.setCreateContainerStructure(false);
		importOperation.run(new NullProgressMonitor());
		Thread.sleep(5000);
	}
	
	/** @return the path toward the location/.project file */
	private Path projectFile() {
		return new Path(location.getAbsolutePath() + "/.project");
	}

}
