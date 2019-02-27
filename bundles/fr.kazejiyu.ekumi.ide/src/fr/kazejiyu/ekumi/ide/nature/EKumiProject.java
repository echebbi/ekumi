package fr.kazejiyu.ekumi.ide.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * <p>An Eclipse IDE project that owns an {@link EKumiProjectNature}.</p>
 * 
 * <p>Such a project usually contains a specification model serialized under
 * the <i>model/</i> directory as well as a <i>.aird</i> file containing
 * a diagram representation of the model.
 */
public interface EKumiProject {
	
	/**
	 * Creates the project.
	 * 
	 * @param name
	 * 			The name of the new project.
	 * @param path
	 * 			The path of the new project.
	 * @param activityName
	 * 			The name of the new activity.
	 * @param monitor
	 * 			The monitor used to follow the execution. Can be null.
	 * 
	 * @return the new project.
	 * 
	 * @throws CoreException 
	 */
	IProject create(String name, IPath path, String activityName, IProgressMonitor monitor) throws CoreException;

}
