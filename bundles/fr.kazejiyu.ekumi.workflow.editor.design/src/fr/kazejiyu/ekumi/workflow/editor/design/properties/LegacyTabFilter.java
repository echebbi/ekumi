package fr.kazejiyu.ekumi.workflow.editor.design.properties;

import static java.util.Arrays.asList;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorFilter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditor;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Used to filter out Sirius legacy tabs from the Properties view
 * when the selection is an EKumi model. 
 */
public class LegacyTabFilter implements IEEFTabDescriptorFilter {
	
	/** IDs of the pages to filter out */
	protected static final Set<String> TABS_TO_FILTER_OUT = new HashSet<>(
			asList("sirius_default_rules_defaultpagesirius_default_rules_defaultgroup", 
				   "property.tab.semantic", 
				   "property.tab.documentation",
				   "property.tab.style",
				   "property.tab.behaviors",
				   "property.tab.DiagramPropertySection",
				   "property.tab.AppearancePropertySection"
			)
	);

	@Override
	public boolean filter(IEEFTabDescriptor tabDescriptor, IWorkbenchPart part, ISelection selection) {
		if (! isSiriusDiagram(part) || ! tabMustBeFilteredOut(tabDescriptor))
			return true;
		
		try {
			Object selectedElement = ((StructuredSelection) selection).getFirstElement();
			View view = (View) ((EditPart) selectedElement).getModel();
			DSemanticDecorator container = (DSemanticDecorator) view.getElement();
					
			// return false to filter out the tab
			return ! isMyOwnObject(container.getTarget());

		} catch (ClassCastException e) {
			// The selection does not match our expectations but that's not a problem.
			// Using a try statement instead of instanceof makes the code clearer.
		}
		return true;
	}
	
	private static boolean isMyOwnObject(EObject object) {
		if (object == null || object.getClass().getCanonicalName() == null)
			return false;
		
		return object.getClass().getCanonicalName().startsWith("fr.kazejiyu.ekumi");
	}
	
	private static boolean isSiriusDiagram(IWorkbenchPart part) {
		return part instanceof SiriusDiagramEditor;
	}

	private static boolean tabMustBeFilteredOut(IEEFTabDescriptor tabDescriptor) {
		// 'startsWith' because the ID of the 'Main' group is dynamic and has a suffix at runtime
		return TABS_TO_FILTER_OUT.stream()
								 .anyMatch(id -> tabDescriptor.getId().startsWith(id));
	}

}
