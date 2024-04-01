grammar gramatyka;

prog: ( stat? NEWLINE )*
;
// x = 1
stat:	INPUT ID		                            #input
	| OUTPUT ID   		                            #output
 	| ID '=' (array|expr1|expr_logic|matrix)		#assign
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

array: '[' ( value ( ',' value )* )? ']'                #val_arr
    | '[' ( logic_value ( ',' logic_value )* )? ']'     #logic_arr
;

value: ID
       | INT
       | STRING
       | '(float)' REAL
       | '(double)' REAL
;

logic_value: ID
        | BOOLEAN
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

