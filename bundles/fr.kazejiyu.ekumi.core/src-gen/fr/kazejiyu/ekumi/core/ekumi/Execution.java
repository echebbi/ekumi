/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getActivity <em>Activity</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getContext <em>Context</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getStartDate <em>Start Date</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getExecution_Activity()
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getActivity <em>Activity</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(UnsafeContext)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getExecution_Context()
	 * @see fr.kazejiyu.ekumi.core.ekumi.UnsafeContext#getExecution
	 * @model opposite="execution" containment="true"
	 * @generated
	 */
	UnsafeContext getContext();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getContext <em>Context</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(UnsafeContext value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getExecution_StartDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.kazejiyu.ekumi.core.ekumi.InterruptedExecutionException"
	 * @generated
	 */
	void join() throws InterruptedExecutionException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isCancelled();

} // Execution
