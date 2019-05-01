package some.workspace.project;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Runner;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.RunnerImpl;

/**
 * A simple {@link Runner} that does nothing.<br>
 * <br>
 * The only purpose of this class is to test the loading of 
 * {@link Runner}s defined within a workspace project.
 * 
 * @see {@code fr.kazejiyu.ekumi.languages.java.tests} plug-in.
 * 
 * @author Emmanuel CHEBBI
 */
public class RunnerDefinedInProject extends RunnerImpl {

	@Override
	public void run(Context context) {
		// does nothing
	}
	
}
