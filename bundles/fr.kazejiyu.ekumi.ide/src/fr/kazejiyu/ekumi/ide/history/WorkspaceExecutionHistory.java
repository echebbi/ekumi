package fr.kazejiyu.ekumi.ide.history;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.kazejiyu.ekumi.core.EKumiPlugin;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.execution.ExecutionHistory;

/**
 * The history of the {@link Execution}s performed in the Eclipse IDE
 * and persisted in the workspace. 
 */
public class WorkspaceExecutionHistory implements ExecutionHistory {
	
	@Override
	public Iterator<Execution> iterator() {
		// TODO [Refactor] This is a dumb implementation to test, will be refactored
		return Arrays.stream(getLocation().toFile().listFiles(File::isDirectory))
					 .flatMap(file -> Arrays.stream(file.listFiles(f -> f.getName().endsWith(".ekumi"))))
					 .map(file -> loadExecutionFromFile(file))
					 .iterator();
	}
	
	public static Path getLocation() {
		return EKumiPlugin.getStateLocation().resolve("executions");
	}
	
	public static URI getLocationURI() {
		return EKumiPlugin.getStateLocationURI().appendSegment("executions");
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
