/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.specs;

import java.util.Optional;

import fr.kazejiyu.ekumi.core.datatypes.DataTypeFactory;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguageFactory;

/**
 * Adapts a specification to an {@link fr.kazejiyu.ekumi.core.workflow.model.workflow.Activity}. 
 */
public interface ActivityAdapter {
	
	/**
	 * Returns whether the adapter can turn the given specification into an Activity.
	 * 
	 * @param specification
	 * 			The specification to adapt, may be null.
	 * 
	 * @return whether the adapter can turn the given specification into an Activity
	 */
	boolean canAdapt(Object specification);
	
	/**
	 * Creates an Activity from the given specification.
	 * 
	 * @param specification
	 * 			The specification to adapt.
	 * @param datatypes
	 * 			The factory used to instantiate available datatypes.
	 * @param languages
	 * 			The factory used to instantiate available scripting languages.
	 * 
	 * @return a new Activity
	 */
	Optional<fr.kazejiyu.ekumi.core.workflow.Activity> adapt(Object specification, DataTypeFactory datatypes, ScriptingLanguageFactory languages);

}
