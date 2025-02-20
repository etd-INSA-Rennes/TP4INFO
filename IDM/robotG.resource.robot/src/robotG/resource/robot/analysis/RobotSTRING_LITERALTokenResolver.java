/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robotG.resource.robot.analysis;

public class RobotSTRING_LITERALTokenResolver implements robotG.resource.robot.IRobotTokenResolver {
	
	private robotG.resource.robot.analysis.RobotDefaultTokenResolver defaultTokenResolver = new robotG.resource.robot.analysis.RobotDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, robotG.resource.robot.IRobotTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
