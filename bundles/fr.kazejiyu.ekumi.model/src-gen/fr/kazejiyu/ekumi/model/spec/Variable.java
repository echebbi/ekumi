/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hold a typed value.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getVariable_Name()
	 * <!-- end-user-doc -->
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Variable#getName <em>Name</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Type Id</b></em>' attribute.
	 * @return the value of the '<em>Type Id</em>' attribute.
	 * @see #setTypeId(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getVariable_TypeId()
	 * <!-- end-user-doc -->
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTypeId();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Variable#getTypeId <em>Type Id</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' attribute.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getVariable_Value()
	 * <!-- end-user-doc -->
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getVariable_IsRequired()
	 * <!-- end-user-doc -->
	 * @model default="true"
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Variable#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

} // Variable
