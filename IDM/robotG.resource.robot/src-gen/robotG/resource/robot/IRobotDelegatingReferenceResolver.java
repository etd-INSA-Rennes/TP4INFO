/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robotG.resource.robot;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see robotG.resource.robot.IRobotOptions
 */
public interface IRobotDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends robotG.resource.robot.IRobotReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(robotG.resource.robot.IRobotReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
