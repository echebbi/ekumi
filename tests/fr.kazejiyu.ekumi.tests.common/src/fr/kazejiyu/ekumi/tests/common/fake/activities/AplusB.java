/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;
import fr.kazejiyu.ekumi.datatypes.DoubleType;

public class AplusB extends AbstractActivityWithStateManagement {

	public AplusB(String id) {
		super(id, "AplusB");
		
		inputs().create("A", new DoubleType());
		inputs().create("B", new DoubleType());
		outputs().create("C", new DoubleType());
	}

	@Override
	protected void doRun(Context context) throws Exception {
		double a = (double) input("A").value();
		double b = (double) input("B").value();
		
		output("C").set(a + b);
	}

}
