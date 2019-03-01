package fr.kazejiyu.ekumi.core.spec.impl.fake;

import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.impl.NodeImpl;

public class FakePredecessor extends NodeImpl {
	
	@Override
	public boolean canPrecede(Node node) {
		return true;
	}

}
