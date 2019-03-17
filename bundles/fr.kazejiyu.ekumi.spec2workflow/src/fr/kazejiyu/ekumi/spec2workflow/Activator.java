/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.spec2workflow;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {
	
	public static final String ID = "fr.kazejiyu.ekumi.spec2workflow";
	
	// The shared instance
	private static Activator plugin;

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
	public static Activator getDefault() {
		return plugin;
	}
	
	/**
	 * Logs a message for info or debugging purposes.
	 * 
	 * @param message
	 * 			The message to log.
	 */
	public static void debug(String message) {
		log(new Status(IStatus.INFO, ID, message));
	}
	
	/**
	 * Logs a message for warning the user.
	 * 
	 * @param message
	 * 			The message to log.
	 */
	public static void warn(String message) {
		log(new Status(IStatus.WARNING, ID, message));
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
		log(new Status(IStatus.WARNING, ID, message, t));
	}
	
	/**
	 * Logs an error.
	 * 
	 * @param message
	 * 			The error message.
	 */
	public static void error(String message) {
		log(new Status(IStatus.ERROR, ID, message));
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
		log(new Status(IStatus.ERROR, ID, message, e));
	}

	/**
	 * Logs a specific status.
	 * 
	 * @param status
	 * 			The status to log.
	 */
	public static void log(Status status) {
		if (getDefault() != null) {
			getDefault().getLog().log(status);
		}
	}

}
