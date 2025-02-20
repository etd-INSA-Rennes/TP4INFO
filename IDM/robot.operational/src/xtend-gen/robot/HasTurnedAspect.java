package robot;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import robot.ContextNCX;
import robot.HasTurnedAspectHasTurnedAspectProperties;
import robot.NXCCodeGenerator;
import robotG.robot.HasTurned;

@Aspect(className = HasTurned.class)
@SuppressWarnings("all")
public class HasTurnedAspect extends NXCCodeGenerator {
  @OverrideAspectMethod
  public static StringBuilder generateCode(final HasTurned _self, final ContextNCX ctx) {
    robot.HasTurnedAspectHasTurnedAspectContext _instance = robot.HasTurnedAspectHasTurnedAspectContext.getInstance();
    				    java.util.Map<robotG.robot.HasTurned,robot.HasTurnedAspectHasTurnedAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						robot.HasTurnedAspectHasTurnedAspectProperties prop = new robot.HasTurnedAspectHasTurnedAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof robotG.robot.HasTurned){
    			     							return robot.HasTurnedAspect.privgenerateCode((robotG.robot.HasTurned)_self,ctx);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							return robot.NXCCodeGenerator.privgenerateCode((java.lang.Object)_self,ctx);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static HasTurnedAspectHasTurnedAspectProperties _self_;
  
  private static StringBuilder super_generateCode(final HasTurned _self, final ContextNCX ctx) {
     return  robot.NXCCodeGenerator.privgenerateCode(_self,ctx);  
  }
  
  protected static StringBuilder privgenerateCode(final HasTurned _self, final ContextNCX ctx) {
    StringBuilder _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder code = _stringBuilder;
      StringBuilder _append = code.append("angle>=");
      int _angle = _self.getAngle();
      StringBuilder _append_1 = _append.append(_angle);
      _xblockexpression = (_append_1);
    }
    return _xblockexpression;
  }
}
