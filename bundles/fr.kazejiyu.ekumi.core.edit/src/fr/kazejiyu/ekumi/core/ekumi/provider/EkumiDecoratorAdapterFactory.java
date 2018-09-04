package fr.kazejiyu.ekumi.core.ekumi.provider;

import org.eclipse.emf.edit.provider.DecoratorAdapterFactory;
import org.eclipse.emf.edit.provider.IItemProviderDecorator;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Execution;

public class EkumiDecoratorAdapterFactory extends DecoratorAdapterFactory {
	
	public EkumiDecoratorAdapterFactory() {
		super(new EkumiItemProviderAdapterFactory());
	}

	@Override
	protected IItemProviderDecorator createItemProviderDecorator(Object target, Object type) {
		// Delegate to custom item providers
		if (target instanceof Execution)
			return new ExecutionItemProviderDecorator(this);
		if (target instanceof Activity)
			return new ActivityItemProviderDecorator(this);
		
		// Use default, generated item providers
		return new ForwardingItemProviderAdapterDecorator(this);
	}

}
