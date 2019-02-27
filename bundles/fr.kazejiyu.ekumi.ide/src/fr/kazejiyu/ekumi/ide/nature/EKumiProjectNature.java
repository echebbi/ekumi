package fr.kazejiyu.ekumi.ide.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * The nature of a project that hosts EKumi workflows.
 */
public class EKumiProjectNature implements IProjectNature {
	
	/** The ID of the nature as defined in the plugin.xml file */
	public static final String NATURE_ID = "fr.kazejiyu.ekumi.ide.ekumi-nature";
	
	private IProject project;

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

	@Override
	public void configure() throws CoreException {
		// nothing to configure
	}

	@Override
	public void deconfigure() throws CoreException {
		// nothing to deconfigure
	}

}
