/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robotG.resource.robot.debug;

public class RobotDebugValue extends robotG.resource.robot.debug.RobotDebugElement implements org.eclipse.debug.core.model.IValue {
	
	private robotG.resource.robot.debug.RobotDebugTarget debugTarget;
	private org.eclipse.debug.core.model.IVariable[] variables;
	private String referenceTypeName;
	private String valueString;
	private java.util.Map<String, Long> children;
	
	public RobotDebugValue(robotG.resource.robot.debug.RobotDebugTarget target, String id, String valueString, String referenceTypeName, java.util.Map<String, Long> children) {
		super(target);
		this.debugTarget = target;
		this.valueString = valueString;
		this.referenceTypeName = referenceTypeName;
		this.children = children;
	}
	
	public String getReferenceTypeName() throws org.eclipse.debug.core.DebugException {
		return referenceTypeName;
	}
	
	public String getValueString() throws org.eclipse.debug.core.DebugException {
		return valueString;
	}
	
	public boolean isAllocated() throws org.eclipse.debug.core.DebugException {
		return true;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables() throws org.eclipse.debug.core.DebugException {
		if (variables == null) {
			// request variables from debug client
			java.util.Collection<Long> childIDs = children.values();
			String[] childIDStrings = new String[childIDs.size()];
			int i = 0;
			for (Long childID : childIDs) {
				childIDStrings[i++] = childID.toString();
			}
			org.eclipse.debug.core.model.IVariable[] response = debugTarget.getDebugProxy().getVariables(childIDStrings);
			variables = response;
		}
		return variables;
	}
	
	public boolean hasVariables() throws org.eclipse.debug.core.DebugException {
		return this.children.keySet().size() > 0;
	}
	
	public org.eclipse.debug.core.model.IVariable getChild(int index) {
		java.util.Set<String> keySet = this.children.keySet();
		java.util.Iterator<String> iterator = keySet.iterator();
		String keyAtIndex = iterator.next();
		for (int i = 0; i < index; i++) {
			keyAtIndex = iterator.next();
		}
		Long childID = this.children.get(keyAtIndex);
		org.eclipse.debug.core.model.IVariable[] response = debugTarget.getDebugProxy().getVariables(childID.toString());
		return response[0];
	}
	
	public int getVariableCount() {
		return this.children.keySet().size();
	}
	
}
