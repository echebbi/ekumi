/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.specs.eds.design.ui.test.steps;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
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
public final class WorkflowProjectFeaturingEDSSteps implements WithAssertions {

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
	
	@When("(I select )the {string} representation")
	public void when_I_use_the_representation(String representation) {
		wizard.selectRepresentation(representation);
	}
	
	@When("I finish the wizard")
	public void i_finish_the_wizard() {
	    wizard.finish();
	}

	@Then("the project {string} exists")
	public void the_project_exists(String projectName) throws CoreException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	    assertThat(project.exists()).isTrue();
	}
	
	@Then("the project {string} has the Modeling nature")
	public void the_project_has_the_Java_nature(String projectName) throws CoreException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		assertThat(ModelingProject.hasModelingProjectNature(project)).isTrue();
	}
	
	@Then("the project {string} has an empty EDS model called {string}")
	public void the_project_has_an_empty_EDS_model(String projectName, String modelName) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile edsModel = project.getFolder("model").getFile(modelName);
		assertThat(edsModel.exists()).as(edsModel.getFullPath() + " exists in project " + projectName).isTrue();
	}

}
