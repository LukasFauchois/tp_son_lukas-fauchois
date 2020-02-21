// Generated from ArithExprASTParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithExprASTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, PLUS=2, MINUS=3, MULTI=4, DIVIS=5, LPAR=6, RPAR=7;
	public static final int
		RULE_prog = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "PLUS", "MINUS", "MULTI", "DIVIS", "LPAR", "RPAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ArithExprASTParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithExprASTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public AExpr val;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArithExprASTParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithExprASTParserListener ) ((ArithExprASTParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithExprASTParserListener ) ((ArithExprASTParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			((ProgContext)_localctx).expr = expr(0);
			setState(5);
			match(EOF);
			((ProgContext)_localctx).val = ((ProgContext)_localctx).expr.val; System.out.println("\nResult: "+_localctx.val.eval());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public AExpr val;
		public ExprContext e1;
		public Token INT;
		public ExprContext x;
		public ExprContext e2;
		public TerminalNode INT() { return getToken(ArithExprASTParser.INT, 0); }
		public TerminalNode LPAR() { return getToken(ArithExprASTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ArithExprASTParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ArithExprASTParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ArithExprASTParser.MINUS, 0); }
		public TerminalNode MULTI() { return getToken(ArithExprASTParser.MULTI, 0); }
		public TerminalNode DIVIS() { return getToken(ArithExprASTParser.DIVIS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithExprASTParserListener ) ((ArithExprASTParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithExprASTParserListener ) ((ArithExprASTParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(9);
				((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).val = new AInt((((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0));
				}
				break;
			case LPAR:
				{
				setState(11);
				match(LPAR);
				setState(12);
				((ExprContext)_localctx).x = expr(0);
				setState(13);
				match(RPAR);
				((ExprContext)_localctx).val = ((ExprContext)_localctx).x.val;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(18);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(19);
						match(PLUS);
						setState(20);
						((ExprContext)_localctx).e2 = expr(7);
						((ExprContext)_localctx).val = new APlus(((ExprContext)_localctx).e1.val,((ExprContext)_localctx).e2.val);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(23);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(24);
						match(MINUS);
						setState(25);
						((ExprContext)_localctx).e2 = expr(6);
						((ExprContext)_localctx).val = new AMinus(((ExprContext)_localctx).e1.val,  ((ExprContext)_localctx).e2.val);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(28);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(29);
						match(MULTI);
						setState(30);
						((ExprContext)_localctx).e2 = expr(5);
						((ExprContext)_localctx).val = new AMulti(((ExprContext)_localctx).e1.val,((ExprContext)_localctx).e2.val);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(33);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(34);
						match(DIVIS);
						setState(35);
						((ExprContext)_localctx).e2 = expr(4);
						((ExprContext)_localctx).val = new ADivis(((ExprContext)_localctx).e1.val,((ExprContext)_localctx).e2.val);
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t.\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\23\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3)\n\3\f\3\16\3,\13\3\3\3\2\3\4\4\2\4\2\2\2\60\2\6\3\2\2\2\4\22\3"+
		"\2\2\2\6\7\5\4\3\2\7\b\7\2\2\3\b\t\b\2\1\2\t\3\3\2\2\2\n\13\b\3\1\2\13"+
		"\f\7\3\2\2\f\23\b\3\1\2\r\16\7\b\2\2\16\17\5\4\3\2\17\20\7\t\2\2\20\21"+
		"\b\3\1\2\21\23\3\2\2\2\22\n\3\2\2\2\22\r\3\2\2\2\23*\3\2\2\2\24\25\f\b"+
		"\2\2\25\26\7\4\2\2\26\27\5\4\3\t\27\30\b\3\1\2\30)\3\2\2\2\31\32\f\7\2"+
		"\2\32\33\7\5\2\2\33\34\5\4\3\b\34\35\b\3\1\2\35)\3\2\2\2\36\37\f\6\2\2"+
		"\37 \7\6\2\2 !\5\4\3\7!\"\b\3\1\2\")\3\2\2\2#$\f\5\2\2$%\7\7\2\2%&\5\4"+
		"\3\6&\'\b\3\1\2\')\3\2\2\2(\24\3\2\2\2(\31\3\2\2\2(\36\3\2\2\2(#\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2\5\22(*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}