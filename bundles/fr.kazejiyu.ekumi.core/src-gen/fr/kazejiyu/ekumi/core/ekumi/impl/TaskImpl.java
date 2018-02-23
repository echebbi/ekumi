/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.Data;
import fr.kazejiyu.ekumi.core.ekumi.DataFlow;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Join;
import fr.kazejiyu.ekumi.core.ekumi.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected Join join;

	/**
	 * The cached value of the '{@link #getOutgoingFlows() <em>Outgoing Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> outgoingFlows;

	/**
	 * The cached value of the '{@link #getIncomingFlows() <em>Incoming Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> incomingFlows;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> outputs;

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
		return EkumiPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join getJoin() {
		if (join != null && join.eIsProxy()) {
			InternalEObject oldJoin = (InternalEObject) join;
			join = (Join) eResolveProxy(oldJoin);
			if (join != oldJoin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.TASK__JOIN, oldJoin, join));
			}
		}
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join basicGetJoin() {
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoin(Join newJoin, NotificationChain msgs) {
		Join oldJoin = join;
		join = newJoin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EkumiPackage.TASK__JOIN,
					oldJoin, newJoin);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(Join newJoin) {
		if (newJoin != join) {
			NotificationChain msgs = null;
			if (join != null)
				msgs = ((InternalEObject) join).eInverseRemove(this, EkumiPackage.JOIN__PREDECESSOR, Join.class, msgs);
			if (newJoin != null)
				msgs = ((InternalEObject) newJoin).eInverseAdd(this, EkumiPackage.JOIN__PREDECESSOR, Join.class, msgs);
			msgs = basicSetJoin(newJoin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.TASK__JOIN, newJoin, newJoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getOutgoingFlows() {
		if (outgoingFlows == null) {
			outgoingFlows = new EObjectContainmentWithInverseEList<DataFlow>(DataFlow.class, this,
					EkumiPackage.TASK__OUTGOING_FLOWS, EkumiPackage.DATA_FLOW__SOURCE);
		}
		return outgoingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getIncomingFlows() {
		if (incomingFlows == null) {
			incomingFlows = new EObjectWithInverseResolvingEList<DataFlow>(DataFlow.class, this,
					EkumiPackage.TASK__INCOMING_FLOWS, EkumiPackage.DATA_FLOW__DESTINATION);
		}
		return incomingFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Data>(Data.class, this, EkumiPackage.TASK__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Data>(Data.class, this, EkumiPackage.TASK__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EkumiPackage.TASK__JOIN:
			if (join != null)
				msgs = ((InternalEObject) join).eInverseRemove(this, EkumiPackage.JOIN__PREDECESSOR, Join.class, msgs);
			return basicSetJoin((Join) otherEnd, msgs);
		case EkumiPackage.TASK__OUTGOING_FLOWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingFlows()).basicAdd(otherEnd, msgs);
		case EkumiPackage.TASK__INCOMING_FLOWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingFlows()).basicAdd(otherEnd, msgs);
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
		case EkumiPackage.TASK__JOIN:
			return basicSetJoin(null, msgs);
		case EkumiPackage.TASK__OUTGOING_FLOWS:
			return ((InternalEList<?>) getOutgoingFlows()).basicRemove(otherEnd, msgs);
		case EkumiPackage.TASK__INCOMING_FLOWS:
			return ((InternalEList<?>) getIncomingFlows()).basicRemove(otherEnd, msgs);
		case EkumiPackage.TASK__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case EkumiPackage.TASK__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EkumiPackage.TASK__ID:
			return getId();
		case EkumiPackage.TASK__NAME:
			return getName();
		case EkumiPackage.TASK__JOIN:
			if (resolve)
				return getJoin();
			return basicGetJoin();
		case EkumiPackage.TASK__OUTGOING_FLOWS:
			return getOutgoingFlows();
		case EkumiPackage.TASK__INCOMING_FLOWS:
			return getIncomingFlows();
		case EkumiPackage.TASK__INPUTS:
			return getInputs();
		case EkumiPackage.TASK__OUTPUTS:
			return getOutputs();
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
		case EkumiPackage.TASK__ID:
			setId((String) newValue);
			return;
		case EkumiPackage.TASK__NAME:
			setName((String) newValue);
			return;
		case EkumiPackage.TASK__JOIN:
			setJoin((Join) newValue);
			return;
		case EkumiPackage.TASK__OUTGOING_FLOWS:
			getOutgoingFlows().clear();
			getOutgoingFlows().addAll((Collection<? extends DataFlow>) newValue);
			return;
		case EkumiPackage.TASK__INCOMING_FLOWS:
			getIncomingFlows().clear();
			getIncomingFlows().addAll((Collection<? extends DataFlow>) newValue);
			return;
		case EkumiPackage.TASK__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Data>) newValue);
			return;
		case EkumiPackage.TASK__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Data>) newValue);
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
		case EkumiPackage.TASK__ID:
			setId(ID_EDEFAULT);
			return;
		case EkumiPackage.TASK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EkumiPackage.TASK__JOIN:
			setJoin((Join) null);
			return;
		case EkumiPackage.TASK__OUTGOING_FLOWS:
			getOutgoingFlows().clear();
			return;
		case EkumiPackage.TASK__INCOMING_FLOWS:
			getIncomingFlows().clear();
			return;
		case EkumiPackage.TASK__INPUTS:
			getInputs().clear();
			return;
		case EkumiPackage.TASK__OUTPUTS:
			getOutputs().clear();
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
		case EkumiPackage.TASK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EkumiPackage.TASK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EkumiPackage.TASK__JOIN:
			return join != null;
		case EkumiPackage.TASK__OUTGOING_FLOWS:
			return outgoingFlows != null && !outgoingFlows.isEmpty();
		case EkumiPackage.TASK__INCOMING_FLOWS:
			return incomingFlows != null && !incomingFlows.isEmpty();
		case EkumiPackage.TASK__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case EkumiPackage.TASK__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
