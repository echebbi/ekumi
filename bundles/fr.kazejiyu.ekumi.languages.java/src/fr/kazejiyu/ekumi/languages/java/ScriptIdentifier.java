/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.languages.java;

import static java.util.Arrays.asList;
import static java.util.Objects.requireNonNull;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.osgi.framework.Bundle;

import fr.kazejiyu.ekumi.model.scripting.exceptions.IllegalScriptIdentifierException;
import fr.kazejiyu.ekumi.model.workflow.Script;

/**
 * Uniquely identifies a Java {@link Script}.<br>
 * <br>
 * See {@link JavaLanguage} for an explanation of the String representation of such an identifier.
 * 
 * @author Emmanuel CHEBBI
 */
class ScriptIdentifier {
	
	private static final Set<String> ALLOWED_TYPES = new HashSet<>(asList("bundle", "project"));
	
	protected final String type;
	
	protected final String plugin;
	
	protected final String fullyQualifiedName;

	/**
	 * Creates a new identifier.
	 * 
	 * @param identifier
	 * 			The String representation of the identifier.
	 * 			Must not be {@code null}.
	 * 
	 * @throws IllegalScriptIdentifierException if the identifier is incorrectly formatted.
	 */
	public ScriptIdentifier(String identifier) {
		requireNonNull(identifier, "Cannot identify a Script from a null identifier");
		String[] typeAndPluginAndClass = identifier.split(";");
		
		if (typeAndPluginAndClass.length != 3)
			throw new IllegalScriptIdentifierException(
					"Malformed identifier: an identifier must be made of three parts separated by "
				  + "a semicolon (e.g. [bundle|project];some.project.name;some.project.name.MyClass)");
		
		type = typeAndPluginAndClass[0].toLowerCase();
		
		if (! ALLOWED_TYPES.contains(type))
			throw new IllegalScriptIdentifierException(
					"Malformed identifier: the first part of the identifier must be either 'bundle' or 'project'");
			
		plugin = typeAndPluginAndClass[1];
		fullyQualifiedName = typeAndPluginAndClass[2];
		
		if (plugin.isEmpty()) 
			throw new IllegalScriptIdentifierException("The name of the plug-in containing the Script to resolve must not be empty");
		
		if (fullyQualifiedName.isEmpty()) 
			throw new IllegalScriptIdentifierException("The name of the Script to resolve must not be empty");
	}

	/**
	 * Returns whether the corresponding script is located in a {@link Bundle}.<br>
	 * <br>
	 * If the script is not within a Bundle, then it means that it is located within
	 * an {@link IProject}.
	 * 
	 * @return whether the corresponding script is located in a Bundle.
	 */
	protected boolean isBundled() {
		return "bundle".equals(type);
	}

}
