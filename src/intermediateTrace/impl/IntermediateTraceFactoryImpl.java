/**
 */
package intermediateTrace.impl;

import intermediateTrace.*;

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
public class IntermediateTraceFactoryImpl extends EFactoryImpl implements IntermediateTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediateTraceFactory init() {
		try {
			IntermediateTraceFactory theIntermediateTraceFactory = (IntermediateTraceFactory)EPackage.Registry.INSTANCE.getEFactory(IntermediateTracePackage.eNS_URI);
			if (theIntermediateTraceFactory != null) {
				return theIntermediateTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntermediateTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateTraceFactoryImpl() {
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
			case IntermediateTracePackage.STATE: return createState();
			case IntermediateTracePackage.VALUATION: return createValuation();
			case IntermediateTracePackage.TEMPLATE_INSTANCE: return createTemplateInstance();
			case IntermediateTracePackage.LOCATION_INSTANCE: return createLocationInstance();
			case IntermediateTracePackage.TRACE: return createTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valuation createValuation() {
		ValuationImpl valuation = new ValuationImpl();
		return valuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateInstance createTemplateInstance() {
		TemplateInstanceImpl templateInstance = new TemplateInstanceImpl();
		return templateInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationInstance createLocationInstance() {
		LocationInstanceImpl locationInstance = new LocationInstanceImpl();
		return locationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateTracePackage getIntermediateTracePackage() {
		return (IntermediateTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntermediateTracePackage getPackage() {
		return IntermediateTracePackage.eINSTANCE;
	}

} //IntermediateTraceFactoryImpl
