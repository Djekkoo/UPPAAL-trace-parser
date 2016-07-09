/**
 */
package intermediateTrace.transitions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.transitions.EdgeTransition#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see intermediateTrace.transitions.TransitionsPackage#getEdgeTransition()
 * @model
 * @generated
 */
public interface EdgeTransition extends AbstractTransition {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' attribute list.
	 * @see intermediateTrace.transitions.TransitionsPackage#getEdgeTransition_Edges()
	 * @model
	 * @generated
	 */
	EList<String> getEdges();

} // EdgeTransition
