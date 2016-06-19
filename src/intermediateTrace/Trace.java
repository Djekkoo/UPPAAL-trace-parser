/**
 */
package intermediateTrace;

import intermediateTrace.transitions.AbstractTransition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.Trace#getStates <em>States</em>}</li>
 *   <li>{@link intermediateTrace.Trace#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link intermediateTrace.Trace#getTemplates <em>Templates</em>}</li>
 * </ul>
 *
 * @see intermediateTrace.IntermediateTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateTrace.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see intermediateTrace.IntermediateTracePackage#getTrace_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateTrace.transitions.AbstractTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see intermediateTrace.IntermediateTracePackage#getTrace_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTransition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateTrace.TemplateInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see intermediateTrace.IntermediateTracePackage#getTrace_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateInstance> getTemplates();

} // Trace
