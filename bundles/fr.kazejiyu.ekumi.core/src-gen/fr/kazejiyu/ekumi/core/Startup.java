package fr.kazejiyu.ekumi.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.ui.IStartup;

import fr.kazejiyu.ekumi.core.ekumi.Task;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		System.out.println(" -- LOOKING FOR PROJECTS !!");
		try {
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (IProject project : projects) {
				// project.open(null /* IProgressMonitor */);
				// javaProjects.add(javaProject);
				System.out.println("    Found: " + project.getName());
				
				if( project.getName().equals("fr.kazejiyu.ekumi.runtime") ) {
					URLClassLoader loader = getClassLoader(project);
					Class<?> clazz = loader.loadClass("fr.kazejiyu.ekumi.runtime.SayHello");
					Task task = clazz.asSubclass(Task.class).newInstance();
					task.run();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(" -- DONE");
		}
	}

	private URLClassLoader getClassLoader(IProject project) throws CoreException, MalformedURLException {
		IJavaProject javaProject = JavaCore.create(project);
		String[] classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(javaProject);
		List<URL> urlList = new ArrayList<URL>();
		for (int i = 0; i < classPathEntries.length; i++) {
			String entry = classPathEntries[i];
			IPath path = new Path(entry);
			URL url = path.toFile().toURI().toURL();
			urlList.add(url);
		}
		ClassLoader parentClassLoader = getClass().getClassLoader();
		URL[] urls = (URL[]) urlList.toArray(new URL[urlList.size()]);
		return new URLClassLoader(urls, parentClassLoader);
	}
}