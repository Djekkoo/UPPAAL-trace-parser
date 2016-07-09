/**
 */
package intermediateTrace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.LocationInstance#getLocation <em>Location</em>}</li>
 *   <li>{@link intermediateTrace.LocationInstance#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see intermediateTrace.IntermediateTracePackage#getLocationInstance()
 * @model
 * @generated
 */
public interface LocationInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see intermediateTrace.IntermediateTracePackage#getLocationInstance_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link intermediateTrace.LocationInstance#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link intermediateTrace.TemplateInstance#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateInstance)
	 * @see intermediateTrace.IntermediateTracePackage#getLocationInstance_Template()
	 * @see intermediateTrace.TemplateInstance#getLocations
	 * @model opposite="locations" required="true" transient="false"
	 * @generated
	 */
	TemplateInstance getTemplate();

	/**
	 * Sets the value of the '{@link intermediateTrace.LocationInstance#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateInstance value);

} // LocationInstance
