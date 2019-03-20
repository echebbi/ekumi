package fr.kazejiyu.ekumi.specs.eds.impl.fake;

import fr.kazejiyu.ekumi.specs.eds.Node;
import fr.kazejiyu.ekumi.specs.eds.gen.impl.NodeImpl;

public class FakeSuccessor extends NodeImpl {
	
	@Override
	public boolean canSucceed(Node node) {
		return true;
	}

}
