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

import static fr.kazejiyu.ekumi.ide.history.PersistedHistory.loadExecutionFromFile;
import static java.util.Objects.requireNonNull;

import java.io.File;
import java.nio.file.Path;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.eclipse.e4.core.services.events.IEventBroker;

import fr.kazejiyu.ekumi.core.EKumiPlugin;
import fr.kazejiyu.ekumi.core.execution.FrozenExecution;
import fr.kazejiyu.ekumi.ide.events.EKumiEvents;

/**
 * Sends specific events when an execution (*.ekumi) file changes.
 */
class PostEventOnExecutionChange extends FileAlterationListenerAdaptor {
	
	/** Used to send events */
	private final IEventBroker bus;
	
	/**
	 * Creates a new file alteration listener.
	 * 
	 * @param bus
	 * 			The event broker to use to send events.
	 */
	public PostEventOnExecutionChange(IEventBroker bus) {
		this.bus = requireNonNull(bus, "The IEventBroker must not be null");
	}

    @Override
    public void onFileCreate(File file) {
    	process(file, EKumiEvents.HISTORY_EXECUTION_STARTED);
    }
 
    @Override
    public void onFileDelete(File file) {
    	// nothing to do
    }
 
    @Override
    public void onFileChange(File file) {
    	process(file, EKumiEvents.HISTORY_EXECUTION_CHANGED);
    }

	private void process(File file, String event) {
		try {
    		FrozenExecution execution = load(file);
    		bus.post(event, execution);
    	} 
		catch (Exception e) {
    		EKumiPlugin.error(e, "An error occurred while processing changes in " + (file == null ? file : file.getAbsolutePath()));
    	}
	}
    
    private FrozenExecution load(File file) {
    	// Ignore lock files
    	if (file.getName().equals(".lock")) {
    		return null;
    	}
    	Path lock = file.getParentFile().toPath().resolve(".lock");
    	
    	while (lock.toFile().exists()) {
    		// wait for lock to be released
    		// TODO Add a timer to prevent infinite loops
    	}
    	return loadExecutionFromFile(file);
    }
    
}
