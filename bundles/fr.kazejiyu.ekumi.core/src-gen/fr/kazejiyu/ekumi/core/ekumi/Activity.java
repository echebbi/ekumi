/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getIncomingFlows <em>Incoming Flows</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.DataFlow}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Flows</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_OutgoingFlows()
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlow#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<DataFlow> getOutgoingFlows();

	/**
	 * Returns the value of the '<em><b>Incoming Flows</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.DataFlow}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Flows</em>' reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_IncomingFlows()
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<DataFlow> getIncomingFlows();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getOutputs();

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Activity}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Successors()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<Activity> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Predecessor()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessors
	 * @model opposite="successors"
	 * @generated
	 */
	Activity getPredecessor();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Activity value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.kazejiyu.ekumi.core.ekumi.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Status
	 * @see #setStatus(Status)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

} // Activity
