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

import java.util.concurrent.atomic.AtomicBoolean;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.AplusB;

@DisplayName("An Activity")
public class ActivityTest implements WithAssertions {
	
	@Test @DisplayName("can bind its input")
	void can_bind_its_input() {
		AplusB a1 = new AplusB("a1");
		AplusB a2 = new AplusB("a2");
		
		a2.bind("A", a1.output("C"));
		
		assertThat(a2.input("A").binding()).containsSame(a1.output("C"));
	}
	
	@Test @DisplayName("can create an activity from a Runnable")
	void can_create_an_activity_from_a_Runnable() {
		AtomicBoolean hasRun = new AtomicBoolean(false);
		
		Activity activity = Activity.of(() -> hasRun.set(true));
		activity.run(new NullContext());
		
		assertThat(hasRun).isTrue();
	}
	
	@Test @DisplayName("can create an activity from a Consumer<Context>")
	void can_create_an_activity_from_a_Context_consumer() {
		AtomicBoolean hasRun = new AtomicBoolean(false);
		
		Activity activity = Activity.of(context -> hasRun.set(true));
		activity.run(new NullContext());
		
		assertThat(hasRun).isTrue();
	}
}
