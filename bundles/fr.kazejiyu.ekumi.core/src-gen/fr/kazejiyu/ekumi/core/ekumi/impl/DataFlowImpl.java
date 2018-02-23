/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.Data;
import fr.kazejiyu.ekumi.core.ekumi.DataFlow;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl#getInput <em>Input</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowImpl extends MinimalEObjectImpl.Container implements DataFlow {
	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Task destination;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Data input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Data output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EkumiPackage.Literals.DATA_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getSource() {
		if (eContainerFeatureID() != EkumiPackage.DATA_FLOW__SOURCE)
			return null;
		return (Task) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Task newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSource, EkumiPackage.DATA_FLOW__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Task newSource) {
		if (newSource != eInternalContainer()
				|| (eContainerFeatureID() != EkumiPackage.DATA_FLOW__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, EkumiPackage.TASK__OUTGOING_FLOWS, Task.class,
						msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.DATA_FLOW__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject) destination;
			destination = (Task) eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.DATA_FLOW__DESTINATION,
							oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Task newDestination, NotificationChain msgs) {
		Task oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EkumiPackage.DATA_FLOW__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(Task newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject) destination).eInverseRemove(this, EkumiPackage.TASK__INCOMING_FLOWS,
						Task.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject) newDestination).eInverseAdd(this, EkumiPackage.TASK__INCOMING_FLOWS,
						Task.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.DATA_FLOW__DESTINATION, newDestination,
					newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject) input;
			input = (Data) eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.DATA_FLOW__INPUT, oldInput,
							input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Data newInput) {
		Data oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.DATA_FLOW__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (Data) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.DATA_FLOW__OUTPUT, oldOutput,
							output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Data newOutput) {
		Data oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.DATA_FLOW__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EkumiPackage.DATA_FLOW__SOURCE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSource((Task) otherEnd, msgs);
		case EkumiPackage.DATA_FLOW__DESTINATION:
			if (destination != null)
				msgs = ((InternalEObject) destination).eInverseRemove(this, EkumiPackage.TASK__INCOMING_FLOWS,
						Task.class, msgs);
			return basicSetDestination((Task) otherEnd, msgs);
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
		case EkumiPackage.DATA_FLOW__SOURCE:
			return basicSetSource(null, msgs);
		case EkumiPackage.DATA_FLOW__DESTINATION:
			return basicSetDestination(null, msgs);
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
		case EkumiPackage.DATA_FLOW__SOURCE:
			return eInternalContainer().eInverseRemove(this, EkumiPackage.TASK__OUTGOING_FLOWS, Task.class, msgs);
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
		case EkumiPackage.DATA_FLOW__SOURCE:
			return getSource();
		case EkumiPackage.DATA_FLOW__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		case EkumiPackage.DATA_FLOW__INPUT:
			if (resolve)
				return getInput();
			return basicGetInput();
		case EkumiPackage.DATA_FLOW__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EkumiPackage.DATA_FLOW__SOURCE:
			setSource((Task) newValue);
			return;
		case EkumiPackage.DATA_FLOW__DESTINATION:
			setDestination((Task) newValue);
			return;
		case EkumiPackage.DATA_FLOW__INPUT:
			setInput((Data) newValue);
			return;
		case EkumiPackage.DATA_FLOW__OUTPUT:
			setOutput((Data) newValue);
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
		case EkumiPackage.DATA_FLOW__SOURCE:
			setSource((Task) null);
			return;
		case EkumiPackage.DATA_FLOW__DESTINATION:
			setDestination((Task) null);
			return;
		case EkumiPackage.DATA_FLOW__INPUT:
			setInput((Data) null);
			return;
		case EkumiPackage.DATA_FLOW__OUTPUT:
			setOutput((Data) null);
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
		case EkumiPackage.DATA_FLOW__SOURCE:
			return getSource() != null;
		case EkumiPackage.DATA_FLOW__DESTINATION:
			return destination != null;
		case EkumiPackage.DATA_FLOW__INPUT:
			return input != null;
		case EkumiPackage.DATA_FLOW__OUTPUT:
			return output != null;
		}
		return super.eIsSet(featureID);
	}

} //DataFlowImpl
