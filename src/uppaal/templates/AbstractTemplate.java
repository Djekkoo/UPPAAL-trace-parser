/**
 */
package uppaal.templates;

import org.eclipse.emf.common.util.EList;

import uppaal.core.CommentableElement;
import uppaal.core.NamedElement;
import uppaal.declarations.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for ordinary timed automata templates as well as redefined templates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaal.templates.AbstractTemplate#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see uppaal.templates.TemplatesPackage#getAbstractTemplate()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueParameterNames='self.parameter->collect(variableDeclaration)->collect(variable)->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames'"
 * @generated
 */
public interface AbstractTemplate extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link uppaal.declarations.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter declarations of the template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see uppaal.templates.TemplatesPackage#getAbstractTemplate_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // AbstractTemplate
