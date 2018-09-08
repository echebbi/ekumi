package fr.kazejiyu.ekumi.languages.java.test.providers;

/**
 * A convenient mixin defining some constants.
 * 
 * @author Emmanuel CHEBBI
 */
public interface ProjectProvider {
	
	final static String PROJECT_NAME = "some.workspace.project";
	final static String PACKAGE_NAME = "some.workspace.project";
	final static String PACKAGE_PATH = "src/some/workspace/project/";

	default String createIdFor(String className) {
		return "project;" + PROJECT_NAME + ";" + PACKAGE_NAME + "." + className;
	}
	
}
