package fr.kazejiyu.ekumi.debug.ui.form.hooks;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.IStructuredContentProvider;

public class ExtensionsHooksContentProvider implements IStructuredContentProvider {

	@Override
	@SuppressWarnings("unchecked")
	public Object[] getElements(Object inputElement) {
		List<IConfigurationElement> hooks = new ArrayList<>();
		List<IConfigurationElement> extensions = (List<IConfigurationElement>) inputElement;
		
		for (IConfigurationElement extension : extensions) {
			if (isACompleteHook(extension)) {
				hooks.add(extension);
			}
		}
		return hooks.toArray();
	}

	private static boolean isACompleteHook(IConfigurationElement extension) {
		return extension.getName().equals("hook")
		    && hasValid(extension, "id") 
			&& hasValid(extension, "name");
	}
	
	private static final boolean hasValid(IConfigurationElement element, String attribute) {
		String value = element.getAttribute(attribute);
		return value != null 
		    && ! "".equals(value);
	}

}
