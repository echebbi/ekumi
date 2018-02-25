package fr.kazejiyu.ekumi.languages.java;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;

import fr.kazejiyu.ekumi.core.ekumi.RunnableScript;
import fr.kazejiyu.ekumi.core.ekumi.Script;
import fr.kazejiyu.ekumi.core.ekumi.TestableScript;
import fr.kazejiyu.ekumi.core.languages.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.languages.exceptions.ScriptLoadingFailureException;

/**
 * Loads {@link Script}s written in Java.
 * 
 * @author Emmanuel CHEBBI
 */
public class JavaLanguage implements ScriptingLanguage {

	@Override
	public RunnableScript resolveRunnable(String path, IProject project) {
		try {
			Class<?> clazz = loadClass(path, project);
			return clazz.asSubclass(RunnableScript.class).newInstance();
			
		} catch (InstantiationException | IllegalAccessException e) {
			throw new ScriptLoadingFailureException("Unable to resolve runnable from path: " + path, e); 
		}
	}

	@Override
	public TestableScript resolveTestable(String path, IProject project) {
		try {
			Class<?> clazz = loadClass(path, project);
			return clazz.asSubclass(TestableScript.class).newInstance();
			
		} catch (InstantiationException | IllegalAccessException e) {
			throw new ScriptLoadingFailureException("Unable to resolve runnable from path: " + path, e); 
		}
	}
	
	/**
	 * Returns the class identified by its {@code fullyQualifiedName} with {@code project}'s class loader.
	 * 
	 * @param fullyQualifiedName
	 * 			The full name of the class to load. Must not be {@code null}.
	 * @param project
	 * 			The Eclipse project containing the class to load. Must not be {@code null}.
	 * 
	 * @return the loaded classes.
	 * 
	 * @throws ScriptLoadingFailureException if an error occurs while loading the class.
	 */
	private Class<?> loadClass(String fullyQualifiedName, IProject project) {
		try {
			URLClassLoader loader = getClassLoader(project);
			return loader.loadClass(fullyQualifiedName);
			
		} catch (MalformedURLException | CoreException | ClassNotFoundException | ClassCastException e) {
			throw new ScriptLoadingFailureException("Unable to resolve runnable from path: " + fullyQualifiedName, e); 
		}
	}

	/**
	 * Returns the class loader related to a specific project.<br>
	 * <br>
	 * This method is mandatory because each OSGI bundle has its own class loader.
	 * 
	 * @param project
	 * 			The project which class loader is required.
	 * 			Must not be {@code null}.
	 * 
	 * @return {@code project}'s class loader.
	 * 
	 * @throws CoreException if project's classpath cannot be computed.
	 * @throws MalformedURLException if a classpath's entry is invalid. Should not occur.
	 */
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

		// parentClassLoader makes possible to cast instances
		// loaded by the new URLClassLoader into EKumi classes.
		ClassLoader parentClassLoader = getClass().getClassLoader();
		URL[] urls = (URL[]) urlList.toArray(new URL[urlList.size()]);
		
		return new URLClassLoader(urls, parentClassLoader);
	}

}
