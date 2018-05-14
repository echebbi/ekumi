package fr.kazejiyu.ekumi.tests.mocks;

import java.util.ArrayList;
import java.util.List;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;

public class SetNameInContext extends ActivityImpl {
	
	public static final String VARIABLE_IN_CONTEXT = "do_nothing_list";

	private boolean hasRun;
	
	public SetNameInContext() {
		this("");
	}
	
	public SetNameInContext(String name) {
		setName(name);
	}
	
	public boolean hasRun() {
		return hasRun;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void run(Context context) {
		hasRun = true;
		
		if (! context.contains(VARIABLE_IN_CONTEXT)) {
			context.set(VARIABLE_IN_CONTEXT, new ArrayList<String>());
		}
		
		context.get(VARIABLE_IN_CONTEXT).ifPresent(var -> var.getValueAs(List.class).add(getName()));
		setStatus(Status.SUCCEEDED);
	}
	
}
