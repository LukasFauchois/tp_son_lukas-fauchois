// Generated from ArithExprASTParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithExprASTParser}.
 */
public interface ArithExprASTParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithExprASTParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArithExprASTParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithExprASTParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArithExprASTParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithExprASTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ArithExprASTParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithExprASTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ArithExprASTParser.ExprContext ctx);
}