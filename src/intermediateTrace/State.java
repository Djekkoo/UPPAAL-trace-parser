/**
 */
package intermediateTrace;

import intermediateTrace.clocks.AbstractClockBoundary;

import intermediateTrace.transitions.AbstractTransition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.State#getTransitionTo <em>Transition To</em>}</li>
 *   <li>{@link intermediateTrace.State#getLocations <em>Locations</em>}</li>
 *   <li>{@link intermediateTrace.State#getValuations <em>Valuations</em>}</li>
 *   <li>{@link intermediateTrace.State#getClocks <em>Clocks</em>}</li>
 *   <li>{@link intermediateTrace.State#getTransitionFrom <em>Transition From</em>}</li>
 *   <li>{@link intermediateTrace.State#getTemplates <em>Templates</em>}</li>
 *   <li>{@link intermediateTrace.State#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see intermediateTrace.IntermediateTracePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateTrace.transitions.AbstractTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition To</em>' reference.
	 * @see #setTransitionTo(AbstractTransition)
	 * @see intermediateTrace.IntermediateTracePackage#getState_TransitionTo()
	 * @see intermediateTrace.transitions.AbstractTransition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	AbstractTransition getTransitionTo();

	/**
	 * Sets the value of the '{@link intermediateTrace.State#getTransitionTo <em>Transition To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition To</em>' reference.
	 * @see #getTransitionTo()
	 * @generated
	 */
	void setTransitionTo(AbstractTransition value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link intermediateTrace.LocationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see intermediateTrace.IntermediateTracePackage#getState_Locations()
	 * @model
	 * @generated
	 */
	EList<LocationInstance> getLocations();

	/**
	 * Returns the value of the '<em><b>Valuations</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateTrace.Valuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuations</em>' containment reference list.
	 * @see intermediateTrace.IntermediateTracePackage#getState_Valuations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Valuation> getValuations();

	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateTrace.clocks.AbstractClockBoundary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clocks</em>' containment reference list.
	 * @see intermediateTrace.IntermediateTracePackage#getState_Clocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractClockBoundary> getClocks();

	/**
	 * Returns the value of the '<em><b>Transition From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link intermediateTrace.transitions.AbstractTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition From</em>' reference.
	 * @see #setTransitionFrom(AbstractTransition)
	 * @see intermediateTrace.IntermediateTracePackage#getState_TransitionFrom()
	 * @see intermediateTrace.transitions.AbstractTransition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	AbstractTransition getTransitionFrom();

	/**
	 * Sets the value of the '{@link intermediateTrace.State#getTransitionFrom <em>Transition From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition From</em>' reference.
	 * @see #getTransitionFrom()
	 * @generated
	 */
	void setTransitionFrom(AbstractTransition value);

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' reference list.
	 * The list contents are of type {@link intermediateTrace.TemplateInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' reference list.
	 * @see intermediateTrace.IntermediateTracePackage#getState_Templates()
	 * @model
	 * @generated
	 */
	EList<TemplateInstance> getTemplates();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(float)
	 * @see intermediateTrace.IntermediateTracePackage#getState_Time()
	 * @model required="true"
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link intermediateTrace.State#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

} // State
