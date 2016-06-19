/**
 */
package intermediateTrace.value.impl;

import intermediateTrace.Valuation;

import intermediateTrace.value.DataVariableDeclarationValuation;
import intermediateTrace.value.ValuePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Variable Declaration Valuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.value.impl.DataVariableDeclarationValuationImpl#getDataVariableDeclaration <em>Data Variable Declaration</em>}</li>
 *   <li>{@link intermediateTrace.value.impl.DataVariableDeclarationValuationImpl#getValuation <em>Valuation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataVariableDeclarationValuationImpl extends MinimalEObjectImpl.Container implements DataVariableDeclarationValuation {
	/**
	 * The default value of the '{@link #getDataVariableDeclaration() <em>Data Variable Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_VARIABLE_DECLARATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataVariableDeclaration() <em>Data Variable Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String dataVariableDeclaration = DATA_VARIABLE_DECLARATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValuation() <em>Valuation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuation()
	 * @generated
	 * @ordered
	 */
	protected EList<Valuation> valuation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataVariableDeclarationValuationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuePackage.Literals.DATA_VARIABLE_DECLARATION_VALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataVariableDeclaration() {
		return dataVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataVariableDeclaration(String newDataVariableDeclaration) {
		String oldDataVariableDeclaration = dataVariableDeclaration;
		dataVariableDeclaration = newDataVariableDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION, oldDataVariableDeclaration, dataVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valuation> getValuation() {
		if (valuation == null) {
			valuation = new EObjectContainmentEList<Valuation>(Valuation.class, this, ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION);
		}
		return valuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				return ((InternalEList<?>)getValuation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION:
				return getDataVariableDeclaration();
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				return getValuation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION:
				setDataVariableDeclaration((String)newValue);
				return;
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				getValuation().clear();
				getValuation().addAll((Collection<? extends Valuation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION:
				setDataVariableDeclaration(DATA_VARIABLE_DECLARATION_EDEFAULT);
				return;
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				getValuation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__DATA_VARIABLE_DECLARATION:
				return DATA_VARIABLE_DECLARATION_EDEFAULT == null ? dataVariableDeclaration != null : !DATA_VARIABLE_DECLARATION_EDEFAULT.equals(dataVariableDeclaration);
			case ValuePackage.DATA_VARIABLE_DECLARATION_VALUATION__VALUATION:
				return valuation != null && !valuation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataVariableDeclaration: ");
		result.append(dataVariableDeclaration);
		result.append(')');
		return result.toString();
	}

} //DataVariableDeclarationValuationImpl
