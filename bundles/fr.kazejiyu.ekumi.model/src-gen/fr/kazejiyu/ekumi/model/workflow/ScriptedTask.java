/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getScriptedTask()
 * @model
 * @generated
 */
public interface ScriptedTask extends Task {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Script Path</b></em>' attribute.
	 * @return the value of the '<em>Script Path</em>' attribute.
	 * @see #setScriptPath(String)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getScriptedTask_ScriptPath()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getScriptPath();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.ScriptedTask#getScriptPath <em>Script Path</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Path</em>' attribute.
	 * @see #getScriptPath()
	 * @generated
	 */
	void setScriptPath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(Runner)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getScriptedTask_Script()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Runner getScript();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.ScriptedTask#getScript <em>Script</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Runner value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(ScriptingLanguage)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getScriptedTask_Language()
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.model.workflow.ScriptingLanguage"
	 * @generated
	 */
	ScriptingLanguage getLanguage();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.ScriptedTask#getLanguage <em>Language</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(ScriptingLanguage value);

} // ScriptedTask
