/**
 */
package fr.kazejiyu.ekumi.model.workflow.impl;

import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.model.execution.events.Events;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.workflow.UnsafeContext;
import fr.kazejiyu.ekumi.model.workflow.Variable;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unsafe Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.UnsafeContextImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.UnsafeContextImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.UnsafeContextImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.UnsafeContextImpl#getExecutionStatus <em>Execution Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnsafeContextImpl extends MinimalEObjectImpl.Container implements UnsafeContext {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The default value of the '{@link #getEvents() <em>Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected static final Events EVENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected Events events = EVENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionStatus() <em>Execution Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionStatus EXECUTION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionStatus() <em>Execution Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStatus()
	 * @generated
	 * @ordered
	 */
	protected ExecutionStatus executionStatus = EXECUTION_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsafeContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.UNSAFE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this,
					WorkflowPackage.UNSAFE_CONTEXT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution getExecution() {
		if (eContainerFeatureID() != WorkflowPackage.UNSAFE_CONTEXT__EXECUTION)
			return null;
		return (Execution) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecution(Execution newExecution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newExecution, WorkflowPackage.UNSAFE_CONTEXT__EXECUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecution(Execution newExecution) {
		if (newExecution != eInternalContainer()
				|| (eContainerFeatureID() != WorkflowPackage.UNSAFE_CONTEXT__EXECUTION && newExecution != null)) {
			if (EcoreUtil.isAncestor(this, newExecution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExecution != null)
				msgs = ((InternalEObject) newExecution).eInverseAdd(this, WorkflowPackage.EXECUTION__CONTEXT,
						Execution.class, msgs);
			msgs = basicSetExecution(newExecution, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.UNSAFE_CONTEXT__EXECUTION,
					newExecution, newExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Events getEvents() {
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvents(Events newEvents) {
		Events oldEvents = events;
		events = newEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.UNSAFE_CONTEXT__EVENTS, oldEvents,
					events));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionStatus getExecutionStatus() {
		return executionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionStatus(ExecutionStatus newExecutionStatus) {
		ExecutionStatus oldExecutionStatus = executionStatus;
		executionStatus = newExecutionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.UNSAFE_CONTEXT__EXECUTION_STATUS,
					oldExecutionStatus, executionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context safe() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetExecution((Execution) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.UNSAFE_CONTEXT__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION:
			return basicSetExecution(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION:
			return eInternalContainer().eInverseRemove(this, WorkflowPackage.EXECUTION__CONTEXT, Execution.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.UNSAFE_CONTEXT__VARIABLES:
			return getVariables();
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION:
			return getExecution();
		case WorkflowPackage.UNSAFE_CONTEXT__EVENTS:
			return getEvents();
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION_STATUS:
			return getExecutionStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.UNSAFE_CONTEXT__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION:
			setExecution((Execution) newValue);
			return;
		case WorkflowPackage.UNSAFE_CONTEXT__EVENTS:
			setEvents((Events) newValue);
			return;
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION_STATUS:
			setExecutionStatus((ExecutionStatus) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WorkflowPackage.UNSAFE_CONTEXT__VARIABLES:
			getVariables().clear();
			return;
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION:
			setExecution((Execution) null);
			return;
		case WorkflowPackage.UNSAFE_CONTEXT__EVENTS:
			setEvents(EVENTS_EDEFAULT);
			return;
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION_STATUS:
			setExecutionStatus(EXECUTION_STATUS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WorkflowPackage.UNSAFE_CONTEXT__VARIABLES:
			return variables != null && !variables.isEmpty();
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION:
			return getExecution() != null;
		case WorkflowPackage.UNSAFE_CONTEXT__EVENTS:
			return EVENTS_EDEFAULT == null ? events != null : !EVENTS_EDEFAULT.equals(events);
		case WorkflowPackage.UNSAFE_CONTEXT__EXECUTION_STATUS:
			return EXECUTION_STATUS_EDEFAULT == null ? executionStatus != null
					: !EXECUTION_STATUS_EDEFAULT.equals(executionStatus);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case WorkflowPackage.UNSAFE_CONTEXT___SAFE:
			return safe();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (events: ");
		result.append(events);
		result.append(", executionStatus: ");
		result.append(executionStatus);
		result.append(')');
		return result.toString();
	}

} //UnsafeContextImpl
