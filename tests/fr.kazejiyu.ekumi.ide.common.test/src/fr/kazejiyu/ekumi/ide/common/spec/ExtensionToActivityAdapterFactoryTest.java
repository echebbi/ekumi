package fr.kazejiyu.ekumi.ide.common.spec;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.core.specs.ActivityAdapter;
import fr.kazejiyu.ekumi.ide.common.Activator;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ExtensionToActivityAdapterFactory")
public class ExtensionToActivityAdapterFactoryTest implements WithAssertions {

	// Object to test
	ExtensionToActivityAdapterFactory factory;
	
	// The configuration elements given to the adapter
	List<IConfigurationElement> configurationElements;
	
	// The activity adapters that should be returned by the adapter
	List<ActivityAdapter> expectedActivityAdapters;

	private ActivityAdapter stringAdapter;
	
	@BeforeEach
	void setup() throws CoreException {
		// Create activity adapters
		
		stringAdapter = Mockito.mock(ActivityAdapter.class);
		when (stringAdapter.canAdapt(any(String.class))) .thenReturn(true);
		ActivityAdapter doubleAdapter = Mockito.mock(ActivityAdapter.class);
		
		expectedActivityAdapters = Arrays.asList(stringAdapter, doubleAdapter);
		
		// Create configuration elements
		
		IConfigurationElement stringConfiguration = Mockito.mock(IConfigurationElement.class);
		when (stringConfiguration.createExecutableExtension("adapter")) .thenReturn(stringAdapter);
		
		IConfigurationElement doubleConfiguration = Mockito.mock(IConfigurationElement.class);
		when (doubleConfiguration.createExecutableExtension("adapter")) .thenReturn(doubleAdapter);
		
		// should be ignored by the adapter
		IConfigurationElement nullConfiguration = Mockito.mock(IConfigurationElement.class);
		when (nullConfiguration.createExecutableExtension("adapter")) .thenReturn(null);
		
		// should be ignored as well
		IConfigurationElement throwingConfiguration = Mockito.mock(IConfigurationElement.class);
		CoreException coreException = new CoreException(new Status(IStatus.ERROR, Activator.ID, "no class attribute"));
		when (nullConfiguration.createExecutableExtension("adapter")) .thenThrow(coreException);
		
		configurationElements = Arrays.asList(
			stringConfiguration, doubleConfiguration, nullConfiguration, throwingConfiguration
		);
		
		factory = new ExtensionToActivityAdapterFactory(() -> configurationElements);
	}
	
	@Nested @DisplayName("when the specification cannot be adapted")
	class WhenTheSpecificationCannotBeAdapted {
		
		@Test @DisplayName("finds no adapter")
		void finds_no_adapter() {
			assertThat(factory.findAdapterFor(new ArrayList<>())).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when the specification can be adapted")
	class WhenTheSpecificationCanBeAdapted {
		
		@Test @DisplayName("finds the corresponding adapter")
		void finds_the_corresponding_adapter() {
			assertThat(factory.findAdapterFor("a string")).contains(stringAdapter);
		}
		
	}
	
}
