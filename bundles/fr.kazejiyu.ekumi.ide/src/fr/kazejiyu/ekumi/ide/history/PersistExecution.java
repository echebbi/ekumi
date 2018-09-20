package fr.kazejiyu.ekumi.ide.history;

import static java.util.Objects.requireNonNull;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
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
 * The execution is persisted under the given URI using the following pattern:
 * <ul>
 * 	<li><i>&lt;yyyy.MM.dd.HHmmssms&gt;-&lt;execution-id&gt;</i>/<i>&lt;execution-name&gt;</i>.ekumi
 * </ul>
 * For instance, the Execution {@code (id=a.simple.execution, name=Simple Execution)} started on December 17th, 2018,
 * at 13:03:42.27 would be persisted under:
 * <ul>
 * 	<li>2018.12.17.13034227-a.simple.execution/Simple Execution.ekumi
 * </ul>
 * 
 * @author Emmanuel CHEBBI
 */
public class PersistExecution implements ActivityListener, ExecutionListener {

	/** The format used to write execution's start date */
	private static final SimpleDateFormat START_DATE_FORMAT = new SimpleDateFormat("yyyy.MM.dd.HHmmssms");
	
	/** Set on execution started */
	private Execution execution;
	
	/** The directory where the execution is persisted */
	private final URI location;
	
	/**
	 * Creates a new listener aimed to persist an execution to the given location.
	 *  
	 * @param location
	 * 			The location where the execution must be persisted.
	 * 			Must be a valid directory.
	 */
	public PersistExecution(URI location) {
		this.location = requireNonNull(location, "The location must not be null");
	}

	@Override
	public void onExecutionStarted(Execution started) {
		this.execution = started;
		persist(execution);
	}

	@Override
	public void onActivityFailed(Activity failed) {
		persist(execution);
	}

	@Override
	public void onActivitySucceeded(Activity succeeded) {
		persist(execution);
	}
	
	@Override
	public void onExecutionSucceeded(Execution succeeded) {
		this.execution = succeeded;
		persist(execution);
	}

	/**
	 * Persists given execution as an XMI file under given location.
	 * 
	 * @param execution
	 * 			The execution to persist.
	 */
	private void persist(Execution execution) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.putIfAbsent("ekumi", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(
				location
					.appendSegment(START_DATE_FORMAT.format(execution.getStartDate()) + "." + execution.getId())
					.appendSegment(execution.getName())
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
