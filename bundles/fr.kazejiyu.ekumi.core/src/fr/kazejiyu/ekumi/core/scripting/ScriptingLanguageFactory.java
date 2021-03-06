/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.scripting;

import java.util.Optional;

import fr.kazejiyu.ekumi.core.scripting.exceptions.ScriptingLanguageNotFoundException;

/**
 * Creates {@link ScriptingLanguage} instances.
 */
@FunctionalInterface
public interface ScriptingLanguageFactory {
	
	/**
	 * Creates a new language according to the given id.
	 *  
	 * @param id
	 * 			The identifier of the language to find.
	 * 
	 * @return the language if it has been found
	 */
	Optional<ScriptingLanguage> find(String id);
	
	/**
	 * Creates a new language according to the given id.
	 * 
	 * @param id
	 * 			The identifier of the language to get.
	 * 
	 * @return the language
	 * 
	 * @throws ScriptingLanguageNotFoundException if no language is associated with the given id
	 */
	default ScriptingLanguage get(String id) {
		return find(id).orElseThrow(() -> new ScriptingLanguageNotFoundException(id));
	}

}
