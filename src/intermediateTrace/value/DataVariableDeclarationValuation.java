/**
 */
package intermediateTrace.value;

import intermediateTrace.Valuation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Variable Declaration Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.value.DataVariableDeclarationValuation#getDataVariableDeclaration <em>Data Variable Declaration</em>}</li>
 *   <li>{@link intermediateTrace.value.DataVariableDeclarationValuation#getValuation <em>Valuation</em>}</li>
 * </ul>
 *
 * @see intermediateTrace.value.ValuePackage#getDataVariableDeclarationValuation()
 * @model
 * @generated
 */
public interface DataVariableDeclarationValuation extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Variable Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Variable Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Variable Declaration</em>' attribute.
	 * @see #setDataVariableDeclaration(String)
	 * @see intermediateTrace.value.ValuePackage#getDataVariableDeclarationValuation_DataVariableDeclaration()
	 * @model required="true"
	 * @generated
	 */
	String getDataVariableDeclaration();

	/**
	 * Sets the value of the '{@link intermediateTrace.value.DataVariableDeclarationValuation#getDataVariableDeclaration <em>Data Variable Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Variable Declaration</em>' attribute.
	 * @see #getDataVariableDeclaration()
	 * @generated
	 */
	void setDataVariableDeclaration(String value);

	/**
	 * Returns the value of the '<em><b>Valuation</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateTrace.Valuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuation</em>' containment reference list.
	 * @see intermediateTrace.value.ValuePackage#getDataVariableDeclarationValuation_Valuation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Valuation> getValuation();

} // DataVariableDeclarationValuation
