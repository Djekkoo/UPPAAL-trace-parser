/**
 */
package intermediateTrace.transitions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see intermediateTrace.transitions.TransitionsFactory
 * @model kind="package"
 * @generated
 */
public interface TransitionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transitions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "myTrace.transitions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "myTrace.transitions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransitionsPackage eINSTANCE = intermediateTrace.transitions.impl.TransitionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link intermediateTrace.transitions.impl.AbstractTransitionImpl <em>Abstract Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.transitions.impl.AbstractTransitionImpl
	 * @see intermediateTrace.transitions.impl.TransitionsPackageImpl#getAbstractTransition()
	 * @generated
	 */
	int ABSTRACT_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Abstract Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.transitions.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.transitions.impl.DelayTransitionImpl
	 * @see intermediateTrace.transitions.impl.TransitionsPackageImpl#getDelayTransition()
	 * @generated
	 */
	int DELAY_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__SOURCE = ABSTRACT_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__TARGET = ABSTRACT_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION__DELAY = ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION_FEATURE_COUNT = ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delay Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_TRANSITION_OPERATION_COUNT = ABSTRACT_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.transitions.impl.EdgeTransitionImpl <em>Edge Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.transitions.impl.EdgeTransitionImpl
	 * @see intermediateTrace.transitions.impl.TransitionsPackageImpl#getEdgeTransition()
	 * @generated
	 */
	int EDGE_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION__SOURCE = ABSTRACT_TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION__TARGET = ABSTRACT_TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION__EDGES = ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION_FEATURE_COUNT = ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TRANSITION_OPERATION_COUNT = ABSTRACT_TRANSITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link intermediateTrace.transitions.AbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition</em>'.
	 * @see intermediateTrace.transitions.AbstractTransition
	 * @generated
	 */
	EClass getAbstractTransition();

	/**
	 * Returns the meta object for the reference '{@link intermediateTrace.transitions.AbstractTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see intermediateTrace.transitions.AbstractTransition#getSource()
	 * @see #getAbstractTransition()
	 * @generated
	 */
	EReference getAbstractTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link intermediateTrace.transitions.AbstractTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see intermediateTrace.transitions.AbstractTransition#getTarget()
	 * @see #getAbstractTransition()
	 * @generated
	 */
	EReference getAbstractTransition_Target();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.transitions.DelayTransition <em>Delay Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Transition</em>'.
	 * @see intermediateTrace.transitions.DelayTransition
	 * @generated
	 */
	EClass getDelayTransition();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.transitions.DelayTransition#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see intermediateTrace.transitions.DelayTransition#getDelay()
	 * @see #getDelayTransition()
	 * @generated
	 */
	EAttribute getDelayTransition_Delay();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.transitions.EdgeTransition <em>Edge Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Transition</em>'.
	 * @see intermediateTrace.transitions.EdgeTransition
	 * @generated
	 */
	EClass getEdgeTransition();

	/**
	 * Returns the meta object for the attribute list '{@link intermediateTrace.transitions.EdgeTransition#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Edges</em>'.
	 * @see intermediateTrace.transitions.EdgeTransition#getEdges()
	 * @see #getEdgeTransition()
	 * @generated
	 */
	EAttribute getEdgeTransition_Edges();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransitionsFactory getTransitionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link intermediateTrace.transitions.impl.AbstractTransitionImpl <em>Abstract Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.transitions.impl.AbstractTransitionImpl
		 * @see intermediateTrace.transitions.impl.TransitionsPackageImpl#getAbstractTransition()
		 * @generated
		 */
		EClass ABSTRACT_TRANSITION = eINSTANCE.getAbstractTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSITION__SOURCE = eINSTANCE.getAbstractTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSITION__TARGET = eINSTANCE.getAbstractTransition_Target();

		/**
		 * The meta object literal for the '{@link intermediateTrace.transitions.impl.DelayTransitionImpl <em>Delay Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.transitions.impl.DelayTransitionImpl
		 * @see intermediateTrace.transitions.impl.TransitionsPackageImpl#getDelayTransition()
		 * @generated
		 */
		EClass DELAY_TRANSITION = eINSTANCE.getDelayTransition();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_TRANSITION__DELAY = eINSTANCE.getDelayTransition_Delay();

		/**
		 * The meta object literal for the '{@link intermediateTrace.transitions.impl.EdgeTransitionImpl <em>Edge Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.transitions.impl.EdgeTransitionImpl
		 * @see intermediateTrace.transitions.impl.TransitionsPackageImpl#getEdgeTransition()
		 * @generated
		 */
		EClass EDGE_TRANSITION = eINSTANCE.getEdgeTransition();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_TRANSITION__EDGES = eINSTANCE.getEdgeTransition_Edges();

	}

} //TransitionsPackage
