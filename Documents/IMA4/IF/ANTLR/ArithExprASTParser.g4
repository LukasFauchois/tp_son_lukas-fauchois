parser grammar ArithExprASTParser;
options {tokenVocab=ArithExprASTLexer;}

prog returns [AExpr val]: expr EOF {$val=$expr.val; System.out.println("\nResult: "+$val.eval());};

expr returns [AExpr val] :
	e1=expr PLUS e2=expr {$val=new APlus($e1.val,$e2.val);}
	| e1=expr MINUS e2=expr {$val=new AMinus($e1.val,  $e2.val);}
	| e1=expr MULTI e2=expr {$val=new AMulti($e1.val,$e2.val);}
	| e1=expr DIVIS e2=expr {$val=new ADivis($e1.val,$e2.val);}
	| INT {$val=new AInt($INT.int);}
	| LPAR x=expr RPAR {$val=$x.val;};
