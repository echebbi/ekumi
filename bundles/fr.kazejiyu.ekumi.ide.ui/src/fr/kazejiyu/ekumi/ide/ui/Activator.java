/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String ID = "fr.kazejiyu.ekumi.ide.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
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
	 * Logs a message for warning the user.
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
