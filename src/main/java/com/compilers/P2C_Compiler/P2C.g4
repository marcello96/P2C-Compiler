grammar P2C;

/*
 * Parser Rules
 */
 
program
	:	globalDefinitions DO blockWithoutReturn DONE
	;

globalDefinitions
	:	(varDeclaration SEMICOLON | funDefinition | recordDefinition SEMICOLON)*
	;

recordDefinition
	: IDENT ASSIGN RECORD (varDeclaration SEMICOLON)* END
	;

recordType: IDENT;

varDeclaration 
	: LET parameterGroup (ASSIGN constant)?
	;

assignment
 : IDENT (LEFT_SQ_BRACKET INTEGER_CONSTANT RIGHT_SQ_BRACKET)* ASSIGN expression
 ;
	
parameterGroup
	:	identifier COLON type
	;
	
	
identifier : IDENT ;	

type
	:	array? (primitiveType | recordType)
	;


primitiveType 
	: INT | LONG | DOUBLE | FLOAT | CHAR | BOOL | STRING
	;

	
array
	: ARRAY (LEFT_SQ_BRACKET INTEGER_CONSTANT RIGHT_SQ_BRACKET)+ OF
	;	
	
arrayType
	: ARRAY OF
	;
	
constant
	: '-'? INTEGER_CONSTANT
	| '-'? FLOATING_CONSTANT
	;
	
// if definition
ifDefinition
	: IF LEFT_BRACKET expression RIGHT_BRACKET DO blockWithoutReturn DONE
		(ELSIF LEFT_BRACKET expression RIGHT_BRACKET DO blockWithoutReturn DONE)* (ELSE DO blockWithoutReturn DONE)?
	;
  
whileDefinition
	: WHILE LEFT_BRACKET expression RIGHT_BRACKET DO blockWithoutReturn DONE
	;

forDefinition
	: FOR LEFT_BRACKET identifier IN range RIGHT_BRACKET DO blockWithoutReturn DONE
	;
  
range
	: constant DOUBLE_DOT constant (BY INTEGER_CONSTANT)?
	;

	
expression
 : EXCLAMATION expression                     			
 | expression operators expression      				                
 | atom                                 						
 ;
 
operators
 : MUL_OPERATORS
 | ADD_OPERATORS
 | RELATIONALEXPR
 | AND
 | OR
 ;
 
 atom
 : LEFT_BRACKET expression RIGHT_BRACKET 		
 | constant  																
 | funDesignator														
 | (TRUE | FALSE) 													
 | IDENT (LEFT_SQ_BRACKET INTEGER_CONSTANT RIGHT_SQ_BRACKET)? 													
 | NULL            													
 ;
	
// function definition
funDefinition
	:	FUN identifier LEFT_BRACKET parameterList? RIGHT_BRACKET (ARROW resultType)? 
		DO block DONE
		
	;
	
parameterList
	:	parameterGroup (COMMA parameterGroup)*
	;
	
resultType
	: arrayType? primitiveType
	;
	
funDesignator
	:	identifier LEFT_BRACKET argumentList? RIGHT_BRACKET
	;
	
argumentList
	:	expression (COMMA expression)*
	;

blockElement
	: varDeclaration SEMICOLON	
	| assignment SEMICOLON			
	| whileDefinition
	| forDefinition						
	| ifDefinition 							
	;	
	
returnStatement
	:	RETURN expression SEMICOLON
	;
	
blockWithoutReturn
	: blockElement*
	;
		
block
	: blockElement* returnStatement
	;
 
 /*
 * Lexer Rules
 */


INT : 'int' ;
LONG : 'long' ;
DOUBLE : 'double' ;
FLOAT : 'float' ;
CHAR : 'char' ;
BOOL : 'bool' ;
STRING : 'string';
NULL : 'null' ;
TRUE : 'true' ;
FALSE : 'false' ;

IF : 'if';
ELSIF : 'elsif' ;
ELSE : 'else';

WHILE : 'while' ;
DO : 'do';
DONE : 'done';
FOR: 'for';
BY: 'by';
IN: 'in';

FUN : 'fun' ;
RETURN : 'return';

LET : 'let' ;
OF : 'of' ;
ARRAY : 'array' ;
RECORD : 'record' ;
END : 'end' ;

UNDERLINE : '_' ;
LEFT_SQ_BRACKET : '[' ;
RIGHT_SQ_BRACKET : ']' ;
LEFT_BRACKET : '(' ;
RIGHT_BRACKET : ')' ;
ASSIGN : '=' ;

AND : 'and' ;
OR : 'or' ;


RELATIONALEXPR
 : '<'
 | '>'
 | '<='
 | '>='
 | '=='
 | '!='
 ;
 
ADD_OPERATORS
	:	'+'
	|	'-'
	;

MUL_OPERATORS
	:	'*'
	|	'/'
	;
	

EXCLAMATION : '!' ;
ARROW : '->';
COLON : ':' ;
COMMA : ',' ;
SEMICOLON: ';';
DOUBLE_DOT: '..';



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
    :   '##' .*? '##'
        -> skip
    ;

LINE_COMMENT
    :   '#' ~[\r\n]*
        -> skip
;