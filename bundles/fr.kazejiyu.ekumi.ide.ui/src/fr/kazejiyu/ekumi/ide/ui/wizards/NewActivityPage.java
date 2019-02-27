package fr.kazejiyu.ekumi.ide.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page used to enter the information required for the creation of a new {@link Activity}.
 */
public class NewActivityPage extends WizardPage {
	
	/** Text box to type the name of the activity to create */
    private Text activityName;

    public NewActivityPage() {
        super("New Workflow");
        setTitle("New Workflow");
        setDescription("Set up project's workflow");
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        Label activityNameLabel = new Label(container, SWT.NONE);
        activityNameLabel.setText("Workflow name:");

        activityName = new Text(container, SWT.BORDER | SWT.SINGLE);
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
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(false);

        activityName.setFocus();
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
}
