// Generated from ArithExprParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithExprParser}.
 */
public interface ArithExprParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArithExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArithExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ArithExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ArithExprParser.ExprContext ctx);
}