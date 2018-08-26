package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Activity;

@FunctionalInterface
public interface OnActivityStarted {
	
	void onActivityStarted(Activity started);

}
