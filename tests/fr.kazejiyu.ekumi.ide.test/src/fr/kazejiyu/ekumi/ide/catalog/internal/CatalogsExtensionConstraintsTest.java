package fr.kazejiyu.ekumi.ide.catalog.internal;

import static org.mockito.Mockito.when;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.IConfigurationElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A CatalogsExtensionConstraints")
public class CatalogsExtensionConstraintsTest implements WithAssertions {
	
	private CatalogsExtensionConstraints constraints;
	
	@Mock
	private IConfigurationElement element;
	
	@Nested @DisplayName("when validating that a configuration element is a catalog")
	class WhenValidatingACatalog {
		
		@BeforeEach
		void createConstraints() {
			constraints = new CatalogsExtensionConstraints();
			
			when(element.getName()).thenReturn("catalog");
			when(element.getAttribute("id")).thenReturn("defaultID");
			when(element.getAttribute("name")).thenReturn("defaultName");
		}
		
		@ParameterizedTest(name="when name = '{0}'")
		@ValueSource(strings = {"", "CATALOG", "category"})
		@DisplayName("invalidates if the element's name is not exactly 'catalog'")
		void invalidates_if_the_element_name_is_not_exactly_catalog(String name) {
			when (element.getName()). thenReturn(name);
			assertThat(constraints.isAValidCatalogElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's id is null")
		void invalidates_if_the_element_id_is_null() {
			when(element.getAttribute("id")).thenReturn(null);
			assertThat(constraints.isAValidCatalogElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's id is empty")
		void invalidates_if_the_element_id_is_empty() {
			when(element.getAttribute("id")).thenReturn("");
			assertThat(constraints.isAValidCatalogElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's name is null")
		void invalidates_if_the_element_name_is_null() {
			when(element.getAttribute("name")).thenReturn(null);
			assertThat(constraints.isAValidCatalogElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's name is empty")
		void invalidates_if_the_element_name_is_empty() {
			when(element.getAttribute("name")).thenReturn("");
			assertThat(constraints.isAValidCatalogElement(element)).isFalse();
		}
		
		@Test @DisplayName("validates if id and name are non-empty strings")
		void validates_if_id_and_name_are_non_empty_strings() {
			assertThat(constraints.isAValidCatalogElement(element)).isTrue();
		}
		
	}
	
	@Nested @DisplayName("when validating that a configuration element is a category")
	class WhenValidatingACategory {
		
		@BeforeEach
		void createConstraints() {
			constraints = new CatalogsExtensionConstraints();
			
			when(element.getName()).thenReturn("category");
			when(element.getAttribute("id")).thenReturn("defaultID");
			when(element.getAttribute("name")).thenReturn("defaultName");
			when(element.getAttribute("parent")).thenReturn("defaultParent");
		}
		
		@ParameterizedTest(name="when name = '{0}'")
		@ValueSource(strings = {"", "CATEGORY", "catalog"})
		@DisplayName("invalidates if the element's name is not exactly 'category'")
		void invalidates_if_the_element_name_is_not_exactly_category(String name) {
			when (element.getName()). thenReturn(name);
			assertThat(constraints.isAValidCategoryElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's id is null")
		void invalidates_if_the_element_id_is_null() {
			when(element.getAttribute("id")).thenReturn(null);
			assertThat(constraints.isAValidCategoryElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's id is empty")
		void invalidates_if_the_element_id_is_empty() {
			when(element.getAttribute("id")).thenReturn("");
			assertThat(constraints.isAValidCategoryElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's name is null")
		void invalidates_if_the_element_name_is_null() {
			when(element.getAttribute("name")).thenReturn(null);
			assertThat(constraints.isAValidCategoryElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's name is empty")
		void invalidates_if_the_element_name_is_empty() {
			when(element.getAttribute("name")).thenReturn("");
			assertThat(constraints.isAValidCategoryElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's parent is null")
		void invalidates_if_the_element_parent_is_null() {
			when(element.getAttribute("parent")).thenReturn(null);
			assertThat(constraints.isAValidCategoryElement(element)).isFalse();
		}
		
		@Test @DisplayName("invalidates if the element's parent is empty")
		void invalidates_if_the_element_parent_is_empty() {
			when(element.getAttribute("parent")).thenReturn("");
			assertThat(constraints.isAValidCategoryElement(element)).isFalse();
		}
		
		@Test @DisplayName("validates if id, name and parent are non-empty strings")
		void validates_if_id_and_name_are_non_empty_strings() {
			assertThat(constraints.isAValidCategoryElement(element)).isTrue();
		}
		
	}

}
