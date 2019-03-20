/**
 */
package fr.kazejiyu.ekumi.specs.eds;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Splits the execution in two or more branches that should be executed concurrently.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.specs.eds.EdsPackage#getDivergence()
 * @model abstract="true"
 * @generated
 */
public interface Divergence extends StartingNode {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Convergence</b></em>' containment reference.
	 * @return the value of the '<em>Convergence</em>' containment reference.
	 * @see #setConvergence(Convergence)
	 * @see fr.kazejiyu.ekumi.specs.eds.SpecPackage#getDivergence_Convergence()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Convergence getConvergence();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.specs.eds.Divergence#getConvergence <em>Convergence</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convergence</em>' containment reference.
	 * @see #getConvergence()
	 * @generated
	 */
	void setConvergence(Convergence value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.specs.eds.Task}.
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see fr.kazejiyu.ekumi.specs.eds.SpecPackage#getDivergence_Roots()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Task> getRoots();

} // Divergence
