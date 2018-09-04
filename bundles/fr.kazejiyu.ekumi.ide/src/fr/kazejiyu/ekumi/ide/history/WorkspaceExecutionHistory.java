package fr.kazejiyu.ekumi.ide.history;

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

import fr.kazejiyu.ekumi.core.EKumiPlugin;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.ekumi.impl.HistoryImpl;

/**
 * The history of the {@link Execution}s performed in the Eclipse IDE
 * and persisted in the workspace. 
 */
public class WorkspaceExecutionHistory extends HistoryImpl {
	
	@Override
	public EList<Execution> getExecutions() {
		// TODO [Refactor] This is a dumb implementation to test, will be refactored
		return new BasicEList<>(
			Arrays.stream(getLocation().toFile().listFiles(File::isDirectory))
			      .flatMap(file -> Arrays.stream(file.listFiles(f -> f.getName().endsWith(".ekumi"))))
				  .map(file -> loadExecutionFromFile(file))
				  .collect(Collectors.toList())
		);
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
