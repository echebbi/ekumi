/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.languages.java.ide;

import static java.util.Arrays.asList;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import fr.kazejiyu.ekumi.ide.project.customization.Customization;

/**
 * <p>Customizes an IProject by adding the Java and PDE natures</p>  
 */
public final class AddPDENature implements Customization {

	@Override
	public void customize(String activityName, IWorkspace workspace, IProject project, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, 5);
		subMonitor.subTask(""); // otherwise previous sub tasks are displayed
		subMonitor.setTaskName("Allowing Java");
		
		addJavaAndPDENatures(workspace, project, subMonitor.split(1));
		
		addBuilders(project.getDescription(), subMonitor.split(1));
		
		configureClasspath(project, subMonitor.split(1));
		
		writeManifest(project, subMonitor.split(1));
		writeBuildProperties(project, subMonitor.split(1));
		
		subMonitor.setWorkRemaining(0);
	}

	private static void addJavaAndPDENatures(IWorkspace workspace, IProject project, IProgressMonitor monitor) throws CoreException {
		monitor.subTask("Adding Java and PDE natures to the project");
		
		IProjectDescription description = project.getDescription();
		Set<String> natures = new HashSet<>(asList(description.getNatureIds()));
		
		natures.add(JavaCore.NATURE_ID);
		natures.add(IBundleProjectDescription.PLUGIN_NATURE);

		String[] newNatures = natures.toArray(new String[natures.size()]);
		IStatus status = workspace.validateNatureSet(newNatures);

		// Throw exception if unable to apply the natures
		if (status.getCode() != IStatus.OK) {
			throw new CoreException(status);
		}
		description.setNatureIds(newNatures);
		project.setDescription(description, null);
	}

	private static void addBuilders(IProjectDescription description, IProgressMonitor monitor) {
		monitor.subTask("Adding Java and PDE builders");
		
		ICommand javaBuilder = description.newCommand();
		javaBuilder.setBuilderName(JavaCore.BUILDER_ID);
		
		ICommand manifestBuilder = description.newCommand();
		manifestBuilder.setBuilderName("org.eclipse.pde.ManifestBuilder");
		
		ICommand schemaBuilder = description.newCommand();
		schemaBuilder.setBuilderName("org.eclipse.pde.SchemaBuilder");
		
		Set<ICommand> newBuilders = new HashSet<>();
		newBuilders.addAll(asList(description.getBuildSpec()));
		newBuilders.add(javaBuilder);
		newBuilders.add(manifestBuilder);
		newBuilders.add(schemaBuilder);
	}

	private static void configureClasspath(IProject project, IProgressMonitor monitor) throws CoreException {
		monitor.subTask("Configuring project's classpath");
		
		IJavaProject java = JavaCore.create(project);
		
		// Create src/ folder
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, null);
		IPackageFragmentRoot src = java.getPackageFragmentRoot(sourceFolder);

		// Allows Eclipse IDE to resolve dependencies in MANIFEST.MF
		IClasspathEntry pdeClasspath = JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"));
		// TODO A bit hacky, see https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/tree/org.eclipse.jdt.ui/ui/org/eclipse/jdt/ui/wizards/NewJavaProjectWizardPageOne.java#n1258
		IClasspathEntry jreClasspath = JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8"));
		
		List<IClasspathEntry> entries = asList(
			pdeClasspath,
			jreClasspath,
			JavaCore.newSourceEntry(src.getPath())
		);
		java.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
	}
	
	private static void writeManifest(IProject project, IProgressMonitor monitor) throws CoreException {
		monitor.subTask("Writing MANIFEST.MF");
		
		StringBuilder parameters = new StringBuilder();
		parameters.append("Manifest-Version: 1.0\n");
        parameters.append("Bundle-ManifestVersion: 2\n");
        parameters.append("Bundle-Name: " + project.getName() + "\n");
        parameters.append("Bundle-SymbolicName: " + project.getName() + "; singleton:=true\n");
        parameters.append("Bundle-Version: 1.0.0\n");
        parameters.append("Require-Bundle: fr.kazejiyu.ekumi.core\n");
        parameters.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.8\n");
        parameters.append("Bundle-ActivationPolicy: lazy\n");
        parameters.append("Automatic-Module-Name: " + project.getName() + "\n");

        IFolder metaInf = project.getFolder("META-INF");
        metaInf.create(false, true, null);
        
        IFile manifest = metaInf.getFile("MANIFEST.MF");
        InputStream content = new ByteArrayInputStream(parameters.toString().getBytes(StandardCharsets.UTF_8));
        manifest.create(content, true, null);
	}
	
	private static void writeBuildProperties(IProject project, IProgressMonitor monitor) throws CoreException {
		monitor.subTask("Writing build.properties");
		
		StringBuilder properties = new StringBuilder();
		properties.append("source.. = src/\n");
        properties.append("output.. = bin/\n");
        properties.append("bin.includes = .,\\\n");
        properties.append("               META-INF/\n");

        IFile buildProperties = project.getFile("build.properties");
        InputStream content = new ByteArrayInputStream(properties.toString().getBytes(StandardCharsets.UTF_8));
        buildProperties.create(content, true, null);
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		return getClass().equals(other.getClass());
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

}
