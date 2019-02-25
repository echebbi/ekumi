package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.model.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.model.workflow.Status.SUCCEEDED;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Runner;
import fr.kazejiyu.ekumi.model.workflow.impl.ScriptedTaskImpl;

public class BasicScriptedTask extends ScriptedTaskImpl {

	@Override
	public void run(Context context) {
		Runner script = getScript();
		
		if (script == null) {
			setStatus(SUCCEEDED);
			return;
		}
		
		try {
			script.getInputs().clear();
			script.getInputs().addAll(getInputs());
			script.getOutputs().clear();
			script.getOutputs().addAll(getOutputs());
			
			script.run(context);
			
			setStatus(SUCCEEDED);
		}
		catch (Exception e) {
			setStatus(FAILED);
		}
	}
	
}
