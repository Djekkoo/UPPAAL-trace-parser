/**
 */
package uppaal.declarations;

import uppaal.declarations.system.ProgressMeasure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * System declarations consisting of process instantiations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaal.declarations.SystemDeclarations#getSystem <em>System</em>}</li>
 *   <li>{@link uppaal.declarations.SystemDeclarations#getProgressMeasure <em>Progress Measure</em>}</li>
 * </ul>
 *
 * @see uppaal.declarations.DeclarationsPackage#getSystemDeclarations()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueTemplateNames='self.declaration->select(oclIsKindOf(system::TemplateDeclaration)).oclAsType(system::TemplateDeclaration)->collect(declaredTemplate)->isUnique(name)' NoChannelDeclarations='not self.declaration->exists(oclIsKindOf(ChannelVariableDeclaration))'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueTemplateNames NoChannelDeclarations'"
 * @generated
 */
public interface SystemDeclarations extends Declarations {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system section describing the process instantiations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(uppaal.declarations.system.System)
	 * @see uppaal.declarations.DeclarationsPackage#getSystemDeclarations_System()
	 * @model containment="true" required="true"
	 * @generated
	 */
	uppaal.declarations.system.System getSystem();

	/**
	 * Sets the value of the '{@link uppaal.declarations.SystemDeclarations#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(uppaal.declarations.system.System value);

	/**
	 * Returns the value of the '<em><b>Progress Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional progress measure section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Measure</em>' containment reference.
	 * @see #setProgressMeasure(ProgressMeasure)
	 * @see uppaal.declarations.DeclarationsPackage#getSystemDeclarations_ProgressMeasure()
	 * @model containment="true"
	 * @generated
	 */
	ProgressMeasure getProgressMeasure();

	/**
	 * Sets the value of the '{@link uppaal.declarations.SystemDeclarations#getProgressMeasure <em>Progress Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Measure</em>' containment reference.
	 * @see #getProgressMeasure()
	 * @generated
	 */
	void setProgressMeasure(ProgressMeasure value);

} // SystemDeclarations
