/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robotG.resource.robot.mopp;

/**
 * A basic implementation of the
 * robotG.resource.robot.IRobotReferenceResolveResult interface that collects
 * mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class RobotReferenceResolveResult<ReferenceType> implements robotG.resource.robot.IRobotReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<robotG.resource.robot.IRobotReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<robotG.resource.robot.IRobotQuickFix> quickFixes;
	
	public RobotReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<robotG.resource.robot.IRobotQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<robotG.resource.robot.IRobotQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(robotG.resource.robot.IRobotQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<robotG.resource.robot.IRobotQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<robotG.resource.robot.IRobotReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<robotG.resource.robot.IRobotReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new robotG.resource.robot.mopp.RobotElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<robotG.resource.robot.IRobotReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new robotG.resource.robot.mopp.RobotURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
