SYNTAXDEF robot
FOR <http://robotG/1.0>
START Flow.Programme

TOKENS {
DEFINE STRING_LITERAL $'"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"'$;
}

RULES {
	Flow.Programme ::= programme*;
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Flow.While ::= "while" condition "do" instructions* "end";
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Flow.If ::= "if" condition "then" instructions* "end";
	
	@Operator(type="binary_left_associative", weight="1", superclass="ExprBool")
	Flow.And ::= filsGauche "and" filsDroit;
	
	@Operator(type="binary_left_associative", weight="2", superclass="ExprBool")
	Flow.Or ::= filsGauche "or" filsDroit; 
	
    @Operator(type="unary_prefix", weight="3", superclass="ExprBool")
	Flow.Not ::= "not" expression;
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Flow.StopProgram ::= "stopProgram";
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Robot.Bip ::= "bip" "(" "duration" "=" duration[] "," "power" "=" power[] "," "repeat" "=" repeat[] ")";
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Robot.Display ::= "display" "(" "msg" "=" msg[STRING_LITERAL] "," "duration" "=" duration[] "," "line" "=" line[] "," "col" "=" col[] ")";
    
    @Operator(type="primitive", weight="4", superclass="ExprBool")
	Robot.HasTurned ::= "hasTurned" "(" "angle" "=" angle[] ")";
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Robot.Move ::= "move" "(" "power" "=" power[] ")";
	
    @Operator(type="primitive", weight="4", superclass="ExprBool")
	Robot.Obstacle ::= "obstacle" "(" "distance" "=" distance[] ")";
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Robot.SetTurnAngle ::= "setTurnAngle" "(" "angle" "=" angle[] ")";
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Robot.StopEngine ::= "stopEngine";
	
	@Operator(type="primitive", weight="4", superclass="Expr")
	Robot.Turn ::= "turn" "(" "power" "=" power[] "," "angle" "=" angle[] ")";
	}