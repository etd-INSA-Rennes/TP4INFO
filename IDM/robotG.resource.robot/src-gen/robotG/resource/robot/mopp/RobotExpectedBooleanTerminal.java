/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robotG.resource.robot.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class RobotExpectedBooleanTerminal extends robotG.resource.robot.mopp.RobotAbstractExpectedElement {
	
	private robotG.resource.robot.grammar.RobotBooleanTerminal booleanTerminal;
	
	public RobotExpectedBooleanTerminal(robotG.resource.robot.grammar.RobotBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public robotG.resource.robot.grammar.RobotBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public robotG.resource.robot.grammar.RobotSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof RobotExpectedBooleanTerminal) {
			return getFeature().equals(((RobotExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
