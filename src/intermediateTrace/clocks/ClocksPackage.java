/**
 */
package intermediateTrace.clocks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see intermediateTrace.clocks.ClocksFactory
 * @model kind="package"
 * @generated
 */
public interface ClocksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "clocks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "myTrace.Clocks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "myTrace.Clocks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClocksPackage eINSTANCE = intermediateTrace.clocks.impl.ClocksPackageImpl.init();

	/**
	 * The meta object id for the '{@link intermediateTrace.clocks.impl.AbstractClockBoundaryImpl <em>Abstract Clock Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.clocks.impl.AbstractClockBoundaryImpl
	 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getAbstractClockBoundary()
	 * @generated
	 */
	int ABSTRACT_CLOCK_BOUNDARY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLOCK_BOUNDARY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLOCK_BOUNDARY__RELATION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLOCK_BOUNDARY__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Abstract Clock Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLOCK_BOUNDARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Clock Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLOCK_BOUNDARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.clocks.impl.SingleClockBoundaryImpl <em>Single Clock Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.clocks.impl.SingleClockBoundaryImpl
	 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getSingleClockBoundary()
	 * @generated
	 */
	int SINGLE_CLOCK_BOUNDARY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CLOCK_BOUNDARY__VALUE = ABSTRACT_CLOCK_BOUNDARY__VALUE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CLOCK_BOUNDARY__RELATION = ABSTRACT_CLOCK_BOUNDARY__RELATION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CLOCK_BOUNDARY__TARGET = ABSTRACT_CLOCK_BOUNDARY__TARGET;

	/**
	 * The number of structural features of the '<em>Single Clock Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CLOCK_BOUNDARY_FEATURE_COUNT = ABSTRACT_CLOCK_BOUNDARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Clock Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CLOCK_BOUNDARY_OPERATION_COUNT = ABSTRACT_CLOCK_BOUNDARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.clocks.impl.InverseClockBoundaryImpl <em>Inverse Clock Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.clocks.impl.InverseClockBoundaryImpl
	 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getInverseClockBoundary()
	 * @generated
	 */
	int INVERSE_CLOCK_BOUNDARY = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_CLOCK_BOUNDARY__VALUE = ABSTRACT_CLOCK_BOUNDARY__VALUE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_CLOCK_BOUNDARY__RELATION = ABSTRACT_CLOCK_BOUNDARY__RELATION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_CLOCK_BOUNDARY__TARGET = ABSTRACT_CLOCK_BOUNDARY__TARGET;

	/**
	 * The number of structural features of the '<em>Inverse Clock Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_CLOCK_BOUNDARY_FEATURE_COUNT = ABSTRACT_CLOCK_BOUNDARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inverse Clock Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_CLOCK_BOUNDARY_OPERATION_COUNT = ABSTRACT_CLOCK_BOUNDARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.clocks.impl.CombinedClockBoundaryImpl <em>Combined Clock Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.clocks.impl.CombinedClockBoundaryImpl
	 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getCombinedClockBoundary()
	 * @generated
	 */
	int COMBINED_CLOCK_BOUNDARY = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CLOCK_BOUNDARY__VALUE = ABSTRACT_CLOCK_BOUNDARY__VALUE;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CLOCK_BOUNDARY__RELATION = ABSTRACT_CLOCK_BOUNDARY__RELATION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CLOCK_BOUNDARY__TARGET = ABSTRACT_CLOCK_BOUNDARY__TARGET;

	/**
	 * The feature id for the '<em><b>Subtrahend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CLOCK_BOUNDARY__SUBTRAHEND = ABSTRACT_CLOCK_BOUNDARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combined Clock Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CLOCK_BOUNDARY_FEATURE_COUNT = ABSTRACT_CLOCK_BOUNDARY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Combined Clock Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_CLOCK_BOUNDARY_OPERATION_COUNT = ABSTRACT_CLOCK_BOUNDARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.clocks.Relation <em>Relation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.clocks.Relation
	 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;


	/**
	 * Returns the meta object for class '{@link intermediateTrace.clocks.AbstractClockBoundary <em>Abstract Clock Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Clock Boundary</em>'.
	 * @see intermediateTrace.clocks.AbstractClockBoundary
	 * @generated
	 */
	EClass getAbstractClockBoundary();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.clocks.AbstractClockBoundary#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see intermediateTrace.clocks.AbstractClockBoundary#getValue()
	 * @see #getAbstractClockBoundary()
	 * @generated
	 */
	EAttribute getAbstractClockBoundary_Value();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.clocks.AbstractClockBoundary#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation</em>'.
	 * @see intermediateTrace.clocks.AbstractClockBoundary#getRelation()
	 * @see #getAbstractClockBoundary()
	 * @generated
	 */
	EAttribute getAbstractClockBoundary_Relation();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.clocks.AbstractClockBoundary#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see intermediateTrace.clocks.AbstractClockBoundary#getTarget()
	 * @see #getAbstractClockBoundary()
	 * @generated
	 */
	EAttribute getAbstractClockBoundary_Target();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.clocks.SingleClockBoundary <em>Single Clock Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Clock Boundary</em>'.
	 * @see intermediateTrace.clocks.SingleClockBoundary
	 * @generated
	 */
	EClass getSingleClockBoundary();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.clocks.InverseClockBoundary <em>Inverse Clock Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse Clock Boundary</em>'.
	 * @see intermediateTrace.clocks.InverseClockBoundary
	 * @generated
	 */
	EClass getInverseClockBoundary();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.clocks.CombinedClockBoundary <em>Combined Clock Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Clock Boundary</em>'.
	 * @see intermediateTrace.clocks.CombinedClockBoundary
	 * @generated
	 */
	EClass getCombinedClockBoundary();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.clocks.CombinedClockBoundary#getSubtrahend <em>Subtrahend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtrahend</em>'.
	 * @see intermediateTrace.clocks.CombinedClockBoundary#getSubtrahend()
	 * @see #getCombinedClockBoundary()
	 * @generated
	 */
	EAttribute getCombinedClockBoundary_Subtrahend();

	/**
	 * Returns the meta object for enum '{@link intermediateTrace.clocks.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation</em>'.
	 * @see intermediateTrace.clocks.Relation
	 * @generated
	 */
	EEnum getRelation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClocksFactory getClocksFactory();

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
		 * The meta object literal for the '{@link intermediateTrace.clocks.impl.AbstractClockBoundaryImpl <em>Abstract Clock Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.clocks.impl.AbstractClockBoundaryImpl
		 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getAbstractClockBoundary()
		 * @generated
		 */
		EClass ABSTRACT_CLOCK_BOUNDARY = eINSTANCE.getAbstractClockBoundary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLOCK_BOUNDARY__VALUE = eINSTANCE.getAbstractClockBoundary_Value();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLOCK_BOUNDARY__RELATION = eINSTANCE.getAbstractClockBoundary_Relation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLOCK_BOUNDARY__TARGET = eINSTANCE.getAbstractClockBoundary_Target();

		/**
		 * The meta object literal for the '{@link intermediateTrace.clocks.impl.SingleClockBoundaryImpl <em>Single Clock Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.clocks.impl.SingleClockBoundaryImpl
		 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getSingleClockBoundary()
		 * @generated
		 */
		EClass SINGLE_CLOCK_BOUNDARY = eINSTANCE.getSingleClockBoundary();

		/**
		 * The meta object literal for the '{@link intermediateTrace.clocks.impl.InverseClockBoundaryImpl <em>Inverse Clock Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.clocks.impl.InverseClockBoundaryImpl
		 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getInverseClockBoundary()
		 * @generated
		 */
		EClass INVERSE_CLOCK_BOUNDARY = eINSTANCE.getInverseClockBoundary();

		/**
		 * The meta object literal for the '{@link intermediateTrace.clocks.impl.CombinedClockBoundaryImpl <em>Combined Clock Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.clocks.impl.CombinedClockBoundaryImpl
		 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getCombinedClockBoundary()
		 * @generated
		 */
		EClass COMBINED_CLOCK_BOUNDARY = eINSTANCE.getCombinedClockBoundary();

		/**
		 * The meta object literal for the '<em><b>Subtrahend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_CLOCK_BOUNDARY__SUBTRAHEND = eINSTANCE.getCombinedClockBoundary_Subtrahend();

		/**
		 * The meta object literal for the '{@link intermediateTrace.clocks.Relation <em>Relation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.clocks.Relation
		 * @see intermediateTrace.clocks.impl.ClocksPackageImpl#getRelation()
		 * @generated
		 */
		EEnum RELATION = eINSTANCE.getRelation();

	}

} //ClocksPackage
