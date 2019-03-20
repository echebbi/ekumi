package fr.kazejiyu.ekumi.specs.eds.design.properties;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.assertj.core.api.WithAssertions;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditor;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IWorkbenchPart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.specs.eds.EdsFactory;
import fr.kazejiyu.ekumi.specs.eds.design.properties.LegacyTabFilter;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A LegacyTabFilter")
public class LegacyTabFilterTest implements WithAssertions {

	// The instance to test
	LegacyTabFilter filter;
	
	StructuredSelection selection;
	
	@Mock SiriusDiagramEditor diagramEditorPart;
	
	@Mock IEEFTabDescriptor tabDescriptor;
	
	@Mock EditPart selectedPart;
	@Mock View view;
	@Mock DSemanticDecorator container;
	
	@BeforeEach
	void setup() {
		filter = new LegacyTabFilter();
		
		// Simulate the environment given by Sirius
		selection = new StructuredSelection(selectedPart);
		when (selectedPart.getModel()) .thenReturn(view);
		when (view.getElement()) .thenReturn(container);
	}
	
	@ParameterizedTest(name = "tab id = {0}")
	@MethodSource("tabsToFilterOut")
	@DisplayName("ignores parts that are not Sirius diagram")
	void ignores_parts_that_are_not_Sirius_diagram(String tabId, @Mock IWorkbenchPart workbenchPart) {
		// even if the tab id indicates that it should be filtered out
		when (tabDescriptor.getId()) .thenReturn(tabId);

		boolean tabIsKept = filter.filter(tabDescriptor, workbenchPart, selection);
		assertThat(tabIsKept).isTrue();
	}
	
	@ParameterizedTest(name = "tab id = {0}")
	@ValueSource(strings = {"", "$$", "property"})
	@DisplayName("ignores tabs that must not be filtered out")
	void ignores_tabs_that_must_not_be_filtered_out(String ignored) {
		// when the tab id indicates that it should not be filtered out
		when (tabDescriptor.getId()) .thenReturn(ignored);
		
		boolean tabIsKept = filter.filter(tabDescriptor, diagramEditorPart, selection);
		assertThat(tabIsKept).isTrue();
	}
	
	@ParameterizedTest(name = "tab id = {0}")
	@MethodSource("nonEKumiObjects")
	@DisplayName("ignores selections with a non EKumi object")
	void ignores_selections_with_a_non_EKumi_object(String tabId, EObject nonEkumi) {
		when (tabDescriptor.getId()) .thenReturn(tabId);
		when (container.getTarget()) .thenReturn(nonEkumi);
		
		boolean tabIsKept = filter.filter(tabDescriptor, diagramEditorPart, selection);
		assertThat(tabIsKept).isTrue();
	}
	
	@ParameterizedTest(name = "tab id = {0}")
	@MethodSource("tabsToFilterOut")
	@DisplayName("filters out EKumi objects")
	void filters_out_EKumi_objects(String tabId) {
		when (tabDescriptor.getId()) .thenReturn(tabId);
		when (container.getTarget()) .thenReturn(EdsFactory.eINSTANCE.createActivity());
		
		boolean tabIsKept = filter.filter(tabDescriptor, diagramEditorPart, selection);
		assertThat(tabIsKept).isFalse();
	}
	
	@ParameterizedTest(name = "tab id = {0}")
	@MethodSource("tabsToFilterOut")
	@DisplayName("ignores malformed selections")
	void ignores_malformed_selections(String tabId) {
		when (tabDescriptor.getId()) .thenReturn(tabId);
		when (container.getTarget()) .thenReturn(EdsFactory.eINSTANCE.createActivity());
		
		boolean tabIsKept = filter.filter(tabDescriptor, diagramEditorPart, new TextSelection(0, 10));
		assertThat(tabIsKept).isTrue();
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<String> tabsToFilterOut() {
		return LegacyTabFilter.TABS_TO_FILTER_OUT.stream();
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<Arguments> nonEKumiObjects() {
		if (LegacyTabFilter.TABS_TO_FILTER_OUT.isEmpty())
			return Stream.empty();
		
		String tabId = LegacyTabFilter.TABS_TO_FILTER_OUT.iterator().next();
		
		return Stream.of(
			Arguments.of(tabId, EcoreFactory.eINSTANCE.createEObject()),
			Arguments.of(tabId, null),
			
			// anonymous class to check objects without canonical name 
			Arguments.of(tabId, new EObjectImpl() {})
		);
	}

}
