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

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.ide.project.customization.Representation;

/**
 * Wizard page used to enter the information required for the creation of a new {@link Activity}.
 */
public class NewActivityPage extends WizardPage {
	
	/** Text box to type the name of the activity to create */
    private Text activityName;
    
    /** The languages that can be selected by the user */
    private final Set<ScriptingLanguage> availableLanguages;
    
    /** The representations that can be selected by the user */
    private final Set<Representation> availableRepresentations;

    /** Displays the list of available languages */
	private CheckboxTableViewer languagesViewer;
	
	/** Displays the list of available representations */
	private CheckboxTableViewer representationsViewer;

	/**
	 * Creates a new page allowing the user to type a name and select
	 * the languages that will be used to implement activities' behavior.
	 * 
	 * @param availableLanguages
	 * 			The languages that can be selected by the user.
	 */
    public NewActivityPage(Set<ScriptingLanguage> availableLanguages, Set<Representation> availableRepresentations) {
        super("New Workflow");
        setTitle("New Workflow");
        setDescription("Set up project's workflow");
        this.availableLanguages = availableLanguages;
        this.availableRepresentations = availableRepresentations;
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        
        createWorkflowPropertiesFields(container);
        createEmptySeparator(container, layout.numColumns);
        
        if (! availableLanguages.isEmpty()) {
        	createLanguagesPicker(container, layout.numColumns);
        } else {
        	createMessageTellingNoLanguageIsAvailable(container, layout.numColumns);
        }
        createEmptySeparator(container, layout.numColumns);
        
        if (! availableRepresentations.isEmpty()) {
        	createRepresentationPicker(container, layout.numColumns);
        } else {
        	createMessageTellingNoRepresentationIsAvailable(container, layout.numColumns);
        }
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(false);
    }

	private void createLanguagesPicker(Composite parent, int numColumns) {
		Group languagesGroup = createGroup(parent, " Scripting Languages ");
		
		Label languagesLabel = new Label(languagesGroup, SWT.WRAP);
        languagesLabel.setText("Please select below the scripting languages that will be used in this project. "
        		             + "Scripting languages are used to define the behavior of workflow's tasks.");
        GridData languagesLabelLayout = new GridData(GridData.FILL_HORIZONTAL);
        languagesLabelLayout.horizontalSpan = numColumns;
        languagesLabel.setLayoutData(languagesLabelLayout);
        
        languagesViewer = CheckboxTableViewer.newCheckList(languagesGroup, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
        languagesViewer.getTable().setData("org.eclipse.swtbot.widget.key", "languagesTable");
        languagesViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return ((ScriptingLanguage) element).name();
			}
		});
        languagesViewer.setContentProvider(new ArrayContentProvider());
        languagesViewer.setInput(availableLanguages);
        GridData languagesViewerLayout = new GridData(GridData.BEGINNING);
        languagesViewerLayout.horizontalSpan = numColumns;
        languagesViewerLayout.horizontalAlignment = SWT.LEFT;
        languagesViewer.getTable().setLayoutData(languagesViewerLayout);
	}
	
	private static void createMessageTellingNoLanguageIsAvailable(Composite parent, int numColumns) {
        Group languagesGroup = createGroup(parent, " Scripting Languages ");
        
		StyledText message = new StyledText(languagesGroup, SWT.WRAP | SWT.MULTI);
		message.setBackground(parent.getParent().getBackground());
		message.setText("Warning: no scripting language have been found. "
					  + "Without one you may not be able to script the behavior of workflow's tasks. "
					  + "Please check EKumi's documentation to learn how to install one.");
		
		StyleRange boldWarning = new StyleRange();
		boldWarning.fontStyle = SWT.BOLD;
		boldWarning.start = 0;
		boldWarning.length = 8;
		message.setStyleRange(boldWarning);

		GridData fillHorizontalSpace = new GridData(GridData.FILL_HORIZONTAL);
        fillHorizontalSpace.horizontalSpan = numColumns;
        message.setLayoutData(fillHorizontalSpace);
	}

	private void createRepresentationPicker(Composite parent, int numColumns) {
		Group representationsGroup = createGroup(parent, " Representations ");
		
		// Create label asking the user to select a representation
		
		StyledText representationsLabel = new StyledText(representationsGroup, SWT.WRAP);
        representationsLabel.setText("(Required) Please select below the representation that will be used in this project. "
        		                   + "A representation is a way to represent and modify a workflow.");
        StyleRange boldRequired = new StyleRange();
        boldRequired.fontStyle = SWT.BOLD;
        boldRequired.start = 1;
        boldRequired.length = "Required".length();
        representationsLabel.setStyleRange(boldRequired);
        representationsLabel.setBackground(parent.getParent().getBackground());
        GridData representationsLabelLayout = new GridData(GridData.FILL_HORIZONTAL);
        representationsLabelLayout.horizontalSpan = numColumns;
        representationsLabel.setLayoutData(representationsLabelLayout);
        
        // Create the table displaying available representations
        
        representationsViewer = CheckboxTableViewer.newCheckList(representationsGroup, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
        representationsViewer.getTable().setData("org.eclipse.swtbot.widget.key", "representationsTable");
        representationsViewer.getTable().setHeaderVisible(true);
        representationsViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
        representationsViewer.setContentProvider(new ArrayContentProvider());
        
        // Create the 'Representation Name' column
        
        TableViewerColumn colName = new TableViewerColumn(representationsViewer, SWT.NONE);
		colName.getColumn().setText("Name");
		colName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Representation representation = (Representation) element;
				return representation.name();
			}
		});
        
        // Create the 'Representation Description' column
        
        TableViewerColumn colDescription = new TableViewerColumn(representationsViewer, SWT.NONE);
        colDescription.getColumn().setText("Description");
        colDescription.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Representation representation = (Representation) element;
				return representation.description();
			}
		});
        
        // The table should fill the space
		
        GridData representationsViewerLayout = new GridData(GridData.BEGINNING);
        representationsViewerLayout.horizontalSpan = numColumns;
        representationsViewerLayout.horizontalAlignment = SWT.CENTER;
        representationsViewer.getTable().setLayoutData(representationsViewerLayout);
        
        // Updates the wizard's Finish button on check
        representationsViewer.addCheckStateListener(event -> {
        	boolean pageIsDone = event.getChecked() && ! activityName.getText().isEmpty();
        	setPageComplete(pageIsDone);
        });
        
        // Don't forget: input must be set only once everything is configured!
        representationsViewer.setInput(availableRepresentations);
        
        // Now that columns are filled, let's resize them
        for (TableColumn column : representationsViewer.getTable().getColumns()) {
			column.pack();
		}
	}
	
	private static void createMessageTellingNoRepresentationIsAvailable(Composite parent, int numColumns) {
        Group representationsGroup = createGroup(parent, " Representations ");
        
		StyledText message = new StyledText(representationsGroup, SWT.WRAP | SWT.MULTI);
		message.setBackground(parent.getParent().getBackground());
		message.setText("Warning: no workflow representation have been found. "
					  + "Without one you won't be able to create, visualize or modify a workflow. "
					  + "Please check EKumi's documentation to learn how to install one.");
		
		StyleRange boldWarning = new StyleRange();
		boldWarning.fontStyle = SWT.BOLD;
		boldWarning.start = 0;
		boldWarning.length = 8;
		message.setStyleRange(boldWarning);

		GridData fillHorizontalSpace = new GridData(GridData.FILL_HORIZONTAL);
        fillHorizontalSpace.horizontalSpan = numColumns;
        message.setLayoutData(fillHorizontalSpace);
	}

	private static Group createGroup(Composite parent, String title) {
		Group group = new Group(parent, SWT.NONE);
		group.setText(title);
		GridLayoutFactory.fillDefaults().margins(8, 8).numColumns(3).applyTo(group);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(group);
		return group;
	}

	private static void createEmptySeparator(Composite parent, int numColumns) {
		Label emptySeparator = new Label(parent, SWT.HORIZONTAL);
        GridData separatorLayout = new GridData(GridData.FILL_HORIZONTAL);
        separatorLayout.horizontalSpan = numColumns;
		emptySeparator.setLayoutData(separatorLayout);
	}

	private void createWorkflowPropertiesFields(Composite parent) {
		Group workflowPropertiesGroup = createGroup(parent, " Workflow Properties ");
		Label activityNameLabel = new Label(workflowPropertiesGroup, SWT.NONE);
        activityNameLabel.setText("Name:");

        activityName = new Text(workflowPropertiesGroup, SWT.BORDER | SWT.SINGLE);
        activityName.setText("");
        activityName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                boolean workflowHasAName = ! activityName.getText().isEmpty();
                setPageComplete(workflowHasAName);
            }
        });
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        activityName.setLayoutData(gd);
	}
    
    @Override
    public void setVisible(boolean visible) {
    	super.setVisible(visible);
    	
    	if (visible) {
    		activityName.setFocus();
    	}
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
     * Returns the representation that has been selected by the user
     * @return the representation that has been selected by the user, if any
     */
    public Optional<Representation> getSelectedRepresentation() {
    	if (availableRepresentations.isEmpty()) {
    		return Optional.empty();
    	}
    	return stream(representationsViewer.getCheckedElements())
    			.map(Representation.class::cast)
    			.findAny();
    }
    
    /**
     * Returns all the languages that have been selected.
     * @return all the languages that have been selected 
     */
    public Set<ScriptingLanguage> getSelectedLanguages() {
    	if (availableLanguages.isEmpty()) {
    		return new HashSet<>();
    	}
    	return stream(languagesViewer.getCheckedElements())
    			.map(ScriptingLanguage.class::cast)
    			.collect(toSet());
    }
}
