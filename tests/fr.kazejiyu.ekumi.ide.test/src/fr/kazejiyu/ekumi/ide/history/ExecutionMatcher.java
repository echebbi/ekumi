package fr.kazejiyu.ekumi.ide.history;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mockito.ArgumentMatcher;

import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * Helps to match a given Execution instance.
 */
class ExecutionMatcher implements ArgumentMatcher<Execution> {
	
	/** Matches all instances that are equal to this one */
	private final Execution expected;
	
	/**
	 * Creates a new matcher.
	 * 
	 * @param expected
	 * 			The reference instance.
	 */
	public ExecutionMatcher(Execution expected) {
		this.expected = expected;
	}

	@Override
	public boolean matches(Execution execution) {
		return EcoreUtil.equals(execution, expected);
	}

}
