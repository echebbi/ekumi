/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.DataFlows;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Executable;
import fr.kazejiyu.ekumi.core.ekumi.HasStatus;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl#getFlows <em>Flows</em>}</li>
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
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected Activity successor;

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
		setFlows(EkumiFactory.eINSTANCE.createDataFlows());
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
	public EList<Variable> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this,
					EkumiPackage.ACTIVITY__INPUTS, EkumiPackage.VARIABLE__OWNER);
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
			outputs = new EObjectContainmentEList<Variable>(Variable.class, this, EkumiPackage.ACTIVITY__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject) successor;
			successor = (Activity) eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.ACTIVITY__SUCCESSOR,
							oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSuccessor() {
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
					EkumiPackage.ACTIVITY__SUCCESSOR, oldSuccessor, newSuccessor);
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
				msgs = ((InternalEObject) successor).eInverseRemove(this, EkumiPackage.ACTIVITY__PREDECESSOR,
						Activity.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject) newSuccessor).eInverseAdd(this, EkumiPackage.ACTIVITY__PREDECESSOR,
						Activity.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.ACTIVITY__SUCCESSOR, newSuccessor,
					newSuccessor));
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
				msgs = ((InternalEObject) predecessor).eInverseRemove(this, EkumiPackage.ACTIVITY__SUCCESSOR,
						Activity.class, msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject) newPredecessor).eInverseAdd(this, EkumiPackage.ACTIVITY__SUCCESSOR,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EkumiPackage.ACTIVITY__FLOWS,
					oldFlows, newFlows);
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
				msgs = ((InternalEObject) flows).eInverseRemove(this, EkumiPackage.DATA_FLOWS__OWNER, DataFlows.class,
						msgs);
			if (newFlows != null)
				msgs = ((InternalEObject) newFlows).eInverseAdd(this, EkumiPackage.DATA_FLOWS__OWNER, DataFlows.class,
						msgs);
			msgs = basicSetFlows(newFlows, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.ACTIVITY__FLOWS, newFlows, newFlows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void run(Context context) {
		//		context.events().started(this);
		//		
		//		setStatus(RUNNING);s
		//		doRun();
		//		
		//		if (status == SUCCEEDED)
		//			context.events().finished(this);
		//		else if (status == FAILED)
		//			context.events().failed(this);

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
		case EkumiPackage.ACTIVITY__SUCCESSOR:
			if (successor != null)
				msgs = ((InternalEObject) successor).eInverseRemove(this, EkumiPackage.ACTIVITY__PREDECESSOR,
						Activity.class, msgs);
			return basicSetSuccessor((Activity) otherEnd, msgs);
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			if (predecessor != null)
				msgs = ((InternalEObject) predecessor).eInverseRemove(this, EkumiPackage.ACTIVITY__SUCCESSOR,
						Activity.class, msgs);
			return basicSetPredecessor((Activity) otherEnd, msgs);
		case EkumiPackage.ACTIVITY__FLOWS:
			if (flows != null)
				msgs = ((InternalEObject) flows).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.ACTIVITY__FLOWS, null, msgs);
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
		case EkumiPackage.ACTIVITY__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case EkumiPackage.ACTIVITY__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case EkumiPackage.ACTIVITY__SUCCESSOR:
			return basicSetSuccessor(null, msgs);
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			return basicSetPredecessor(null, msgs);
		case EkumiPackage.ACTIVITY__FLOWS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EkumiPackage.ACTIVITY__STATUS:
			return getStatus();
		case EkumiPackage.ACTIVITY__INPUTS:
			return getInputs();
		case EkumiPackage.ACTIVITY__OUTPUTS:
			return getOutputs();
		case EkumiPackage.ACTIVITY__SUCCESSOR:
			if (resolve)
				return getSuccessor();
			return basicGetSuccessor();
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			if (resolve)
				return getPredecessor();
			return basicGetPredecessor();
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
		case EkumiPackage.ACTIVITY__STATUS:
			setStatus((Status) newValue);
			return;
		case EkumiPackage.ACTIVITY__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Variable>) newValue);
			return;
		case EkumiPackage.ACTIVITY__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Variable>) newValue);
			return;
		case EkumiPackage.ACTIVITY__SUCCESSOR:
			setSuccessor((Activity) newValue);
			return;
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			setPredecessor((Activity) newValue);
			return;
		case EkumiPackage.ACTIVITY__FLOWS:
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
		case EkumiPackage.ACTIVITY__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case EkumiPackage.ACTIVITY__INPUTS:
			getInputs().clear();
			return;
		case EkumiPackage.ACTIVITY__OUTPUTS:
			getOutputs().clear();
			return;
		case EkumiPackage.ACTIVITY__SUCCESSOR:
			setSuccessor((Activity) null);
			return;
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			setPredecessor((Activity) null);
			return;
		case EkumiPackage.ACTIVITY__FLOWS:
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
		case EkumiPackage.ACTIVITY__STATUS:
			return status != STATUS_EDEFAULT;
		case EkumiPackage.ACTIVITY__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case EkumiPackage.ACTIVITY__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case EkumiPackage.ACTIVITY__SUCCESSOR:
			return successor != null;
		case EkumiPackage.ACTIVITY__PREDECESSOR:
			return predecessor != null;
		case EkumiPackage.ACTIVITY__FLOWS:
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
			case EkumiPackage.ACTIVITY__STATUS:
				return EkumiPackage.HAS_STATUS__STATUS;
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
			case EkumiPackage.HAS_STATUS__STATUS:
				return EkumiPackage.ACTIVITY__STATUS;
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
			case EkumiPackage.EXECUTABLE___RUN__CONTEXT:
				return EkumiPackage.ACTIVITY___RUN__CONTEXT;
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
