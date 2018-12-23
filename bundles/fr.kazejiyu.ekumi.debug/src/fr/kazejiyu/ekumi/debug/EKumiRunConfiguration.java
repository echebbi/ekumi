package fr.kazejiyu.ekumi.debug;

/**
 * Stores constants about EKumi Run Configurations.
 */
public final class EKumiRunConfiguration {
	
	/** ID of the EKumi extension contribution to the org.eclipse.debug.ui.launchShortcuts extension point */
	public static final String ID = "fr.kazejiyu.ekumi.launchConfiguration.launchConfigurationType";
	
	/** Name of the configuration's attribute used to specify the URI of the Activity to execute */
	public static final String EKUMI_MODEL_URI = "fr.kazejiyu.ekumi.launchConfiguration.model";
	
	private EKumiRunConfiguration() {
		// should not be instantiated
	}
}
