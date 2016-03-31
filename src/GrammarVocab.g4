lexer grammar GrammarVocab;
@header{ 
	package parser.antlr4;
}


LCB: '{';
RCB: '}';

LB: '(';
RB: ')';

LSB: '[';
RSB: ']';
COLON: ':';
SEMI: ';';
ARROW: '->';
COMMA: ',';
DOT: '.';

STATE: 'State:';
TRANSITION: 'Transition:';
DELAY: 'Delay:';

MINUS: '-';

EQ: '=';
NE: '!=';
GE: '>=';
GT: '>';
LE: '<=';
LT: '<';

AND: '&&';
OR: '||';
EXCL: '!';
QM: '?';

TIMEZERO: 't(0)';
OBJECTREF: (TIMEZERO | VARREF(DOT OBJECTREF)*);
VARREF: CHAR (CHAR| DIGIT)*;
NUM: MINUS? DIGIT+;

WS: [\t\r\n ]+ -> skip;
LINECOMMENT: '//' (~[\r\n])* -> skip; // not officially UPPAAL, but useful for debugging
BLOCKCOMMENT: '/*' .*? '*/' -> skip; // not officially UPPAAL, but useful for debugging

CHAR: [A-Za-z_];
DIGIT: [0-9];
