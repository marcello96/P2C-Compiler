grammar P2C;

/*
 * Parser Rules
 */

program 
	:	varDeclaration SEMICOLON
	|	expression SEMICOLON
	;


varDeclaration 
	: LET identifier COLON type (ASSIGNMENT constant)?
	;
	
	
identifier : IDENT ;	

type
	:	array? primitiveType
	;


primitiveType 
	: INT | DOUBLE | FLOAT | CHAR | BOOL
	;

	
array
	: 'array' '[' INTEGER_CONSTANT ']' 'of' 
	;	
	

constant
	:	'-'? INTEGER_CONSTANT
	|	'-'? FLOATING_CONSTANT // | function
	|	identifier
	;

expression
	:	term
	|	term ADD_OPERATORS expression
	;
	
term
	:	factor
	|	term MUL_OPERATORS factor
	;
	
factor
	:	constant
	|	LEFT_BRACKET expression	RIGHT_BRACKET
	;
 
 /*
 * Lexer Rules
 */
	


LET : 'let' ;
INT : 'int' ;
DOUBLE : 'double' ;
FLOAT : 'float' ;
CHAR : 'char' ;
BOOL : 'bool' ;


OF : 'of' ;
ARRAY : 'array' ;
UNDERLINE : '_' ;


LEFT_SQ_BRACKET : '[' ;
RIGHT_SQ_BRACKET : ']' ;
LEFT_BRACKET : '(' ;
RIGHT_BRACKET : ')' ;
ASSIGNMENT : '=' ;
ADD_OPERATORS
	:	'+'
	|	'-'
	;

MUL_OPERATORS
	:	'*'
	|	'/'
	;
	


COLON : ':' ;
SEMICOLON: ';';



IDENT
	:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
	;


FLOATING_CONSTANT
    :   NONZERO_DIGIT DIGIT_SEQUENCE? '.' DIGIT_SEQUENCE
    |    '0.' DIGIT_SEQUENCE
;



INTEGER_CONSTANT
    :   DECIMAL_CONSTANT
    |   OCTAL_CONSTANT
    |   HEXADECIMAL_CONSTANT
    |	BINARY_CONSTANT
;




fragment
DIGIT_SEQUENCE
	:	DIGIT+
	;

fragment
BINARY_CONSTANT
	:	'0' [bB] [0-1]+
	;

fragment
DECIMAL_CONSTANT
    :   NONZERO_DIGIT DIGIT*
    ;

fragment
OCTAL_CONSTANT
    :   '0' OCTAL_DIGIT*
    ;

fragment
HEXADECIMAL_CONSTANT
    :   HEXADECIMAL_PREFIX HEXADECIMAL_DIGIT+
    ;

fragment
HEXADECIMAL_PREFIX
    :   '0' [xX]
    ;

fragment
DIGIT
    :   [0-9]
;

fragment
NONZERO_DIGIT
    :   [1-9]
    ;

fragment
OCTAL_DIGIT
    :   [0-7]
    ;

fragment
HEXADECIMAL_DIGIT
    :   [0-9a-fA-F]
	;
	



WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;

BLOCK_COMMENT
    :   '/*' .*? '*/'
        -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]*
        -> skip
;