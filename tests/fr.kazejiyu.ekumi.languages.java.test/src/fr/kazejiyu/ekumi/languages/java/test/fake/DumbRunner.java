package fr.kazejiyu.ekumi.languages.java.test.fake;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Runner;
import fr.kazejiyu.ekumi.core.ekumi.impl.RunnerImpl;

/**
 * A simple {@link Runner} that does nothing.
 * 
 * @author Emmanuel CHEBBI
 */
public class DumbRunner extends RunnerImpl {

	@Override
	public void run(Context context) {
		// does nothing
	}
	
}
