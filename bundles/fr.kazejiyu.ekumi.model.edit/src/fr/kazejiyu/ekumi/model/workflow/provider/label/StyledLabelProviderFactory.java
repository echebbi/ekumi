package fr.kazejiyu.ekumi.model.workflow.provider.label;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;

public class StyledLabelProviderFactory extends LabelProvider implements IStyledLabelProvider {
	
	private ILabelProvider labelProvider;

	public StyledLabelProviderFactory(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}

	@Override
	public String getText(Object element) {
		return labelProvider.getText(element);
	}

	@Override
	public StyledString getStyledText(Object element) {
		return new StyledString(getText(element));
	}

}
