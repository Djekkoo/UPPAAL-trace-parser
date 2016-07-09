/**
 */
package intermediateTrace;

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
 * @see intermediateTrace.IntermediateTraceFactory
 * @model kind="package"
 * @generated
 */
public interface IntermediateTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intermediateTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "intermediateTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intermediateTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntermediateTracePackage eINSTANCE = intermediateTrace.impl.IntermediateTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link intermediateTrace.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.impl.StateImpl
	 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Transition To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_TO = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Valuations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VALUATIONS = 2;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CLOCKS = 3;

	/**
	 * The feature id for the '<em><b>Transition From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION_FROM = 4;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TEMPLATES = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TIME = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.impl.ValuationImpl <em>Valuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.impl.ValuationImpl
	 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getValuation()
	 * @generated
	 */
	int VALUATION = 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION__TEMPLATE = 3;

	/**
	 * The number of structural features of the '<em>Valuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Valuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.impl.TemplateInstanceImpl <em>Template Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.impl.TemplateInstanceImpl
	 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getTemplateInstance()
	 * @generated
	 */
	int TEMPLATE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Template Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Template Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.impl.LocationInstanceImpl <em>Location Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.impl.LocationInstanceImpl
	 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getLocationInstance()
	 * @generated
	 */
	int LOCATION_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_INSTANCE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_INSTANCE__TEMPLATE = 1;

	/**
	 * The number of structural features of the '<em>Location Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link intermediateTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see intermediateTrace.impl.TraceImpl
	 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TEMPLATES = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link intermediateTrace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see intermediateTrace.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link intermediateTrace.State#getTransitionTo <em>Transition To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition To</em>'.
	 * @see intermediateTrace.State#getTransitionTo()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_TransitionTo();

	/**
	 * Returns the meta object for the reference list '{@link intermediateTrace.State#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see intermediateTrace.State#getLocations()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.State#getValuations <em>Valuations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valuations</em>'.
	 * @see intermediateTrace.State#getValuations()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Valuations();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.State#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see intermediateTrace.State#getClocks()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Clocks();

	/**
	 * Returns the meta object for the reference '{@link intermediateTrace.State#getTransitionFrom <em>Transition From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition From</em>'.
	 * @see intermediateTrace.State#getTransitionFrom()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_TransitionFrom();

	/**
	 * Returns the meta object for the reference list '{@link intermediateTrace.State#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Templates</em>'.
	 * @see intermediateTrace.State#getTemplates()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Templates();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.State#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see intermediateTrace.State#getTime()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Time();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.Valuation <em>Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuation</em>'.
	 * @see intermediateTrace.Valuation
	 * @generated
	 */
	EClass getValuation();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.Valuation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see intermediateTrace.Valuation#getVariable()
	 * @see #getValuation()
	 * @generated
	 */
	EAttribute getValuation_Variable();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.Valuation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermediateTrace.Valuation#getName()
	 * @see #getValuation()
	 * @generated
	 */
	EAttribute getValuation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link intermediateTrace.Valuation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see intermediateTrace.Valuation#getValue()
	 * @see #getValuation()
	 * @generated
	 */
	EReference getValuation_Value();

	/**
	 * Returns the meta object for the reference '{@link intermediateTrace.Valuation#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see intermediateTrace.Valuation#getTemplate()
	 * @see #getValuation()
	 * @generated
	 */
	EReference getValuation_Template();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.TemplateInstance <em>Template Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Instance</em>'.
	 * @see intermediateTrace.TemplateInstance
	 * @generated
	 */
	EClass getTemplateInstance();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.TemplateInstance#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see intermediateTrace.TemplateInstance#getTemplate()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EAttribute getTemplateInstance_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.TemplateInstance#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see intermediateTrace.TemplateInstance#getLocations()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EReference getTemplateInstance_Locations();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.TemplateInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see intermediateTrace.TemplateInstance#getName()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EAttribute getTemplateInstance_Name();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.LocationInstance <em>Location Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Instance</em>'.
	 * @see intermediateTrace.LocationInstance
	 * @generated
	 */
	EClass getLocationInstance();

	/**
	 * Returns the meta object for the attribute '{@link intermediateTrace.LocationInstance#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see intermediateTrace.LocationInstance#getLocation()
	 * @see #getLocationInstance()
	 * @generated
	 */
	EAttribute getLocationInstance_Location();

	/**
	 * Returns the meta object for the container reference '{@link intermediateTrace.LocationInstance#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template</em>'.
	 * @see intermediateTrace.LocationInstance#getTemplate()
	 * @see #getLocationInstance()
	 * @generated
	 */
	EReference getLocationInstance_Template();

	/**
	 * Returns the meta object for class '{@link intermediateTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see intermediateTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.Trace#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see intermediateTrace.Trace#getStates()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_States();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.Trace#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see intermediateTrace.Trace#getTransitions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link intermediateTrace.Trace#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see intermediateTrace.Trace#getTemplates()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Templates();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntermediateTraceFactory getIntermediateTraceFactory();

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
		 * The meta object literal for the '{@link intermediateTrace.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.impl.StateImpl
		 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Transition To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_TO = eINSTANCE.getState_TransitionTo();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LOCATIONS = eINSTANCE.getState_Locations();

		/**
		 * The meta object literal for the '<em><b>Valuations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VALUATIONS = eINSTANCE.getState_Valuations();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CLOCKS = eINSTANCE.getState_Clocks();

		/**
		 * The meta object literal for the '<em><b>Transition From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION_FROM = eINSTANCE.getState_TransitionFrom();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TEMPLATES = eINSTANCE.getState_Templates();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TIME = eINSTANCE.getState_Time();

		/**
		 * The meta object literal for the '{@link intermediateTrace.impl.ValuationImpl <em>Valuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.impl.ValuationImpl
		 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getValuation()
		 * @generated
		 */
		EClass VALUATION = eINSTANCE.getValuation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUATION__VARIABLE = eINSTANCE.getValuation_Variable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUATION__NAME = eINSTANCE.getValuation_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUATION__VALUE = eINSTANCE.getValuation_Value();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUATION__TEMPLATE = eINSTANCE.getValuation_Template();

		/**
		 * The meta object literal for the '{@link intermediateTrace.impl.TemplateInstanceImpl <em>Template Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.impl.TemplateInstanceImpl
		 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getTemplateInstance()
		 * @generated
		 */
		EClass TEMPLATE_INSTANCE = eINSTANCE.getTemplateInstance();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_INSTANCE__TEMPLATE = eINSTANCE.getTemplateInstance_Template();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_INSTANCE__LOCATIONS = eINSTANCE.getTemplateInstance_Locations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_INSTANCE__NAME = eINSTANCE.getTemplateInstance_Name();

		/**
		 * The meta object literal for the '{@link intermediateTrace.impl.LocationInstanceImpl <em>Location Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.impl.LocationInstanceImpl
		 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getLocationInstance()
		 * @generated
		 */
		EClass LOCATION_INSTANCE = eINSTANCE.getLocationInstance();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_INSTANCE__LOCATION = eINSTANCE.getLocationInstance_Location();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_INSTANCE__TEMPLATE = eINSTANCE.getLocationInstance_Template();

		/**
		 * The meta object literal for the '{@link intermediateTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see intermediateTrace.impl.TraceImpl
		 * @see intermediateTrace.impl.IntermediateTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATES = eINSTANCE.getTrace_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRANSITIONS = eINSTANCE.getTrace_Transitions();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TEMPLATES = eINSTANCE.getTrace_Templates();

	}

} //IntermediateTracePackage
