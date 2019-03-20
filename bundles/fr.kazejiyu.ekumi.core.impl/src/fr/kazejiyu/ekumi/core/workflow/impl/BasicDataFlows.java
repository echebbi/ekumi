/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.impl;

import fr.kazejiyu.ekumi.core.workflow.DataFlow;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowsImpl;

public class BasicDataFlows extends DataFlowsImpl {

	@Override
	public void resolveInputs() {
		for (DataFlow flow : getIncomings()) {
			flow.getOutput().setValue(flow.getInput().getValue());
		}
	}
	
}
