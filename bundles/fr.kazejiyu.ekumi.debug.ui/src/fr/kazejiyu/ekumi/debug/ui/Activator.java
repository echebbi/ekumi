package fr.kazejiyu.ekumi.debug.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {
	
	public static final String ID = "fr.kazejiyu.ekumi.debug.ui";
	
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
