package fr.kazejiyu.ekumi.core.workflow.impl;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.DataFlow;
import fr.kazejiyu.ekumi.model.workflow.DataFlows;
import fr.kazejiyu.ekumi.model.workflow.Variable;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;
import fr.kazejiyu.ekumi.tests.common.fake.activities.DoNothing;

/**
 * Tests the behaviour of {@link DataFlows} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@DisplayName("A DataFlows")
public class DataFlowsTest {
	
	@Nested
	@DisplayName("without any DataFlow")
	class WithoutDataFlow {
		private DataFlows flows;
		
		@BeforeEach
		void initialize() {
			flows = WorkflowFactory.eINSTANCE.createDataFlows();
		}
		
		// resolveInputs
		
		@Test @DisplayName("does not throw when resolving inputs")
		void does_not_throw_when_resolving_inputs() {
			flows.resolveInputs();
		}
	}
	
	@Nested
	@DisplayName("with incoming DataFlows")
	class NonEmpty {
		private DataFlows flows;
		private Activity owner;
		
		@BeforeEach
		void initialize() {
			owner = new DoNothing();
			Activity predecessor = new DoNothing();

			flows = WorkflowFactory.eINSTANCE.createDataFlows();
			flows.setOwner(owner);
			
			for (int i = 0 ; i < 5 ; i++) {
				Variable input = WorkflowFactory.eINSTANCE.createVariable();
				input.setName("in" + i);
				input.setOwner(owner);
				input.setValue(-i);
				
				Variable output = WorkflowFactory.eINSTANCE.createVariable();
				output.setName("out" + i);
				output.setOwner(predecessor);
				output.setValue(i);
				
				DataFlow flow = WorkflowFactory.eINSTANCE.createDataFlow();
				flow.setInput(input);
				flow.setOutput(output);
				
				flows.getIncomings().add(flow);
			}
		}
		
		// resolveInputs()
		
		@Test @DisplayName("does not throw when resolving inputs")
		void does_not_throw_when_resolving_inputs() {
			flows.resolveInputs();
		}
		
		@Test @DisplayName("resolves inputs by setting the right value")
		void resolves_inputs_by_setting_the_right_value() {
			flows.resolveInputs();
			
			SoftAssertions softly = new SoftAssertions();
			
			for (DataFlow flow : flows.getIncomings()) {
				Object inputValue = owner.findInput(flow.getInput().getName()).get().getValue();
				
				softly.assertThat(inputValue)
					  .isEqualTo(flow.getOutput().getValue());
			}
			
			softly.assertAll();	
		}
	}

}
