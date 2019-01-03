/**
 */
package fr.kazejiyu.ekumi.model.spec.impl;

import fr.kazejiyu.ekumi.model.spec.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecFactoryImpl extends EFactoryImpl implements SpecFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecFactory init() {
		try {
			SpecFactory theSpecFactory = (SpecFactory) EPackage.Registry.INSTANCE.getEFactory(SpecPackage.eNS_URI);
			if (theSpecFactory != null) {
				return theSpecFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpecFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SpecPackage.JOIN:
			return createJoin();
		case SpecPackage.START_JOIN:
			return createStartJoin();
		case SpecPackage.SPLIT_JOIN:
			return createSplitJoin();
		case SpecPackage.SIMPLE_JOIN:
			return createSimpleJoin();
		case SpecPackage.REPEAT_JOIN:
			return createRepeatJoin();
		case SpecPackage.WORKFLOW:
			return createWorkflow();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartJoin createStartJoin() {
		StartJoinImpl startJoin = new StartJoinImpl();
		return startJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitJoin createSplitJoin() {
		SplitJoinImpl splitJoin = new SplitJoinImpl();
		return splitJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleJoin createSimpleJoin() {
		SimpleJoinImpl simpleJoin = new SimpleJoinImpl();
		return simpleJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatJoin createRepeatJoin() {
		RepeatJoinImpl repeatJoin = new RepeatJoinImpl();
		return repeatJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecPackage getSpecPackage() {
		return (SpecPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpecPackage getPackage() {
		return SpecPackage.eINSTANCE;
	}

} //SpecFactoryImpl
