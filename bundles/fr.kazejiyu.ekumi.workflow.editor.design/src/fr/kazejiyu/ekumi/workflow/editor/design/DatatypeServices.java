/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.workflow.editor.design;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.Objects;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.ide.common.datatypes.ExtensionToDatatypeAdapter;
import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.spec.Variable;

/**
 * Provides services related to {@link DataType} for EKumi's workflow editor viewpoint.
 */
public class DatatypeServices {

	/**
	 * <p>Returns the name of a given datatype.</p>
	 * 
	 * <p>I can't make Sirius call {@link DataType#getName()} by itself
	 * so this function compensate for that.</p>
	 * 
	 * @param type
	 * 			The type which name is looked for.
	 * 
	 * @return a human-readable name of the given datatype
	 */
	public String name(DataType<?> type) {
		return type.getName();
	}
	
	/**
	 * <p>Returns the datatype of a given variable</p>
	 * 
	 * @param variable
	 * 			The variable which type is required.
	 * 
	 * @return the type of the variable, or null if it doesn't have one
	 */
	public DataType<?> getDatatype(Variable variable) {
		if (variable.getTypeId() == null || variable.getTypeId().isEmpty())
			return null;
		
		for (DataType<?> dataType : availableDatatypes(variable)) {
			if (Objects.equals(dataType.getId(), variable.getTypeId())) {
				return dataType;
			}
		}
		
		return null;
	}
	
	/**
	 * Sets the type of a given variable.
	 * 
	 * @param variable
	 * 			The variable which type is set.
	 * @param type
	 * 			The new type of the variable.
	 */
	public void setDatatype(Variable variable, DataType<?> type) {
		variable.setTypeId(type.getId());
	}
	
	/**
	 * Returns the list of available datatypes for a given variable.
	 * 
	 * @param variable
	 * 			The variable for which available datatypes are looked for.
	 * 
	 * @return the datatypes available for the given variable
	 */
	public List<DataType<?>> availableDatatypes(Variable variable) {
		IExtensionRegistry extensions = Platform.getExtensionRegistry();
		ExtensionToDatatypeAdapter adapter = new ExtensionToDatatypeAdapter();
		return adapter.adapt(asList(
				extensions.getConfigurationElementsFor(EKumiPlugin.DATATYPES_EXTENSION_ID)
		));
	}
	
}
