/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.common.languages;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguageFactory;

/**
 * <p>Creates new datatypes from given configuration elements</p>
 */
public class ExtensionToLanguageFactory implements ScriptingLanguageFactory {
	
	private final Supplier<List<IConfigurationElement>> elements;

	public ExtensionToLanguageFactory(Supplier<List<IConfigurationElement>> elements) {
		this.elements = elements;
	}

	@Override
	public Optional<ScriptingLanguage> find(String id) {
		ExtensionToScriptingLanguageAdapter adapter = new ExtensionToScriptingLanguageAdapter();
		return adapter.adapt(elements.get()).stream()
					  .filter(language -> id.equals(language.id()))
					  .findAny();
	}
	
}
