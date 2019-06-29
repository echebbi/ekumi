package fr.kazejiyu.ekumi.ide.common.execution;

import static org.mockito.Mockito.when;

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

import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionHook;
import fr.kazejiyu.ekumi.ide.common.Activator;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ExtensionToExecutionHookFactory")
public class ExtensionToExecutionHookFactoryTest implements WithAssertions {

	// Object to test
	ExtensionToExecutionHookFactory factory;
	
	// The configuration elements given to the adapter
	List<IConfigurationElement> configurationElements;
	
	// The hooks that should be returned by the adapter
	List<ExecutionHook> expectedHooks;

	private ExecutionHook hook1;

	@BeforeEach
	void setup() throws CoreException {
		// Create expected hooks
		
		hook1 = Mockito.mock(ExecutionHook.class);
		when (hook1.id()) .thenReturn("language.java");
		
		ExecutionHook hook2 = Mockito.mock(ExecutionHook.class);
		
		expectedHooks = Arrays.asList(hook1, hook2);
		
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
		factory = new ExtensionToExecutionHookFactory(() -> configurationElements);
	}
	
	@Nested @DisplayName("when the ID matches no extension")
	class WhenTheIDMatchesNoExtension {
		
		@Test @DisplayName("returns no hook")
		void returns_no_hook() {
			assertThat(factory.find("shfdfh")).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when the ID matches an extension")
	class WhenTheIDMatchesAnExtension {
	
		@Test @DisplayName("creates the expected hook")
		void creates_the_expected_hook() {
			assertThat(factory.find(hook1.id())).contains(hook1);
		}
		
	}
	
}
