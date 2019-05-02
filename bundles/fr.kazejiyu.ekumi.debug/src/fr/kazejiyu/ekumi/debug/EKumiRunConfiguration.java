/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.debug;

/**
 * Stores constants about EKumi Run Configurations.
 */
public final class EKumiRunConfiguration {
	
	/** ID of the extension contribution providing an EKumi Launch Configuration. */
	public static final String ID = "fr.kazejiyu.ekumi.launchConfiguration.launchConfigurationType";
	
	/** Name of the configuration's attribute used to specify the URI of the Activity to execute. */
	public static final String EKUMI_MODEL_URI = "fr.kazejiyu.ekumi.launchConfiguration.model";
	
	private EKumiRunConfiguration() {
		// should not be instantiated
	}
}
