package fr.kazejiyu.ekumi.languages.java.test;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

/**
 * Represents an Eclipse project that can be imported in the workspace.
 * 
 * @author Emmanuel CHEBBI
 */
public class ImportableProject {

	private final File location;
	private IProject project;

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
	 */
	public void importInWorkspace() throws CoreException {
		IProjectDescription description = ResourcesPlugin
				   .getWorkspace()
				   .loadProjectDescription(projectFile());
		
		project = ResourcesPlugin
				   .getWorkspace()
				   .getRoot()
				   .getProject(description.getName());
		
		project.create(description, null);
		project.open(null);
	}
	
	/** @return the path toward the location/.project file */
	private Path projectFile() {
		return new Path(location.getAbsolutePath() + "/.project");
	}

}
