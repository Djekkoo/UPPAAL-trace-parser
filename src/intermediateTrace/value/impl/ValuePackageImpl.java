/**
 */
package intermediateTrace.value.impl;

import intermediateTrace.IntermediateTracePackage;

import intermediateTrace.clocks.ClocksPackage;

import intermediateTrace.clocks.impl.ClocksPackageImpl;

import intermediateTrace.impl.IntermediateTracePackageImpl;

import intermediateTrace.transitions.TransitionsPackage;

import intermediateTrace.transitions.impl.TransitionsPackageImpl;

import intermediateTrace.value.ArrayValue;
import intermediateTrace.value.BoolValue;
import intermediateTrace.value.BuiltInTypeValue;
import intermediateTrace.value.ChanValue;
import intermediateTrace.value.ClockValue;
import intermediateTrace.value.DataVariableDeclarationValuation;
import intermediateTrace.value.IntValue;
import intermediateTrace.value.RangeSpecificationValue;
import intermediateTrace.value.ScalarSpecificationValue;
import intermediateTrace.value.StructSpecificationValue;
import intermediateTrace.value.TypeSpecificationValue;
import intermediateTrace.value.Value;
import intermediateTrace.value.ValueFactory;
import intermediateTrace.value.ValuePackage;
import intermediateTrace.value.VoidValue;

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
public class ValuePackageImpl extends EPackageImpl implements ValuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInTypeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarSpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structSpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeSpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVariableDeclarationValuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

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
	 * @see intermediateTrace.value.ValuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuePackageImpl() {
		super(eNS_URI, ValueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuePackage init() {
		if (isInited) return (ValuePackage)EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI);

		// Obtain or create and register package
		ValuePackageImpl theValuePackage = (ValuePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValuePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValuePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IntermediateTracePackageImpl theIntermediateTracePackage = (IntermediateTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateTracePackage.eNS_URI) instanceof IntermediateTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateTracePackage.eNS_URI) : IntermediateTracePackage.eINSTANCE);
		TransitionsPackageImpl theTransitionsPackage = (TransitionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI) instanceof TransitionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransitionsPackage.eNS_URI) : TransitionsPackage.eINSTANCE);
		ClocksPackageImpl theClocksPackage = (ClocksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) instanceof ClocksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClocksPackage.eNS_URI) : ClocksPackage.eINSTANCE);

		// Create package meta-data objects
		theValuePackage.createPackageContents();
		theIntermediateTracePackage.createPackageContents();
		theTransitionsPackage.createPackageContents();
		theClocksPackage.createPackageContents();

		// Initialize created meta-data
		theValuePackage.initializePackageContents();
		theIntermediateTracePackage.initializePackageContents();
		theTransitionsPackage.initializePackageContents();
		theClocksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValuePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuePackage.eNS_URI, theValuePackage);
		return theValuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInTypeValue() {
		return builtInTypeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChanValue() {
		return chanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolValue() {
		return boolValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolValue_Value() {
		return (EAttribute)boolValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntValue() {
		return intValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntValue_Value() {
		return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockValue() {
		return clockValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockValue_Value() {
		return (EAttribute)clockValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidValue() {
		return voidValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSpecificationValue() {
		return typeSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarSpecificationValue() {
		return scalarSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalarSpecificationValue_Value() {
		return (EReference)scalarSpecificationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructSpecificationValue() {
		return structSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructSpecificationValue_Value() {
		return (EReference)structSpecificationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeSpecificationValue() {
		return rangeSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeSpecificationValue_Value() {
		return (EReference)rangeSpecificationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataVariableDeclarationValuation() {
		return dataVariableDeclarationValuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataVariableDeclarationValuation_DataVariableDeclaration() {
		return (EAttribute)dataVariableDeclarationValuationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataVariableDeclarationValuation_Valuation() {
		return (EReference)dataVariableDeclarationValuationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayValue_Value() {
		return (EReference)arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueFactory getValueFactory() {
		return (ValueFactory)getEFactoryInstance();
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
		valueEClass = createEClass(VALUE);

		builtInTypeValueEClass = createEClass(BUILT_IN_TYPE_VALUE);

		chanValueEClass = createEClass(CHAN_VALUE);

		boolValueEClass = createEClass(BOOL_VALUE);
		createEAttribute(boolValueEClass, BOOL_VALUE__VALUE);

		intValueEClass = createEClass(INT_VALUE);
		createEAttribute(intValueEClass, INT_VALUE__VALUE);

		clockValueEClass = createEClass(CLOCK_VALUE);
		createEAttribute(clockValueEClass, CLOCK_VALUE__VALUE);

		voidValueEClass = createEClass(VOID_VALUE);

		typeSpecificationValueEClass = createEClass(TYPE_SPECIFICATION_VALUE);

		scalarSpecificationValueEClass = createEClass(SCALAR_SPECIFICATION_VALUE);
		createEReference(scalarSpecificationValueEClass, SCALAR_SPECIFICATION_VALUE__VALUE);

		structSpecificationValueEClass = createEClass(STRUCT_SPECIFICATION_VALUE);
		createEReference(structSpecificationValueEClass, STRUCT_SPECIFICATION_VALUE__VALUE);

		rangeSpecificationValueEClass = createEClass(RANGE_SPECIFICATION_VALUE);
		createEReference(rangeSpecificationValueEClass, RANGE_SPECIFICATION_VALUE__VALUE);

		dataVariableDeclarationValuationEClass = createEClass(DATA_VARIABLE_DECLARATION_VALUATION);
		createEAttribute(dataVariableDeclarationValuationEClass, DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION);
		createEReference(dataVariableDeclarationValuationEClass, DATA_VARIABLE_DECLARATION_VALUATION__VALUATION);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__VALUE);
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
		builtInTypeValueEClass.getESuperTypes().add(this.getValue());
		chanValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		boolValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		intValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		clockValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		voidValueEClass.getESuperTypes().add(this.getBuiltInTypeValue());
		typeSpecificationValueEClass.getESuperTypes().add(this.getValue());
		scalarSpecificationValueEClass.getESuperTypes().add(this.getTypeSpecificationValue());
		structSpecificationValueEClass.getESuperTypes().add(this.getTypeSpecificationValue());
		rangeSpecificationValueEClass.getESuperTypes().add(this.getTypeSpecificationValue());
		arrayValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builtInTypeValueEClass, BuiltInTypeValue.class, "BuiltInTypeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chanValueEClass, ChanValue.class, "ChanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolValueEClass, BoolValue.class, "BoolValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BoolValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockValueEClass, ClockValue.class, "ClockValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClockValue_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, ClockValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidValueEClass, VoidValue.class, "VoidValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeSpecificationValueEClass, TypeSpecificationValue.class, "TypeSpecificationValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalarSpecificationValueEClass, ScalarSpecificationValue.class, "ScalarSpecificationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalarSpecificationValue_Value(), this.getIntValue(), null, "value", null, 1, 1, ScalarSpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structSpecificationValueEClass, StructSpecificationValue.class, "StructSpecificationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructSpecificationValue_Value(), this.getDataVariableDeclarationValuation(), null, "value", null, 0, -1, StructSpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeSpecificationValueEClass, RangeSpecificationValue.class, "RangeSpecificationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeSpecificationValue_Value(), this.getIntValue(), null, "value", null, 0, 1, RangeSpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataVariableDeclarationValuationEClass, DataVariableDeclarationValuation.class, "DataVariableDeclarationValuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataVariableDeclarationValuation_DataVariableDeclaration(), ecorePackage.getEString(), "dataVariableDeclaration", null, 1, 1, DataVariableDeclarationValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataVariableDeclarationValuation_Valuation(), theIntermediateTracePackage.getValuation(), null, "valuation", null, 0, -1, DataVariableDeclarationValuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Value(), this.getValue(), null, "value", null, 0, -1, ArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ValuePackageImpl
