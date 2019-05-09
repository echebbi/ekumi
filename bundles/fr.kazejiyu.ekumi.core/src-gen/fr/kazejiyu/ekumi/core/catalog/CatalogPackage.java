/**
 */
package fr.kazejiyu.ekumi.core.catalog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.core.catalog.CatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ekumi.kazejiyu.fr/catalog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogPackage eINSTANCE = fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.catalog.Identifiable
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.GroupImpl
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = IDENTIFIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CATEGORIES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARENT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogImpl
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DESCRIPTION = GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CATEGORIES = GROUP__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__PARENT = GROUP__PARENT;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CategoryImpl
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORIES = GROUP__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PARENT = GROUP__PARENT;

	/**
	 * The feature id for the '<em><b>Activity Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ACTIVITY_TEMPLATES = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogsImpl <em>Catalogs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogsImpl
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getCatalogs()
	 * @generated
	 */
	int CATALOGS = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Catalogs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalogs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl <em>Activity Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getActivityTemplate()
	 * @generated
	 */
	int ACTIVITY_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE__DESCRIPTION = IDENTIFIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE__MODEL_PATH = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE__CATEGORY = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE___TO_ACTIVITY = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TEMPLATE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>Activity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity
	 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 6;

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.catalog.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.catalog.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.catalog.Category#getActivityTemplates <em>Activity Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Templates</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Category#getActivityTemplates()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_ActivityTemplates();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.catalog.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.catalog.Group#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Group#getCategories()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Categories();

	/**
	 * Returns the meta object for the container reference '{@link fr.kazejiyu.ekumi.core.catalog.Group#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Group#getParent()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Parent();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.catalog.Catalogs <em>Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogs</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Catalogs
	 * @generated
	 */
	EClass getCatalogs();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.catalog.Catalogs#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Catalogs#getContent()
	 * @see #getCatalogs()
	 * @generated
	 */
	EReference getCatalogs_Content();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.catalog.ActivityTemplate <em>Activity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Template</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.ActivityTemplate
	 * @generated
	 */
	EClass getActivityTemplate();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.catalog.ActivityTemplate#getModelPath <em>Model Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Path</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.ActivityTemplate#getModelPath()
	 * @see #getActivityTemplate()
	 * @generated
	 */
	EAttribute getActivityTemplate_ModelPath();

	/**
	 * Returns the meta object for the container reference '{@link fr.kazejiyu.ekumi.core.catalog.ActivityTemplate#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Category</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.ActivityTemplate#getCategory()
	 * @see #getActivityTemplate()
	 * @generated
	 */
	EReference getActivityTemplate_Category();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.catalog.ActivityTemplate#toActivity() <em>To Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Activity</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.catalog.ActivityTemplate#toActivity()
	 * @generated
	 */
	EOperation getActivityTemplate__ToActivity();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Identifiable#getName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.kazejiyu.ekumi.core.catalog.Identifiable#getDescription()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Description();

	/**
	 * Returns the meta object for data type '{@link fr.kazejiyu.ekumi.core.workflow.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity
	 * @model instanceClass="fr.kazejiyu.ekumi.core.workflow.Activity"
	 * @generated
	 */
	EDataType getActivity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogFactory getCatalogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogImpl
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CategoryImpl
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Activity Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ACTIVITY_TEMPLATES = eINSTANCE.getCategory_ActivityTemplates();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.GroupImpl
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CATEGORIES = eINSTANCE.getGroup_Categories();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__PARENT = eINSTANCE.getGroup_Parent();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogsImpl <em>Catalogs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogsImpl
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getCatalogs()
		 * @generated
		 */
		EClass CATALOGS = eINSTANCE.getCatalogs();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGS__CONTENT = eINSTANCE.getCatalogs_Content();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl <em>Activity Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getActivityTemplate()
		 * @generated
		 */
		EClass ACTIVITY_TEMPLATE = eINSTANCE.getActivityTemplate();

		/**
		 * The meta object literal for the '<em><b>Model Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_TEMPLATE__MODEL_PATH = eINSTANCE.getActivityTemplate_ModelPath();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TEMPLATE__CATEGORY = eINSTANCE.getActivityTemplate_Category();

		/**
		 * The meta object literal for the '<em><b>To Activity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_TEMPLATE___TO_ACTIVITY = eINSTANCE.getActivityTemplate__ToActivity();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.catalog.Identifiable
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NAME = eINSTANCE.getIdentifiable_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__DESCRIPTION = eINSTANCE.getIdentifiable_Description();

		/**
		 * The meta object literal for the '<em>Activity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.Activity
		 * @see fr.kazejiyu.ekumi.core.catalog.gen.impl.CatalogPackageImpl#getActivity()
		 * @generated
		 */
		EDataType ACTIVITY = eINSTANCE.getActivity();

	}

} //CatalogPackage
