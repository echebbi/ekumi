/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import static java.util.Objects.requireNonNull;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.ekumi.Variable;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.execution.events.impl.BasicEvents;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ContextImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.ContextImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {

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
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected Execution execution;

	@Override
	public boolean contains(String name) {
		return get(name).isPresent();
	}

	@Override
	public Optional<Variable> get(String name) {
		return getVariables().stream().filter(var -> var.getName().equals(name)).findAny();
	}

	@Override
	public void set(String name, Object value) {
		if (contains(name)) {
			get(name).ifPresent(var -> var.setValue(value));
		} else {
			Variable var = EkumiFactory.eINSTANCE.createVariable();
			var.setName(requireNonNull(name));
			var.setValue(value);
			getVariables().add(var);
		}
	}

	@Override
	public void unset(String name) {
		get(name).ifPresent(var -> getVariables().remove(var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EkumiPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, EkumiPackage.CONTEXT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution getExecution() {
		if (execution != null && execution.eIsProxy()) {
			InternalEObject oldExecution = (InternalEObject) execution;
			execution = (Execution) eResolveProxy(oldExecution);
			if (execution != oldExecution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.CONTEXT__EXECUTION,
							oldExecution, execution));
			}
		}
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution basicGetExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecution(Execution newExecution, NotificationChain msgs) {
		Execution oldExecution = execution;
		execution = newExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EkumiPackage.CONTEXT__EXECUTION, oldExecution, newExecution);
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
	public void setExecution(Execution newExecution) {
		if (newExecution != execution) {
			NotificationChain msgs = null;
			if (execution != null)
				msgs = ((InternalEObject) execution).eInverseRemove(this, EkumiPackage.EXECUTION__CONTEXT,
						Execution.class, msgs);
			if (newExecution != null)
				msgs = ((InternalEObject) newExecution).eInverseAdd(this, EkumiPackage.EXECUTION__CONTEXT,
						Execution.class, msgs);
			msgs = basicSetExecution(newExecution, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.CONTEXT__EXECUTION, newExecution,
					newExecution));
	}

	private Events events = new BasicEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Events events() {
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EkumiPackage.CONTEXT__EXECUTION:
			if (execution != null)
				msgs = ((InternalEObject) execution).eInverseRemove(this, EkumiPackage.EXECUTION__CONTEXT,
						Execution.class, msgs);
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
		case EkumiPackage.CONTEXT__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
		case EkumiPackage.CONTEXT__EXECUTION:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EkumiPackage.CONTEXT__VARIABLES:
			return getVariables();
		case EkumiPackage.CONTEXT__EXECUTION:
			if (resolve)
				return getExecution();
			return basicGetExecution();
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
		case EkumiPackage.CONTEXT__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case EkumiPackage.CONTEXT__EXECUTION:
			setExecution((Execution) newValue);
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
		case EkumiPackage.CONTEXT__VARIABLES:
			getVariables().clear();
			return;
		case EkumiPackage.CONTEXT__EXECUTION:
			setExecution((Execution) null);
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
		case EkumiPackage.CONTEXT__VARIABLES:
			return variables != null && !variables.isEmpty();
		case EkumiPackage.CONTEXT__EXECUTION:
			return execution != null;
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
		case EkumiPackage.CONTEXT___EVENTS:
			return events();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContextImpl
