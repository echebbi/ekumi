/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
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
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Sequence#getRoot <em>Root</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Sequence#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Activity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getSequence_Root()
	 * @model containment="true"
	 * @generated
	 */
	Activity getRoot();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Sequence#getRoot <em>Root</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Activity}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see #isSetActivities()
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getSequence_Activities()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Sequence#getActivities <em>Activities</em>}' reference list is set.
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activities</em>' reference list is set.
	 * @see #getActivities()
	 * @generated
	 */
	boolean isSetActivities();

} // Sequence
