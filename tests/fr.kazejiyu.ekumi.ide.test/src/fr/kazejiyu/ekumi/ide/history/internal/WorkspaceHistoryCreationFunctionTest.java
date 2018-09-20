package fr.kazejiyu.ekumi.ide.history.internal;

import org.assertj.core.api.WithAssertions;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.ide.history.PersistedHistory;

@Tag("requires-Eclipse-runtime")
@DisplayName("A WorkspaceHistoryCreationFunction")
public class WorkspaceHistoryCreationFunctionTest implements WithAssertions {

	private WorkspaceHistoryCreationFunction service;
	
	private IEclipseContext context;
	
	@BeforeEach
	void createService() {
		service = new WorkspaceHistoryCreationFunction();
		context = EclipseContextFactory.create();
	}
	
	@Test @DisplayName("computes a new History instance")
	void computes_a_new_History_instance() {
		Object history = service.compute(context, "");
		assertThat(history).isInstanceOf(PersistedHistory.class);
	}

}
