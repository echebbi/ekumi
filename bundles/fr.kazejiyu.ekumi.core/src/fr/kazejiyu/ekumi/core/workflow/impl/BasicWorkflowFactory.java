package fr.kazejiyu.ekumi.core.workflow.impl;

import fr.kazejiyu.ekumi.core.execution.BasicExecution;
import fr.kazejiyu.ekumi.model.workflow.DataFlows;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.workflow.ScriptedTask;
import fr.kazejiyu.ekumi.model.workflow.Sequence;
import fr.kazejiyu.ekumi.model.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;
import fr.kazejiyu.ekumi.model.workflow.impl.WorkflowFactoryImpl;

/**
 * <p>Custom factory used to instantiate custom sub-classes of the {@link WorkflowPackage}.</p>  
 */
public class BasicWorkflowFactory extends WorkflowFactoryImpl {

	@Override
	public DataFlows createDataFlows() {
		return new BasicDataFlows();
	}

	@Override
	public Execution createExecution() {
		return new BasicExecution();
	}

	@Override
	public Sequence createSequence() {
		return new BasicSequence();
	}

	@Override
	public StructuredLoop createStructuredLoop() {
		return new BasicStructuredLoop();
	}

	@Override
	public ScriptedTask createScriptedTask() {
		return new BasicScriptedTask();
	}

}
