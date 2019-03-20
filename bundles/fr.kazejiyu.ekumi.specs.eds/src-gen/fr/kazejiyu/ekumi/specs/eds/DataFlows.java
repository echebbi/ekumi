/**
 */
package fr.kazejiyu.ekumi.specs.eds;

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
 * @see fr.kazejiyu.ekumi.specs.eds.EdsPackage#getDataFlows()
 * @model
 * @generated
 */
public interface DataFlows extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Incomings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.specs.eds.DataFlow}.
	 * @return the value of the '<em>Incomings</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.specs.eds.SpecPackage#getDataFlows_Incomings()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlow> getIncomings();

} // DataFlows
