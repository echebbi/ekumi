package fr.kazejiyu.ekumi.core.ekumi.impl;

import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.DriverRunner;

public class BasicDriver extends DriverImpl {
	
	@Override
	public void run(Context context) {
		DriverRunner script = getScript();
		
		if (script == null) {
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
