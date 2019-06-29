/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.debug.ui.form;

import static java.lang.Boolean.parseBoolean;
import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import fr.kazejiyu.ekumi.core.EKumiExtensions;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.debug.EKumiRunConfiguration;
import fr.kazejiyu.ekumi.debug.ui.Activator;
import fr.kazejiyu.ekumi.debug.ui.form.hooks.ExtensionsHooksContentProvider;
import fr.kazejiyu.ekumi.debug.ui.form.hooks.LambdaLabelProvider;

/**
 * A tab allowing to choose the {@link Activity} to execute. 
 */
public class ChooseActivityModelTab extends AbstractLaunchConfigurationTab {
	/** 
	 * Contains the URI of the Activity to execute 
	 */
	private Text modelURI;
	/**
	 * The execution hooks provided by extension points.
	 */
	private List<IConfigurationElement> hooks;
	/**
	 * The table showing available hooks and allowing the user to select the ones to use during the execution.
	 */
	private CheckboxTableViewer hooksTable;
	
    @Override
    public void createControl(Composite parent) {
    	Composite comp = new Composite(parent, SWT.NONE);
    	GridLayout layout = new GridLayout(1, false);
    	layout.verticalSpacing = 0;
		comp.setLayout(layout);
    	comp.setFont(parent.getFont());
    	GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 1;
    	comp.setLayoutData(gd);
        
        createActivityGroup(comp);
        createExecutionHooksGroup(comp);
        
        setControl(comp);
    }

    /**
     * Creates a group allowing to choose the URI of an Activity's model file.
     */
	private void createActivityGroup(Composite parent) {
		Group activitySelectionGroup = new Group(parent, SWT.NONE);
        activitySelectionGroup.setText("Activity");
        GridLayoutFactory.fillDefaults().margins(8, 8).numColumns(3).applyTo(activitySelectionGroup);
        GridDataFactory.fillDefaults().grab(true, false).applyTo(activitySelectionGroup);
        
        StyledText explanation = new StyledText(activitySelectionGroup, SWT.WRAP | SWT.MULTI);
        explanation.setText("Select below the file defining the activity to execute. The path should be in the form of \"platform:/resource/[workspace/relative/file]\".");
        explanation.setBackground(parent.getParent().getBackground());
        StyleRange italicTemplate = new StyleRange();
        italicTemplate.start = explanation.getText().indexOf('[');
        italicTemplate.length = explanation.getText().indexOf(']') - explanation.getText().indexOf('[') + 1;
        italicTemplate.fontStyle = SWT.ITALIC;
        explanation.setStyleRange(italicTemplate);
        GridDataFactory.fillDefaults().grab(true, false).span(3, 1).applyTo(explanation);

        Label label = new Label(activitySelectionGroup, SWT.NONE);
        label.setText("Activity's URI:");
        GridDataFactory.swtDefaults().applyTo(label);

        modelURI = new Text(activitySelectionGroup, SWT.BORDER);
        modelURI.setToolTipText("EKumi Workflow file");
        modelURI.addKeyListener(new DirtyDialogOnInput());
        
        Button browse = new Button(activitySelectionGroup, SWT.NONE);
        browse.setText("Browse");
        browse.addSelectionListener(new SelectWorkspaceResource());
        
        GridDataFactory.fillDefaults().grab(true, false).applyTo(modelURI);
	}
	
	/**
	 * Creates a group containing a table showing available Execution Hooks. Execution Hooks are found from extension points.
	 * Each execution hook provide a checkbox that can be used to activate / deactivate the hook.
	 */
	private void createExecutionHooksGroup(Composite parent) {
		Group hooksSelectionGroup = new Group(parent, SWT.NONE);
        hooksSelectionGroup.setText("Execution Hooks");
        GridLayoutFactory.fillDefaults().margins(8, 8).applyTo(hooksSelectionGroup);
        GridDataFactory.fillDefaults().grab(true, false).applyTo(hooksSelectionGroup);
        
        Text explanation = new Text(hooksSelectionGroup, SWT.WRAP | SWT.MULTI);
        explanation.setText("Select below the hooks that should be activated during the execution of this activity. Unchecked hooks will be ignored.");
        explanation.setBackground(parent.getParent().getBackground());
        
		hooksTable = CheckboxTableViewer.newCheckList(hooksSelectionGroup, SWT.BORDER);
		hooksTable.getTable().setHeaderVisible(true);
		hooksTable.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		hooksTable.setContentProvider(new ExtensionsHooksContentProvider());
		
		TableViewerColumn colName = new TableViewerColumn(hooksTable, SWT.NONE);
		colName.getColumn().setWidth(100);
		colName.getColumn().setText("Name");
		colName.setLabelProvider(new LambdaLabelProvider(hook -> hook.getAttribute("name")));
		
		TableViewerColumn colDescription = new TableViewerColumn(hooksTable, SWT.NONE);
		colDescription.getColumn().setWidth(300);
		colDescription.getColumn().setText("Description");
		colDescription.setLabelProvider(new LambdaLabelProvider(hook -> hook.getAttribute("description")));
		
		TableViewerColumn colId = new TableViewerColumn(hooksTable, SWT.NONE);
		colId.getColumn().setWidth(200);
		colId.getColumn().setText("Id");
		colId.setLabelProvider(new LambdaLabelProvider(hook -> hook.getAttribute("id")));
		
		TableViewerColumn colPluginId = new TableViewerColumn(hooksTable, SWT.NONE);
		colPluginId.getColumn().setWidth(200);
		colPluginId.getColumn().setText("Source Plugin Id");
		colPluginId.setLabelProvider(new LambdaLabelProvider(hook -> hook.getContributor().getName()));
		
		hooksTable.setInput(executionHooks());
		
		// Init checked state based on whether the hook is activated by default
		for (IConfigurationElement extension : hooks) {
			if (parseBoolean(extension.getAttribute("activated_by_default"))) {
				hooksTable.setChecked(extension, true);
			}
		}
		// Dirty the tab when a hook is activated / deactivated
		hooksTable.addCheckStateListener(event -> setDirty());
	}

    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    	String commaSeparatedHooks = executionHooks().stream()
									    			 .filter(hook -> parseBoolean(hook.getAttribute("activated_by_default")))
    												 .map(hook -> hook.getAttribute("id"))
    												 .collect(joining(","));
    	configuration.setAttribute(EKumiRunConfiguration.COMMA_SEPARATED_HOOKS_ID, commaSeparatedHooks);
    }

    @Override
    public void initializeFrom(ILaunchConfiguration configuration) {
        try {
            String consoleText = configuration.getAttribute(EKumiRunConfiguration.EKUMI_MODEL_URI, "");
            modelURI.setText(consoleText);
            
            String commaSeparatedActivatedHooksId = configuration.getAttribute(EKumiRunConfiguration.COMMA_SEPARATED_HOOKS_ID, "");
            Set<String> activatedHooksId = new HashSet<>(asList(commaSeparatedActivatedHooksId.split(",")));
            
            for (IConfigurationElement hook : executionHooks()) {
            	boolean hookIsActivated = activatedHooksId.contains(hook.getAttribute("id"));
				hooksTable.setChecked(hook, hookIsActivated);
			}
        }
        catch (CoreException e) {
        	Activator.error(e, "Unable to initialize '" + getName() + "' tab");
        }
    }

    @Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(EKumiRunConfiguration.EKUMI_MODEL_URI, modelURI.getText());
        
        Object[] activatedHooks = hooksTable.getCheckedElements();
        String commaSeparatedHooksId = stream(activatedHooks)
        							  .map(element -> (IConfigurationElement) element)
        							  .map(hook -> hook.getAttribute("id"))
        							  .collect(joining(","));
        configuration.setAttribute(EKumiRunConfiguration.COMMA_SEPARATED_HOOKS_ID, commaSeparatedHooksId);
    }

    @Override
    public String getName() {
        return "Configuration";
    }
    
    public List<IConfigurationElement> executionHooks() {
    	if (hooks == null) {
    		hooks = asList(Platform.getExtensionRegistry().getConfigurationElementsFor(EKumiExtensions.EXECUTION_EXTENSION_ID));
    	}
    	return hooks;
    }
    
    private void setDirty() {
    	setDirty(true);
		updateLaunchConfigurationDialog();
    }

    /**
     * <p>Opens a dialog allowing the user to select a resource from the workspace</p>
     * 
     * TODO Add a validator to ensure that the user selects a valid resource
     */
    private final class SelectWorkspaceResource extends SelectionAdapter {
    	
		@Override
		public void widgetSelected(SelectionEvent e) {
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
			
			dialog.setTitle("Workspace");
			dialog.setMessage("Select an activity");
			dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
			
			if (dialog.open() == Dialog.OK && dialog.getResult().length > 0) {
				Object selected = dialog.getResult()[0];
				
				PlatformObject object = (PlatformObject) selected;
				IPath path = object.getAdapter(IFile.class).getFullPath();
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
				
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				ChooseActivityModelTab.this.modelURI.setText(uri.toString());
				
				setDirty();
			}
		}
		
	}

	/**
     * Dirty the launch configuration dialog when the user type something.
     */
	private final class DirtyDialogOnInput extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent event) {
			setDirty();
		}
		
	}

}
