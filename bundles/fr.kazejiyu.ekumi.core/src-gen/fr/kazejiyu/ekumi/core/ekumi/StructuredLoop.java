/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

/**
 * <!-- begin-user-doc -->
 * Represents either a While or a For loop.
 * 
 * @see <a href="http://www.workflowpatterns.com/patterns/control/new/wcp21.php">www.workflowspatterns.com</a>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPreTest <em>Pre Test</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPostTest <em>Post Test</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop()
 * @model
 * @generated
 */
public interface StructuredLoop extends Activity {
	/**
	 * Returns the value of the '<em><b>Pre Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Test</em>' containment reference.
	 * @see #setPreTest(TestableScript)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop_PreTest()
	 * @model containment="true"
	 * @generated
	 */
	TestableScript getPreTest();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPreTest <em>Pre Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Test</em>' containment reference.
	 * @see #getPreTest()
	 * @generated
	 */
	void setPreTest(TestableScript value);

	/**
	 * Returns the value of the '<em><b>Post Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Test</em>' containment reference.
	 * @see #setPostTest(TestableScript)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop_PostTest()
	 * @model containment="true"
	 * @generated
	 */
	TestableScript getPostTest();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPostTest <em>Post Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Test</em>' containment reference.
	 * @see #getPostTest()
	 * @generated
	 */
	void setPostTest(TestableScript value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // StructuredLoop
