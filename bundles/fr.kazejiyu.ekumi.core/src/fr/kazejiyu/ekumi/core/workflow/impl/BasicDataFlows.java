package fr.kazejiyu.ekumi.core.workflow.impl;

import fr.kazejiyu.ekumi.model.workflow.DataFlow;
import fr.kazejiyu.ekumi.model.workflow.impl.DataFlowsImpl;

public class BasicDataFlows extends DataFlowsImpl {

	@Override
	public void resolveInputs() {
		for (DataFlow flow : getIncomings()) {
			flow.getOutput().setValue(flow.getInput().getValue());
		}
	}
	
}
