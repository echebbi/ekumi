package fr.kazejiyu.ekumi.workflow.editor.design;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.model.catalog.Catalogs;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;

/**
 * An adapter creating {@link ScriptingLanguage} instances from {@link IConfigurationElement}s.<br>
 * <br>
 * This adapter is used to create a {@link ScriptingLanguage} from the contributions to the 
 * {@link EKumiPlugin#LANGUAGES_EXTENSION_ID} extension point.
 * 
 * @author Emmanuel CHEBBI
 */
// TODO [Refactor] Move this class to another bundle
class ExtensionToScriptingLanguageAdapter {
	
	/**
	 * Creates a new {@link Catalogs} according to the given configuration elements.
	 * 
	 * @param configurationElements
	 * 			The configuration elements describing user extensions.
	 * 
	 * @return a new Catalogs instance.
	 */
	List<ScriptingLanguage> adapt(List<IConfigurationElement> configurationElements) {
		requireNonNull(configurationElements, "Cannot adapt null configuration elements");
		
		return configurationElements.stream()
									.map(toLanguage())
									.filter(Objects::nonNull)
									.map(ScriptingLanguage.class::cast)
									.collect(toList());
	}
	
	private static Function<IConfigurationElement, ScriptingLanguage> toLanguage() {
		return conf -> {
			try {
				return (ScriptingLanguage) conf.createExecutableExtension("class");
				
			} catch (CoreException e) {
				EKumiPlugin.warn(e, "An error occured while creating an executable extension of property 'class' for configuration: " + conf);
				return null;
			}
		};
	}

}
