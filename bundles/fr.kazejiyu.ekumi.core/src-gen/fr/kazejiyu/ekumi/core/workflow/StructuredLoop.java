/**
 */
package fr.kazejiyu.ekumi.core.workflow;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getStructuredLoop()
 * @model
 * @generated
 */
public interface StructuredLoop extends Activity {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Pre Condition</b></em>' containment reference.
	 * @return the value of the '<em>Pre Condition</em>' containment reference.
	 * @see #setPreCondition(Condition)
	 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getStructuredLoop_PreCondition()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Condition getPreCondition();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getPreCondition <em>Pre Condition</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' containment reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Condition value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(Condition)
	 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getStructuredLoop_PostCondition()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Condition getPostCondition();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Condition value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getStructuredLoop_Activity()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getActivity <em>Activity</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // StructuredLoop
