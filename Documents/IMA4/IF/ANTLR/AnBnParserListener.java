// Generated from AnBnParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnBnParser}.
 */
public interface AnBnParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnBnParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AnBnParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnBnParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AnBnParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnBnParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(AnBnParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnBnParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(AnBnParser.SContext ctx);
}