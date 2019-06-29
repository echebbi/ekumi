/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core;

/**
 * Provides access to the extension points declared by EKumi. 
 */
public final class EKumiExtensions {
	
	/** ID of the 'catalogs' extension point */
	public static final String CATALOGS_EXTENSION_ID = EKumiPlugin.ID + ".catalogs";
	
	/** ID of the 'datatypes' extension point */
	public static final String DATATYPES_EXTENSION_ID = EKumiPlugin.ID +".datatypes";
	
	/** ID of the 'languages' extension point */
	public static final String LANGUAGES_EXTENSION_ID = EKumiPlugin.ID +".languages";
	
	/** ID of the 'specs' extension point */
	public static final String SPECS_EXTENSION_ID = EKumiPlugin.ID +".specs";
	
	/** ID of the 'execution' extension point */
	public static final String EXECUTION_EXTENSION_ID = EKumiPlugin.ID +".execution";
	
	private EKumiExtensions() {
		// makes no sense to instantiate it
	}

}
