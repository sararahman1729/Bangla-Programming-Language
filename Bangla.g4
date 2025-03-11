grammar Bangla;

// Parser Rules
// Parser Rules
program
    : statement* EOF
    ;

statement
    : declaration
    | assignment
    | arrayDeclaration
    | arrayAssignment
    | fileOperation
    | flowControl
    ;

declaration
    : type IDENTIFIER (ASSIGN_OP expression)?
    ;

assignment
    : IDENTIFIER ASSIGN_OP expression
    ;

arrayDeclaration
    : type IDENTIFIER '[' NUMBER ']'
    ;


type
    : INTEGER
    ;

arrayAssignment
    : IDENTIFIER '[' expression ']' ASSIGN_OP expression
    ;

fileOperation
    : 'filekhola' '(' STRING ')'
    | 'filelekha' '(' STRING ',' STRING ')'
    | 'filepora' '(' STRING ')'
    ;

expression
    : IDENTIFIER
    | NUMBER
    | STRING
    | expression ARITH_OP expression
    | IDENTIFIER '[' expression ']'
    | '(' expression ')'
    ;

flowControl
    : ifElse
    | whileLoop
    | forLoop
    ;

ifElse
    : 'jodi' '(' condition ')' statements ('nahole' statements)?
    ;

whileLoop
    : 'jokhon' '(' condition ')' statements
    ;

forLoop
    : 'proti' '(' (declaration | assignment)? ';' condition? ';' assignment? ')' statements
    ;

condition
    : expression COMPARE_OP expression
    ;

statements
    : statement+
    ;




//for Lexical Rules
INTEGER : 'poornoshonkha';  
IF : 'jodi';             
NOT : 'na';              
AND : 'ebong';            
OR : 'othoba';           



// Keywords
FILEKHOLA  : 'filekhola';
FILELEKHA  : 'filelekha';
FILEPORA   : 'filepora';
NAHOLE     : 'nahole';
JOKHON     : 'jokhon';
PROTI      : 'proti';

// Symbols
LBRACKET   : '[';
RBRACKET   : ']';
SEMICOLON  : ';';
LPAREN     : '(';
RPAREN     : ')';
COMMA      : ',';

// Tokens
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER     : [0-9]+;
STRING     : '"' (~["\r\n])* '"';
ASSIGN_OP  : '=';
ARITH_OP   : '+' | '-' | '*' | '/';
COMPARE_OP : '==' | '!=' | '<' | '>' | '<=' | '>=';

// Whitespace
WS : [ \t\r\n]+ -> skip;
