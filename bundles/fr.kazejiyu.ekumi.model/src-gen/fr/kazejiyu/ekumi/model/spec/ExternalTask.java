/**
 */
package fr.kazejiyu.ekumi.model.spec;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A task which behavior is implemented by the user.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getExternalTask()
 * @model
 * @generated
 */
public interface ExternalTask extends Task {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Language Id</b></em>' attribute.
	 * @return the value of the '<em>Language Id</em>' attribute.
	 * @see #setLanguageId(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getExternalTask_LanguageId()
	 * <!-- end-user-doc -->
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLanguageId();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.ExternalTask#getLanguageId <em>Language Id</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Id</em>' attribute.
	 * @see #getLanguageId()
	 * @generated
	 */
	void setLanguageId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Script Id</b></em>' attribute.
	 * @return the value of the '<em>Script Id</em>' attribute.
	 * @see #setScriptId(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getExternalTask_ScriptId()
	 * <!-- end-user-doc -->
	 * @model default=""
	 * @generated
	 */
	String getScriptId();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.ExternalTask#getScriptId <em>Script Id</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Id</em>' attribute.
	 * @see #getScriptId()
	 * @generated
	 */
	void setScriptId(String value);

} // ExternalTask
