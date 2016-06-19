/**
 */
package intermediateTrace.value;

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
 * @see intermediateTrace.value.ValueFactory
 * @model kind="package"
 * @generated
 */
public interface ValuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "value";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "myTrace.value";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "myTrace.value";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValuePackage eINSTANCE = intermediateTrace.value.impl.ValuePackageImpl.init();

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.ValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.BuiltInTypeValueImpl <em>Built In Type Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.BuiltInTypeValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getBuiltInTypeValue()
	 * @generated
	 */
	int BUILT_IN_TYPE_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Built In Type Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Built In Type Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_TYPE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.ChanValueImpl <em>Chan Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.ChanValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getChanValue()
	 * @generated
	 */
	int CHAN_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Chan Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAN_VALUE_FEATURE_COUNT = BUILT_IN_TYPE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chan Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAN_VALUE_OPERATION_COUNT = BUILT_IN_TYPE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.BoolValueImpl <em>Bool Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.BoolValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getBoolValue()
	 * @generated
	 */
	int BOOL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE__VALUE = BUILT_IN_TYPE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_FEATURE_COUNT = BUILT_IN_TYPE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VALUE_OPERATION_COUNT = BUILT_IN_TYPE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.IntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.IntValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getIntValue()
	 * @generated
	 */
	int INT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__VALUE = BUILT_IN_TYPE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_FEATURE_COUNT = BUILT_IN_TYPE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_OPERATION_COUNT = BUILT_IN_TYPE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.ClockValueImpl <em>Clock Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.ClockValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getClockValue()
	 * @generated
	 */
	int CLOCK_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_VALUE__VALUE = BUILT_IN_TYPE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_VALUE_FEATURE_COUNT = BUILT_IN_TYPE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clock Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_VALUE_OPERATION_COUNT = BUILT_IN_TYPE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.VoidValueImpl <em>Void Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.VoidValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getVoidValue()
	 * @generated
	 */
	int VOID_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Void Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_VALUE_FEATURE_COUNT = BUILT_IN_TYPE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_VALUE_OPERATION_COUNT = BUILT_IN_TYPE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.TypeSpecificationValueImpl <em>Type Specification Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.TypeSpecificationValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getTypeSpecificationValue()
	 * @generated
	 */
	int TYPE_SPECIFICATION_VALUE = 7;

	/**
	 * The number of structural features of the '<em>Type Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFICATION_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.ScalarSpecificationValueImpl <em>Scalar Specification Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.ScalarSpecificationValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getScalarSpecificationValue()
	 * @generated
	 */
	int SCALAR_SPECIFICATION_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_SPECIFICATION_VALUE__VALUE = TYPE_SPECIFICATION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scalar Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_SPECIFICATION_VALUE_FEATURE_COUNT = TYPE_SPECIFICATION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scalar Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_SPECIFICATION_VALUE_OPERATION_COUNT = TYPE_SPECIFICATION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.StructSpecificationValueImpl <em>Struct Specification Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.StructSpecificationValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getStructSpecificationValue()
	 * @generated
	 */
	int STRUCT_SPECIFICATION_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SPECIFICATION_VALUE__VALUE = TYPE_SPECIFICATION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SPECIFICATION_VALUE_FEATURE_COUNT = TYPE_SPECIFICATION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Struct Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SPECIFICATION_VALUE_OPERATION_COUNT = TYPE_SPECIFICATION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.RangeSpecificationValueImpl <em>Range Specification Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.RangeSpecificationValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getRangeSpecificationValue()
	 * @generated
	 */
	int RANGE_SPECIFICATION_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SPECIFICATION_VALUE__VALUE = TYPE_SPECIFICATION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SPECIFICATION_VALUE_FEATURE_COUNT = TYPE_SPECIFICATION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Range Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SPECIFICATION_VALUE_OPERATION_COUNT = TYPE_SPECIFICATION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.DataVariableDeclarationValuationImpl <em>Data Variable Declaration Valuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.DataVariableDeclarationValuationImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getDataVariableDeclarationValuation()
	 * @generated
	 */
	int DATA_VARIABLE_DECLARATION_VALUATION = 11;

	/**
	 * The feature id for the '<em><b>Data Variable Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VARIABLE_DECLARATION_VALUATION__VALUATION = 1;

	/**
	 * The number of structural features of the '<em>Data Variable Declaration Valuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VARIABLE_DECLARATION_VALUATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Variable Declaration Valuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VARIABLE_DECLARATION_VALUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.value.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.value.impl.ArrayValueImpl
	 * @see intermediateTrace.value.impl.ValuePackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see intermediateTrace.value.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.BuiltInTypeValue <em>Built In Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Type Value</em>'.
	 * @see intermediateTrace.value.BuiltInTypeValue
	 * @generated
	 */
	EClass getBuiltInTypeValue();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.ChanValue <em>Chan Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chan Value</em>'.
	 * @see intermediateTrace.value.ChanValue
	 * @generated
	 */
	EClass getChanValue();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.BoolValue <em>Bool Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Value</em>'.
	 * @see intermediateTrace.value.BoolValue
	 * @generated
	 */
	EClass getBoolValue();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.value.BoolValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see intermediateTrace.value.BoolValue#isValue()
	 * @see #getBoolValue()
	 * @generated
	 */
	EAttribute getBoolValue_Value();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see intermediateTrace.value.IntValue
	 * @generated
	 */
	EClass getIntValue();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.value.IntValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see intermediateTrace.value.IntValue#getValue()
	 * @see #getIntValue()
	 * @generated
	 */
	EAttribute getIntValue_Value();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.ClockValue <em>Clock Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Value</em>'.
	 * @see intermediateTrace.value.ClockValue
	 * @generated
	 */
	EClass getClockValue();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.value.ClockValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see intermediateTrace.value.ClockValue#getValue()
	 * @see #getClockValue()
	 * @generated
	 */
	EAttribute getClockValue_Value();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.VoidValue <em>Void Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Value</em>'.
	 * @see intermediateTrace.value.VoidValue
	 * @generated
	 */
	EClass getVoidValue();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.TypeSpecificationValue <em>Type Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Specification Value</em>'.
	 * @see intermediateTrace.value.TypeSpecificationValue
	 * @generated
	 */
	EClass getTypeSpecificationValue();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.ScalarSpecificationValue <em>Scalar Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Specification Value</em>'.
	 * @see intermediateTrace.value.ScalarSpecificationValue
	 * @generated
	 */
	EClass getScalarSpecificationValue();

	/**
	 * Returns the meta object for the containment reference '{@link intermediateTrace.value.ScalarSpecificationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see intermediateTrace.value.ScalarSpecificationValue#getValue()
	 * @see #getScalarSpecificationValue()
	 * @generated
	 */
	EReference getScalarSpecificationValue_Value();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.StructSpecificationValue <em>Struct Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Specification Value</em>'.
	 * @see intermediateTrace.value.StructSpecificationValue
	 * @generated
	 */
	EClass getStructSpecificationValue();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.value.StructSpecificationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see intermediateTrace.value.StructSpecificationValue#getValue()
	 * @see #getStructSpecificationValue()
	 * @generated
	 */
	EReference getStructSpecificationValue_Value();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.RangeSpecificationValue <em>Range Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Specification Value</em>'.
	 * @see intermediateTrace.value.RangeSpecificationValue
	 * @generated
	 */
	EClass getRangeSpecificationValue();

	/**
	 * Returns the meta object for the containment reference '{@link intermediateTrace.value.RangeSpecificationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see intermediateTrace.value.RangeSpecificationValue#getValue()
	 * @see #getRangeSpecificationValue()
	 * @generated
	 */
	EReference getRangeSpecificationValue_Value();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.DataVariableDeclarationValuation <em>Data Variable Declaration Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Variable Declaration Valuation</em>'.
	 * @see intermediateTrace.value.DataVariableDeclarationValuation
	 * @generated
	 */
	EClass getDataVariableDeclarationValuation();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.value.DataVariableDeclarationValuation#getDataVariableDeclaration <em>Data Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Variable Declaration</em>'.
	 * @see intermediateTrace.value.DataVariableDeclarationValuation#getDataVariableDeclaration()
	 * @see #getDataVariableDeclarationValuation()
	 * @generated
	 */
	EAttribute getDataVariableDeclarationValuation_DataVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.value.DataVariableDeclarationValuation#getValuation <em>Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valuation</em>'.
	 * @see intermediateTrace.value.DataVariableDeclarationValuation#getValuation()
	 * @see #getDataVariableDeclarationValuation()
	 * @generated
	 */
	EReference getDataVariableDeclarationValuation_Valuation();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.value.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see intermediateTrace.value.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.value.ArrayValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see intermediateTrace.value.ArrayValue#getValue()
	 * @see #getArrayValue()
	 * @generated
	 */
	EReference getArrayValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValueFactory getValueFactory();

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
		 * The meta object literal for the '{@link intermediateTrace.value.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.ValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.BuiltInTypeValueImpl <em>Built In Type Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.BuiltInTypeValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getBuiltInTypeValue()
		 * @generated
		 */
		EClass BUILT_IN_TYPE_VALUE = eINSTANCE.getBuiltInTypeValue();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.ChanValueImpl <em>Chan Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.ChanValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getChanValue()
		 * @generated
		 */
		EClass CHAN_VALUE = eINSTANCE.getChanValue();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.BoolValueImpl <em>Bool Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.BoolValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getBoolValue()
		 * @generated
		 */
		EClass BOOL_VALUE = eINSTANCE.getBoolValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_VALUE__VALUE = eINSTANCE.getBoolValue_Value();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.IntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.IntValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getIntValue()
		 * @generated
		 */
		EClass INT_VALUE = eINSTANCE.getIntValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.ClockValueImpl <em>Clock Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.ClockValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getClockValue()
		 * @generated
		 */
		EClass CLOCK_VALUE = eINSTANCE.getClockValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_VALUE__VALUE = eINSTANCE.getClockValue_Value();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.VoidValueImpl <em>Void Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.VoidValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getVoidValue()
		 * @generated
		 */
		EClass VOID_VALUE = eINSTANCE.getVoidValue();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.TypeSpecificationValueImpl <em>Type Specification Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.TypeSpecificationValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getTypeSpecificationValue()
		 * @generated
		 */
		EClass TYPE_SPECIFICATION_VALUE = eINSTANCE.getTypeSpecificationValue();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.ScalarSpecificationValueImpl <em>Scalar Specification Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.ScalarSpecificationValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getScalarSpecificationValue()
		 * @generated
		 */
		EClass SCALAR_SPECIFICATION_VALUE = eINSTANCE.getScalarSpecificationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_SPECIFICATION_VALUE__VALUE = eINSTANCE.getScalarSpecificationValue_Value();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.StructSpecificationValueImpl <em>Struct Specification Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.StructSpecificationValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getStructSpecificationValue()
		 * @generated
		 */
		EClass STRUCT_SPECIFICATION_VALUE = eINSTANCE.getStructSpecificationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_SPECIFICATION_VALUE__VALUE = eINSTANCE.getStructSpecificationValue_Value();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.RangeSpecificationValueImpl <em>Range Specification Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.RangeSpecificationValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getRangeSpecificationValue()
		 * @generated
		 */
		EClass RANGE_SPECIFICATION_VALUE = eINSTANCE.getRangeSpecificationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_SPECIFICATION_VALUE__VALUE = eINSTANCE.getRangeSpecificationValue_Value();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.DataVariableDeclarationValuationImpl <em>Data Variable Declaration Valuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.DataVariableDeclarationValuationImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getDataVariableDeclarationValuation()
		 * @generated
		 */
		EClass DATA_VARIABLE_DECLARATION_VALUATION = eINSTANCE.getDataVariableDeclarationValuation();

		/**
		 * The meta object literal for the '<em><b>Data Variable Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION = eINSTANCE.getDataVariableDeclarationValuation_DataVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Valuation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_VARIABLE_DECLARATION_VALUATION__VALUATION = eINSTANCE.getDataVariableDeclarationValuation_Valuation();

		/**
		 * The meta object literal for the '{@link intermediateTrace.value.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.value.impl.ArrayValueImpl
		 * @see intermediateTrace.value.impl.ValuePackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__VALUE = eINSTANCE.getArrayValue_Value();

	}

} //ValuePackage
