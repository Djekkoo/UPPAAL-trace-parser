/**
 */
package intermediateTrace.transitions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.transitions.DelayTransition#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see intermediateTrace.transitions.TransitionsPackage#getDelayTransition()
 * @model
 * @generated
 */
public interface DelayTransition extends AbstractTransition {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(float)
	 * @see intermediateTrace.transitions.TransitionsPackage#getDelayTransition_Delay()
	 * @model required="true"
	 * @generated
	 */
	float getDelay();

	/**
	 * Sets the value of the '{@link intermediateTrace.transitions.DelayTransition#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(float value);

} // DelayTransition
