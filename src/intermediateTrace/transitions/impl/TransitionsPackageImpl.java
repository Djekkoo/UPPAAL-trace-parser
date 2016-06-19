/**
 */
package intermediateTrace.transitions.impl;

import intermediateTrace.IntermediateTracePackage;

import intermediateTrace.clocks.ClocksPackage;

import intermediateTrace.clocks.impl.ClocksPackageImpl;

import intermediateTrace.impl.IntermediateTracePackageImpl;

import intermediateTrace.transitions.AbstractTransition;
import intermediateTrace.transitions.DelayTransition;
import intermediateTrace.transitions.EdgeTransition;
import intermediateTrace.transitions.TransitionsFactory;
import intermediateTrace.transitions.TransitionsPackage;

import intermediateTrace.value.ValuePackage;

import intermediateTrace.value.impl.ValuePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionsPackageImpl extends EPackageImpl implements TransitionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeTransitionEClass = null;

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
	 * @see intermediateTrace.transitions.TransitionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransitionsPackageImpl() {
		super(eNS_URI, TransitionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransitionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransitionsPackage init() {
		if (isInited) return (TransitionsPackage)EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI);

		// Obtain or create and register package
		TransitionsPackageImpl theTransitionsPackage = (TransitionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TransitionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TransitionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IntermediateTracePackageImpl theIntermediateTracePackage = (IntermediateTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateTracePackage.eNS_URI) instanceof IntermediateTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateTracePackage.eNS_URI) : IntermediateTracePackage.eINSTANCE);
		ClocksPackageImpl theClocksPackage = (ClocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) instanceof ClocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) : ClocksPackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);

		// Create package meta-data objects
		theTransitionsPackage.createPackageContents();
		theIntermediateTracePackage.createPackageContents();
		theClocksPackage.createPackageContents();
		theValuePackage.createPackageContents();

		// Initialize created meta-data
		theTransitionsPackage.initializePackageContents();
		theIntermediateTracePackage.initializePackageContents();
		theClocksPackage.initializePackageContents();
		theValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransitionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransitionsPackage.eNS_URI, theTransitionsPackage);
		return theTransitionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransition() {
		return abstractTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTransition_Source() {
		return (EReference)abstractTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTransition_Target() {
		return (EReference)abstractTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayTransition() {
		return delayTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayTransition_Delay() {
		return (EAttribute)delayTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeTransition() {
		return edgeTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeTransition_Edges() {
		return (EAttribute)edgeTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionsFactory getTransitionsFactory() {
		return (TransitionsFactory)getEFactoryInstance();
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
		abstractTransitionEClass = createEClass(ABSTRACT_TRANSITION);
		createEReference(abstractTransitionEClass, ABSTRACT_TRANSITION__SOURCE);
		createEReference(abstractTransitionEClass, ABSTRACT_TRANSITION__TARGET);

		delayTransitionEClass = createEClass(DELAY_TRANSITION);
		createEAttribute(delayTransitionEClass, DELAY_TRANSITION__DELAY);

		edgeTransitionEClass = createEClass(EDGE_TRANSITION);
		createEAttribute(edgeTransitionEClass, EDGE_TRANSITION__EDGES);
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

		// Obtain other dependent packages
		IntermediateTracePackage theIntermediateTracePackage = (IntermediateTracePackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateTracePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		delayTransitionEClass.getESuperTypes().add(this.getAbstractTransition());
		edgeTransitionEClass.getESuperTypes().add(this.getAbstractTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractTransitionEClass, AbstractTransition.class, "AbstractTransition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTransition_Source(), theIntermediateTracePackage.getState(), theIntermediateTracePackage.getState_TransitionTo(), "source", null, 1, 1, AbstractTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTransition_Target(), theIntermediateTracePackage.getState(), theIntermediateTracePackage.getState_TransitionFrom(), "target", null, 1, 1, AbstractTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayTransitionEClass, DelayTransition.class, "DelayTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayTransition_Delay(), ecorePackage.getEFloat(), "delay", null, 1, 1, DelayTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeTransitionEClass, EdgeTransition.class, "EdgeTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdgeTransition_Edges(), ecorePackage.getEString(), "edges", null, 0, -1, EdgeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TransitionsPackageImpl
