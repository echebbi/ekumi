package fr.kazejiyu.ekumi.model.workflow.provider;

import fr.kazejiyu.ekumi.model.workflow.Execution;

/**
 * A custom item provider dedicated to {@link Execution} instances.
 * 
 * @author Emmanuel CHEBBI
 */
public class ExecutionItemProviderDecorator extends ItemProviderAdapterDecorator {
	
	public ExecutionItemProviderDecorator(EkumiDecoratorAdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Execution execution = (Execution) object;
		return execution.getStartDate().toString();
	}

}
