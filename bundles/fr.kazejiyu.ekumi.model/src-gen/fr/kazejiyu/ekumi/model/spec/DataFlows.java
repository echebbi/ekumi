/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of dataflow.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getDataFlows()
 * @model
 * @generated
 */
public interface DataFlows extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Incomings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.DataFlow}.
	 * @return the value of the '<em>Incomings</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getDataFlows_Incomings()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlow> getIncomings();

} // DataFlows
