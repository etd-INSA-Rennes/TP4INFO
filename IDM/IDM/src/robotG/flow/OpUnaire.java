/**
 */
package robotG.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Unaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robotG.flow.OpUnaire#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see robotG.flow.FlowPackage#getOpUnaire()
 * @model abstract="true"
 * @generated
 */
public interface OpUnaire extends ExprBool {
	/**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ExprBool)
   * @see robotG.flow.FlowPackage#getOpUnaire_Expression()
   * @model containment="true" required="true"
   * @generated
   */
	ExprBool getExpression();

	/**
   * Sets the value of the '{@link robotG.flow.OpUnaire#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
	void setExpression(ExprBool value);

} // OpUnaire
