package fr.kazejiyu.ekumi.languages.java;

import static java.util.Objects.requireNonNull;
import static java.util.Arrays.asList;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.osgi.framework.Bundle;

import fr.kazejiyu.ekumi.core.ekumi.Script;
import fr.kazejiyu.ekumi.core.languages.exceptions.IllegalScripIdentifierException;

/**
 * Uniquely identifies a Java {@link Script}.<br>
 * <br>
 * See {@link JavaLanguage} for an explanation of the String representation of such an identifier.
 * 
 * @author Emmanuel CHEBBI
 */
class ScriptIdentifier {
	
	private static final Set<String> ALLOWED_TYPES = new HashSet<>(asList("bundle", "project"));
	
	final String type;
	
	final String plugin;
	
	final String fullyQualifiedName;

	/**
	 * Creates a new identifier.
	 * 
	 * @param identifier
	 * 			The String representation of the identifier.
	 * 			Must not be {@code null}.
	 * 
	 * @throws IllegalScripIdentifierException if the identifier is incorrectly formatted.
	 */
	public ScriptIdentifier(String identifier) {
		requireNonNull(identifier, "Cannot identify a Script from a null identifier");
		String[] typeAndPluginAndClass = identifier.split(";");
		
		if (typeAndPluginAndClass.length != 3)
			throw new IllegalScripIdentifierException(
					"Malformed identifier: an identifier must be made of three parts separated by "
				  + "a semicolon (e.g. [bundle|project];some.project.name;some.project.name.MyClass)");
		
		type = typeAndPluginAndClass[0].toLowerCase();
		
		if (! ALLOWED_TYPES.contains(type))
			throw new IllegalScripIdentifierException(
					"Malformed identifier: the first part of the identifier must be either 'bundle' or 'project'");
			
		plugin = typeAndPluginAndClass[1];
		fullyQualifiedName = typeAndPluginAndClass[2];
		
		if (plugin.isEmpty()) 
			throw new IllegalScripIdentifierException("The name of the plug-in containing the Script to resolve must not be empty");
		
		if (fullyQualifiedName.isEmpty()) 
			throw new IllegalScripIdentifierException("The name of the Script to resolve must not be empty");
	}

	/**
	 * Returns whether the corresponding script is located in a {@link Bundle}.<br>
	 * <br>
	 * If the script is not within a Bundle, then it means that it is located within
	 * an {@link IProject}.
	 * 
	 * @return whether the corresponding script is located in a Bundle.
	 */
	boolean isBundled() {
		return type.equals("bundle");
	}

}
