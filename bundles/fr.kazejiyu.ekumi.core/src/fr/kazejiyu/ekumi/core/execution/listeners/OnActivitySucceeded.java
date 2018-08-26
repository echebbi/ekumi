package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Activity;

@FunctionalInterface
public interface OnActivitySucceeded {
	
	void onActivitySucceeded(Activity succeeded);

}
