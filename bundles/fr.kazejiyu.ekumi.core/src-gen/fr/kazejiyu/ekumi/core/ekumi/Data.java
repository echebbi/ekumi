/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import fr.kazejiyu.ekumi.core.datatypes.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Data#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Data#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(DataType)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getData_Type()
	 * @model dataType="fr.kazejiyu.ekumi.core.ekumi.DataType"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Data#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Data
