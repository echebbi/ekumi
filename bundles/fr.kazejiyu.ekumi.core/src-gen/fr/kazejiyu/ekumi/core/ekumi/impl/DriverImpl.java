/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Driver;
import fr.kazejiyu.ekumi.core.ekumi.DriverRunner;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DriverImpl#getDriven <em>Driven</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DriverImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriverImpl extends ActivityImpl implements Driver {
	/**
	 * The cached value of the '{@link #getDriven() <em>Driven</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriven()
	 * @generated
	 * @ordered
	 */
	protected Activity driven;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected DriverRunner script;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EkumiPackage.Literals.DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getDriven() {
		return driven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriven(Activity newDriven, NotificationChain msgs) {
		Activity oldDriven = driven;
		driven = newDriven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EkumiPackage.DRIVER__DRIVEN,
					oldDriven, newDriven);
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
	public void setDriven(Activity newDriven) {
		if (newDriven != driven) {
			NotificationChain msgs = null;
			if (driven != null)
				msgs = ((InternalEObject) driven).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.DRIVER__DRIVEN, null, msgs);
			if (newDriven != null)
				msgs = ((InternalEObject) newDriven).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.DRIVER__DRIVEN, null, msgs);
			msgs = basicSetDriven(newDriven, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.DRIVER__DRIVEN, newDriven, newDriven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverRunner getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(DriverRunner newScript, NotificationChain msgs) {
		DriverRunner oldScript = script;
		script = newScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EkumiPackage.DRIVER__SCRIPT,
					oldScript, newScript);
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
	public void setScript(DriverRunner newScript) {
		if (newScript != script) {
			NotificationChain msgs = null;
			if (script != null)
				msgs = ((InternalEObject) script).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.DRIVER__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject) newScript).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.DRIVER__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.DRIVER__SCRIPT, newScript, newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EkumiPackage.DRIVER__DRIVEN:
			return basicSetDriven(null, msgs);
		case EkumiPackage.DRIVER__SCRIPT:
			return basicSetScript(null, msgs);
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
		case EkumiPackage.DRIVER__DRIVEN:
			return getDriven();
		case EkumiPackage.DRIVER__SCRIPT:
			return getScript();
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
		case EkumiPackage.DRIVER__DRIVEN:
			setDriven((Activity) newValue);
			return;
		case EkumiPackage.DRIVER__SCRIPT:
			setScript((DriverRunner) newValue);
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
		case EkumiPackage.DRIVER__DRIVEN:
			setDriven((Activity) null);
			return;
		case EkumiPackage.DRIVER__SCRIPT:
			setScript((DriverRunner) null);
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
		case EkumiPackage.DRIVER__DRIVEN:
			return driven != null;
		case EkumiPackage.DRIVER__SCRIPT:
			return script != null;
		}
		return super.eIsSet(featureID);
	}

} //DriverImpl
