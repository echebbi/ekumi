package fr.kazejiyu.ekumi.workflow.editor.design;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ExtensionToDatatypeAdapter")
public class ExtensionToDatatypeAdapterTest implements WithAssertions {

	// Object to test
	ExtensionToDatatypeAdapter adapter;
	
	// The configuration elements given to the adapter
	List<IConfigurationElement> configurationElements;
	
	// The datatypes that should be returned by the adapter
	List<DataType<?>> expectedDatatypes;
	
	@BeforeEach
	@SuppressWarnings("unchecked")
	void setup() throws CoreException {
		adapter = new ExtensionToDatatypeAdapter();
		
		// Create datatypes
		
		DataType<String> stringType = Mockito.mock(DataType.class);
		DataType<String> doubleType = Mockito.mock(DataType.class);
		
		expectedDatatypes = Arrays.asList(stringType, doubleType);
		
		// Create configuration elements
		
		IConfigurationElement stringConfiguration = Mockito.mock(IConfigurationElement.class);
		when (stringConfiguration.createExecutableExtension("class")) .thenReturn(stringType);
		
		IConfigurationElement doubleConfiguration = Mockito.mock(IConfigurationElement.class);
		when (doubleConfiguration.createExecutableExtension("class")) .thenReturn(doubleType);
		
		// should be ignored by the adapter
		IConfigurationElement nullConfiguration = Mockito.mock(IConfigurationElement.class);
		when (nullConfiguration.createExecutableExtension("class")) .thenReturn(null);
		
		// should be ignored as well
		IConfigurationElement throwingConfiguration = Mockito.mock(IConfigurationElement.class);
		when (nullConfiguration.createExecutableExtension("class")) .thenThrow(CoreException.class);
		
		configurationElements = Arrays.asList(
			stringConfiguration, doubleConfiguration, nullConfiguration, throwingConfiguration
		);
	}
	
	@Nested @DisplayName("when there are no configuration elements")
	class WhenThereAreNoConfigurationElements {
		
		@Test @DisplayName("returns no datatype")
		void returns_no_datatype() {
			assertThat(adapter.adapt(Collections.emptyList())).isEmpty();
		}
		
	}
	
	@Test @DisplayName("creates the expected datatypes")
	void creates_the_expected_datatypes() {
		assertThat(adapter.adapt(configurationElements)).containsExactlyInAnyOrderElementsOf(expectedDatatypes);
	}
	
}
