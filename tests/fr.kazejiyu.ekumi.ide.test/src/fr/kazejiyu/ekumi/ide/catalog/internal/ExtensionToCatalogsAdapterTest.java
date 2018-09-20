package fr.kazejiyu.ekumi.ide.catalog.internal;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.IConfigurationElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ExtensionToCatalogsAdapter")
public class ExtensionToCatalogsAdapterTest implements WithAssertions {
	
	private ExtensionToCatalogsAdapter adapter;
	
	@Nested @DisplayName("when adapting an invalid category")
	class WhenAdaptingAnInvalidCategory {
		
		@Mock 
		private IConfigurationElement configurationElement;
		
		private List<IConfigurationElement> configurationElements;
		
		@BeforeEach
		void createAdapter() {
			adapter = new ExtensionToCatalogsAdapter();
			
			when(configurationElement.getName()).thenReturn("category");
			when(configurationElement.getAttribute("id")).thenReturn("id");
			when(configurationElement.getAttribute("name")).thenReturn("name");
			when(configurationElement.getAttribute("parent")).thenReturn("parent");
			
			configurationElements = asList(configurationElement);
		}
		
		@Test @DisplayName("ignores the category if it does not have any id")
		void ignores_the_category_if_it_does_not_have_any_id() {
			when(configurationElement.getAttribute("id")).thenReturn("");
			assertThat(adapter.adapt(configurationElements).getContent()).isEmpty();
		}
		
		@Test @DisplayName("ignores the category if it does not have any name")
		void ignores_the_category_if_it_does_not_have_any_name() {
			when(configurationElement.getAttribute("name")).thenReturn("");
			assertThat(adapter.adapt(configurationElements).getContent()).isEmpty();
		}
		
		@Test @DisplayName("ignores the category if it does not have any parent")
		void ignores_the_category_if_it_does_not_have_any_parent() {
			when(configurationElement.getAttribute("parent")).thenReturn("");
			assertThat(adapter.adapt(configurationElements).getContent()).isEmpty();
		}
		
		@Test @DisplayName("ignores the category if its parent does not exist")
		void ignores_the_category_if_its_parent_does_not_exist() {
			assertThat(adapter.adapt(configurationElements).getContent()).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when adapting an invalid catalog")
	class WhenAdaptingAnInvalidCatalog {
		
		@Mock 
		private IConfigurationElement configurationElement;
		
		private List<IConfigurationElement> configurationElements;
		
		@BeforeEach
		void createAdapter() {
			adapter = new ExtensionToCatalogsAdapter();
			
			when(configurationElement.getName()).thenReturn("category");
			when(configurationElement.getAttribute("id")).thenReturn("id");
			when(configurationElement.getAttribute("name")).thenReturn("name");
			
			configurationElements = asList(configurationElement);
		}
		
		@Test @DisplayName("ignores the catalog if it does not have any id")
		void ignores_the_catalog_if_it_does_not_have_any_id() {
			when(configurationElement.getAttribute("id")).thenReturn("");
			assertThat(adapter.adapt(configurationElements).getContent()).isEmpty();
		}
		
		@Test @DisplayName("ignores the catalog if it does not have any name")
		void ignores_the_catalog_if_it_does_not_have_any_name() {
			when(configurationElement.getAttribute("name")).thenReturn("");
			assertThat(adapter.adapt(configurationElements).getContent()).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when adapting duplicated elements")
	class WhenAdaptingDuplicatedElements {
		
		private List<IConfigurationElement> configurationElements;
		
		@BeforeEach
		void createAdapter(@Mock IConfigurationElement element) {
			adapter = new ExtensionToCatalogsAdapter();

			when(element.getName()).thenReturn("catalog");
			when(element.getAttribute("id")).thenReturn("catalogId");
			when(element.getAttribute("name")).thenReturn("First Catalog");
			
			configurationElements = new ArrayList<>(asList(element));
		}
		
		@Test @DisplayName("keeps only one catalog when there are a few with the same id") 
		void keeps_only_one_catalog_when_there_are_two_with_the_same_id() {
			for (String name : asList("Second Catalog", "Third Catalog")) {
				IConfigurationElement element = Mockito.mock(IConfigurationElement.class);
				when(element.getName()).thenReturn("catalog");
				when(element.getAttribute("id")).thenReturn("catalogId");
				when(element.getAttribute("name")).thenReturn(name);
				
				configurationElements.add(element);
			}
			
			// create 1 catalog
			assertThat(adapter.adapt(configurationElements).eAllContents()).size().isEqualTo(1);
		}
		
		@Test @DisplayName("keeps only one category when there are two with the same id")
		void keeps_only_one_category_when_there_are_two_with_the_same_id() {
			for (String name : asList("First Category", "Second Category")) {
				IConfigurationElement element = Mockito.mock(IConfigurationElement.class);
				when(element.getName()).thenReturn("category");
				when(element.getAttribute("id")).thenReturn("categoryId");
				when(element.getAttribute("name")).thenReturn(name);
				when(element.getAttribute("parent")).thenReturn("catalogId");
				
				configurationElements.add(element);
			}
			
			// create 1 catalog + 1 category == 2
			assertThat(adapter.adapt(configurationElements).eAllContents()).size().isEqualTo(2);
		}
		
	}
	
	@Nested @DisplayName("when two categories have the same category as parent")
	class WhenTwoCategoriesHaveTheSameCategoryAsParent {
		
		private List<IConfigurationElement> configurationElements;
		
		@BeforeEach
		void createAdapter(@Mock IConfigurationElement catalog) {
			adapter = new ExtensionToCatalogsAdapter();
			
			when(catalog.getName()).thenReturn("catalog");
			when(catalog.getAttribute("id")).thenReturn("catalogId");
			when(catalog.getAttribute("name")).thenReturn("First Catalog");
			
			configurationElements = new ArrayList<>(asList(catalog));

			for (String name : asList("first category", "second category")) {
				IConfigurationElement element = Mockito.mock(IConfigurationElement.class);
				when(element.getName()).thenReturn("category");
				when(element.getAttribute("id")).thenReturn(name);
				when(element.getAttribute("name")).thenReturn(name);
				when(element.getAttribute("parent")).thenReturn("parentCategoryId");
				
				configurationElements.add(element);
			}
		}
		
		@Test @DisplayName("does not create the parent category twice")
		void does_not_create_the_parent_category_twice() {
			IConfigurationElement parentCategory = Mockito.mock(IConfigurationElement.class);
			when(parentCategory.getName()).thenReturn("category");
			when(parentCategory.getAttribute("id")).thenReturn("parentCategoryId");
			when(parentCategory.getAttribute("name")).thenReturn("parent category");
			when(parentCategory.getAttribute("parent")).thenReturn("catalogId");
			
			configurationElements.add(parentCategory);

			// create 1 catalog + 1 category + 2 sub-categories == 4
			assertThat(adapter.adapt(configurationElements).eAllContents()).size().isEqualTo(4);
		}
		
		@Test @DisplayName("does not create the categories if the parent cannot be created")
		void does_not_create_the_categories_if_the_parent_cannot_be_created() {
			IConfigurationElement parentCategory = Mockito.mock(IConfigurationElement.class);
			when(parentCategory.getName()).thenReturn("category");
			when(parentCategory.getAttribute("id")).thenReturn("parentCategoryId");
			when(parentCategory.getAttribute("name")).thenReturn("parent category");
			when(parentCategory.getAttribute("parent")).thenReturn("nonExistingParentId");
			
			configurationElements.add(parentCategory);

			// 1 catalog
			assertThat(adapter.adapt(configurationElements).eAllContents()).size().isEqualTo(1);
		}
		
		@Test @DisplayName("does not create the categories if the parent does not exist")
		void does_not_create_the_categories() {
			// create 1 catalog
			assertThat(adapter.adapt(configurationElements).eAllContents()).size().isEqualTo(1);
		}
	}
	
}
