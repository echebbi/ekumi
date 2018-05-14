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
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Data#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Data#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {

	/**
	 * Returns the value casted to the specified class.
	 * 
	 * @param type
	 * 			Must not be {@code null}.
	 * 
	 * @return the casted value, or {@code null} if the value is null.
	 */
	default <T> T getValueAs(Class<T> type) {
		return type.cast(getValue());
	}

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

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getData_Owner()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getInputs
	 * @model opposite="inputs" transient="false"
	 * @generated
	 */
	Activity getOwner();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Data#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Activity value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getData_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Data#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // Data
