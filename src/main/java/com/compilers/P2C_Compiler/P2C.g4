grammar P2C;

/*
 * Parser Rules
 */
 
ident : (LETTER | UNDERLINE) (LETTER | DIGIT | UNDERLINE)*;
type : (ARRAY LEFT_SQ_BRACKET DIGIT+ RIGHT_SQ_BRACKET OF)? (INT | DOUBLE | FLOAT | CHAR | BOOL);
varDeclaration : LET ident COLON type SEMICOLON;
 
 /*
 * Lexer Rules
 */

DIGIT : ('0'..'9') ;
LETTER : ('a'..'z') | ('A'..'Z') ;

INT : 'int' ;
DOUBLE : 'double' ;
FLOAT : 'float' ;
CHAR : 'char' ;
BOOL : 'bool' ;

LET : 'let' ;
OF : 'of' ;
ARRAY : 'array' ;
UNDERLINE : '_' ;

LEFT_SQ_BRACKET : '[' ;
RIGHT_SQ_BRACKET : ']' ;
LEFT_BRACKET : '(' ;
RIGHT_BRACKET : ')' ;

COLON : ':' ;
SEMICOLON: ';';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;