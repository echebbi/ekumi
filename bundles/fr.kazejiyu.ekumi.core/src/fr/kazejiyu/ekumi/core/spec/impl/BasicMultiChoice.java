package fr.kazejiyu.ekumi.core.spec.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.impl.MultiChoiceImpl;

public class BasicMultiChoice extends MultiChoiceImpl {
	
	@Override
	public boolean canPrecede() {
		return true;
	}

	@Override
	public boolean canPrecede(Node node) {
		return ! EcoreUtil.equals(this, node);
	}
	
	@Override
	public boolean canSucceed() {
		return getPredecessors().isEmpty();
	}
	
	@Override
	public boolean canSucceed(Node node) {
		return canSucceed() && ! EcoreUtil.equals(this, node); 
	}

}
