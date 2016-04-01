grammar Trace;
import GrammarVocab;

trace: firstState? gotoState*; // an program, firstState is optional to allow cutting of file

// state and transaction definition
firstState: state; // state without transaction
gotoState: transition state; //state with transaction
transition: (TRANSITION | TRANSITIONS) transitionDetails* #transitionTransition
		  | DELAY REAL									  #transitionDelay
		  ;	
transitionDetails: systemState ARROW systemState 
				LCB 
				(
					transactionGuard SEMI (synchronization SEMI)? transactionAssignmentsLibutap SEMI | // libutap
					transactionGuard COMMA (synchronization COMMA)? transactionAssignmentsVerifyta 		// verifyta
				) 
				RCB;
					
				
state: STATE systemStates variables clocks;

// sub definition of state
systemStates: (
					systemState+?		 | // libutap	 
					LB systemState+? RB	   //  verifyta
				);
variables: variable*?;
assignments: assignment*?; // nocora
clocks: clock+?;

// sub definition of transaction
transactionGuard: expr;
synchronization: syncExpr;
transactionAssignmentsLibutap : (variables|REAL);
transactionAssignmentsVerifyta : (assignments|REAL);

// general types
systemState: OBJECTREF;
variable: OBJECTREF EQ value;
assignment: OBJECTREF ASSIGN value; //nocora
clock: clockLHS relation REAL;
clockLHS: TIMEZERO MINUS OBJECTREF 				#clockLHSZeroMinusObject
		| OBJECTREF MINUS TIMEZERO 				#clockLHSObjectMinusZero
		| OBJECTREF MINUS OBJECTREF				#clockLHSObjectMinusObject
		| OBJECTREF								#clockLHSObject
		;
relation: EQ | LT | LE | GT | GE | NE;
value: BOOL | REAL;

syncExpr : syncExpr AND syncExpr
		 | syncExpr EXCL
		 | syncExpr QM
		 | OBJECTREF
		 | value
		 ;

expr: expr relation expr
 	| expr AND expr
 	| expr OR expr
 	| EXCL expr
 	| OBJECTREF
 	| value
 	;