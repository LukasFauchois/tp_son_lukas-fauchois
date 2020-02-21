parser grammar ArithExprParser;
options {tokenVocab=ArithExprLexer;}

prog : expr EOF {System.out.println("\nResult: "+$expr.val);};

expr returns [int val] :
	e1=expr PLUS e2=expr {$val=$e1.val+$e2.val;}
	| e1=expr MINUS e2=expr {$val=$e1.val-$e2.val;}
	| e1=expr MULTI e2=expr {$val=$e1.val*$e2.val;}
	| e1=expr DIVIS e2=expr {$val=$e1.val/$e2.val;}
	| INT {$val=$INT.int;}
	| LPAR e=expr RPAR {$val=$e.val;};
