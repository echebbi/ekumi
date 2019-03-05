/**
 */
package fr.kazejiyu.ekumi.model.workflow.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.DataFlows;
import fr.kazejiyu.ekumi.model.workflow.Executable;
import fr.kazejiyu.ekumi.model.workflow.HasStatus;
import fr.kazejiyu.ekumi.model.workflow.Status;
import fr.kazejiyu.ekumi.model.workflow.Variable;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends IdentifiableImpl implements Activity {
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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> outputs;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Activity successor;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected DataFlows flows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ActivityImpl() {
		super();
		setFlows(WorkflowFactory.eINSTANCE.createDataFlows());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this,
					WorkflowPackage.ACTIVITY__INPUTS, WorkflowPackage.VARIABLE__OWNER);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Variable>(Variable.class, this, WorkflowPackage.ACTIVITY__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(Activity newSuccessor, NotificationChain msgs) {
		Activity oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.ACTIVITY__SUCCESSOR, oldSuccessor, newSuccessor);
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
	public void setSuccessor(Activity newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject) successor).eInverseRemove(this, WorkflowPackage.ACTIVITY__PREDECESSOR,
						Activity.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject) newSuccessor).eInverseAdd(this, WorkflowPackage.ACTIVITY__PREDECESSOR,
						Activity.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__SUCCESSOR, newSuccessor,
					newSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getPredecessor() {
		if (eContainerFeatureID() != WorkflowPackage.ACTIVITY__PREDECESSOR)
			return null;
		return (Activity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(Activity newPredecessor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPredecessor, WorkflowPackage.ACTIVITY__PREDECESSOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(Activity newPredecessor) {
		if (newPredecessor != eInternalContainer()
				|| (eContainerFeatureID() != WorkflowPackage.ACTIVITY__PREDECESSOR && newPredecessor != null)) {
			if (EcoreUtil.isAncestor(this, newPredecessor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject) newPredecessor).eInverseAdd(this, WorkflowPackage.ACTIVITY__SUCCESSOR,
						Activity.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__PREDECESSOR, newPredecessor,
					newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlows getFlows() {
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlows(DataFlows newFlows, NotificationChain msgs) {
		DataFlows oldFlows = flows;
		flows = newFlows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.ACTIVITY__FLOWS, oldFlows, newFlows);
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
	public void setFlows(DataFlows newFlows) {
		if (newFlows != flows) {
			NotificationChain msgs = null;
			if (flows != null)
				msgs = ((InternalEObject) flows).eInverseRemove(this, WorkflowPackage.DATA_FLOWS__OWNER,
						DataFlows.class, msgs);
			if (newFlows != null)
				msgs = ((InternalEObject) newFlows).eInverseAdd(this, WorkflowPackage.DATA_FLOWS__OWNER,
						DataFlows.class, msgs);
			msgs = basicSetFlows(newFlows, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__FLOWS, newFlows, newFlows));
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
		case WorkflowPackage.ACTIVITY__INPUTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputs()).basicAdd(otherEnd, msgs);
		case WorkflowPackage.ACTIVITY__SUCCESSOR:
			if (successor != null)
				msgs = ((InternalEObject) successor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.ACTIVITY__SUCCESSOR, null, msgs);
			return basicSetSuccessor((Activity) otherEnd, msgs);
		case WorkflowPackage.ACTIVITY__PREDECESSOR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPredecessor((Activity) otherEnd, msgs);
		case WorkflowPackage.ACTIVITY__FLOWS:
			if (flows != null)
				msgs = ((InternalEObject) flows).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.ACTIVITY__FLOWS, null, msgs);
			return basicSetFlows((DataFlows) otherEnd, msgs);
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
		case WorkflowPackage.ACTIVITY__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.ACTIVITY__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.ACTIVITY__SUCCESSOR:
			return basicSetSuccessor(null, msgs);
		case WorkflowPackage.ACTIVITY__PREDECESSOR:
			return basicSetPredecessor(null, msgs);
		case WorkflowPackage.ACTIVITY__FLOWS:
			return basicSetFlows(null, msgs);
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
		case WorkflowPackage.ACTIVITY__PREDECESSOR:
			return eInternalContainer().eInverseRemove(this, WorkflowPackage.ACTIVITY__SUCCESSOR, Activity.class, msgs);
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
		case WorkflowPackage.ACTIVITY__STATUS:
			return getStatus();
		case WorkflowPackage.ACTIVITY__INPUTS:
			return getInputs();
		case WorkflowPackage.ACTIVITY__OUTPUTS:
			return getOutputs();
		case WorkflowPackage.ACTIVITY__SUCCESSOR:
			return getSuccessor();
		case WorkflowPackage.ACTIVITY__PREDECESSOR:
			return getPredecessor();
		case WorkflowPackage.ACTIVITY__FLOWS:
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
		case WorkflowPackage.ACTIVITY__STATUS:
			setStatus((Status) newValue);
			return;
		case WorkflowPackage.ACTIVITY__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Variable>) newValue);
			return;
		case WorkflowPackage.ACTIVITY__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Variable>) newValue);
			return;
		case WorkflowPackage.ACTIVITY__SUCCESSOR:
			setSuccessor((Activity) newValue);
			return;
		case WorkflowPackage.ACTIVITY__PREDECESSOR:
			setPredecessor((Activity) newValue);
			return;
		case WorkflowPackage.ACTIVITY__FLOWS:
			setFlows((DataFlows) newValue);
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
		case WorkflowPackage.ACTIVITY__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case WorkflowPackage.ACTIVITY__INPUTS:
			getInputs().clear();
			return;
		case WorkflowPackage.ACTIVITY__OUTPUTS:
			getOutputs().clear();
			return;
		case WorkflowPackage.ACTIVITY__SUCCESSOR:
			setSuccessor((Activity) null);
			return;
		case WorkflowPackage.ACTIVITY__PREDECESSOR:
			setPredecessor((Activity) null);
			return;
		case WorkflowPackage.ACTIVITY__FLOWS:
			setFlows((DataFlows) null);
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
		case WorkflowPackage.ACTIVITY__STATUS:
			return status != STATUS_EDEFAULT;
		case WorkflowPackage.ACTIVITY__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case WorkflowPackage.ACTIVITY__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case WorkflowPackage.ACTIVITY__SUCCESSOR:
			return successor != null;
		case WorkflowPackage.ACTIVITY__PREDECESSOR:
			return getPredecessor() != null;
		case WorkflowPackage.ACTIVITY__FLOWS:
			return flows != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Executable.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == HasStatus.class) {
			switch (derivedFeatureID) {
			case WorkflowPackage.ACTIVITY__STATUS:
				return WorkflowPackage.HAS_STATUS__STATUS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Executable.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == HasStatus.class) {
			switch (baseFeatureID) {
			case WorkflowPackage.HAS_STATUS__STATUS:
				return WorkflowPackage.ACTIVITY__STATUS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Executable.class) {
			switch (baseOperationID) {
			case WorkflowPackage.EXECUTABLE___RUN__CONTEXT:
				return WorkflowPackage.ACTIVITY___RUN__CONTEXT;
			default:
				return -1;
			}
		}
		if (baseClass == HasStatus.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case WorkflowPackage.ACTIVITY___RUN__CONTEXT:
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
