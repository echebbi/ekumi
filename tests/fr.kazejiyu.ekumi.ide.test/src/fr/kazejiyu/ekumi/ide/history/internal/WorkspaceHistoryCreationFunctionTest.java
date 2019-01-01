package fr.kazejiyu.ekumi.ide.history.internal;

import org.assertj.core.api.WithAssertions;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.ide.history.PersistedHistory;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@Tag("requires-Eclipse-runtime")
@ExtendWith(MockitoExtension.class)
@DisplayName("A WorkspaceHistoryCreationFunction")
public class WorkspaceHistoryCreationFunctionTest implements WithAssertions {

	private WorkspaceHistoryCreationFunction service;
	
	private IEclipseContext context;
	
	@BeforeEach
	void createService(@Mock IEventBroker broker) {
		service = new WorkspaceHistoryCreationFunction();
		context = EclipseContextFactory.create();
		
		// Needed by the PersistedHistory instance created by the service
		context.set(IEventBroker.class, broker);
	}
	
	@Test @DisplayName("computes a new History instance")
	void computes_a_new_History_instance() {
		Object history = service.compute(context, "");
		assertThat(history).isInstanceOf(PersistedHistory.class);
	}
	
	@Test @DisplayName("does not throw when the IEventBroker cannot be found")
	void does_not_throw_when_the_IEventBroker_cannot_be_found() {
		context.remove(IEventBroker.class);
		Object history = service.compute(context, "");
		assertThat(history).isInstanceOf(PersistedHistory.class);
	}

}
