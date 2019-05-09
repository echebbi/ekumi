package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;
import java.util.List;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

public class SetNameInList extends AbstractActivityWithStateManagement {
	
	private boolean hasRun;
	
	private Context contextOnRun;

	private List<String> names;
	
	public SetNameInList(String name, List<String> names) {
		super("" + new Date().hashCode(), name);
		this.names = names;
	}
	
	public boolean hasRun() {
		return hasRun;
	}
	
	public Context getContextOnRun() {
		return contextOnRun;
	}
	
	@Override
	public void doRun(Context context) {
		hasRun = true;
		contextOnRun = context;
		
		names.add(this.name());
	}
	
}
