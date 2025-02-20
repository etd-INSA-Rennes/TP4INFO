/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robotG.resource.robot.mopp;

public class RobotBracketInformationProvider {
	
	public class BracketPair implements robotG.resource.robot.IRobotBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<robotG.resource.robot.IRobotBracketPair> getBracketPairs() {
		java.util.Collection<robotG.resource.robot.IRobotBracketPair> result = new java.util.ArrayList<robotG.resource.robot.IRobotBracketPair>();
		result.add(new BracketPair("(", ")", true));
		return result;
	}
	
}
