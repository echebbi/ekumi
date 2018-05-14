/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Driver#getDriven <em>Driven</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Driver#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends Activity {
	/**
	 * Returns the value of the '<em><b>Driven</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driven</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driven</em>' containment reference.
	 * @see #setDriven(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDriver_Driven()
	 * @model containment="true"
	 * @generated
	 */
	Activity getDriven();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Driver#getDriven <em>Driven</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driven</em>' containment reference.
	 * @see #getDriven()
	 * @generated
	 */
	void setDriven(Activity value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(DriverRunner)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDriver_Script()
	 * @model containment="true"
	 * @generated
	 */
	DriverRunner getScript();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Driver#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(DriverRunner value);

} // Driver
