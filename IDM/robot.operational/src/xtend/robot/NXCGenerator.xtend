package robot

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

import robotG.flow.Programme
import robotG.robot.Move
import robotG.robot.SetTurnAngle
import robotG.flow.While
import robotG.robot.Obstacle
import robotG.flow.Not
import robotG.flow.If
import robotG.flow.And
import robotG.flow.Or
import robotG.flow.StopProgram
import robotG.robot.Bip
import robotG.robot.Display
import robotG.robot.HasTurned
import robotG.robot.StopEngine
import robotG.robot.Turn
import javax.management.remote.rmi.NoCallStackClassLoader

// The context (cf pattern Interpreter) is an object given as an argument during the
// code generation. It contains information on the generation process.
class ContextNCX {
	// Contains the code that will compose the beginning of a NXC program.
	// eg
	// Task myProgram {
	// ...
	// }
	@Property val StringBuilder header = new StringBuilder
	// Defines whether the ultrasonic sensor has been initialised.
	@Property var boolean initUSCreated = false
	// Defines whether the angle variable has been declared.
	@Property var boolean angleVarCreated = false
	
}

// Defines the concept of generable: all the aspects you will define must inherits this class.
@Aspect(className=typeof(Object))
abstract class NXCCodeGenerator {
	def StringBuilder generateCode(ContextNCX ctx){
		println(_self)
		return new StringBuilder
	}
}

@Aspect(className=typeof(StopEngine))
class StopEngineAspect extends NXCCodeGenerator {
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		println("coucou")
		new StringBuilder().append("Off(OUT_BC);\n")
	}
}


@Aspect(className=typeof(Programme))
class ProgramUnitAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		ctx.header.append("#include \"NXCDefs.h\"\n\ntask main(){\n")
		new StringBuilder("while(1){\n").append(_self.programme.map[generateCode(ctx)].join).append("}\n}\n")
	}
}




@Aspect(className=typeof(While))
class WhileAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("while(").append(_self.condition.generateCode(ctx)).append("){\n").append(_self.instructions.generateCode(ctx)).append("}\n")
	}
}

@Aspect(className=typeof(If))
class IfAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("if(").append(_self.condition.generateCode(ctx)).append(") {\n").append(_self.instructions.generateCode(ctx)).append("}\n else { \n }")
	}
}

@Aspect(className=typeof(And))
class AndAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append(_self.filsGauche.generateCode(ctx)).append(" && ").append(_self.filsDroit.generateCode(ctx))
	}
}

@Aspect(className=typeof(Not))
class NotAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("!(").append(_self.expression.generateCode(ctx)).append(")")
	}
}

@Aspect(className=typeof(Or))
class OrAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append(_self.filsGauche.generateCode(ctx)).append(" || ").append(_self.filsDroit.generateCode(ctx))
	}
}

@Aspect(className=typeof(StopProgram))
class StopProgramAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("Stop(true);\n")
	}
}

@Aspect(className=typeof(Bip))
class BipAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("PlayToneEx(").append(_self.duration).append(",").append(_self.power).append(",").append(_self.repeat).append(");\n")
	}
}

@Aspect(className=typeof(Display))
class DisplayAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("TextOut(").append(_self.msg).append(",").append(_self.duration).append(",").append(_self.line).append(",").append(_self.col).append(");\n")
	}
}

@Aspect(className=typeof(HasTurned))
class HasTurnedAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("angle>=").append(_self.angle)
	}
}

// 3 examples of aspects in Kermeta 3:
// An aspect on the class MoveCmd
@Aspect(className=typeof(Move))
class MoveCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		// DO NOT FORGET TO USE _self TO ACCESS ELEMENTS OF THE CLASS.
		new StringBuilder("OnFwdSync(OUT_BC, ").append(_self.power.intValue).append(", 0);\n")		
	}
}

@Aspect(className=typeof(Obstacle))
class ObstacleAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("SensorUS(S4)<").append(_self.distance)
	}
}

@Aspect(className=typeof(SetTurnAngle))
class SetTurnAngleCmdAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		// A unique variable must be defined to contain the angle value.
		if(!ctx.angleVarCreated) {
			ctx.angleVarCreated = true
			ctx.header.append("int angle;\n")
		}
		code.append("angle=").append(_self.angle.intValue).append(";\n")
	}
}


@Aspect(className=typeof(Turn))
class TurnAspect extends NXCCodeGenerator{
	@OverrideAspectMethod
	def StringBuilder generateCode(ContextNCX ctx) {
		val StringBuilder code = new StringBuilder
		code.append("OnFwdSync(OUT_BC,").append(_self.power).append(",-99);\n angle += ").append(_self.angle).append(";\n Wait(20);\n")
	}
}