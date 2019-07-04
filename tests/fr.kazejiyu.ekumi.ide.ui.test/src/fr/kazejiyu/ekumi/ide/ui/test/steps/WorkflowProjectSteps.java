/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.ui.test.steps;

import org.assertj.core.api.WithAssertions;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.kazejiyu.ekumi.tests.common.ui.steps.newproject.NewEKumiProjectWizardBot;

/**
 * Steps related to the management of Workflow projects.
 * 
 * @author Emmanuel CHEBBI
 */
public final class WorkflowProjectSteps implements WithAssertions {

	private NewEKumiProjectWizardBot wizard;
	
	@Given("that I open a wizard for a new workflow project {string}")
	public void given_a_workflow_project(String name) {
	    SWTWorkbenchBot bot = new SWTWorkbenchBot();
	    wizard = new NewEKumiProjectWizardBot(bot);
	    wizard.open("test");
	}
	
	@When("(I select )no language")
	public void when_I_use_no_language() {
		// no language selected by default
	}
	
	@When("(I select )no representation")
	public void when_I_use_no_representation() {
		// no representation selected by default
	}
	
	@Then("I cannot finish the wizard")
	public void then_I_cannot_finish_the_wizard() {
		assertThat(wizard.canFinish()).isFalse();
	}

}
