package fr.kazejiyu.ekumi.launchconfiguration.ui.form;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * Main page for configuring EKumi Launch Configurations. 
 */
public class EkumiTabGroup extends AbstractLaunchConfigurationTabGroup {
	
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] { new ChooseActivityModelTab() });
	}

}
