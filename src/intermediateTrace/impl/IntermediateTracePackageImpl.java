/**
 */
package intermediateTrace.impl;

import intermediateTrace.IntermediateTraceFactory;
import intermediateTrace.IntermediateTracePackage;
import intermediateTrace.LocationInstance;
import intermediateTrace.State;
import intermediateTrace.TemplateInstance;
import intermediateTrace.Trace;
import intermediateTrace.Valuation;

import intermediateTrace.clocks.ClocksPackage;

import intermediateTrace.clocks.impl.ClocksPackageImpl;

import intermediateTrace.transitions.TransitionsPackage;

import intermediateTrace.transitions.impl.TransitionsPackageImpl;

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
public class IntermediateTracePackageImpl extends EPackageImpl implements IntermediateTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

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
	 * @see intermediateTrace.IntermediateTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntermediateTracePackageImpl() {
		super(eNS_URI, IntermediateTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntermediateTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntermediateTracePackage init() {
		if (isInited) return (IntermediateTracePackage)EPackage.Registry.INSTANCE.getEPackage(IntermediateTracePackage.eNS_URI);

		// Obtain or create and register package
		IntermediateTracePackageImpl theIntermediateTracePackage = (IntermediateTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntermediateTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntermediateTracePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TransitionsPackageImpl theTransitionsPackage = (TransitionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI) instanceof TransitionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI) : TransitionsPackage.eINSTANCE);
		ClocksPackageImpl theClocksPackage = (ClocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) instanceof ClocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) : ClocksPackage.eINSTANCE);
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI) : ValuePackage.eINSTANCE);

		// Create package meta-data objects
		theIntermediateTracePackage.createPackageContents();
		theTransitionsPackage.createPackageContents();
		theClocksPackage.createPackageContents();
		theValuePackage.createPackageContents();

		// Initialize created meta-data
		theIntermediateTracePackage.initializePackageContents();
		theTransitionsPackage.initializePackageContents();
		theClocksPackage.initializePackageContents();
		theValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntermediateTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntermediateTracePackage.eNS_URI, theIntermediateTracePackage);
		return theIntermediateTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_TransitionTo() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Locations() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Valuations() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Clocks() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_TransitionFrom() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Templates() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Time() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuation() {
		return valuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuation_Variable() {
		return (EAttribute)valuationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuation_Name() {
		return (EAttribute)valuationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuation_Value() {
		return (EReference)valuationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuation_Template() {
		return (EReference)valuationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateInstance() {
		return templateInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateInstance_Template() {
		return (EAttribute)templateInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateInstance_Locations() {
		return (EReference)templateInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateInstance_Name() {
		return (EAttribute)templateInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationInstance() {
		return locationInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationInstance_Location() {
		return (EAttribute)locationInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationInstance_Template() {
		return (EReference)locationInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_States() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Transitions() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Templates() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateTraceFactory getIntermediateTraceFactory() {
		return (IntermediateTraceFactory)getEFactoryInstance();
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
		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__TRANSITION_TO);
		createEReference(stateEClass, STATE__LOCATIONS);
		createEReference(stateEClass, STATE__VALUATIONS);
		createEReference(stateEClass, STATE__CLOCKS);
		createEReference(stateEClass, STATE__TRANSITION_FROM);
		createEReference(stateEClass, STATE__TEMPLATES);
		createEAttribute(stateEClass, STATE__TIME);

		valuationEClass = createEClass(VALUATION);
		createEAttribute(valuationEClass, VALUATION__VARIABLE);
		createEAttribute(valuationEClass, VALUATION__NAME);
		createEReference(valuationEClass, VALUATION__VALUE);
		createEReference(valuationEClass, VALUATION__TEMPLATE);

		templateInstanceEClass = createEClass(TEMPLATE_INSTANCE);
		createEAttribute(templateInstanceEClass, TEMPLATE_INSTANCE__TEMPLATE);
		createEReference(templateInstanceEClass, TEMPLATE_INSTANCE__LOCATIONS);
		createEAttribute(templateInstanceEClass, TEMPLATE_INSTANCE__NAME);

		locationInstanceEClass = createEClass(LOCATION_INSTANCE);
		createEAttribute(locationInstanceEClass, LOCATION_INSTANCE__LOCATION);
		createEReference(locationInstanceEClass, LOCATION_INSTANCE__TEMPLATE);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__STATES);
		createEReference(traceEClass, TRACE__TRANSITIONS);
		createEReference(traceEClass, TRACE__TEMPLATES);
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
		TransitionsPackage theTransitionsPackage = (TransitionsPackage)EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI);
		ClocksPackage theClocksPackage = (ClocksPackage)EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI);
		ValuePackage theValuePackage = (ValuePackage)EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTransitionsPackage);
		getESubpackages().add(theClocksPackage);
		getESubpackages().add(theValuePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_TransitionTo(), theTransitionsPackage.getAbstractTransition(), theTransitionsPackage.getAbstractTransition_Source(), "transitionTo", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Locations(), this.getLocationInstance(), null, "locations", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Valuations(), this.getValuation(), null, "valuations", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Clocks(), theClocksPackage.getAbstractClockBoundary(), null, "clocks", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_TransitionFrom(), theTransitionsPackage.getAbstractTransition(), theTransitionsPackage.getAbstractTransition_Target(), "transitionFrom", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Templates(), this.getTemplateInstance(), null, "templates", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuationEClass, Valuation.class, "Valuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuation_Variable(), ecorePackage.getEString(), "variable", null, 1, 1, Valuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Valuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuation_Value(), theValuePackage.getValue(), null, "value", null, 1, 1, Valuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuation_Template(), this.getTemplateInstance(), null, "template", null, 0, 1, Valuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateInstanceEClass, TemplateInstance.class, "TemplateInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateInstance_Template(), ecorePackage.getEString(), "template", null, 1, 1, TemplateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateInstance_Locations(), this.getLocationInstance(), this.getLocationInstance_Template(), "locations", null, 0, -1, TemplateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemplateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationInstanceEClass, LocationInstance.class, "LocationInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationInstance_Location(), ecorePackage.getEString(), "location", null, 1, 1, LocationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationInstance_Template(), this.getTemplateInstance(), this.getTemplateInstance_Locations(), "template", null, 1, 1, LocationInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_States(), this.getState(), null, "states", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Transitions(), theTransitionsPackage.getAbstractTransition(), null, "transitions", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Templates(), this.getTemplateInstance(), null, "templates", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IntermediateTracePackageImpl
