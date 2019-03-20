/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.provider.label;

import java.util.function.Function;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;

/**
 * Provides a styled label for all instances of a specific class.
 * 
 * @author Emmanuel CHEBBI
 *
 * @param <T> The type of the element which label has to be provided
 */
public class DynamicStyledLabelProvider<T> extends LabelProvider implements IStyledLabelProvider {
	
	/** The type of the handled instances */
	private Class<T> clazz;
	
	/** Provides the label */
	private Function<T, String> getLabel;

	/**
	 * Creates a provider for instances of the specified class.
	 * 
	 * @param clazz
	 * 			The class for which labels have to be provided.
	 * @param getLabel
	 * 			The lambda providing labels for corresponding instances.
	 */
	public DynamicStyledLabelProvider(Class<T> clazz, Function<T,String> getLabel) {
		this.clazz = clazz;
		this.getLabel = getLabel;
		
	}
	
	@Override
	public String getText(Object element) {
		if (! clazz.isInstance(element))
			return "";
		
		return getLabel.apply(clazz.cast(element)); 
	}

	@Override
	public StyledString getStyledText(Object element) {
		return new StyledString(getText(element));
	}

}
