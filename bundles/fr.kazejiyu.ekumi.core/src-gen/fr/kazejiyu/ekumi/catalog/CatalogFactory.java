/**
 */
package fr.kazejiyu.ekumi.catalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.catalog.CatalogPackage
 * @generated
 */
public interface CatalogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogFactory eINSTANCE = fr.kazejiyu.ekumi.catalog.impl.CatalogFactoryImpl.init();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Catalog</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Catalog</em>'.
	 * @generated
	 */
	Catalog createCatalog();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Category</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Catalogs</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Catalogs</em>'.
	 * @generated
	 */
	Catalogs createCatalogs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the package supported by this factory.
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CatalogPackage getCatalogPackage();

} //CatalogFactory
