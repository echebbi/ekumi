package fr.kazejiyu.ekumi.tests.unit;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.DataFlow;
import fr.kazejiyu.ekumi.core.ekumi.DataFlows;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.Variable;
import fr.kazejiyu.ekumi.tests.mocks.DoNothing;

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
			flows = EkumiFactory.eINSTANCE.createDataFlows();
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

			flows = EkumiFactory.eINSTANCE.createDataFlows();
			flows.setOwner(owner);
			
			for (int i = 0 ; i < 5 ; i++) {
				Variable input = EkumiFactory.eINSTANCE.createVariable();
				input.setName("in" + i);
				input.setOwner(owner);
				input.setValue(-i);
				
				Variable output = EkumiFactory.eINSTANCE.createVariable();
				output.setName("out" + i);
				output.setOwner(predecessor);
				output.setValue(i);
				
				DataFlow flow = EkumiFactory.eINSTANCE.createDataFlow();
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
				Object inputValue = owner.getInput(flow.getInput().getName()).get().getValue();
				
				softly.assertThat(inputValue)
					  .isEqualTo(flow.getOutput().getValue());
			}
			
			softly.assertAll();	
		}
	}

}
