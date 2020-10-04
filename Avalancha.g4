/**
 * Define a grammar called Avalancha
 */
grammar Avalancha;       

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

LINE_COMMENT
: '--' ~[\r\n]* -> skip ;

FUN:   'fun';
CHECK: 'check';
IMP:   'imp'; 
AND:   'and';
OR:    'or';
NOT:    'not';
TRUE:   ('True ' | 'true');
FALSE:  ('False' | 'false');

LPAREN:     '(';
RPAREN:     ')';
COMMA:      ',';
ARROW:      '->';
UNDERSCORE: '_';
COLON:      ':';
QUESTION:   '?';
BANG:       '!';
EQ:         '==';

LOWERID : [a-z][_a-zA-Z0-9]*;
UPPERID : [A-Z][_a-zA-Z0-9]*; 

programa : declaraciones chequeos;

declaraciones : 
	| declaracion declaraciones;
	
chequeos : 
	| chequeo chequeos;
	
declaracion : FUN LOWERID signatura precondicion postcondicion reglas;

chequeo : CHECK formula;

signatura : 
	| COLON listaParametros ARROW parametro;
	
precondicion : 
	| QUESTION formula;
	
postcondicion : 
	| BANG formula;
	
listaParametros : 
	| listaParametrosNoVacia;
	
listaParametrosNoVacia : parametro | parametro COMMA listaParametrosNoVacia;
	
parametro : UNDERSCORE | LOWERID;

reglas : | regla reglas;

regla : listaPatrones ARROW expresion;

patron : UNDERSCORE | LOWERID | UPPERID | UPPERID LPAREN listaPatrones RPAREN;

listaPatrones: | listaPatronesNoVacia;

listaPatronesNoVacia : expresion | expresion COMMA listaPatronesNoVacia;

expresion : LOWERID | LOWERID LPAREN listaExpresiones RPAREN | UPPERID | UPPERID LPAREN listaExpresiones RPAREN;

listaExpresiones : | listaExpresionesNoVacia;

listaExpresionesNoVacia : expresion | expresion COMMA listaExpresionesNoVacia;

formula : formulaImpOrAndNeg;
 
formulaImpOrAndNeg : formulaOrAndNeg | formulaOrAndNeg IMP formulaImpOrAndNeg;

formulaOrAndNeg: formulaAndNeg | formulaAndNeg OR formulaOrAndNeg;

formulaAndNeg : formulaNeg | formulaNeg AND formulaAndNeg;

formulaNeg : formulaAtomica | NOT formulaNeg;

formulaAtomica : TRUE | FALSE | LPAREN formula RPAREN | expresion | expresion EQ expresion;
