package fr.kazejiyu.ekumi.model.workflow.provider;

import fr.kazejiyu.ekumi.model.workflow.Activity;

/**
 * A custom item provider dedicated to {@link Activity} instances.
 * 
 * @author Emmanuel CHEBBI
 */
public class ActivityItemProviderDecorator extends ItemProviderAdapterDecorator {
	
	public ActivityItemProviderDecorator(EkumiDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Activity activity = (Activity) object;
		return activity.getName();
	}

}