package fr.kazejiyu.ekumi.ide.history;

import static java.util.Objects.requireNonNull;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.ekumi.History;
import fr.kazejiyu.ekumi.core.ekumi.impl.HistoryImpl;

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
			      .flatMap(file -> Arrays.stream(file.listFiles(f -> f.getName().endsWith(".ekumi"))))
				  .map(file -> loadExecutionFromFile(file))
				  .collect(Collectors.toList())
		);	
	}

	private File[] executionFolders() {
		File[] folders = location.toFile().listFiles(File::isDirectory);
		
		if (folders == null)
			folders = new File[0];
		
		return folders;
	}
	
	private static Execution loadExecutionFromFile(File file) {
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
				
			m.putIfAbsent("ekumi", new XMIResourceFactoryImpl());
				
			ResourceSet resourceSet = new ResourceSetImpl();
			
			resourceSet.getPackageRegistry().put(EkumiPackage.eNS_URI, EkumiPackage.eINSTANCE);
			Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
				
			return (Execution) resource.getContents().get(0);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
