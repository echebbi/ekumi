/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop()
 * @model
 * @generated
 */
public interface StructuredLoop extends Workflow {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(TestableScript)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStructuredLoop_Test()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TestableScript getTest();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(TestableScript value);

} // StructuredLoop
