/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DriverRunner#getDriven <em>Driven</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDriverRunner()
 * @model abstract="true"
 * @generated
 */
public interface DriverRunner extends Runner {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Driven</b></em>' reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driven</em>' reference.
	 * @see #setDriven(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDriverRunner_Driven()
	 * @model
	 * @generated
	 */
	Activity getDriven();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DriverRunner#getDriven <em>Driven</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driven</em>' reference.
	 * @see #getDriven()
	 * @generated
	 */
	void setDriven(Activity value);

} // DriverRunner
