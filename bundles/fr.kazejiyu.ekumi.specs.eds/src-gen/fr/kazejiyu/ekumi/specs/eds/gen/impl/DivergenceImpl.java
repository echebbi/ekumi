/**
 */
package fr.kazejiyu.ekumi.specs.eds.gen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.kazejiyu.ekumi.specs.eds.Convergence;
import fr.kazejiyu.ekumi.specs.eds.Divergence;
import fr.kazejiyu.ekumi.specs.eds.EdsPackage;
import fr.kazejiyu.ekumi.specs.eds.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Divergence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DivergenceImpl#getConvergence <em>Convergence</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DivergenceImpl#getRoots <em>Roots</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DivergenceImpl extends StartingNodeImpl implements Divergence {
	/**
	 * The cached value of the '{@link #getConvergence() <em>Convergence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvergence()
	 * @generated
	 * @ordered
	 */
	protected Convergence convergence;

	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> roots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivergenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsPackage.Literals.DIVERGENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convergence getConvergence() {
		return convergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConvergence(Convergence newConvergence, NotificationChain msgs) {
		Convergence oldConvergence = convergence;
		convergence = newConvergence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EdsPackage.DIVERGENCE__CONVERGENCE, oldConvergence, newConvergence);
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
	public void setConvergence(Convergence newConvergence) {
		if (newConvergence != convergence) {
			NotificationChain msgs = null;
			if (convergence != null)
				msgs = ((InternalEObject) convergence).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EdsPackage.DIVERGENCE__CONVERGENCE, null, msgs);
			if (newConvergence != null)
				msgs = ((InternalEObject) newConvergence).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EdsPackage.DIVERGENCE__CONVERGENCE, null, msgs);
			msgs = basicSetConvergence(newConvergence, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsPackage.DIVERGENCE__CONVERGENCE, newConvergence,
					newConvergence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getRoots() {
		if (roots == null) {
			roots = new EObjectResolvingEList<Task>(Task.class, this, EdsPackage.DIVERGENCE__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdsPackage.DIVERGENCE__CONVERGENCE:
			return basicSetConvergence(null, msgs);
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
		case EdsPackage.DIVERGENCE__CONVERGENCE:
			return getConvergence();
		case EdsPackage.DIVERGENCE__ROOTS:
			return getRoots();
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
		case EdsPackage.DIVERGENCE__CONVERGENCE:
			setConvergence((Convergence) newValue);
			return;
		case EdsPackage.DIVERGENCE__ROOTS:
			getRoots().clear();
			getRoots().addAll((Collection<? extends Task>) newValue);
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
		case EdsPackage.DIVERGENCE__CONVERGENCE:
			setConvergence((Convergence) null);
			return;
		case EdsPackage.DIVERGENCE__ROOTS:
			getRoots().clear();
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
		case EdsPackage.DIVERGENCE__CONVERGENCE:
			return convergence != null;
		case EdsPackage.DIVERGENCE__ROOTS:
			return roots != null && !roots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DivergenceImpl
