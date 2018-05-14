/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Data;
import fr.kazejiyu.ekumi.core.ekumi.DataFlows;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Status;

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> successors;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Activity predecessor;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.IDLE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlows> flows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EkumiPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.ACTIVITY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<Data>(Data.class, this, EkumiPackage.ACTIVITY__INPUTS,
					EkumiPackage.DATA__OWNER);
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
			outputs = new EObjectContainmentEList<Data>(Data.class, this, EkumiPackage.ACTIVITY__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getSuccessors() {
		if (successors == null) {
			successors = new EObjectWithInverseResolvingEList<Activity>(Activity.class, this,
					EkumiPackage.ACTIVITY__SUCCESSORS, EkumiPackage.ACTIVITY__PREDECESSOR);
		}
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject) predecessor;
			predecessor = (Activity) eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.ACTIVITY__PREDECESSOR,
							oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(Activity newPredecessor, NotificationChain msgs) {
		Activity oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EkumiPackage.ACTIVITY__PREDECESSOR, oldPredecessor, newPredecessor);
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
	public void setPredecessor(Activity newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null)
				msgs = ((InternalEObject) predecessor).eInverseRemove(this, EkumiPackage.ACTIVITY__SUCCESSORS,
						Activity.class, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject) newPredecessor).eInverseAdd(this, EkumiPackage.ACTIVITY__SUCCESSORS,
						Activity.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.ACTIVITY__PREDECESSOR, newPredecessor,
					newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.ACTIVITY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlows> getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList<DataFlows>(DataFlows.class, this, EkumiPackage.ACTIVITY__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run(Context context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case EkumiPackage.ACTIVITY__INPUTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputs()).basicAdd(otherEnd, msgs);
		case EkumiPackage.ACTIVITY__SUCCESSORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuccessors()).basicAdd(otherEnd, msgs);
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			if (predecessor != null)
				msgs = ((InternalEObject) predecessor).eInverseRemove(this, EkumiPackage.ACTIVITY__SUCCESSORS,
						Activity.class, msgs);
			return basicSetPredecessor((Activity) otherEnd, msgs);
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
		case EkumiPackage.ACTIVITY__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case EkumiPackage.ACTIVITY__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case EkumiPackage.ACTIVITY__SUCCESSORS:
			return ((InternalEList<?>) getSuccessors()).basicRemove(otherEnd, msgs);
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			return basicSetPredecessor(null, msgs);
		case EkumiPackage.ACTIVITY__FLOWS:
			return ((InternalEList<?>) getFlows()).basicRemove(otherEnd, msgs);
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
		case EkumiPackage.ACTIVITY__ID:
			return getId();
		case EkumiPackage.ACTIVITY__NAME:
			return getName();
		case EkumiPackage.ACTIVITY__INPUTS:
			return getInputs();
		case EkumiPackage.ACTIVITY__OUTPUTS:
			return getOutputs();
		case EkumiPackage.ACTIVITY__SUCCESSORS:
			return getSuccessors();
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			if (resolve)
				return getPredecessor();
			return basicGetPredecessor();
		case EkumiPackage.ACTIVITY__STATUS:
			return getStatus();
		case EkumiPackage.ACTIVITY__FLOWS:
			return getFlows();
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
		case EkumiPackage.ACTIVITY__ID:
			setId((String) newValue);
			return;
		case EkumiPackage.ACTIVITY__NAME:
			setName((String) newValue);
			return;
		case EkumiPackage.ACTIVITY__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Data>) newValue);
			return;
		case EkumiPackage.ACTIVITY__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Data>) newValue);
			return;
		case EkumiPackage.ACTIVITY__SUCCESSORS:
			getSuccessors().clear();
			getSuccessors().addAll((Collection<? extends Activity>) newValue);
			return;
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			setPredecessor((Activity) newValue);
			return;
		case EkumiPackage.ACTIVITY__STATUS:
			setStatus((Status) newValue);
			return;
		case EkumiPackage.ACTIVITY__FLOWS:
			getFlows().clear();
			getFlows().addAll((Collection<? extends DataFlows>) newValue);
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
		case EkumiPackage.ACTIVITY__ID:
			setId(ID_EDEFAULT);
			return;
		case EkumiPackage.ACTIVITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EkumiPackage.ACTIVITY__INPUTS:
			getInputs().clear();
			return;
		case EkumiPackage.ACTIVITY__OUTPUTS:
			getOutputs().clear();
			return;
		case EkumiPackage.ACTIVITY__SUCCESSORS:
			getSuccessors().clear();
			return;
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			setPredecessor((Activity) null);
			return;
		case EkumiPackage.ACTIVITY__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case EkumiPackage.ACTIVITY__FLOWS:
			getFlows().clear();
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
		case EkumiPackage.ACTIVITY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EkumiPackage.ACTIVITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EkumiPackage.ACTIVITY__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case EkumiPackage.ACTIVITY__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case EkumiPackage.ACTIVITY__SUCCESSORS:
			return successors != null && !successors.isEmpty();
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			return predecessor != null;
		case EkumiPackage.ACTIVITY__STATUS:
			return status != STATUS_EDEFAULT;
		case EkumiPackage.ACTIVITY__FLOWS:
			return flows != null && !flows.isEmpty();
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
		case EkumiPackage.ACTIVITY___RUN__CONTEXT:
			run((Context) arguments.get(0));
			return null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
