/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop()
 * @model
 * @generated
 */
public interface StructuredLoop extends Activity {
	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' containment reference.
	 * @see #setPreCondition(Condition)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop_PreCondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getPreCondition();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPreCondition <em>Pre Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' containment reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(Condition)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop_PostCondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getPostCondition();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop_Activity()
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // StructuredLoop
