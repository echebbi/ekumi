package fr.kazejiyu.ekumi.ide.common.execution;

import static java.util.Arrays.asList;
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

import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionHook;
import fr.kazejiyu.ekumi.ide.common.Activator;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ExtensionToExecutionHookAdapter")
public class ExtensionToExecutionHookAdapterTest implements WithAssertions {

	// Object to test
	ExtensionToExecutionHookAdapter adapter;
	
	// The configuration elements given to the adapter
	List<IConfigurationElement> configurationElements;
	
	// The hooks that should be returned by the adapter
	List<ExecutionHook> expectedHooks;
	
	@BeforeEach
	void setup() throws CoreException {
		adapter = new ExtensionToExecutionHookAdapter();
		
		// Create hooks
		
		ExecutionHook hook1 = Mockito.mock(ExecutionHook.class);
		ExecutionHook hook2 = Mockito.mock(ExecutionHook.class);
		
		expectedHooks = asList(hook1, hook2);
		
		// Create configuration elements
		
		IConfigurationElement hook1Configuration = Mockito.mock(IConfigurationElement.class);
		when (hook1Configuration.getName()) .thenReturn("hook");
		when (hook1Configuration.createExecutableExtension("class")) .thenReturn(hook1);
		
		IConfigurationElement hook2Configuration = Mockito.mock(IConfigurationElement.class);
		when (hook2Configuration.getName()) .thenReturn("hook");
		when (hook2Configuration.createExecutableExtension("class")) .thenReturn(hook2);
		
		// null should be ignored by the adapter
		IConfigurationElement nullConfiguration = Mockito.mock(IConfigurationElement.class);
		when (nullConfiguration.getName()) .thenReturn("hook");
		when (nullConfiguration.createExecutableExtension("class")) .thenReturn(null);
		
		// CoreException should be ignored as well
		IConfigurationElement throwingConfiguration = Mockito.mock(IConfigurationElement.class);
		when (nullConfiguration.getName()) .thenReturn("hook");
		CoreException coreException = new CoreException(new Status(IStatus.ERROR, Activator.ID, "no class attribute"));
		when (nullConfiguration.createExecutableExtension("class")) .thenThrow(coreException);
		
		// should be ignored as well
		IConfigurationElement notAHookConfiguration = Mockito.mock(IConfigurationElement.class);
		when (notAHookConfiguration.getName()) .thenReturn("not a hook");
		when (notAHookConfiguration.createExecutableExtension("class")) .thenReturn(null);
		
		configurationElements = Arrays.asList(
			hook1Configuration, hook2Configuration, nullConfiguration, throwingConfiguration, notAHookConfiguration
		);
	}
	
	@Nested @DisplayName("when there are no configuration elements")
	class WhenThereAreNoConfigurationElements {
		
		@Test @DisplayName("returns no language")
		void returns_no_language() {
			assertThat(adapter.adapt(Collections.emptyList())).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when given a null list")
	class WhenGivenANullList {
		
		@Test @DisplayName("throws a NullPointerException")
		void throws_a_NullPointerException() {
			assertThatNullPointerException().isThrownBy(() -> adapter.adapt(null));
		}
	}
	
	@Test @DisplayName("creates the expected hooks")
	void creates_the_expected_hooks() {
		assertThat(adapter.adapt(configurationElements)).containsExactlyInAnyOrderElementsOf(expectedHooks);
	}
	
}
