package fr.kazejiyu.ekumi.core.spec.impl;

import org.eclipse.emf.ecore.EFactory;

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
public class BasicSpecFactory extends SpecFactoryImpl implements EFactory {

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
