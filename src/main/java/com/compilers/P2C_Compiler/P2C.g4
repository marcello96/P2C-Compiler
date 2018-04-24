grammar P2C;

// Parser Rules
varDeclaration : LET ident COLON array? type;

text : LETTER+ ;

ident : (LETTER | UNDERLINE)(LETTER | NUMBER | UNDERLINE)*;
type : INT | DOUBLE | FLOAT | CHAR | BOOL;

array : ARRAY LEFT_SQ_BRACKET INT_NUMBER RIGHT_SQ_BRACKET OF ;
// Lexer Rules

LET : 'let' ;

//types
INT : 'int' ;
DOUBLE : 'double' ;
FLOAT : 'float' ;
CHAR : 'char' ;
BOOL : 'bool' ;

OF : 'of' ;
ARRAY : 'array' ;
UNDERLINE : '_' ;
INT_NUMBER : ('0') | ('1'..'9')('0'..'9')*  ;
DEC_NUMER : ('0'..'9')+ ;
NUMBER : ('0'..'9') ;
LETTER : ('a'..'z') | ('A'..'Z') ;

COLON : ':' ;
LEFT_SQ_BRACKET : '[' ;
RIGHT_SQ_BRACKET : ']' ;
LEFT_BRACKET : '(' ;
RIGHT_BRACKET : ')' ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;