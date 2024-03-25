grammar gramatyka;

prog: ( stat? NEWLINE )*
    ;

stat:	WRITE ID		#write
	| READ ID   		#read
 	| ID '=' expr0		#assign
 	| expr0              #expression
  ;

expr0:  expr1			            #single0
    | expr1 (AND | OR | XOR) expr1	#logical
;

expr1:  expr2			            #single1
    | expr2 (ADD | MINUS) expr2	    #plusminus
;

expr2: expr3    #single2
    | expr3 (MULTIPLY | DIVIDE) expr3 #multidivide
;

expr3: expr4        #single3
    | NEG expr4     #negative
;

expr4:   value              #single4
       | '(' expr0 ')'		#par
;

value: ID
       | INT
       | STRING
       | REAL
   ;

WRITE:	'write'
   ;

READ:	'read'
   ;

AND: 'and'
   ;

OR: 'or'
   ;

XOR: 'xor'
   ;

NEG: 'neg'
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

WS: [ \t]+ -> skip;

