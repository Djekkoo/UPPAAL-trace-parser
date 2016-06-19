/**
 */
package intermediateTrace.clocks.impl;

import intermediateTrace.IntermediateTracePackage;

import intermediateTrace.clocks.AbstractClockBoundary;
import intermediateTrace.clocks.ClocksFactory;
import intermediateTrace.clocks.ClocksPackage;
import intermediateTrace.clocks.CombinedClockBoundary;
import intermediateTrace.clocks.InverseClockBoundary;
import intermediateTrace.clocks.Relation;
import intermediateTrace.clocks.SingleClockBoundary;

import intermediateTrace.impl.IntermediateTracePackageImpl;

import intermediateTrace.transitions.TransitionsPackage;

import intermediateTrace.transitions.impl.TransitionsPackageImpl;

import intermediateTrace.value.ValuePackage;

import intermediateTrace.value.impl.ValuePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClocksPackageImpl extends EPackageImpl implements ClocksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClockBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleClockBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseClockBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedClockBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see intermediateTrace.clocks.ClocksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClocksPackageImpl() {
		super(eNS_URI, ClocksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClocksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClocksPackage init() {
		if (isInited) return (ClocksPackage)EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI);

		// Obtain or create and register package
		ClocksPackageImpl theClocksPackage = (ClocksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClocksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClocksPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IntermediateTracePackageImpl theIntermediateTracePackage = (IntermediateTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateTracePackage.eNS_URI) instanceof IntermediateTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateTracePackage.eNS_URI) : IntermediateTracePackage.eINSTANCE);
		TransitionsPackageImpl theTransitionsPackage = (TransitionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI) instanceof TransitionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI) : TransitionsPackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);

		// Create package meta-data objects
		theClocksPackage.createPackageContents();
		theIntermediateTracePackage.createPackageContents();
		theTransitionsPackage.createPackageContents();
		theValuePackage.createPackageContents();

		// Initialize created meta-data
		theClocksPackage.initializePackageContents();
		theIntermediateTracePackage.initializePackageContents();
		theTransitionsPackage.initializePackageContents();
		theValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClocksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClocksPackage.eNS_URI, theClocksPackage);
		return theClocksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractClockBoundary() {
		return abstractClockBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClockBoundary_Value() {
		return (EAttribute)abstractClockBoundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClockBoundary_Relation() {
		return (EAttribute)abstractClockBoundaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClockBoundary_Target() {
		return (EAttribute)abstractClockBoundaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleClockBoundary() {
		return singleClockBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseClockBoundary() {
		return inverseClockBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedClockBoundary() {
		return combinedClockBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedClockBoundary_Subtrahend() {
		return (EAttribute)combinedClockBoundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelation() {
		return relationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClocksFactory getClocksFactory() {
		return (ClocksFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractClockBoundaryEClass = createEClass(ABSTRACT_CLOCK_BOUNDARY);
		createEAttribute(abstractClockBoundaryEClass, ABSTRACT_CLOCK_BOUNDARY__VALUE);
		createEAttribute(abstractClockBoundaryEClass, ABSTRACT_CLOCK_BOUNDARY__RELATION);
		createEAttribute(abstractClockBoundaryEClass, ABSTRACT_CLOCK_BOUNDARY__TARGET);

		singleClockBoundaryEClass = createEClass(SINGLE_CLOCK_BOUNDARY);

		inverseClockBoundaryEClass = createEClass(INVERSE_CLOCK_BOUNDARY);

		combinedClockBoundaryEClass = createEClass(COMBINED_CLOCK_BOUNDARY);
		createEAttribute(combinedClockBoundaryEClass, COMBINED_CLOCK_BOUNDARY__SUBTRAHEND);

		// Create enums
		relationEEnum = createEEnum(RELATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		singleClockBoundaryEClass.getESuperTypes().add(this.getAbstractClockBoundary());
		inverseClockBoundaryEClass.getESuperTypes().add(this.getAbstractClockBoundary());
		combinedClockBoundaryEClass.getESuperTypes().add(this.getAbstractClockBoundary());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractClockBoundaryEClass, AbstractClockBoundary.class, "AbstractClockBoundary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractClockBoundary_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, AbstractClockBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractClockBoundary_Relation(), this.getRelation(), "relation", "LE", 1, 1, AbstractClockBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractClockBoundary_Target(), ecorePackage.getEString(), "target", null, 1, 1, AbstractClockBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleClockBoundaryEClass, SingleClockBoundary.class, "SingleClockBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverseClockBoundaryEClass, InverseClockBoundary.class, "InverseClockBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(combinedClockBoundaryEClass, CombinedClockBoundary.class, "CombinedClockBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCombinedClockBoundary_Subtrahend(), ecorePackage.getEString(), "subtrahend", null, 1, 1, CombinedClockBoundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relationEEnum, Relation.class, "Relation");
		addEEnumLiteral(relationEEnum, Relation.EQ);
		addEEnumLiteral(relationEEnum, Relation.NE);
		addEEnumLiteral(relationEEnum, Relation.LT);
		addEEnumLiteral(relationEEnum, Relation.LE);
		addEEnumLiteral(relationEEnum, Relation.GT);
		addEEnumLiteral(relationEEnum, Relation.GE);
	}

} //ClocksPackageImpl
