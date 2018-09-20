package fr.kazejiyu.ekumi.ide.catalog.internal;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.model.catalog.Catalog;
import fr.kazejiyu.ekumi.model.catalog.Catalogs;
import fr.kazejiyu.ekumi.model.catalog.Category;

/**
 * An OSGI Declarative Service making a {@link Catalogs} instance available for injection.<br>
 * <br>
 * This instance is filled with {@link Catalog} and {@link Category} instances provided via extensions.<br>
 * <br>
 * The corresponding extension point is {@link EKumiPlugin#CATALOGS_EXTENSION_ID}.
 * 
 * @author Emmanuel CHEBBI
 */
public class CatalogsCreationFunction implements IContextFunction {
	
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		IExtensionRegistry extensions = context.get(IExtensionRegistry.class);
		
		ExtensionToCatalogsAdapter adapter = new ExtensionToCatalogsAdapter();
		
		Catalogs catalogs = adapter.adapt(
			extensions.getConfigurationElementsFor(EKumiPlugin.CATALOGS_EXTENSION_ID)
		);

		ContextInjectionFactory.inject(catalogs, context);
		return catalogs;
	}
	
}
