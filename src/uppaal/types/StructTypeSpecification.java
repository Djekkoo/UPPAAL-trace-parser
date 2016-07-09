/**
 */
package uppaal.types;

import org.eclipse.emf.common.util.EList;

import uppaal.declarations.DataVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specification of a 'struct' type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaal.types.StructTypeSpecification#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see uppaal.types.TypesPackage#getStructTypeSpecification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueFieldNames='self.declaration->collect(variable)->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueFieldNames'"
 * @generated
 */
public interface StructTypeSpecification extends TypeSpecification {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link uppaal.declarations.DataVariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variable declarations representing the fields of the 'struct' type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see uppaal.types.TypesPackage#getStructTypeSpecification_Declaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataVariableDeclaration> getDeclaration();

} // StructTypeSpecification
