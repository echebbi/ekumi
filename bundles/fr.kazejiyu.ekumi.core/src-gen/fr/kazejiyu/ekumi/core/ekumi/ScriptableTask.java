/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scriptable Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.ScriptableTask#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScriptableTask()
 * @model
 * @generated
 */
public interface ScriptableTask extends Task {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(RunnableScript)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScriptableTask_Script()
	 * @model containment="true"
	 * @generated
	 */
	RunnableScript getScript();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.ScriptableTask#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(RunnableScript value);

} // ScriptableTask
