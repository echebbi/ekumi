package fr.kazejiyu.ekumi.debug.ui.form.hooks;

import java.util.function.Function;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.ColumnLabelProvider;

public class LambdaLabelProvider extends ColumnLabelProvider {
	
	private final Function<IConfigurationElement, String> labelProvider;

	public LambdaLabelProvider(Function<IConfigurationElement, String> labelProvider) {
		super();
		this.labelProvider = labelProvider;
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof IConfigurationElement) {
			IConfigurationElement hook = (IConfigurationElement) element;
			return labelProvider.apply(hook);
		}
		return "";
	}

}
