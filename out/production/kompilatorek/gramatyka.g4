grammar gramatyka;

prog: block
;

block: ( stat? NEWLINE )*
;

stat:	INPUT (INTTYPE | FLOAT | DOUBLE | BOOLTYPE | STRINGTYPE) ID     #input
	| OUTPUT ID   		                                                #output
 	| ID '=' (array|expr1|expr_logic|matrix)		                    #assign
 	| REPEAT repetitions block ENDREPEAT		                        #repeat
 	| 'if' condition block 'endif'                                      #if
;

repetitions: (INT|ID)
;

condition: ID (BIGGER|SMALLER|EQUAL|NOTEQUAL) ID
;

expr_logic: expr_logic (AND | OR | XOR) expr_logic      #logic_opp
    | NEG expr_logic                                    #neg
    | logic_value                                       #logic_val
    | '(' expr_logic ')'                                #logic_par
;

expr1:  expr2			            #single1
    | expr2 (ADD | MINUS) expr2	    #plusminus
;

expr2: expr3                            #single2
    | expr3 (MULTIPLY | DIVIDE) expr3   #multidivide
;

expr3:   value              #single4
       | '(' expr1 ')'		#expr_par
;

matrix: '[' ( array ( ',' array )* )? ']'
;

array: '['size = INT']' '[' ( INT ( ',' INT )* )? ']'
;

value: ID
       | INT
       | STRING
       | FLOAT REAL
       | DOUBLE REAL
;

logic_value: ID
        | BOOLEAN
;

BIGGER: '>'
;

SMALLER: '<'
;

EQUAL: '=='
;

NOTEQUAL: '!='
;

REPEAT: 'repeat'
;

ENDREPEAT: 'endrepeat'
;

INPUT:	'in'
;

OUTPUT:	'out'
;

AND: 'and'
;

OR: 'or'
;

XOR: 'xor'
;

NEG: 'neg'
;

FLOAT: '(float)'
;

DOUBLE: '(double)'
;

STRINGTYPE: '(string)'
;

INTTYPE: '(int)'
;

BOOLTYPE: '(bool)'
;

BOOLEAN: ('true' | 'false')
;

ID:   ('a'..'z'|'A'..'Z')+
;

REAL: '0'..'9'+'.''0'..'9'+
;

INT:   '0'..'9'+
;

ADD: '+'
;

MULTIPLY: '*'
;

MINUS: '-'
;

DIVIDE: '/'
;

STRING :  '"' ( ~('\\'|'"') )* '"'
;

NEWLINE:	'\r'? '\n'
;

WS: [ \t]+ -> skip
;

