/**
 */
package robotG.flow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotG.flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "flow";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://flow";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "flow";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	FlowPackage eINSTANCE = robotG.flow.impl.FlowPackageImpl.init();

	/**
   * The meta object id for the '{@link robotG.flow.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.ExprImpl
   * @see robotG.flow.impl.FlowPackageImpl#getExpr()
   * @generated
   */
	int EXPR = 5;

	/**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXPR_FEATURE_COUNT = 0;

	/**
   * The number of operations of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXPR_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.WhileImpl
   * @see robotG.flow.impl.FlowPackageImpl#getWhile()
   * @generated
   */
	int WHILE = 0;

	/**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int WHILE__CONDITION = EXPR_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int WHILE__INSTRUCTIONS = EXPR_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int WHILE_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
   * The number of operations of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int WHILE_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.IfImpl
   * @see robotG.flow.impl.FlowPackageImpl#getIf()
   * @generated
   */
	int IF = 1;

	/**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IF__CONDITION = EXPR_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IF__INSTRUCTIONS = EXPR_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IF_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
   * The number of operations of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IF_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.ExprBoolImpl <em>Expr Bool</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.ExprBoolImpl
   * @see robotG.flow.impl.FlowPackageImpl#getExprBool()
   * @generated
   */
	int EXPR_BOOL = 3;

	/**
   * The number of structural features of the '<em>Expr Bool</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXPR_BOOL_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Expr Bool</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXPR_BOOL_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.OpUnaireImpl <em>Op Unaire</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.OpUnaireImpl
   * @see robotG.flow.impl.FlowPackageImpl#getOpUnaire()
   * @generated
   */
	int OP_UNAIRE = 6;

	/**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OP_UNAIRE__EXPRESSION = EXPR_BOOL_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Op Unaire</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OP_UNAIRE_FEATURE_COUNT = EXPR_BOOL_FEATURE_COUNT + 1;

	/**
   * The number of operations of the '<em>Op Unaire</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OP_UNAIRE_OPERATION_COUNT = EXPR_BOOL_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.NotImpl
   * @see robotG.flow.impl.FlowPackageImpl#getNot()
   * @generated
   */
	int NOT = 2;

	/**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOT__EXPRESSION = OP_UNAIRE__EXPRESSION;

	/**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOT_FEATURE_COUNT = OP_UNAIRE_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOT_OPERATION_COUNT = OP_UNAIRE_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.StopProgramImpl <em>Stop Program</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.StopProgramImpl
   * @see robotG.flow.impl.FlowPackageImpl#getStopProgram()
   * @generated
   */
	int STOP_PROGRAM = 4;

	/**
   * The number of structural features of the '<em>Stop Program</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STOP_PROGRAM_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Stop Program</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STOP_PROGRAM_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.OpBinaireImpl <em>Op Binaire</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.OpBinaireImpl
   * @see robotG.flow.impl.FlowPackageImpl#getOpBinaire()
   * @generated
   */
	int OP_BINAIRE = 7;

	/**
   * The feature id for the '<em><b>Fils Gauche</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OP_BINAIRE__FILS_GAUCHE = EXPR_BOOL_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Fils Droit</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OP_BINAIRE__FILS_DROIT = EXPR_BOOL_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Op Binaire</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OP_BINAIRE_FEATURE_COUNT = EXPR_BOOL_FEATURE_COUNT + 2;

	/**
   * The number of operations of the '<em>Op Binaire</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OP_BINAIRE_OPERATION_COUNT = EXPR_BOOL_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.AndImpl
   * @see robotG.flow.impl.FlowPackageImpl#getAnd()
   * @generated
   */
	int AND = 8;

	/**
   * The feature id for the '<em><b>Fils Gauche</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AND__FILS_GAUCHE = OP_BINAIRE__FILS_GAUCHE;

	/**
   * The feature id for the '<em><b>Fils Droit</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AND__FILS_DROIT = OP_BINAIRE__FILS_DROIT;

	/**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AND_FEATURE_COUNT = OP_BINAIRE_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int AND_OPERATION_COUNT = OP_BINAIRE_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.OrImpl
   * @see robotG.flow.impl.FlowPackageImpl#getOr()
   * @generated
   */
	int OR = 9;

	/**
   * The feature id for the '<em><b>Fils Gauche</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OR__FILS_GAUCHE = OP_BINAIRE__FILS_GAUCHE;

	/**
   * The feature id for the '<em><b>Fils Droit</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OR__FILS_DROIT = OP_BINAIRE__FILS_DROIT;

	/**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OR_FEATURE_COUNT = OP_BINAIRE_FEATURE_COUNT + 0;

	/**
   * The number of operations of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OR_OPERATION_COUNT = OP_BINAIRE_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link robotG.flow.impl.ProgrammeImpl <em>Programme</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see robotG.flow.impl.ProgrammeImpl
   * @see robotG.flow.impl.FlowPackageImpl#getProgramme()
   * @generated
   */
	int PROGRAMME = 10;

	/**
   * The feature id for the '<em><b>Programme</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PROGRAMME__PROGRAMME = 0;

	/**
   * The number of structural features of the '<em>Programme</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PROGRAMME_FEATURE_COUNT = 1;

	/**
   * The number of operations of the '<em>Programme</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PROGRAMME_OPERATION_COUNT = 0;


	/**
   * Returns the meta object for class '{@link robotG.flow.While <em>While</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see robotG.flow.While
   * @generated
   */
	EClass getWhile();

	/**
   * Returns the meta object for the containment reference '{@link robotG.flow.While#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see robotG.flow.While#getCondition()
   * @see #getWhile()
   * @generated
   */
	EReference getWhile_Condition();

	/**
   * Returns the meta object for the containment reference list '{@link robotG.flow.While#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see robotG.flow.While#getInstructions()
   * @see #getWhile()
   * @generated
   */
	EReference getWhile_Instructions();

	/**
   * Returns the meta object for class '{@link robotG.flow.If <em>If</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see robotG.flow.If
   * @generated
   */
	EClass getIf();

	/**
   * Returns the meta object for the containment reference '{@link robotG.flow.If#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see robotG.flow.If#getCondition()
   * @see #getIf()
   * @generated
   */
	EReference getIf_Condition();

	/**
   * Returns the meta object for the containment reference list '{@link robotG.flow.If#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see robotG.flow.If#getInstructions()
   * @see #getIf()
   * @generated
   */
	EReference getIf_Instructions();

	/**
   * Returns the meta object for class '{@link robotG.flow.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see robotG.flow.Not
   * @generated
   */
	EClass getNot();

	/**
   * Returns the meta object for class '{@link robotG.flow.ExprBool <em>Expr Bool</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Bool</em>'.
   * @see robotG.flow.ExprBool
   * @generated
   */
	EClass getExprBool();

	/**
   * Returns the meta object for class '{@link robotG.flow.StopProgram <em>Stop Program</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stop Program</em>'.
   * @see robotG.flow.StopProgram
   * @generated
   */
	EClass getStopProgram();

	/**
   * Returns the meta object for class '{@link robotG.flow.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see robotG.flow.Expr
   * @generated
   */
	EClass getExpr();

	/**
   * Returns the meta object for class '{@link robotG.flow.OpUnaire <em>Op Unaire</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Unaire</em>'.
   * @see robotG.flow.OpUnaire
   * @generated
   */
	EClass getOpUnaire();

	/**
   * Returns the meta object for the containment reference '{@link robotG.flow.OpUnaire#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see robotG.flow.OpUnaire#getExpression()
   * @see #getOpUnaire()
   * @generated
   */
	EReference getOpUnaire_Expression();

	/**
   * Returns the meta object for class '{@link robotG.flow.OpBinaire <em>Op Binaire</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Binaire</em>'.
   * @see robotG.flow.OpBinaire
   * @generated
   */
	EClass getOpBinaire();

	/**
   * Returns the meta object for the containment reference '{@link robotG.flow.OpBinaire#getFilsGauche <em>Fils Gauche</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fils Gauche</em>'.
   * @see robotG.flow.OpBinaire#getFilsGauche()
   * @see #getOpBinaire()
   * @generated
   */
	EReference getOpBinaire_FilsGauche();

	/**
   * Returns the meta object for the containment reference '{@link robotG.flow.OpBinaire#getFilsDroit <em>Fils Droit</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fils Droit</em>'.
   * @see robotG.flow.OpBinaire#getFilsDroit()
   * @see #getOpBinaire()
   * @generated
   */
	EReference getOpBinaire_FilsDroit();

	/**
   * Returns the meta object for class '{@link robotG.flow.And <em>And</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see robotG.flow.And
   * @generated
   */
	EClass getAnd();

	/**
   * Returns the meta object for class '{@link robotG.flow.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see robotG.flow.Or
   * @generated
   */
	EClass getOr();

	/**
   * Returns the meta object for class '{@link robotG.flow.Programme <em>Programme</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Programme</em>'.
   * @see robotG.flow.Programme
   * @generated
   */
	EClass getProgramme();

	/**
   * Returns the meta object for the containment reference list '{@link robotG.flow.Programme#getProgramme <em>Programme</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Programme</em>'.
   * @see robotG.flow.Programme#getProgramme()
   * @see #getProgramme()
   * @generated
   */
	EReference getProgramme_Programme();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	FlowFactory getFlowFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link robotG.flow.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.WhileImpl
     * @see robotG.flow.impl.FlowPackageImpl#getWhile()
     * @generated
     */
		EClass WHILE = eINSTANCE.getWhile();

		/**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference WHILE__INSTRUCTIONS = eINSTANCE.getWhile_Instructions();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.IfImpl
     * @see robotG.flow.impl.FlowPackageImpl#getIf()
     * @generated
     */
		EClass IF = eINSTANCE.getIf();

		/**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference IF__INSTRUCTIONS = eINSTANCE.getIf_Instructions();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.NotImpl
     * @see robotG.flow.impl.FlowPackageImpl#getNot()
     * @generated
     */
		EClass NOT = eINSTANCE.getNot();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.ExprBoolImpl <em>Expr Bool</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.ExprBoolImpl
     * @see robotG.flow.impl.FlowPackageImpl#getExprBool()
     * @generated
     */
		EClass EXPR_BOOL = eINSTANCE.getExprBool();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.StopProgramImpl <em>Stop Program</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.StopProgramImpl
     * @see robotG.flow.impl.FlowPackageImpl#getStopProgram()
     * @generated
     */
		EClass STOP_PROGRAM = eINSTANCE.getStopProgram();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.ExprImpl
     * @see robotG.flow.impl.FlowPackageImpl#getExpr()
     * @generated
     */
		EClass EXPR = eINSTANCE.getExpr();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.OpUnaireImpl <em>Op Unaire</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.OpUnaireImpl
     * @see robotG.flow.impl.FlowPackageImpl#getOpUnaire()
     * @generated
     */
		EClass OP_UNAIRE = eINSTANCE.getOpUnaire();

		/**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OP_UNAIRE__EXPRESSION = eINSTANCE.getOpUnaire_Expression();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.OpBinaireImpl <em>Op Binaire</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.OpBinaireImpl
     * @see robotG.flow.impl.FlowPackageImpl#getOpBinaire()
     * @generated
     */
		EClass OP_BINAIRE = eINSTANCE.getOpBinaire();

		/**
     * The meta object literal for the '<em><b>Fils Gauche</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OP_BINAIRE__FILS_GAUCHE = eINSTANCE.getOpBinaire_FilsGauche();

		/**
     * The meta object literal for the '<em><b>Fils Droit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OP_BINAIRE__FILS_DROIT = eINSTANCE.getOpBinaire_FilsDroit();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.AndImpl
     * @see robotG.flow.impl.FlowPackageImpl#getAnd()
     * @generated
     */
		EClass AND = eINSTANCE.getAnd();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.OrImpl
     * @see robotG.flow.impl.FlowPackageImpl#getOr()
     * @generated
     */
		EClass OR = eINSTANCE.getOr();

		/**
     * The meta object literal for the '{@link robotG.flow.impl.ProgrammeImpl <em>Programme</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see robotG.flow.impl.ProgrammeImpl
     * @see robotG.flow.impl.FlowPackageImpl#getProgramme()
     * @generated
     */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
     * The meta object literal for the '<em><b>Programme</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference PROGRAMME__PROGRAMME = eINSTANCE.getProgramme_Programme();

	}

} //FlowPackage
