/**
 */
package fr.kazejiyu.ekumi.core.workflow.gen.impl;

import org.eclipse.emf.ecore.EClass;

import fr.kazejiyu.ekumi.core.workflow.Task;
import fr.kazejiyu.ekumi.core.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TaskImpl extends ActivityImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.TASK;
	}

} //TaskImpl
