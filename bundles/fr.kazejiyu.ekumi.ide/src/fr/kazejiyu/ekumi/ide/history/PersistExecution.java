/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.history;

import static java.util.Objects.requireNonNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.kazejiyu.ekumi.core.EKumiPlugin;
import fr.kazejiyu.ekumi.core.execution.listeners.ActivityListener;
import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionListener;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.ide.internal.lock.LockFolderFile;

/**
 * Watches an {@link Execution} in order to persist it in the workspace each time it changes.
 * <<p>
 * The execution is persisted under the given URI using the following pattern:
 * <ul>
 * 	<li><i>&lt;yyyy.MM.dd.HHmmssms&gt;-&lt;execution-id&gt;</i>/<i>&lt;execution-name&gt;</i>.ekumi
 * </ul>
 * For instance, the Execution {@code (id=a.simple.execution, name=Simple Execution)} started on December 17th, 2018,
 * at 13:03:42.27 would be persisted under:
 * <ul>
 * 	<li>2018.12.17.13034227-a.simple.execution/Simple Execution.workflow
 * </ul>
 * 
 * @author Emmanuel CHEBBI
 */
// TODO [Refactor] Should rely on OSGI declarative services
public class PersistExecution implements ActivityListener, ExecutionListener {

	/** The format used to write execution's start date */
	private final SimpleDateFormat startDateFormat = new SimpleDateFormat("yyyy.MM.dd.HHmmssms");
	
	/** Set on execution started */
	private Execution execution;
	
	/** The directory where the execution is persisted */
	private final Path location;
	
	/**
	 * Creates a new listener aimed to persist an execution to the given location.
	 *  
	 * @param location
	 * 			The location where the execution must be persisted.
	 * 			Must be a valid directory.
	 */
	public PersistExecution(Path location) {
		this.location = requireNonNull(location, "The location must not be null");
	}

	@Override
	public void onExecutionStarted(Execution started) {
		this.execution = started;
		persist(execution);
	}

	@Override
	public void onActivityFailed(Activity failed) {
		persist(execution);
	}

	@Override
	public void onActivitySucceeded(Activity succeeded) {
		persist(execution);
	}
	
	@Override
	public void onExecutionSucceeded(Execution succeeded) {
		this.execution = succeeded;
		persist(execution);
	}
	
	@Override
	public void onExecutionFailed(Execution failed) {
		this.execution = failed;
		persist(execution);
	}

	/**
	 * Persists given execution as an XMI file under given location.
	 * 
	 * @param execution
	 * 			The execution to persist.
	 */
	private void persist(Execution execution) {
		Path folder = location.resolve(folderNameFor(execution));
		
		// Save the resource with a lock to prevent readings while the resource is not fully written
		try (LockFolderFile lock = new LockFolderFile(folder.resolve(".lock"))) {
			Path modelFile = folder.resolve(execution.name() + ".workflow");
			
			Files.createDirectories(folder);
			Files.write(modelFile, serialize(execution).getBytes());
		}
		catch (IOException e) {
			EKumiPlugin.error(e, "An error occurred while persisting " + execution + " at URI " + location);
		}
	}

	/**
	 * Returns the name of the folder in which the given execution can be saved.
	 * 
	 * @param execution
	 * 			The execution for which a folder name is required.
	 * 
	 * @return the name of the folder in which the execution can be saved
	 */
	private String folderNameFor(Execution execution) {
		return execution.startDate().map(startDateFormat::format)
									.map(date -> date + "_" + execution.id())
									.orElse("not started yet");
	}
	
	private static String serialize(Execution execution) {
		return execution.id() + ";" 
			 + execution.name() 
			 + ";" + execution.state() 
			 + ";" + execution.startDate().map(Date::getTime).orElse(0l);
	}

}
