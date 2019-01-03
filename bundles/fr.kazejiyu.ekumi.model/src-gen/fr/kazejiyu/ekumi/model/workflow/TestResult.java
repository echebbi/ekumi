/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Test Result</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getTestResult()
 * @model
 * @generated
 */
public enum TestResult implements Enumerator {
	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>FULFILLED</b></em>' literal object.
	 * <!-- end-user-doc -->
	 * @see #FULFILLED_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLED(0, "FULFILLED", "FULFILLED"),

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>UNSATISFIED</b></em>' literal object.
	 * <!-- end-user-doc -->
	 * @see #UNSATISFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSATISFIED(1, "UNSATISFIED", "UNSATISFIED");

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>FULFILLED</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>FULFILLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULFILLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLED_VALUE = 0;

	/**
	 * <!-- begin-user-doc -->
	 * The '<em><b>UNSATISFIED</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>UNSATISFIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSATISFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSATISFIED_VALUE = 1;

	/**
	 * <!-- begin-user-doc -->
	 * An array of all the '<em><b>Test Result</b></em>' enumerators.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TestResult[] VALUES_ARRAY = new TestResult[] { FULFILLED, UNSATISFIED, };

	/**
	 * <!-- begin-user-doc -->
	 * A public read-only list of all the '<em><b>Test Result</b></em>' enumerators.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TestResult> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * <!-- begin-user-doc -->
	 * Returns the '<em><b>Test Result</b></em>' literal with the specified literal value.
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestResult get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestResult result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the '<em><b>Test Result</b></em>' literal with the specified name.
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestResult getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestResult result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the '<em><b>Test Result</b></em>' literal with the specified integer value.
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestResult get(int value) {
		switch (value) {
		case FULFILLED_VALUE:
			return FULFILLED;
		case UNSATISFIED_VALUE:
			return UNSATISFIED;
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
	private TestResult(int value, String name, String literal) {
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

} //TestResult
