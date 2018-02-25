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
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.ScriptableTask#getScriptPath <em>Script Path</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Script Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Path</em>' attribute.
	 * @see #setScriptPath(String)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getScriptableTask_ScriptPath()
	 * @model
	 * @generated
	 */
	String getScriptPath();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.ScriptableTask#getScriptPath <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Path</em>' attribute.
	 * @see #getScriptPath()
	 * @generated
	 */
	void setScriptPath(String value);

} // ScriptableTask
