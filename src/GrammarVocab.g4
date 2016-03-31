lexer grammar GrammarVocab;

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

TRANSITION: 'Transition';
DELAY: 'Delay';

MINUS: '-';

EQ: '=';
NE: '!=';
GE: '>=';
GT: '>';
LE: '<=';
LT: '<';

TIMEZERO: 't(0)';
OBJECTREF: VARREF(DOT OBJECTREF)*;
VARREF: CHAR (CHAR| DIGIT)*;
NUM: DIGIT+;

WS: [\t\r\n ]+ -> skip;
LINECOMMENT: '//' (~[\r\n])* -> skip; // not officially UPPAAL, but useful for debugging
BLOCKCOMMENT: '/*' .*? '*/' -> skip; // not officially UPPAAL, but useful for debugging

CHAR: [A-Za-z_];
DIGIT: [0-9];
