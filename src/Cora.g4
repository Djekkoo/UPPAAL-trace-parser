grammar Cora;
import GrammarVocab;
@header{ 
	package parser.antlr4;
}


trace: firstState gotoState*; // an program

// state and transaction definition
firstState: state; // state without transaction
gotoState: transition state; //state with transaction
transition: TRANSITION COLON systemState ARROW systemState LCB transactionGuard SEMI synchronization SEMI assignments SEMI RCB;
state: systemStates variables clocks;

// sub definition of state
systemStates: systemState+;
variables: variable*;
clocks: clock+;

// sub definition of transaction
transactionGuard: ;
synchronization: ;
assignments: ;

// general types
systemState: OBJECTREF;
variable: OBJECTREF EQ NUM;
clock: clockLHS relation NUM;
clockLHS: TIMEZERO MINUS OBJECTREF 				#clockLHSZeroMinusObject
		| OBJECTREF MINUS TIMEZERO 				#clockLHSObjectMinusZero
		| OBJECTREF MINUS OBJECTREF				#clockLHSObjectMinusObject
		;
relation: EQ | LT | LE | GT | GE | EQ;