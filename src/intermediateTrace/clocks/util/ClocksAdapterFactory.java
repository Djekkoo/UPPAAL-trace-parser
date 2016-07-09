/**
 */
package intermediateTrace.clocks.util;

import intermediateTrace.clocks.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see intermediateTrace.clocks.ClocksPackage
 * @generated
 */
public class ClocksAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClocksPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClocksAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClocksPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClocksSwitch<Adapter> modelSwitch =
		new ClocksSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractClockBoundary(AbstractClockBoundary object) {
				return createAbstractClockBoundaryAdapter();
			}
			@Override
			public Adapter caseSingleClockBoundary(SingleClockBoundary object) {
				return createSingleClockBoundaryAdapter();
			}
			@Override
			public Adapter caseInverseClockBoundary(InverseClockBoundary object) {
				return createInverseClockBoundaryAdapter();
			}
			@Override
			public Adapter caseCombinedClockBoundary(CombinedClockBoundary object) {
				return createCombinedClockBoundaryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link intermediateTrace.clocks.AbstractClockBoundary <em>Abstract Clock Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateTrace.clocks.AbstractClockBoundary
	 * @generated
	 */
	public Adapter createAbstractClockBoundaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateTrace.clocks.SingleClockBoundary <em>Single Clock Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateTrace.clocks.SingleClockBoundary
	 * @generated
	 */
	public Adapter createSingleClockBoundaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateTrace.clocks.InverseClockBoundary <em>Inverse Clock Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateTrace.clocks.InverseClockBoundary
	 * @generated
	 */
	public Adapter createInverseClockBoundaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link intermediateTrace.clocks.CombinedClockBoundary <em>Combined Clock Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see intermediateTrace.clocks.CombinedClockBoundary
	 * @generated
	 */
	public Adapter createCombinedClockBoundaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClocksAdapterFactory
