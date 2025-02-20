package robot;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import robot.ContextNCX;
import robot.NXCCodeGenerator;
import robot.NotAspectNotAspectProperties;
import robotG.flow.ExprBool;
import robotG.flow.Not;

@Aspect(className = Not.class)
@SuppressWarnings("all")
public class NotAspect extends NXCCodeGenerator {
  @OverrideAspectMethod
  public static StringBuilder generateCode(final Not _self, final ContextNCX ctx) {
    robot.NotAspectNotAspectContext _instance = robot.NotAspectNotAspectContext.getInstance();
    				    java.util.Map<robotG.flow.Not,robot.NotAspectNotAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						robot.NotAspectNotAspectProperties prop = new robot.NotAspectNotAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof robotG.flow.Not){
    			     							return robot.NotAspect.privgenerateCode((robotG.flow.Not)_self,ctx);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							return robot.NXCCodeGenerator.privgenerateCode((java.lang.Object)_self,ctx);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static NotAspectNotAspectProperties _self_;
  
  private static StringBuilder super_generateCode(final Not _self, final ContextNCX ctx) {
     return  robot.NXCCodeGenerator.privgenerateCode(_self,ctx);  
  }
  
  protected static StringBuilder privgenerateCode(final Not _self, final ContextNCX ctx) {
    StringBuilder _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder code = _stringBuilder;
      StringBuilder _append = code.append("!(");
      ExprBool _expression = _self.getExpression();
      StringBuilder _generateCode = NXCCodeGenerator.generateCode(_expression, ctx);
      StringBuilder _append_1 = _append.append(_generateCode);
      StringBuilder _append_2 = _append_1.append(")");
      _xblockexpression = (_append_2);
    }
    return _xblockexpression;
  }
}
