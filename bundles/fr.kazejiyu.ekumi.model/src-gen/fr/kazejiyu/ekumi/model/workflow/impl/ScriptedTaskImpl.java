/**
 */
package fr.kazejiyu.ekumi.model.workflow.impl;

import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.workflow.Runner;
import fr.kazejiyu.ekumi.model.workflow.ScriptedTask;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripted Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ScriptedTaskImpl#getScriptPath <em>Script Path</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ScriptedTaskImpl#getScript <em>Script</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.ScriptedTaskImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptedTaskImpl extends TaskImpl implements ScriptedTask {
	/**
	 * The default value of the '{@link #getScriptPath() <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptPath() <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptPath()
	 * @generated
	 * @ordered
	 */
	protected String scriptPath = SCRIPT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ScriptingLanguage LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected ScriptingLanguage language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptedTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.SCRIPTED_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptPath() {
		return scriptPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptPath(String newScriptPath) {
		String oldScriptPath = scriptPath;
		scriptPath = newScriptPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SCRIPTED_TASK__SCRIPT_PATH,
					oldScriptPath, scriptPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runner getScript() {
		Runner script = basicGetScript();
		return script != null && script.eIsProxy() ? (Runner) eResolveProxy((InternalEObject) script) : script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runner basicGetScript() {
		// TODO: implement this method to return the 'Script' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Runner newScript) {
		// TODO: implement this method to set the 'Script' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetScript() {
		// TODO: implement this method to unset the 'Script' reference
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetScript() {
		return getScript() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptingLanguage getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(ScriptingLanguage newLanguage) {
		ScriptingLanguage oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.SCRIPTED_TASK__LANGUAGE, oldLanguage,
					language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.SCRIPTED_TASK__SCRIPT_PATH:
			return getScriptPath();
		case WorkflowPackage.SCRIPTED_TASK__SCRIPT:
			if (resolve)
				return getScript();
			return basicGetScript();
		case WorkflowPackage.SCRIPTED_TASK__LANGUAGE:
			return getLanguage();
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
		case WorkflowPackage.SCRIPTED_TASK__SCRIPT_PATH:
			setScriptPath((String) newValue);
			return;
		case WorkflowPackage.SCRIPTED_TASK__SCRIPT:
			setScript((Runner) newValue);
			return;
		case WorkflowPackage.SCRIPTED_TASK__LANGUAGE:
			setLanguage((ScriptingLanguage) newValue);
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
		case WorkflowPackage.SCRIPTED_TASK__SCRIPT_PATH:
			setScriptPath(SCRIPT_PATH_EDEFAULT);
			return;
		case WorkflowPackage.SCRIPTED_TASK__SCRIPT:
			unsetScript();
			return;
		case WorkflowPackage.SCRIPTED_TASK__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
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
		case WorkflowPackage.SCRIPTED_TASK__SCRIPT_PATH:
			return SCRIPT_PATH_EDEFAULT == null ? scriptPath != null : !SCRIPT_PATH_EDEFAULT.equals(scriptPath);
		case WorkflowPackage.SCRIPTED_TASK__SCRIPT:
			return isSetScript();
		case WorkflowPackage.SCRIPTED_TASK__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
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
		result.append(" (scriptPath: ");
		result.append(scriptPath);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //ScriptedTaskImpl
