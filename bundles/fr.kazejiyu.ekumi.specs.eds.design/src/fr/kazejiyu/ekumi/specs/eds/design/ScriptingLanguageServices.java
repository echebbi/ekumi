/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.specs.eds.design;

import static java.util.Arrays.asList;
import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.Objects;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;

import fr.kazejiyu.ekumi.core.EKumiExtensions;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.ide.common.languages.ExtensionToScriptingLanguageAdapter;
import fr.kazejiyu.ekumi.specs.eds.ExternalTask;

/**
 * Provides services related to {@link ScriptingLanguage} for EKumi's workflow editor viewpoint.
 */
public class ScriptingLanguageServices {
	
	private IExtensionRegistry extensions;
	
	public ScriptingLanguageServices() {
		this.extensions = Platform.getExtensionRegistry();
	}
	
	/**
	 * Sets the registry used to retrieve available datatypes.
	 * 
	 * @param extensions
	 * 			The registry to use.
	 */
	public void setExtensionRegistry(IExtensionRegistry extensions) {
		this.extensions = requireNonNull(extensions, "The ExtensionRegistry must not be null");
	}

	/**
	 * <p>Returns the name of a given scripting language.</p>
	 * 
	 * <p>I can't make Sirius call {@link ScriptingLanguage#name()} by itself
	 * so this function compensate for that.</p>
	 * 
	 * @param language
	 * 			The language which name is looked for.
	 * 
	 * @return a human-readable name of the given language
	 */
	public String name(ScriptingLanguage language) {
		return language.name();
	}
	
	/**
	 * Returns the scripting language used by a given task.
	 * 
	 * @param task
	 * 			The task which language is looked for.
	 * 
	 * @return the task's language, or null if it doesn't have one
	 */
	public ScriptingLanguage getScriptingLanguage(ExternalTask task) {
		if (task.getLanguageId() == null || task.getLanguageId().isEmpty())
			return null;
		
		for (ScriptingLanguage language : availableScriptingLanguages(task)) {
			if (Objects.equals(language.id(), task.getLanguageId())) {
				return language;
			}
		}
		return null;
	}
	
	/**
	 * Sets the language of a given task.
	 * 
	 * @param task
	 * 			The task which language is set.
	 * @param language
	 * 			The language to use.
	 */
	public void setScriptingLanguage(ExternalTask task, ScriptingLanguage language) {
		task.setLanguageId(language.id());
	}
	
	/**
	 * Returns all the {@link ScriptingLanguage}s that are available in the environment.
	 * 
	 * @param object
	 * 			The object that requires the list of languages.
	 * 
	 * @return the list of available scripting languages
	 */
	public List<ScriptingLanguage> availableScriptingLanguages(EObject object) {
		ExtensionToScriptingLanguageAdapter adapter = new ExtensionToScriptingLanguageAdapter();
		return adapter.adapt(asList(
				extensions.getConfigurationElementsFor(EKumiExtensions.LANGUAGES_EXTENSION_ID)
		));
	}
	
}
