package fr.kazejiyu.ekumi;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;

/**
 * Activator of the {@code fr.kazejiyu.ekumi.core} bundle.
 * 
 * @author Emmanuel CHEBBI
 */
public class EKumiPlugin implements BundleActivator {
	
	public static final String ID = "fr.kazejiyu.ekumi.core";
	
	/** ID of the 'catalogs' extension point */
	public static final String CATALOGS_EXTENSION_ID = "fr.kazejiyu.ekumi.core.catalogs";
	
	/** ID of the 'datatypes' extension point */
	public static final String DATATYPES_EXTENSION_ID = "fr.kazejiyu.ekumi.core.datatypes";
	
	/** ID of the 'languages' extension point */
	public static final String LANGUAGES_EXTENSION_ID = "fr.kazejiyu.ekumi.core.languages";

	/** URI of the plug-in's corresponding folder under the .metadata/.plugins directory */
	private static final URI STATE_LOCATION_URI = URI.createURI("platform:/meta/" + ID + "/");

	// The shared instance
	private static EKumiPlugin plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static EKumiPlugin getDefault() {
		return plugin;
	}
	
	/**
	 * Returns the URI of the state directory for this bundle under <i>.metadata/.plugins/</i>.
	 * @return the URI of the state directory for this bundle under <i>.metadata/.plugins/</i>
	 */
	public static URI getStateLocationURI() {
		return STATE_LOCATION_URI;
	}
	
	/**
	 * Returns the location of the state directory for this bundle under <i>.metadata/.plugins/</i>.
	 * @return the location of the state directory for this bundle under <i>.metadata/.plugins/</i>
	 */
	public static Path getStateLocation() {
		try {
			return Paths.get(FileLocator.resolve(new URL(getStateLocationURI().toString())).toURI());
			
		} catch (URISyntaxException | IOException e) {
			// Should never happen
			throw new EKumiRuntimeException("An unexpected error occurred while resolving the state location of " + ID, e);
		}
	}

}
