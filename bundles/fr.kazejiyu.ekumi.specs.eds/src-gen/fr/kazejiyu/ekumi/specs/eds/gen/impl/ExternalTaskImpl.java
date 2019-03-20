/**
 */
package fr.kazejiyu.ekumi.specs.eds.gen.impl;

import fr.kazejiyu.ekumi.specs.eds.EdsPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.kazejiyu.ekumi.specs.eds.ExternalTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ExternalTaskImpl#getLanguageId <em>Language Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ExternalTaskImpl#getScriptId <em>Script Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalTaskImpl extends TaskImpl implements ExternalTask {
	/**
	 * The default value of the '{@link #getLanguageId() <em>Language Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageId()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLanguageId() <em>Language Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageId()
	 * @generated
	 * @ordered
	 */
	protected String languageId = LANGUAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptId() <em>Script Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptId()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getScriptId() <em>Script Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptId()
	 * @generated
	 * @ordered
	 */
	protected String scriptId = SCRIPT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsPackage.Literals.EXTERNAL_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageId() {
		return languageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageId(String newLanguageId) {
		String oldLanguageId = languageId;
		languageId = newLanguageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsPackage.EXTERNAL_TASK__LANGUAGE_ID, oldLanguageId,
					languageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptId() {
		return scriptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptId(String newScriptId) {
		String oldScriptId = scriptId;
		scriptId = newScriptId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsPackage.EXTERNAL_TASK__SCRIPT_ID, oldScriptId,
					scriptId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdsPackage.EXTERNAL_TASK__LANGUAGE_ID:
			return getLanguageId();
		case EdsPackage.EXTERNAL_TASK__SCRIPT_ID:
			return getScriptId();
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
		case EdsPackage.EXTERNAL_TASK__LANGUAGE_ID:
			setLanguageId((String) newValue);
			return;
		case EdsPackage.EXTERNAL_TASK__SCRIPT_ID:
			setScriptId((String) newValue);
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
		case EdsPackage.EXTERNAL_TASK__LANGUAGE_ID:
			setLanguageId(LANGUAGE_ID_EDEFAULT);
			return;
		case EdsPackage.EXTERNAL_TASK__SCRIPT_ID:
			setScriptId(SCRIPT_ID_EDEFAULT);
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
		case EdsPackage.EXTERNAL_TASK__LANGUAGE_ID:
			return LANGUAGE_ID_EDEFAULT == null ? languageId != null : !LANGUAGE_ID_EDEFAULT.equals(languageId);
		case EdsPackage.EXTERNAL_TASK__SCRIPT_ID:
			return SCRIPT_ID_EDEFAULT == null ? scriptId != null : !SCRIPT_ID_EDEFAULT.equals(scriptId);
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
		result.append(" (languageId: ");
		result.append(languageId);
		result.append(", scriptId: ");
		result.append(scriptId);
		result.append(')');
		return result.toString();
	}

} //ExternalTaskImpl
