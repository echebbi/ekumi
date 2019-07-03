/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.tests.common.ui.steps.newproject;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTableItem;

/**
 * 
 * @author Emmanuel CHEBBI
 */
// TODO Make API fluent to prevent inconsistent order of method calls
public class NewEKumiProjectWizardBot {
	
	private final SWTWorkbenchBot bot;
	
	private SWTBotShell wizard;

	public NewEKumiProjectWizardBot(SWTWorkbenchBot bot) {
		this.bot = bot;
	}
	
	public void open(String projectName) {
		bot.menu("File")
		   .menu("New")
		   .menu("Project...")
		   .click();
		wizard = bot.shell("New Project");
        wizard.activate();
        bot.tree()
           .expandNode("EKumi")
           .select("Workflow Project");
        bot.button("Next >").click();
        bot.textWithLabel("Project name:").setText(projectName);
        bot.button("Next >").click();
        
        // Ensure the wizard is open & visible before moving on
        bot.waitUntil(Conditions.shellIsActive("Workflow Project Wizard"));
	}
	
	/**
	 * 
	 * @param language
	 * @throws WidgetNotFoundException if the node was not found
	 */
	public void selectLanguage(String language) {
		SWTBotTable languages = bot.tableWithId("languagesTable");
		SWTBotTableItem languageItem = languages.getTableItem(language);
		languageItem.check();
	}
	
	/**
	 * 
	 * @param language
	 * @throws WidgetNotFoundException if the node was not found
	 */
	public void selectRepresentation(String representation) {
		SWTBotTable representations = bot.tableWithId("representationsTable");
		SWTBotTableItem representationItem = representations.getTableItem(representation);
		representationItem.check();
	}
	
	public boolean canFinish() {
		return bot.button("Finish").isEnabled();
	}
	
	public void finish() {
        bot.button("Finish").click();

        // Ensure the project is fully created before moving on
        bot.waitUntil(Conditions.shellCloses(wizard));
	}

}
