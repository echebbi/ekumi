/**
 */
package fr.kazejiyu.ekumi.model.workflow;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends Activity {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Driven</b></em>' containment reference.
	 * @return the value of the '<em>Driven</em>' containment reference.
	 * @see #setDriven(Activity)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDriver_Driven()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Activity getDriven();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Driver#getDriven <em>Driven</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driven</em>' containment reference.
	 * @see #getDriven()
	 * @generated
	 */
	void setDriven(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(DriverRunner)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDriver_Script()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	DriverRunner getScript();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Driver#getScript <em>Script</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(DriverRunner value);

} // Driver
