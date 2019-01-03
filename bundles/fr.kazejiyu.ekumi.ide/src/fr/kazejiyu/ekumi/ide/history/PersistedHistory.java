package fr.kazejiyu.ekumi.ide.history;

import static java.util.Objects.requireNonNull;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.workflow.History;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;
import fr.kazejiyu.ekumi.model.workflow.impl.HistoryImpl;

/**
 * An {@link History} persisted under a given directory.<br>
 * <br>
 * An instance of this class can load executions persisted by an instance of {@link PersistExecution}.
 */
public class PersistedHistory extends HistoryImpl {
	
	/** The directory where the executions are persisted */
	private final Path location;
	
	public PersistedHistory(Path location) {
		this.location = requireNonNull(location, "The location URI must not be null");
	}
	
	@Override
	public EList<Execution> getExecutions() {
		// TODO [Refactor] This is a dumb implementation to test, will be refactored
		return new BasicEList<>(
			Arrays.stream(executionFolders())
			      .flatMap(file -> Arrays.stream(file.listFiles(f -> f.getName().endsWith(".workflow"))))
				  .map(file -> loadExecutionFromFile(file))
				  .filter(Objects::nonNull)
				  .collect(Collectors.toList())
		);
	}
	
	/**
	 * Sets up the instance to send events when the history changes.
	 * 
	 * @param bus
	 * 			The event broker to use to send events.
	 * 
	 * @throws Exception if an error occurs while preparing to listen for changes
	 */
	public void notifyOnChange(IEventBroker bus) throws Exception {
		FileAlterationObserver observer = new FileAlterationObserver(location.toFile());
		FileAlterationMonitor monitor = new FileAlterationMonitor(1000);
		FileAlterationListener listener = new PostEventOnExecutionChange(bus);
		
		// Creates a new thread to listen for changes periodically
		observer.addListener(listener);
		monitor.addObserver(observer);
		monitor.start();
	}

	private File[] executionFolders() {
		File[] folders = location.toFile().listFiles(File::isDirectory);
		
		if (folders == null)
			folders = new File[0];
		
		return folders;
	}
	
	// TODO [Refactor] Move this method to a more appropriate place
	static Execution loadExecutionFromFile(File file) {
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
				
			m.putIfAbsent("workflow", new XMIResourceFactoryImpl());
				
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getPackageRegistry().put(WorkflowPackage.eNS_URI, WorkflowPackage.eINSTANCE);
			
			Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
			return (Execution) resource.getContents().get(0);
			
		} catch (Exception e) {
			EKumiPlugin.error(e, "Unable to load an Execution from " + file.getAbsolutePath());
			return null;
		}
	}

}
