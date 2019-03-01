/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.languages.java;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

import com.google.inject.CreationException;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import fr.kazejiyu.ekumi.languages.java.inject.EventsModule;
import fr.kazejiyu.ekumi.languages.java.inject.ExecutionStatusModule;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.scripting.exceptions.IllegalScriptIdentifierException;
import fr.kazejiyu.ekumi.model.scripting.exceptions.ScriptLoadingFailureException;
import fr.kazejiyu.ekumi.model.workflow.Condition;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Runner;
import fr.kazejiyu.ekumi.model.workflow.Script;

/**
 * Loads {@link Script}s written in Java.<br>
 * <br>
 * In order to resolve the script, an instance of this class expects a unique String identifier.
 * This identifier must be made of three parts, separated by a semicolon:
 * <ol>
 * 	<li>the type of plug-in (either 'bundle' or 'project'),
 * 	<li>the fully qualified name of the script's class,
 * 	<li>the name of its project or bundle.
 * </ol>
 * The type is 'project' if the class is contained by a project located in the workspace. It is 'bundle' 
 * if the class is contained by a plug-in installed within Eclipse IDE.<br>
 * <br>
 * For instance, the identifier corresponding to the class {@code com.domain.MyClass} contained by the
 * {@code com.domain} bundle is:
 * <ul>
 * 	<li>{@code bundle;com.domain;com.domain.MyClass}
 * </ul>
 * Moreover, the script class must implement either {@link Runner} or {@link Condition} and must provide a
 * default, nullary constructor.
 * 
 * @author Emmanuel CHEBBI
 */
public final class JavaLanguage implements ScriptingLanguage {
	
	/** The id of the extension providing this scripting language */
	public static final String EXTENSION_ID = "fr.kazejiyu.ekumi.languages.java";
	
	@Override
	public String id() {
		return EXTENSION_ID;
	}
	
	@Override
	public String name() {
		return "Java";
	}

	@Override
	public Runner resolveRunner(String identifier, Context context) {
		try {
			Runner runner = resolve(new ScriptIdentifier(identifier), Runner.class);
			
			if (context == null)
				return runner;
			
			return injected(runner, context);
			
		} catch (IllegalArgumentException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ScriptLoadingFailureException("Unable to instantiate a Runner from id: " + identifier, e); 
		}
	}

	@Override
	public Condition resolveCondition(String identifier, Context context) {
		try {
			Condition condition = resolve(new ScriptIdentifier(identifier), Condition.class);
			
			if (context == null)
				return condition;
			
			return injected(condition, context);
			
		} catch (IllegalArgumentException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ScriptLoadingFailureException("Unable to instantiate a Condition from id: " + identifier, e); 
		}
	}
	
	/**
	 * Resolves a specific {@link Script} class and instantiates it.
	 * 
	 * @param id
	 * 			The instance identifying the script to resolve.
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
	 * @throws ScriptLoadingFailureException if the identifier does not follow the require format.
	 * @throws IllegalScriptIdentifierException if the IProject or Bundle instance cannot be found from the id.
	 */
	private static <T> T resolve(ScriptIdentifier id, Class<T> clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		if (id.isBundled()) {
			Bundle bundle = Platform.getBundle(id.plugin);
			
			if (bundle == null)
				throw new IllegalArgumentException("Cannot find any Bundle with id " + id.plugin);
			
			return bundle.loadClass(id.fullyQualifiedName).asSubclass(clazz).newInstance();
		} 
		// Not in a Bundle => must be in an IProject
		else {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(id.plugin); 
			
			if (! project.exists())
				throw new IllegalArgumentException("Cannot find any Project named  '" + id.plugin + "'. "
												 + "If it does exist, please ensure that the project is open.");
			
			return loadFromProject(id.fullyQualifiedName, project).asSubclass(clazz).newInstance();
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
	
	/**
	 * Injects the given script with data of the given context, then returns it.
	 * 
	 * @param script
	 * 			The script to inject. Must not be {@code null}.
	 * @param context
	 * 			The context bringing the data available for injection. Must not be {@code null}.
	 * 
	 * @return the injected script.
	 * 
	 * @throws ScriptLoadingFailureException if an error occurs during the injection.
	 */
	private static <T extends Script> T injected(T script, Context context) {
		try {
			Injector injector = Guice.createInjector(createModules(context));
			injector.injectMembers(script);
			
			return script;
			
		} catch (CreationException e) {
			throw new ScriptLoadingFailureException("An error occurred while injecting " + script, e);
		}
	}
	
	/** @return the list of modules that should be used by Guice injector */
	private static Collection<Module> createModules(Context context) {
		return Arrays.asList(
				new EventsModule(context.events()),
				new ExecutionStatusModule(context.execution())
		);
	}

}
