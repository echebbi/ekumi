package fr.kazejiyu.ekumi.ide.catalog.internal;

import static org.mockito.Mockito.when;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.core.EKumiExtensions;
import fr.kazejiyu.ekumi.core.catalog.Catalog;
import fr.kazejiyu.ekumi.core.catalog.CatalogFactory;
import fr.kazejiyu.ekumi.core.catalog.Catalogs;
import fr.kazejiyu.ekumi.core.catalog.Category;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@Tag("requires-Eclipse-runtime")
@ExtendWith(MockitoExtension.class)
@DisplayName("A CatalogsCreationFunction")
public class CatalogsCreationFunctionTest implements WithAssertions {
	
	private CatalogsCreationFunction service;
	
	private IEclipseContext context;
	
	@BeforeEach 
	void createService(@Mock IExtensionRegistry registry) {
		service = new CatalogsCreationFunction();

		context = EclipseContextFactory.create();
		context.set(IExtensionRegistry.class, registry);
		
		IConfigurationElement[] configurationElements = createConfigurationElements();
		when(registry.getConfigurationElementsFor(EKumiExtensions.CATALOGS_EXTENSION_ID))
			.thenReturn(configurationElements);
	}
	
	@Test @DisplayName("adds a Catalogs created from extensions to Eclipse context")
	void adds_a_Catalogs_created_from_extensions_to_Eclipse_context() {
		Catalogs computed = (Catalogs) service.compute(context, "");
		assertThat(EcoreUtil.equals(computed, expectedCatalogs()))
			.as("Computed Catalogs contains categories & catalogs described by extensions")
			.isTrue();
	}

	private IConfigurationElement[] createConfigurationElements() {
		IConfigurationElement catalog = Mockito.mock(IConfigurationElement.class);
		when(catalog.getName()).thenReturn("catalog");
		when(catalog.getAttribute("id")).thenReturn("catalog1");
		when(catalog.getAttribute("name")).thenReturn("Catalog 1");
		
		IConfigurationElement category1 = Mockito.mock(IConfigurationElement.class);
		when(category1.getName()).thenReturn("category");
		when(category1.getAttribute("id")).thenReturn("category1");
		when(category1.getAttribute("name")).thenReturn("Category 1");
		when(category1.getAttribute("parent")).thenReturn("catalog1");
		
		IConfigurationElement subCategory1 = Mockito.mock(IConfigurationElement.class);
		when(subCategory1.getName()).thenReturn("category");
		when(subCategory1.getAttribute("id")).thenReturn("subCategory1");
		when(subCategory1.getAttribute("name")).thenReturn("Sub Category 1");
		when(subCategory1.getAttribute("parent")).thenReturn("category1");
		
		return new IConfigurationElement[] { catalog, category1, subCategory1 };
	}
	
	private Catalogs expectedCatalogs() {
		Catalogs catalogs = CatalogFactory.eINSTANCE.createCatalogs();

		Catalog catalog = CatalogFactory.eINSTANCE.createCatalog();
		catalog.setId("catalog1");
		catalog.setName("Catalog 1");
		
		catalogs.getContent().add(catalog);
		
		Category category1 = CatalogFactory.eINSTANCE.createCategory();
		category1.setId("category1");
		category1.setName("Category 1");
		
		catalog.getCategories().add(category1);
		
		Category subCategory1 = CatalogFactory.eINSTANCE.createCategory();
		subCategory1.setId("subCategory1");
		subCategory1.setName("Sub Category 1");
		
		category1.getCategories().add(subCategory1);
		
		return catalogs;
	}

}
