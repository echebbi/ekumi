package fr.kazejiyu.ekumi.ide.history;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.execution.listeners.ActivityListener;
import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionListener;

/**
 * Watches an {@link Execution} in order to persist it in the workspace each time it changes.<br>
 * <br>
 * The execution is persisted under the directory given by {@link WorkspaceExecutionHistory#getLocation()}.
 * More specifically, it is persisted as an <i>&lt;execution-id&gt;</i>/<i>&lt;activity-name&gt;</i>.ekumi.
 * 
 * @author Emmanuel CHEBBI
 */
public class PersistExecutionInWorkspace implements ActivityListener, ExecutionListener {
	
	/** Set on execution started */
	private Execution execution;

	@Override
	public void onExecutionStarted(Execution execution) {
		this.execution = execution;
		persistInWorkspaceMetada(execution);
	}

	@Override
	public void onActivityFailed(Activity failed) {
		persistInWorkspaceMetada(execution);
	}

	@Override
	public void onActivitySucceeded(Activity succeeded) {
		persistInWorkspaceMetada(execution);
	}
	
	/**
	 * Persists given execution as an XMI file in workspace .metadata folder.
	 * 
	 * @param execution
	 * 			The execution to persist.
	 */
	private static void persistInWorkspaceMetada(Execution execution) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		
		if (! m.containsKey("ekumi"))
			m.put("ekumi", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(
				WorkspaceExecutionHistory.getLocationURI()
										 .appendSegment(execution.getActivity().getId())
										 .appendSegment(execution.getActivity().getName())
										 .appendFileExtension("ekumi")
		 );
		
		resource.getContents().add(execution);
		
		try {
			resource.save(Collections.emptyMap());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
