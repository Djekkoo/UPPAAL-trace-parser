/**
 */
package intermediateTrace.transitions;

import intermediateTrace.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.transitions.AbstractTransition#getSource <em>Source</em>}</li>
 *   <li>{@link intermediateTrace.transitions.AbstractTransition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see intermediateTrace.transitions.TransitionsPackage#getAbstractTransition()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateTrace.State#getTransitionTo <em>Transition To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see intermediateTrace.transitions.TransitionsPackage#getAbstractTransition_Source()
	 * @see intermediateTrace.State#getTransitionTo
	 * @model opposite="transitionTo" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link intermediateTrace.transitions.AbstractTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateTrace.State#getTransitionFrom <em>Transition From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see intermediateTrace.transitions.TransitionsPackage#getAbstractTransition_Target()
	 * @see intermediateTrace.State#getTransitionFrom
	 * @model opposite="transitionFrom" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link intermediateTrace.transitions.AbstractTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

} // AbstractTransition
