package fr.kazejiyu.ekumi.ide.catalog.internal;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IConfigurationElement;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.catalog.Catalog;
import fr.kazejiyu.ekumi.catalog.CatalogFactory;
import fr.kazejiyu.ekumi.catalog.Catalogs;
import fr.kazejiyu.ekumi.catalog.Category;
import fr.kazejiyu.ekumi.catalog.Group;

/**
 * An adapter creating {@link Catalogs} instances from {@link IConfigurationElement}s.<br>
 * <br>
 * This adapter is used to create a {@link Catalogs} from the contributions to the 
 * {@link EKumiPlugin#DATATYPES_EXTENSION_ID} extension point.
 * 
 * @author Emmanuel CHEBBI
 */
class ExtensionToCatalogsAdapter {
	
	/** Ensures that the extensions provide proper data */
	private final CatalogsExtensionConstraints constraints = new CatalogsExtensionConstraints();

	/** Keeps track of categories that cannot be resolved because of missing information */
	private Set<String> unresolvableCategories;
	
	/** Stores the Category that have already been resolved, mapped with their id */
	private Map<String, Category> alreadyCreatedCategories;

	/** Stores the templates of the Category to create, mapped with their id */
	private Map<String, CategoryTemplate> templates;
	
	/**
	 * Creates a new {@link Catalogs} according to the given configuration elements.
	 * 
	 * @param rawConfigurationElements
	 * 			The configuration elements describing user extensions.
	 * 
	 * @return a new Catalogs instance.
	 */
	Catalogs adapt(IConfigurationElement[] rawConfigurationElements) {
		List<IConfigurationElement> configurationElements = asList(rawConfigurationElements);
		
		Catalogs catalogs = CatalogFactory.eINSTANCE.createCatalogs();
		catalogs.getContent().addAll(catalogElementsIn(configurationElements));
		
		this.alreadyCreatedCategories = new HashMap<>();
		this.unresolvableCategories = new HashSet<>();
		this.templates = categoryTemplatesIn(configurationElements);
		
		for (CategoryTemplate template : templates.values())
			resolveCategory(template, catalogs);
		
		return catalogs;
	}
	
	/** @return all the 'catalog' elements declared in the extensions */
	private Set<Catalog> catalogElementsIn(List<IConfigurationElement> configurationElements) {
		return configurationElements.stream()
									.filter(constraints::isAValidCatalogElement)
									.map(this::createCatalogFromExtension)
									.collect(toSet());
	}
	
	private Map<String, CategoryTemplate> categoryTemplatesIn(List<IConfigurationElement> configurationElements) {
		return configurationElements.stream()
				.filter(constraints::isAValidCategoryElement)
				.map(this::createCategoryTemplateFromExtension)
				.collect(Collectors.toMap(template -> template.id, Function.identity()));
	}
	
	/** 
	 * Creates a new Category according to the given template.<br>
	 * <br>
	 * The new Category is added to its parent Catalog or Category.
	 * If a Category's parent is another Category that does not exist
	 * yet, it is created.
	 * 
	 * @param template
	 * 			The description of the category to create.
	 * @param catalogs
	 * 			The top-level catalogs that can hold new categories.
	 * 
	 * @return the new Category
	 */
	private Category resolveCategory(CategoryTemplate template, Catalogs catalogs) {
		if (alreadyCreatedCategories.containsKey(template.id))
			return alreadyCreatedCategories.get(template.id);
		
		if (unresolvableCategories.contains(template.id))
			return null;
		
		Group parent = getCatalog(catalogs, template.parentId);
		
		// parent must be a Category instead of a Catalog
		if (parent == null) {
			CategoryTemplate parentCategoryTemplate = templates.get(template.parentId);
			parent = resolveCategory(parentCategoryTemplate, catalogs);
			
			// still null: parent cannot be resolved
			if (parent == null) {
				// TODO [Log] A warning should be logged here
				unresolvableCategories.add(template.id);
				unresolvableCategories.add(template.parentId);

				return null;
			}
		}
		
		Category category = CatalogFactory.eINSTANCE.createCategory();
		category.setId(template.id);
		category.setName(template.name);
		category.setParent(parent);
		category.setDescription(template.description);
		
		alreadyCreatedCategories.put(category.getId(), category);
		
		return category;
	}
	
	/** @return a new Catalog instance corresponding to the given configuration element */
	private Catalog createCatalogFromExtension(IConfigurationElement configurationElement) {
		Catalog catalog = CatalogFactory.eINSTANCE.createCatalog();
		
		catalog.setId(configurationElement.getAttribute("id"));
		catalog.setName(configurationElement.getAttribute("name"));
		
		return catalog;
	}
	
	/** @return a new CategoryTemplate instance corresponding to the given configuration element */
	private CategoryTemplate createCategoryTemplateFromExtension(IConfigurationElement configurationElement) {
		CategoryTemplate template = new CategoryTemplate();
		
		template.id = configurationElement.getAttribute("id");
		template.name = configurationElement.getAttribute("name");
		template.parentId = configurationElement.getAttribute("parent");
		template.description = configurationElement.getAttribute("description");
		
		return template;
	}
	
	/** @return the Catalog with the given id */
	private static Catalog getCatalog(Catalogs catalogs, String id) {
		return catalogs.getContent().stream()
									.filter(catalog -> catalog.getId().equals(id))
									.findAny()
									.orElse(null);
	}
	
	/** A Category that is not created yet */
	private static class CategoryTemplate {
	
		String id;
		
		String name;
		
		String parentId;
		
		String description;
	
	}

}
