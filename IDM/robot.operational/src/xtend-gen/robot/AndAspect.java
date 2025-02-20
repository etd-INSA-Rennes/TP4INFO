package robot;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import robot.AndAspectAndAspectProperties;
import robot.ContextNCX;
import robot.NXCCodeGenerator;
import robotG.flow.And;
import robotG.flow.ExprBool;

@Aspect(className = And.class)
@SuppressWarnings("all")
public class AndAspect extends NXCCodeGenerator {
  @OverrideAspectMethod
  public static StringBuilder generateCode(final And _self, final ContextNCX ctx) {
    robot.AndAspectAndAspectContext _instance = robot.AndAspectAndAspectContext.getInstance();
    				    java.util.Map<robotG.flow.And,robot.AndAspectAndAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						robot.AndAspectAndAspectProperties prop = new robot.AndAspectAndAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof robotG.flow.And){
    			     							return robot.AndAspect.privgenerateCode((robotG.flow.And)_self,ctx);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							return robot.NXCCodeGenerator.privgenerateCode((java.lang.Object)_self,ctx);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static AndAspectAndAspectProperties _self_;
  
  private static StringBuilder super_generateCode(final And _self, final ContextNCX ctx) {
     return  robot.NXCCodeGenerator.privgenerateCode(_self,ctx);  
  }
  
  protected static StringBuilder privgenerateCode(final And _self, final ContextNCX ctx) {
    StringBuilder _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder code = _stringBuilder;
      ExprBool _filsGauche = _self.getFilsGauche();
      StringBuilder _generateCode = NXCCodeGenerator.generateCode(_filsGauche, ctx);
      StringBuilder _append = code.append(_generateCode);
      StringBuilder _append_1 = _append.append(" && ");
      ExprBool _filsDroit = _self.getFilsDroit();
      StringBuilder _generateCode_1 = NXCCodeGenerator.generateCode(_filsDroit, ctx);
      StringBuilder _append_2 = _append_1.append(_generateCode_1);
      _xblockexpression = (_append_2);
    }
    return _xblockexpression;
  }
}
