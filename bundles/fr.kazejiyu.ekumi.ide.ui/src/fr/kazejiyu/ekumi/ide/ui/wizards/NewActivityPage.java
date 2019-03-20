/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.ui.wizards;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;

import java.util.Set;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.workflow.Activity;

/**
 * Wizard page used to enter the information required for the creation of a new {@link Activity}.
 */
public class NewActivityPage extends WizardPage {
	
	/** Text box to type the name of the activity to create */
    private Text activityName;
    
    /** The languages that can be selected by the user */
    private final Set<ScriptingLanguage> availableLanguages;

    /** Displays the list of available languages */
	private CheckboxTableViewer languagesViewer;

	/**
	 * Creates a new page allowing the user to type a name and select
	 * the languages that will be used to implement activities' behavior.
	 * 
	 * @param availableLanguages
	 * 			The languages that can be selected by the user.
	 */
    public NewActivityPage(Set<ScriptingLanguage> availableLanguages) {
        super("New Workflow");
        setTitle("New Workflow");
        setDescription("Set up project's workflow");
        this.availableLanguages = availableLanguages;
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        
        createWorkflowNameTextField(container);
        createEmptySeparator(container, layout.numColumns);
        createLanguagesPicker(container, layout.numColumns);
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(false);
    }

	private void createLanguagesPicker(Composite parent, int numColumns) {
		Label languagesLabel = new Label(parent, SWT.NONE);
        languagesLabel.setText("Which languages will be used?");
        GridData languagesLabelLayout = new GridData(GridData.FILL_HORIZONTAL);
        languagesLabelLayout.horizontalSpan = numColumns;
        languagesLabel.setLayoutData(languagesLabelLayout);
        
        languagesViewer = CheckboxTableViewer.newCheckList(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
        languagesViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return ((ScriptingLanguage) element).name();
			}
		});
        languagesViewer.setContentProvider(new ArrayContentProvider());
        languagesViewer.setInput(availableLanguages);
        GridData languagesViewerLayout = new GridData(GridData.FILL_HORIZONTAL);
        languagesViewerLayout.horizontalSpan = 2;
        languagesViewerLayout.horizontalAlignment = GridData.CENTER;
        languagesViewer.getTable().setLayoutData(languagesViewerLayout);
	}

	private static void createEmptySeparator(Composite parent, int numColumns) {
		Label emptySeparator = new Label(parent, SWT.HORIZONTAL);
        GridData separatorLayout = new GridData(GridData.FILL_HORIZONTAL);
        separatorLayout.horizontalSpan = numColumns;
		emptySeparator.setLayoutData(separatorLayout);
	}

	private void createWorkflowNameTextField(Composite parent) {
		Label activityNameLabel = new Label(parent, SWT.NONE);
        activityNameLabel.setText("Workflow name:");

        activityName = new Text(parent, SWT.BORDER | SWT.SINGLE);
        activityName.setText("");
        activityName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (! activityName.getText().isEmpty())
                    setPageComplete(true);
            }
        });
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        activityName.setLayoutData(gd);
	}
    
    @Override
    public void setVisible(boolean visible) {
    	super.setVisible(visible);
    	
    	if (visible)
    		activityName.setFocus();
    }

    /**
     * Returns the name of the activity as typed by the user.
     * @return the name of the activity as typed by the user
     */
    public String getActivityName() {
        return activityName.getText();
    }
    
    /**
     * Sets the content of the 'activity name' text field.
     * 
     * @param name
     * 			The name of the activity.
     */
    public void setActivityName(String name) {
    	activityName.setText(name);
    }
    
    /**
     * Returns all the languages that have been selected.
     * @return all the languages that have been selected 
     */
    public Set<ScriptingLanguage> getSelectedLanguages() {
    	return stream(languagesViewer.getCheckedElements())
    		  .map(ScriptingLanguage.class::cast)
    		  .collect(toSet());
    }
}
