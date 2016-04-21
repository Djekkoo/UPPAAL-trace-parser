grammar UPPAALTrace; //TODO: ANTLR style conventions. kijken naar semantic predicates
import GrammarVocab;

trace: firstState? gotoState*; // an program, firstState is optional to allow cutting of file

// state and transition definition
firstState: state; // state without transition
gotoState: transition state; //state with transition
transition
	: (TRANSITION | TRANSITIONS) transitionDetails* #transitionState
	| DELAY REAL									#transitionDelay
	;	
transitionDetails
	: systemState ARROW systemState 
	LCB ( 
		  transitionGuard SEMI (synchronization SEMI)? transitionAssignments SEMI // libutap
		| transitionGuard COMMA (synchronization COMMA)? transitionAssignments	  // verifyta
	) RCB;
					
				
state: STATE systemStates variables clocks;

// sub definition of state
systemStates
	: systemState+? 		// libutap	 
	| LB systemState+? RB	// verifyta
	;
variables: variable*;
assignments: ( (assignment |funcAssignment) (COMMA? (assignment |funcAssignment) )*?)?; // verifyta 
//TODO: funcassignments in parser
clocks: clock*?;

// sub definition of transition
transitionGuard: expr;
synchronization
	: syncExpr  // sync
	| value		// no sync
	; 
transitionAssignments
	: variables 	// libutap
	| assignments	// verifyta
	| REAL			// libtap/verifyta -> no transactions
	;  

// general types
systemState: OBJECTREF;
variable: OBJECTREF EQ value;
assignment: OBJECTREF ASSIGN value; //verifyta
funcAssignment: OBJECTREF LB value? RB; //verifyta
clock: clockLHS relation REAL;
clockLHS
	: TIMEZERO MINUS OBJECTREF 	#clockLHSZeroMinusObject
	| OBJECTREF MINUS TIMEZERO 	#clockLHSObjectMinusZero
	| OBJECTREF MINUS OBJECTREF	#clockLHSObjectMinusObject
	| OBJECTREF					#clockLHSObject
	;
		
relation
	: EQ 
	| LT 
	| LE 
	| GT 
	| GE 
	| NE
	;
	
syncExpr
	: syncExpr AND syncExpr
	| OBJECTREF EXCL? 		// OBJECTREF EXCL -> libutap, OBJECTREF -> verifyta 
	| OBJECTREF QM
	;

expr
	: expr relation expr
 	| expr AND expr
 	| expr OR expr
 	| EXCL expr
 	| OBJECTREF
 	| OBJECTREF LB value? RB // function call
 	| value
 	;
// TODO: OBJECTREF LB value? RB in parser
value
	: BOOL 
	| REAL
	;
 	