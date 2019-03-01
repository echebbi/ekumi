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

import fr.kazejiyu.ekumi.model.spec.ExternalTask;
import fr.kazejiyu.ekumi.model.spec.MultiChoice;
import fr.kazejiyu.ekumi.model.spec.ParallelSplit;
import fr.kazejiyu.ekumi.model.spec.SimpleMerge;
import fr.kazejiyu.ekumi.model.spec.SpecPackage;
import fr.kazejiyu.ekumi.model.spec.Start;
import fr.kazejiyu.ekumi.model.spec.Synchronization;
import fr.kazejiyu.ekumi.model.spec.impl.SpecFactoryImpl;

/**
 * <p>Custom factory used to instantiate custom sub-classes of the {@link SpecPackage}.</p>
 */
public class BasicSpecFactory extends SpecFactoryImpl {

	@Override
	public Start createStart() {
		return new BasicStart();
	}
	
	@Override
	public ExternalTask createExternalTask() {
		return new BasicExternalTask();
	}

	@Override
	public ParallelSplit createParallelSplit() {
		return new BasicParallelSplit();
	}
	
	@Override
	public Synchronization createSynchronization() {
		return new BasicSynchronization();
	}

	@Override
	public MultiChoice createMultiChoice() {
		return new BasicMultiChoice();
	}

	@Override
	public SimpleMerge createSimpleMerge() {
		return new BasicSimpleMerge();
	}
	
}
