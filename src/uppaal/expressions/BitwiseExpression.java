/**
 */
package uppaal.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bitwise Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A binary expression representing an arithemtic operation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uppaal.expressions.BitwiseExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see uppaal.expressions.ExpressionsPackage#getBitwiseExpression()
 * @model
 * @generated
 */
public interface BitwiseExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link uppaal.expressions.BitwiseOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arithmetic operator to be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see uppaal.expressions.BitwiseOperator
	 * @see #setOperator(BitwiseOperator)
	 * @see uppaal.expressions.ExpressionsPackage#getBitwiseExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	BitwiseOperator getOperator();

	/**
	 * Sets the value of the '{@link uppaal.expressions.BitwiseExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see uppaal.expressions.BitwiseOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BitwiseOperator value);

} // BitwiseExpression
