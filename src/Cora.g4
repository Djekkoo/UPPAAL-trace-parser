grammar Cora;
import GrammarVocab;

trace: firstState gotoState*; // an program

// state and transaction definition
firstState: state; // state without transaction
gotoState: transition state; //state with transaction
transition: TRANSITION (systemState ARROW systemState LCB transactionGuard SEMI (synchronization SEMI)? assignments SEMI RCB)?;
state: STATE systemStates variables clocks;

// sub definition of state
systemStates: systemState+?;
variables: variable*?;
clocks: clock+?;

// sub definition of transaction
transactionGuard: expr;
synchronization: syncExpr;
assignments: (variables|NUM);

// general types
systemState: OBJECTREF;
variable: OBJECTREF EQ NUM;
clock: clockLHS relation NUM;
clockLHS: TIMEZERO MINUS OBJECTREF 				#clockLHSZeroMinusObject
		| OBJECTREF MINUS TIMEZERO 				#clockLHSObjectMinusZero
		| OBJECTREF MINUS OBJECTREF				#clockLHSObjectMinusObject
		;
relation: EQ | LT | LE | GT | GE | NE;

syncExpr : syncExpr AND syncExpr
		 | OBJECTREF EXCL
		 | OBJECTREF QM
		 | NUM
		 ;

expr: expr relation expr
 	| expr AND expr
 	| expr OR expr
 	| EXCL expr
 	| NUM 
 	| OBJECTREF
 	;
