grammar gramatyka;

prog: ( stat? NEWLINE )* 
    ;

stat:	WRITE ' ' ID		#write
	| READ ' ' ID   		#read
 	| ID ' = ' expr		#assign
 	| expr              #expression
  ;

expr: expr ' ' ADD ' ' expr		#add
    | expr MULTIPLY expr    #multiply
    | expr MINUS expr   #minus
    | expr DIVIDE expr  #divide
    | expr AND expr    #and
    | expr OR expr     #or
    | expr XOR expr    #xor
    | NEG expr     #neg
	| value		 	#single
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

INT:   '0'..'9'+
    ;

REAL: '0'..'9'+'.''0'..'9'+
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

WS:   (' '|'\t')+ { skip(); }
    ;
