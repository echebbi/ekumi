package fr.kazejiyu.ekumi.ide.common.spec;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
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
@DisplayName("An ExtensionToActivityAdapterAdapter")
public class ExtensionToActivityAdapterAdapterTest implements WithAssertions {

	// Object to test
	ExtensionToActivityAdapterAdapter adapter;
	
	// The configuration elements given to the adapter
	List<IConfigurationElement> configurationElements;
	
	// The activity adapters that should be returned by the adapter
	List<ActivityAdapter> expectedActivityAdapters;
	
	@BeforeEach
	void setup() throws CoreException {
		adapter = new ExtensionToActivityAdapterAdapter();
		
		// Create datatypes
		
		ActivityAdapter specAdapter = Mockito.mock(ActivityAdapter.class);
		
		expectedActivityAdapters = Arrays.asList(specAdapter);
		
		// Create configuration elements
		
		IConfigurationElement specConfiguration = Mockito.mock(IConfigurationElement.class);
		when (specConfiguration.createExecutableExtension("adapter")) .thenReturn(specAdapter);
		
		// should be ignored by the adapter
		IConfigurationElement nullConfiguration = Mockito.mock(IConfigurationElement.class);
		when (nullConfiguration.createExecutableExtension("adapter")) .thenReturn(null);
		
		// should be ignored as well
		IConfigurationElement throwingConfiguration = Mockito.mock(IConfigurationElement.class);
		CoreException coreException = new CoreException(new Status(IStatus.ERROR, Activator.ID, "no class attribute"));
		when (nullConfiguration.createExecutableExtension("adapter")) .thenThrow(coreException);
		
		configurationElements = Arrays.asList(
			specConfiguration, nullConfiguration, throwingConfiguration
		);
	}
	
	@Nested @DisplayName("when there are no configuration elements")
	class WhenThereAreNoConfigurationElements {
		
		@Test @DisplayName("returns no adapter")
		void returns_no_adapter() {
			assertThat(adapter.adapt(Collections.emptyList())).isEmpty();
		}
		
	}
	
	@Test @DisplayName("creates the expected adapters")
	void creates_the_expected_adapters() {
		assertThat(adapter.adapt(configurationElements)).containsExactlyInAnyOrderElementsOf(expectedActivityAdapters);
	}
	
}
