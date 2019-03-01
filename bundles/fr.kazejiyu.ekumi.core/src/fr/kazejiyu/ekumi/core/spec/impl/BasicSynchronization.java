package fr.kazejiyu.ekumi.core.spec.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.impl.SynchronizationImpl;

public class BasicSynchronization extends SynchronizationImpl {
	
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
		return true;
	}
	
	@Override
	public boolean canSucceed(Node node) {
		return ! getPredecessors().contains(node)
			&& ! EcoreUtil.equals(this, node);
	}

}
