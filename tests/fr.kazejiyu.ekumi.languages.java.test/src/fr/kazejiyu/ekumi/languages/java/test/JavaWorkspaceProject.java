package fr.kazejiyu.ekumi.languages.java.test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

import fr.kazejiyu.ekumi.languages.java.test.providers.ProjectProvider;

/**
 * A Java project located in the workspace.
 * 
 * @author Emmanuel CHEBBI
 */
public class JavaWorkspaceProject implements ProjectProvider {
	
	public final String name;
	
	private IProject project;

	public JavaWorkspaceProject(String name) {
		this.name = name;

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		project = root.getProject(name);
	}
	
	public void create() throws CoreException {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		
		project.create(progressMonitor);
		project.open(progressMonitor);
		
		withJavaNature(project, progressMonitor);
		project.refreshLocal(IProject.DEPTH_INFINITE, null);
	}

	private void withJavaNature(IProject project, IProgressMonitor progressMonitor) throws CoreException {
		IProjectDescription description = project.getDescription();

		String[] natures = description.getNatureIds();

		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = JavaCore.NATURE_ID;

		description.setNatureIds(newNatures);
		project.setDescription(description, progressMonitor);
		
		configureJavaClassPath(project, progressMonitor);
	}

	private void configureJavaClassPath(IProject project, IProgressMonitor progressMonitor) throws CoreException {
		// Create project & compute default classpath
		IJavaProject javaProject = JavaCore.create(project);

		Set<IClasspathEntry> entries = new HashSet<>();
		entries.addAll(Arrays.asList(javaProject.getRawClasspath()));

		IVMInstall vmInstall= JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations= JavaRuntime.getLibraryLocations(vmInstall);

		for (LibraryLocation element : locations)
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		
		// Add src/ folder to classpath
		IPath srcPath = javaProject.getPath().append("src/");
		IClasspathEntry srcEntry = JavaCore.newSourceEntry(srcPath, null);
		entries.add(srcEntry);
		
		createFolder("src");
		
		// Finally set the classpath
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), progressMonitor);
	}
	
	/**
	 * Removes the project from the workspace, but does not delete its content.
	 * 
	 * @throws CoreException if an error occurs.
	 */
	public void deleteFromWorkspace() throws CoreException {
		if (project != null)
			project.delete(false, true, null);
	}
	
	public void createFolder(String name) throws CoreException {
		if (project != null)
			project.getFolder(name).create(true, true, null);
	}
	
	public void createFile(String name, InputStream content) throws CoreException {
		if (project != null)
			project.getFile(name).create(content, true, null);
	}
	
}
