/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripting Language</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScriptingLanguage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ScriptingLanguage extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RunnableScript resolveRunnable(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TestableScript resolveTestable(String path);

} // ScriptingLanguage
