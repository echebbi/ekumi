/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.project.customization;

import fr.kazejiyu.ekumi.core.workflow.Activity;

/**
 * <p>A representation of an {@link Activity}.</p>
 * 
 * <p>A representation is not necessarily visual: it may be textual or in-memory.</p>
 */
public interface Representation extends Customization {
	
	/**
	 * Returns the ID of the representation.
	 * @return a unique identifier
	 */
	String id();
	
	/**
	 * Returns the name of the representation.
	 * @return a human-readable name
	 */
	String name();
	
	/**
	 * Returns the description of the representation.
	 * @return the description of the representation
	 */
	String description();

}
