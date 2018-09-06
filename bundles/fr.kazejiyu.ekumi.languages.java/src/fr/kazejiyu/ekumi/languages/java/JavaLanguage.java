package fr.kazejiyu.ekumi.languages.java;

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
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.osgi.framework.Bundle;

import fr.kazejiyu.ekumi.core.ekumi.Condition;
import fr.kazejiyu.ekumi.core.ekumi.Runner;
import fr.kazejiyu.ekumi.core.ekumi.Script;
import fr.kazejiyu.ekumi.core.languages.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.languages.exceptions.ScriptLoadingFailureException;

/**
 * Loads {@link Script}s written in Java.<br>
 * <br>
 * In order to resolve the script, an instance of this class expects a unique String identifier.
 * This identifier must be the fully qualified name of the script's class next to the if of its project or bundle,
 * the two separated by a semicolon.<br>
 * <br>
 * For instance, the identifier corresponding to the class {@code com.domain.MyClass} within the {@code com.domain}
 * bundle must be:
 * <ul>
 * 	<li>com.domain;com.domain.MyClass
 * </ul>
 * Moreover, the script class must implement either {@link Runner} or {@link Condition} and must provide a
 * default, nullary constructor.
 * 
 * FIXME [Refactor] With the current implementation, any workspace project owning the same name as a bundle
 * 					will be hidden by the bundle, which makes impossible to resolve a class located in the project. 
 * 
 * @author Emmanuel CHEBBI
 */
public final class JavaLanguage implements ScriptingLanguage {

	@Override
	public Runner resolveRunner(String identifier) {
		try {
			return resolve(identifier, Runner.class);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ScriptLoadingFailureException("Unable to instantiate a Runner from path: " + identifier, e); 
		}
	}

	@Override
	public Condition resolveCondition(String identifier) {
		try {
			return resolve(identifier, Condition.class);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ScriptLoadingFailureException("Unable to instantiate a Condition from path: " + identifier, e); 
		}
	}
	
	/**
	 * Resolves a specific {@link Script} class and instantiates it.
	 * 
	 * @param identifier
	 * 			The String identifying the script to resolve.
	 * @param clazz
	 * 			The expected class of the Script.
	 * 
	 * @return a new instance of {@code clazz}.
	 * 
	 * @param <T> The expected type of the script to instantiate. 
	 * 
	 * @throws InstantiationException if this Class represents an abstract class,an interface, 
	 * 								  a array class, a primitive type, or void;or if the class 
	 * 								  has no nullary constructor;or if the instantiation fails 
	 * 								  for some other reason.
	 * @throws IllegalAccessException if the class or its nullary constructor is not accessible.
	 * @throws ClassNotFoundException if the class cannot be found.
	 * @throws ClassCastException if the new script instance cannot be casted to the given clazz.
	 */
	private static <T> T resolve(String identifier, Class<T> clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String[] pluginAndClass = identifier.split(";");
		String fullyQualifiedName = pluginAndClass[1];
		String plugin = pluginAndClass[0];

		Bundle bundle = Platform.getBundle(plugin);
		
		// Bundle  == plug-in that is installed within Eclipse IDE
		// IProject == project located within the workspace
		if (bundle != null) {
			return bundle.loadClass(fullyQualifiedName).asSubclass(clazz).newInstance();
		} else {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(plugin); 
			return loadFromProject(fullyQualifiedName, project).asSubclass(clazz).newInstance();
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
	private static Class<?> loadFromProject(String fullyQualifiedName, IProject project) {
		try {
			URLClassLoader loader = getClassLoader(project);
			return loader.loadClass(fullyQualifiedName);

		} catch (MalformedURLException | CoreException | ClassNotFoundException | ClassCastException e) {
			throw new ScriptLoadingFailureException("Unable to resolve any Java class from path: " + fullyQualifiedName + " in project " + project, e); 
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
	private static URLClassLoader getClassLoader(IProject project) throws CoreException, MalformedURLException {
		IJavaProject javaProject = JavaCore.create(project);
		String[] classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(javaProject);
		List<URL> urlList = new ArrayList<>();
		
		for (int i = 0; i < classPathEntries.length; i++) {
			String entry = classPathEntries[i];
			IPath path = new Path(entry);
			URL url = path.toFile().toURI().toURL();
			urlList.add(url);
		}
		
		// parentClassLoader makes possible to cast instances
		// loaded by the new URLClassLoader into EKumi classes.
		ClassLoader parentClassLoader = JavaLanguage.class.getClassLoader();
		URL[] urls = urlList.toArray(new URL[urlList.size()]);
		
		return new URLClassLoader(urls, parentClassLoader);
	}

}
