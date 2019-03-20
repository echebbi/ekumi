package fr.kazejiyu.ekumi.specs.eds.impl.fake;

import fr.kazejiyu.ekumi.specs.eds.Node;
import fr.kazejiyu.ekumi.specs.eds.gen.impl.NodeImpl;

public class FakePredecessor extends NodeImpl {
	
	@Override
	public boolean canPrecede(Node node) {
		return true;
	}

}
