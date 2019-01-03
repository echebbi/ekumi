package fr.kazejiyu.ekumi.launchconfiguration.ui.form;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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

import fr.kazejiyu.ekumi.debug.EKumiRunConfiguration;
import fr.kazejiyu.ekumi.model.workflow.Activity;

/**
 * A tab allowing to choose the {@link Activity} to execute. 
 */
public class ChooseActivityModelTab extends AbstractLaunchConfigurationTab {

	/** Contains the URI of the Activity to execute */
	private Text modelURI;
	
    @Override
    public void createControl(Composite parent) {
        Composite comp = new Group(parent, SWT.BORDER);
        setControl(comp);

        GridLayoutFactory.swtDefaults().numColumns(3).applyTo(comp);

        Label label = new Label(comp, SWT.NONE);
        label.setText("Activity's URI:");
        GridDataFactory.swtDefaults().applyTo(label);

        modelURI = new Text(comp, SWT.BORDER);
        modelURI.setText("EKumi Workflow file");
        modelURI.addKeyListener(new DirtyDialogOnInput());
        
        Button browse = new Button(comp, SWT.NONE);
        browse.setText("Browse");
        browse.addSelectionListener(new SelectWorkspaceResource());
        
        GridDataFactory.fillDefaults().grab(true, false).applyTo(modelURI);
    }

    @Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    	// nothing to initialize
    }

    @Override
    public void initializeFrom(ILaunchConfiguration configuration) {
        try {
            String consoleText = configuration.getAttribute(EKumiRunConfiguration.EKUMI_MODEL_URI, "");
            modelURI.setText(consoleText);
            
        } catch (CoreException e) {
        	e.printStackTrace();
        }
    }

    @Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(EKumiRunConfiguration.EKUMI_MODEL_URI, modelURI.getText());
    }

    @Override
    public String getName() {
        return "Choose Activity";
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
			dialog.setMessage("Select an activity (*.ekumi)");
			dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
			
			if (dialog.open() == Dialog.OK) {
				Object selected = dialog.getResult()[0];
				
				PlatformObject object = (PlatformObject) selected;
				IPath path = object.getAdapter(IFile.class).getFullPath();
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
				
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				ChooseActivityModelTab.this.modelURI.setText(uri.toString());
				
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		}
		
	}

	/**
     * Dirty the launch configuration dialog when the user type something.
     */
	private final class DirtyDialogOnInput extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent event) {
			setDirty(true);
			updateLaunchConfigurationDialog();
		}
		
	}

}
