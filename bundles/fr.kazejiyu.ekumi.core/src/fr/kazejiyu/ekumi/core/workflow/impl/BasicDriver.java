package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.model.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.model.workflow.Status.SUCCEEDED;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.DriverRunner;
import fr.kazejiyu.ekumi.model.workflow.impl.DriverImpl;

public class BasicDriver extends DriverImpl {
	
	@Override
	public void run(Context context) {
		DriverRunner script = getScript();
		
		if (script == null || driven == null) {
			setStatus(SUCCEEDED);
			return;
		}
		
		try {
			script.setDriven(getDriven());
			script.getInputs().clear();
			script.getInputs().addAll(getInputs());
			script.getOutputs().clear();
			script.getOutputs().addAll(getOutputs());
			
			script.run(context);
			
			setStatus(SUCCEEDED);
		}
		catch (Exception e) {
			// TODO log error
			setStatus(FAILED);
		}
	}

}
