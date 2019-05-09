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

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.eclipse.e4.core.services.events.IEventBroker;

import fr.kazejiyu.ekumi.core.execution.FrozenExecution;
import fr.kazejiyu.ekumi.core.execution.History;
import fr.kazejiyu.ekumi.core.execution.impl.CsvFrozenExecution;
import fr.kazejiyu.ekumi.ide.EKumiIdePlugin;

/**
 * An {@link History} persisted under a given directory.
 * <p>
 * An instance of this class can load executions persisted by an instance of {@link PersistExecution}.
 */
//TODO [Refactor] Should rely on OSGI declarative services
public class PersistedHistory implements History {
	
	/** The directory where the executions are persisted */
	private final Path location;
	
	public PersistedHistory(Path location) {
		this.location = requireNonNull(location, "The location URI must not be null");
	}
	
	@Override
	public Iterator<FrozenExecution> iterator() {
		return Arrays.stream(executionFolders())
					 .flatMap(file -> Arrays.stream(file.listFiles(f -> f.getName().endsWith(".workflow"))))
					 .map(file -> loadExecutionFromFile(file))
					 .filter(Objects::nonNull)
					 .iterator();
	}
	
	/**
	 * Sets up the instance to send events when the history changes.
	 * 
	 * @param bus
	 * 			The event broker to use to send events.
	 * 
	 * @throws Exception if an error occurs while preparing to listen for changes
	 */
	public void notifyOnChange(IEventBroker bus) throws Exception {
		FileAlterationObserver observer = new FileAlterationObserver(location.toFile());
		FileAlterationMonitor monitor = new FileAlterationMonitor(1000);
		FileAlterationListener listener = new PostEventOnExecutionChange(bus);
		
		// Creates a new thread to listen for changes periodically
		observer.addListener(listener);
		monitor.addObserver(observer);
		monitor.start();
	}

	private File[] executionFolders() {
		File[] folders = location.toFile().listFiles(File::isDirectory);
		
		if (folders == null)
			folders = new File[0];
		
		return folders;
	}
	
	// TODO [Refactor] Move this method to a more appropriate place
	static FrozenExecution loadExecutionFromFile(File file) {
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			if (lines.isEmpty()) {
				return null;
			}
			return new CsvFrozenExecution(lines.get(0));
		} 
		catch (Exception e) {
			EKumiIdePlugin.error(e, "Unable to load an execution from " + file);
			return null;
		}
	}

}
