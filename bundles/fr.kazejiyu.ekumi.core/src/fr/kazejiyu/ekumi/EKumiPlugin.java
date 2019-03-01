/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.BundleContext;

import fr.kazejiyu.ekumi.model.exceptions.EKumiRuntimeException;

/**
 * Activator of the {@code fr.kazejiyu.ekumi.core} bundle.
 * 
 * @author Emmanuel CHEBBI
 */
public class EKumiPlugin extends Plugin {
	
	public static final String ID = "fr.kazejiyu.ekumi.core";
	
	/** ID of the 'catalogs' extension point */
	public static final String CATALOGS_EXTENSION_ID = "fr.kazejiyu.ekumi.model.catalogs";
	
	/** ID of the 'datatypes' extension point */
	public static final String DATATYPES_EXTENSION_ID = "fr.kazejiyu.ekumi.model.datatypes";
	
	/** ID of the 'languages' extension point */
	public static final String LANGUAGES_EXTENSION_ID = "fr.kazejiyu.ekumi.model.languages";

	/** URI of the plug-in's corresponding folder under the .metadata/.plugins directory */
	private static final URI STATE_LOCATION_URI = URI.createURI("platform:/meta/" + ID + "/");

	// The shared instance
	private static EKumiPlugin plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static EKumiPlugin getDefault() {
		return plugin;
	}
	
	/**
	 * Returns the URI of the state directory for this bundle under <i>.metadata/.plugins/</i>.
	 * @return the URI of the state directory for this bundle under <i>.metadata/.plugins/</i>
	 */
	public static URI getStateLocationURI() {
		return STATE_LOCATION_URI;
	}
	
	/**
	 * Returns the location of the state directory for this bundle under <i>.metadata/.plugins/</i>.
	 * @return the location of the state directory for this bundle under <i>.metadata/.plugins/</i>
	 */
	public static Path getStateLocationPath() {
		try {
			return Paths.get(FileLocator.resolve(new URL(getStateLocationURI().toString())).toURI());
			
		} catch (URISyntaxException | IOException e) {
			// Should never happen
			throw new EKumiRuntimeException("An unexpected error occurred while resolving the state location of " + ID, e);
		}
	}
	
	/**
	 * Logs a message for info or debugging purposes.
	 * 
	 * @param message
	 * 			The message to log.
	 */
	public static void debug(String message) {
		getDefault().getLog().log(new Status(IStatus.INFO, ID, message));
	}
	
	/**
	 * Logs a message for warning the user.
	 * 
	 * @param message
	 * 			The message to log.
	 */
	public static void warn(String message) {
		getDefault().getLog().log(new Status(IStatus.WARNING, ID, message));
	}
	
	/**
	 * Logs a message for warning the user providing an additional stack trace.
	 * 
	 * @param t
	 * 			The throwable that causes the warning.
	 * @param message
	 * 			The message to log.
	 */
	public static void warn(Throwable t, String message) {
		getDefault().getLog().log(new Status(IStatus.WARNING, ID, message, t));
	}
	
	/**
	 * Logs an error.
	 * 
	 * @param message
	 * 			The error message.
	 */
	public static void error(String message) {
		getDefault().getLog().log(new Status(IStatus.ERROR, ID, message));
	}
	
	/**
	 * Logs an Exception.
	 * 
	 * @param e
	 * 			The exception to log.
	 * @param message
	 * 			The error message.
	 */
	public static void error(Exception e, String message) {
		getDefault().getLog().log(new Status(IStatus.ERROR, ID, message, e));
	}

}
