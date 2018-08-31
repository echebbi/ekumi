/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator {
	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>IDLE</b></em>' literal object.
	 * <!-- end-user-doc -->
	 * @see #IDLE_VALUE
	 * @generated
	 * @ordered
	 */
	IDLE(0, "IDLE", "IDLE"),

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>RUNNING</b></em>' literal object.
	 * <!-- end-user-doc -->
	 * @see #RUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNING(1, "RUNNING", "RUNNING"),

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>SUCCEEDED</b></em>' literal object.
	 * <!-- end-user-doc -->
	 * @see #SUCCEEDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCEEDED(2, "SUCCEEDED", "SUCCEEDED"),

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>FAILED</b></em>' literal object.
	 * <!-- end-user-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(3, "FAILED", "FAILED"),
	/**
	 * <!-- begin-user-doc -->
	* The '<em><b>CANCELLED</b></em>' literal object.
	* <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(4, "CANCELLED", "CANCELLED"),
	/**
	 * <!-- begin-user-doc -->
	* The '<em><b>PAUSED</b></em>' literal object.
	* <!-- end-user-doc -->
	 * @see #PAUSED_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSED(5, "PAUSED", "PAUSED");

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>IDLE</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>IDLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDLE_VALUE = 0;

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>RUNNING</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>RUNNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUNNING_VALUE = 1;

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>SUCCEEDED</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>SUCCEEDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCEEDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUCCEEDED_VALUE = 2;

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>FAILED</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>FAILED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 3;

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>CANCELLED</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>CANCELLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCELLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 4;

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>PAUSED</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>PAUSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAUSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAUSED_VALUE = 5;

	/**
	 * <!-- begin-user-doc -->
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Status[] VALUES_ARRAY = new Status[] { IDLE, RUNNING, SUCCEEDED, FAILED, CANCELLED, PAUSED, };

	/**
	 * <!-- begin-user-doc -->
	 * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * <!-- begin-user-doc -->
	 * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the '<em><b>Status</b></em>' literal with the specified name.
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(int value) {
		switch (value) {
		case IDLE_VALUE:
			return IDLE;
		case RUNNING_VALUE:
			return RUNNING;
		case SUCCEEDED_VALUE:
			return SUCCEEDED;
		case FAILED_VALUE:
			return FAILED;
		case CANCELLED_VALUE:
			return CANCELLED;
		case PAUSED_VALUE:
			return PAUSED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * <!-- begin-user-doc -->
	 * Only this class can construct instances.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Status(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Status
