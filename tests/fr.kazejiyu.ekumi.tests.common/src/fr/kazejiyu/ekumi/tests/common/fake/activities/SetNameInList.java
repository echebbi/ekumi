package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.List;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;

public class SetNameInList extends ActivityImpl {
	
	private boolean hasRun;
	
	private Context contextOnRun;

	private List<String> names;
	
	public SetNameInList(String name, List<String> names) {
		setName(name);
		this.names = names;
	}
	
	public boolean hasRun() {
		return hasRun;
	}
	
	public Context getContextOnRun() {
		return contextOnRun;
	}
	
	@Override
	public void run(Context context) {
		hasRun = true;
		contextOnRun = context;
		
		names.add(getName());
		
		setStatus(Status.SUCCEEDED);
	}
	
}
