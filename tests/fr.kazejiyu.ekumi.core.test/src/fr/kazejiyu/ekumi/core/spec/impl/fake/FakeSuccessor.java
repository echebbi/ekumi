package fr.kazejiyu.ekumi.core.spec.impl.fake;

import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.impl.NodeImpl;

public class FakeSuccessor extends NodeImpl {
	
	@Override
	public boolean canSucceed(Node node) {
		return true;
	}

}
