/**
 */
package intermediateTrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.TemplateInstance#getTemplate <em>Template</em>}</li>
 *   <li>{@link intermediateTrace.TemplateInstance#getLocations <em>Locations</em>}</li>
 *   <li>{@link intermediateTrace.TemplateInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see intermediateTrace.IntermediateTracePackage#getTemplateInstance()
 * @model
 * @generated
 */
public interface TemplateInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(String)
	 * @see intermediateTrace.IntermediateTracePackage#getTemplateInstance_Template()
	 * @model required="true"
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link intermediateTrace.TemplateInstance#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link intermediateTrace.LocationInstance}.
	 * It is bidirectional and its opposite is '{@link intermediateTrace.LocationInstance#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see intermediateTrace.IntermediateTracePackage#getTemplateInstance_Locations()
	 * @see intermediateTrace.LocationInstance#getTemplate
	 * @model opposite="template" containment="true"
	 * @generated
	 */
	EList<LocationInstance> getLocations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see intermediateTrace.IntermediateTracePackage#getTemplateInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link intermediateTrace.TemplateInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TemplateInstance
