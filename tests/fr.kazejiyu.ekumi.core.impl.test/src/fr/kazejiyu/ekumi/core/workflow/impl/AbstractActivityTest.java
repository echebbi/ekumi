/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.core.workflow.State.CANCELLED;
import static fr.kazejiyu.ekumi.core.workflow.State.IDLE;
import static fr.kazejiyu.ekumi.core.workflow.State.SKIPPED;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import fr.kazejiyu.ekumi.core.func.Try;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Outputs;
import fr.kazejiyu.ekumi.tests.common.fake.activities.AplusB;

@DisplayName("An AbstractActivity")
public class AbstractActivityTest implements WithAssertions {
	
	private AbstractActivity activity;
	
	@BeforeEach
	void instantiateActivity() {
		activity = new FakeActivity("", "");
	}
	
	@Nested @DisplayName("when instantiated")
	class WhenInstantiated {
		
		@Test @DisplayName("throws if specified id is null")
		void throws_if_specified_id_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				new FakeActivity(null, "name")
			);
		}
		
		@ParameterizedTest
		@ValueSource(strings = {"", "id"})
		@DisplayName("has the expected id")
		void has_the_expected_id(String id) {
			activity = new FakeActivity(id, "name");
			assertThat(activity.id()).isEqualTo(id);
		}
		
		@Test @DisplayName("throws if specified name is null")
		void throws_if_specified_name_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				new FakeActivity(null, "name")
			);
		}
		
		@ParameterizedTest
		@ValueSource(strings = {"", "name"})
		@DisplayName("has the expected name")
		void has_the_expected_name(String name) {
			activity = new FakeActivity("id", name);
			assertThat(activity.name()).isEqualTo(name);
		}
		
		@Test @DisplayName("is in the idle state")
		void is_in_the_idle_state() {
			assertThat(activity.state()).isEqualTo(IDLE);
		}
		
		@Test @DisplayName("has no inputs")
		void has_no_inputs() {
			assertThat(activity.inputs()).isEmpty();
		}
		
		@Test @DisplayName("has no outputs")
		void has_no_outputs() {
			assertThat(activity.outputs()).isEmpty();
		}
		
		@Test @DisplayName("has no predecessor")
		void has_no_predecessor() {
			assertThat(activity.predecessor()).isEmpty();
		}
		
		@Test @DisplayName("can succeed nothing")
		void can_succeed_nothing() {
			assertThatCode(() -> activity.succeed(null)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("does not precede another activity")
		void does_not_precede_another_activity() {
			assertThat(activity.precedes(new AplusB(""))).isFalse();
		}
		
		@Test @DisplayName("has no successor")
		void has_no_successor() {
			assertThat(activity.successor()).isEmpty();
		}
		
		@Test @DisplayName("can precede nothing")
		void can_precede_nothing() {
			assertThatCode(() -> activity.precede(null)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("does not succeed another activity")
		void does_not_succeed_another_activity() {
			assertThat(activity.succeeds(new AplusB(""))).isFalse();
		}
		
	}
	
	@Nested @DisplayName("with a successor")
	class WithASuccessor {
		
		private Activity successor;
		
		@BeforeEach
		void setSuccessor() {
			successor = new FakeActivity("", "");
			activity.precede(successor);
		}
		
		@Test @DisplayName("has the right successor")
		void has_the_right_successor() {
			assertThat(activity.successor()).containsSame(successor);
		}
		
		@Test @DisplayName("precedes its successor")
		void precedes_its_successor() {
			assertThat(activity.precedes(successor)).isTrue();
		}
		
		@Nested @DisplayName("its successor")
		class ItsSuccessor {
			
			@Test @DisplayName("has the right predecessor")
			void has_the_right_predecessor() {
				assertThat(successor.predecessor()).containsSame(activity);
			}
			
			@Test @DisplayName("succeeds it")
			void succeeds_it() {
				assertThat(successor.succeeds(activity)).isTrue();
			}
			
		}
		
		@Nested @DisplayName("with a new successor")
		class WithANewSuccessor {
			
			private Activity newSuccessor;
			
			@BeforeEach
			void setNewSuccessor() {
				newSuccessor = new FakeActivity("", "");
				activity.precede(newSuccessor);
			}
			
			@Test @DisplayName("has the right successor")
			void has_the_right_successor() {
				assertThat(activity.successor()).containsSame(newSuccessor);
			}
			
			@Test @DisplayName("precedes its successor")
			void precedes_its_successor() {
				assertThat(activity.precedes(newSuccessor)).isTrue();
			}
			
			@Test @DisplayName("does not precede its old successor anymore")
			void does_not_precede_its_old_successor_anymore() {
				assertThat(activity.precedes(successor)).isFalse();
			}
			
		}
		
		@Nested @DisplayName("when it stops preceding it")
		class WhenItStopsPrecedingIt {
			
			@BeforeEach
			void makeActivityPrecedeNothing() {
				activity.precede(null);
			}
			
			@Test @DisplayName("has no successor anymore")
			void it_has_no_successor_anymore() {
				assertThat(activity.successor()).isEmpty();
			}
			
			@Test @DisplayName("does not precede its old successor anymore")
			void does_not_precede_its_old_successor_anymore() {
				assertThat(activity.precedes(successor)).isFalse();
			}
			
			@Nested @DisplayName("then its old successor")
			class ThenItsOldSuccessor {
				
				@Test @DisplayName("has no predecessor")
				void has_no_predecessor() {
					assertThat(successor.predecessor()).isEmpty();
				}
				
				@Test @DisplayName("does not succeed it anymore")
				void does_not_succeed_it_anymore() {
					assertThat(successor.succeeds(activity)).isFalse();
				}
				
			}
			
		}
	}
	
	@Nested @DisplayName("with a predecessor")
	class WithAPredecessor {
		
		private Activity predecessor;
		
		@BeforeEach
		void setPredecessor() {
			predecessor = new FakeActivity("", "");
			activity.succeed(predecessor);
		}
		
		@Test @DisplayName("has the right predecessor")
		void has_the_right_predecessor() {
			assertThat(activity.predecessor()).containsSame(predecessor);
		}
		
		@Test @DisplayName("succeeds its predecessor")
		void succeeds_its_predecessor() {
			assertThat(activity.succeeds(predecessor)).isTrue();
		}
		
		@Nested @DisplayName("its predecessor")
		class ItsPredecessor {
			
			@Test @DisplayName("has the right successor")
			void has_the_right_successor() {
				assertThat(predecessor.successor()).containsSame(activity);
			}
			
			@Test @DisplayName("precedes it")
			void precedes_it() {
				assertThat(predecessor.precedes(activity)).isTrue();
			}
			
		}
		
		@Nested @DisplayName("with a new predecessor")
		class WithANewPredecessor {
			
			private Activity newPredecessor;
			
			@BeforeEach
			void setNewSuccessor() {
				newPredecessor = new FakeActivity("", "");
				activity.succeed(newPredecessor);
			}
			
			@Test @DisplayName("has the right predecessor")
			void has_the_right_predecessor() {
				assertThat(activity.predecessor()).containsSame(newPredecessor);
			}
			
			@Test @DisplayName("succeeds its predecessor")
			void succeeds_its_predecessor() {
				assertThat(activity.succeeds(newPredecessor)).isTrue();
			}
			
			@Test @DisplayName("does not succeed its old predecessor anymore")
			void does_not_succeed_its_old_predecessor_anymore() {
				assertThat(activity.succeeds(predecessor)).isFalse();
			}
			
		}
		
		@Nested @DisplayName("when it stops succeeding it")
		class WhenItStopsSucceedingIt {
			
			@BeforeEach
			void makeActivitySucceedNothing() {
				activity.succeed(null);
			}
			
			@Test @DisplayName("has no predecessor anymore")
			void it_has_no_predecessor_anymore() {
				assertThat(activity.predecessor()).isEmpty();
			}
			
			@Test @DisplayName("does not succeed its old predecessor anymore")
			void does_not_precede_its_old_predecessor_anymore() {
				assertThat(activity.succeeds(predecessor)).isFalse();
			}
			
			@Nested @DisplayName("then its old predecessor")
			class ThenItsOldPredecessor {
				
				@Test @DisplayName("has no successor")
				void has_no_successor() {
					assertThat(predecessor.successor()).isEmpty();
				}
				
				@Test @DisplayName("does not precede it anymore")
				void does_not_precede_it_anymore() {
					assertThat(predecessor.precedes(activity)).isFalse();
				}
				
			}
			
		}
	}
	
	@Nested @DisplayName("after being skipped")
	class AfterBeingSkipped {
		
		@BeforeEach
		void skipActivity() {
			activity.skip();
		}
		
		@Test @DisplayName("is in the skipped state")
		void is_in_the_skipped_state() {
			assertThat(activity.state()).isEqualTo(SKIPPED);
		}
		
	}
	
	@Nested @DisplayName("after being cancelled")
	class AfterBeingCancelled {
		
		@BeforeEach
		void cancelActivity() {
			activity.cancel();
		}
		
		@Test @DisplayName("is in the cancelled state")
		void is_in_the_skipped_state() {
			assertThat(activity.state()).isEqualTo(CANCELLED);
		}
		
	}

}

/**
 * An activity that does nothing in the purpose of testing
 * {@link AbstractActivity}'s default methods 
 */
class FakeActivity extends AbstractActivity {

	public FakeActivity(String id, String name) {
		super(id, name);
	}

	@Override
	public Try<Outputs> run(Context context) {
		return Try.success(null);
	}
	
}