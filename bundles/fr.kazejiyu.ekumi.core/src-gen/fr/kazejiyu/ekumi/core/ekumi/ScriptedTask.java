/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripted Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.ScriptedTask#getScriptPath <em>Script Path</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.ScriptedTask#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScriptedTask()
 * @model
 * @generated
 */
public interface ScriptedTask extends Task {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Script Path</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Path</em>' attribute.
	 * @see #setScriptPath(String)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScriptedTask_ScriptPath()
	 * @model
	 * @generated
	 */
	String getScriptPath();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.ScriptedTask#getScriptPath <em>Script Path</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Path</em>' attribute.
	 * @see #getScriptPath()
	 * @generated
	 */
	void setScriptPath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(Runner)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScriptedTask_Script()
	 * @model containment="true"
	 * @generated
	 */
	Runner getScript();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.ScriptedTask#getScript <em>Script</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Runner value);

} // ScriptedTask
