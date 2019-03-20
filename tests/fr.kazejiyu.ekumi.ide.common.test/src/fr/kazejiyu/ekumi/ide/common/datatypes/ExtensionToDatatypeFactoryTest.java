package fr.kazejiyu.ekumi.ide.common.datatypes;

import static org.mockito.Mockito.when;

import java.util.Arrays;
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

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ExtensionToDatatypeAdapter")
public class ExtensionToDatatypeFactoryTest implements WithAssertions {

	// Object to test
	ExtensionToDatatypeFactory factory;
	
	// The configuration elements given to the adapter
	List<IConfigurationElement> configurationElements;
	
	// The datatypes that should be returned by the adapter
	List<DataType<?>> expectedDatatypes;

	private DataType<String> stringType;
	
	@BeforeEach
	@SuppressWarnings("unchecked")
	void setup() throws CoreException {
		// Create datatypes
		
		stringType = Mockito.mock(DataType.class);
		when (stringType.getId()) .thenReturn("type.string");
		
		DataType<String> doubleType = Mockito.mock(DataType.class);
		when (doubleType.getId()) .thenReturn("type.double");
		
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
		
		factory = new ExtensionToDatatypeFactory(() -> configurationElements);
	}
	
	@Nested @DisplayName("when the ID matches no extension")
	class WhenTheIDMatchesNoExtension {
		
		@Test @DisplayName("finds no datatype")
		void finds_no_datatype() {
			assertThat(factory.find("sdkjfhsd")).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when the ID matches an extension")
	class WhenTheIDMatchesAnExtension {
		
		@Test @DisplayName("finds the corresponding datatype")
		void finds_the_corresponding_datatype() {
			assertThat(factory.find(stringType.getId())).contains(stringType);
		}
		
	}
	
}
