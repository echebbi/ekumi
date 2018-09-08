package fr.kazejiyu.ekumi.languages.java.test.providers;

/**
 * A convenient mixin defining some constants.
 * 
 * @author Emmanuel CHEBBI
 */
public interface BundleProvider {
	
	final static String PLUGIN_ID = "fr.kazejiyu.ekumi.languages.java";

	default String createIdFor(String className) {
		return "bundle;" + PLUGIN_ID + ";" + PLUGIN_ID + ".test.fake." + className;
	}
	
}
