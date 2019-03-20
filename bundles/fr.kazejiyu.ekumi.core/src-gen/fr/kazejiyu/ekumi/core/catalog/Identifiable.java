/**
 */
package fr.kazejiyu.ekumi.core.catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getIdentifiable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getIdentifiable_Id()
	 * <!-- end-user-doc -->
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable#getId <em>Id</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getIdentifiable_Name()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable#getName <em>Name</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getIdentifiable_Description()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.catalog.Identifiable#getDescription <em>Description</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Identifiable
