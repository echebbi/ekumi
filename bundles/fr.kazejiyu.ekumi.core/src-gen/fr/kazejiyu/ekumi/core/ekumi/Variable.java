/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import fr.kazejiyu.ekumi.core.datatypes.DataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getType <em>Type</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {

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
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getName <em>Name</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(DataType)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getVariable_Type()
	 * @model dataType="fr.kazejiyu.ekumi.core.ekumi.DataType"
	 * @generated
	 */
	DataType getType();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getType <em>Type</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getVariable_Owner()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getInputs
	 * @model opposite="inputs" transient="false"
	 * @generated
	 */
	Activity getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getOwner <em>Owner</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getVariable_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // Variable
