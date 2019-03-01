/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.spec.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.impl.StartImpl;

public class BasicStart extends StartImpl {
	
	@Override
	public boolean canPrecede() {
		return getSuccessors().isEmpty();
	}
	
	@Override
	public boolean canPrecede(Node node) {
		return canPrecede() && ! EcoreUtil.equals(this, node);
	}
	
	@Override
	public boolean canSucceed() {
		return false;
	}
	
	@Override
	public boolean canSucceed(Node node) {
		return false;
	}

}
