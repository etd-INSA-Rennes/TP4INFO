/**
 */
package robotG.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robotG.flow.While#getCondition <em>Condition</em>}</li>
 *   <li>{@link robotG.flow.While#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see robotG.flow.FlowPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Expr {
	/**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(ExprBool)
   * @see robotG.flow.FlowPackage#getWhile_Condition()
   * @model containment="true" required="true"
   * @generated
   */
	ExprBool getCondition();

	/**
   * Sets the value of the '{@link robotG.flow.While#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
	void setCondition(ExprBool value);

	/**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link robotG.flow.Expr}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see robotG.flow.FlowPackage#getWhile_Instructions()
   * @model containment="true"
   * @generated
   */
	EList<Expr> getInstructions();

} // While
