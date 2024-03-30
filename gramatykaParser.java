// Generated from gramatyka.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramatykaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INPUT=7, OUTPUT=8, AND=9, 
		OR=10, XOR=11, NEG=12, BOOLEAN=13, ID=14, REAL=15, INT=16, ADD=17, MULTIPLY=18, 
		MINUS=19, DIVIDE=20, STRING=21, NEWLINE=22, WS=23;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr_logic = 2, RULE_expr1 = 3, RULE_expr2 = 4, 
		RULE_expr3 = 5, RULE_matrix = 6, RULE_array = 7, RULE_value = 8, RULE_logic_value = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr_logic", "expr1", "expr2", "expr3", "matrix", "array", 
			"value", "logic_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "','", "']'", "'in'", "'out'", "'and'", 
			"'or'", "'xor'", "'neg'", null, null, null, null, "'+'", "'*'", "'-'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INPUT", "OUTPUT", "AND", "OR", 
			"XOR", "NEG", "BOOLEAN", "ID", "REAL", "INT", "ADD", "MULTIPLY", "MINUS", 
			"DIVIDE", "STRING", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "gramatyka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramatykaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(gramatykaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gramatykaParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4211072L) != 0)) {
				{
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16768L) != 0)) {
					{
					setState(20);
					stat();
					}
				}

				setState(23);
				match(NEWLINE);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends StatContext {
		public TerminalNode OUTPUT() { return getToken(gramatykaParser.OUTPUT, 0); }
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public OutputContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitOutput(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends StatContext {
		public TerminalNode INPUT() { return getToken(gramatykaParser.INPUT, 0); }
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public InputContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInput(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr_logicContext expr_logic() {
			return getRuleContext(Expr_logicContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitAssign(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(INPUT);
				setState(30);
				match(ID);
				}
				break;
			case OUTPUT:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(OUTPUT);
				setState(32);
				match(ID);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(ID);
				setState(34);
				match(T__0);
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(35);
					array();
					}
					break;
				case 2:
					{
					setState(36);
					expr1();
					}
					break;
				case 3:
					{
					setState(37);
					expr_logic(0);
					}
					break;
				case 4:
					{
					setState(38);
					matrix();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_logicContext extends ParserRuleContext {
		public Expr_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_logic; }
	 
		public Expr_logicContext() { }
		public void copyFrom(Expr_logicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Logic_valContext extends Expr_logicContext {
		public Logic_valueContext logic_value() {
			return getRuleContext(Logic_valueContext.class,0);
		}
		public Logic_valContext(Expr_logicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogic_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogic_val(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends Expr_logicContext {
		public TerminalNode NEG() { return getToken(gramatykaParser.NEG, 0); }
		public Expr_logicContext expr_logic() {
			return getRuleContext(Expr_logicContext.class,0);
		}
		public NegContext(Expr_logicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitNeg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Logic_oppContext extends Expr_logicContext {
		public List<Expr_logicContext> expr_logic() {
			return getRuleContexts(Expr_logicContext.class);
		}
		public Expr_logicContext expr_logic(int i) {
			return getRuleContext(Expr_logicContext.class,i);
		}
		public TerminalNode AND() { return getToken(gramatykaParser.AND, 0); }
		public TerminalNode OR() { return getToken(gramatykaParser.OR, 0); }
		public TerminalNode XOR() { return getToken(gramatykaParser.XOR, 0); }
		public Logic_oppContext(Expr_logicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogic_opp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogic_opp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Logic_parContext extends Expr_logicContext {
		public Expr_logicContext expr_logic() {
			return getRuleContext(Expr_logicContext.class,0);
		}
		public Logic_parContext(Expr_logicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogic_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogic_par(this);
		}
	}

	public final Expr_logicContext expr_logic() throws RecognitionException {
		return expr_logic(0);
	}

	private Expr_logicContext expr_logic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_logicContext _localctx = new Expr_logicContext(_ctx, _parentState);
		Expr_logicContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr_logic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				match(NEG);
				setState(45);
				expr_logic(3);
				}
				break;
			case BOOLEAN:
			case ID:
				{
				_localctx = new Logic_valContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				logic_value();
				}
				break;
			case T__1:
				{
				_localctx = new Logic_parContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(T__1);
				setState(48);
				expr_logic(0);
				setState(49);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_oppContext(new Expr_logicContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_logic);
					setState(53);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(54);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(55);
					expr_logic(5);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitSingle1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusminusContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode ADD() { return getToken(gramatykaParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(gramatykaParser.MINUS, 0); }
		public PlusminusContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterPlusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitPlusminus(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr1);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				expr2();
				}
				break;
			case 2:
				_localctx = new PlusminusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				expr2();
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				expr2();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single2Context extends Expr2Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Single2Context(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterSingle2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitSingle2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultidivideContext extends Expr2Context {
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(gramatykaParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(gramatykaParser.DIVIDE, 0); }
		public MultidivideContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterMultidivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitMultidivide(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr2);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Single2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				expr3();
				}
				break;
			case 2:
				_localctx = new MultidivideContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				expr3();
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				expr3();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	 
		public Expr3Context() { }
		public void copyFrom(Expr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_parContext extends Expr3Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr_parContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterExpr_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitExpr_par(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single4Context extends Expr3Context {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Single4Context(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterSingle4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitSingle4(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr3);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case REAL:
			case INT:
			case STRING:
				_localctx = new Single4Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				value();
				}
				break;
			case T__1:
				_localctx = new Expr_parContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__1);
				setState(77);
				expr1();
				setState(78);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixContext extends ParserRuleContext {
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitMatrix(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__3);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(83);
				array();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(84);
					match(T__4);
					setState(85);
					array();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(93);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Val_arrContext extends ArrayContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Val_arrContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterVal_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitVal_arr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Logic_arrContext extends ArrayContext {
		public List<Logic_valueContext> logic_value() {
			return getRuleContexts(Logic_valueContext.class);
		}
		public Logic_valueContext logic_value(int i) {
			return getRuleContext(Logic_valueContext.class,i);
		}
		public Logic_arrContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogic_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogic_arr(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Val_arrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__3);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2211840L) != 0)) {
					{
					setState(96);
					value();
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(97);
						match(T__4);
						setState(98);
						value();
						}
						}
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(106);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new Logic_arrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__3);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOOLEAN || _la==ID) {
					{
					setState(108);
					logic_value();
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(109);
						match(T__4);
						setState(110);
						logic_value();
						}
						}
						setState(115);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(118);
				match(T__5);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public TerminalNode INT() { return getToken(gramatykaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(gramatykaParser.STRING, 0); }
		public TerminalNode REAL() { return getToken(gramatykaParser.REAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2211840L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(gramatykaParser.BOOLEAN, 0); }
		public Logic_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogic_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogic_value(this);
		}
	}

	public final Logic_valueContext logic_value() throws RecognitionException {
		Logic_valueContext _localctx = new Logic_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logic_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_logic_sempred((Expr_logicContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_logic_sempred(Expr_logicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0003\u0000\u0016\b\u0000\u0001"+
		"\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0003\u0001"+
		"*\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u00029\b\u0002\n\u0002\f\u0002<\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"C\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004J\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005Q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006W\b\u0006\n\u0006\f\u0006Z\t\u0006\u0003\u0006"+
		"\\\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007d\b\u0007\n\u0007\f\u0007g\t\u0007\u0003\u0007"+
		"i\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007p\b\u0007\n\u0007\f\u0007s\t\u0007\u0003\u0007u\b\u0007\u0001"+
		"\u0007\u0003\u0007x\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000"+
		"\u0001\u0004\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0005"+
		"\u0001\u0000\t\u000b\u0002\u0000\u0011\u0011\u0013\u0013\u0002\u0000\u0012"+
		"\u0012\u0014\u0014\u0002\u0000\u000e\u0010\u0015\u0015\u0001\u0000\r\u000e"+
		"\u0087\u0000\u001a\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000"+
		"\u00043\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bI\u0001"+
		"\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000"+
		"\u000ew\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012{"+
		"\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0019\u0005\u0016\u0000\u0000\u0018\u0015"+
		"\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0001"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005\u0007\u0000\u0000\u001e*\u0005\u000e\u0000\u0000\u001f \u0005\b"+
		"\u0000\u0000 *\u0005\u000e\u0000\u0000!\"\u0005\u000e\u0000\u0000\"\'"+
		"\u0005\u0001\u0000\u0000#(\u0003\u000e\u0007\u0000$(\u0003\u0006\u0003"+
		"\u0000%(\u0003\u0004\u0002\u0000&(\u0003\f\u0006\u0000\'#\u0001\u0000"+
		"\u0000\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'&"+
		"\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\u001d\u0001\u0000"+
		"\u0000\u0000)\u001f\u0001\u0000\u0000\u0000)!\u0001\u0000\u0000\u0000"+
		"*\u0003\u0001\u0000\u0000\u0000+,\u0006\u0002\uffff\uffff\u0000,-\u0005"+
		"\f\u0000\u0000-4\u0003\u0004\u0002\u0003.4\u0003\u0012\t\u0000/0\u0005"+
		"\u0002\u0000\u000001\u0003\u0004\u0002\u000012\u0005\u0003\u0000\u0000"+
		"24\u0001\u0000\u0000\u00003+\u0001\u0000\u0000\u00003.\u0001\u0000\u0000"+
		"\u00003/\u0001\u0000\u0000\u00004:\u0001\u0000\u0000\u000056\n\u0004\u0000"+
		"\u000067\u0007\u0000\u0000\u000079\u0003\u0004\u0002\u000585\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=C\u0003\b\u0004\u0000>?\u0003\b\u0004\u0000?@\u0007\u0001\u0000"+
		"\u0000@A\u0003\b\u0004\u0000AC\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000"+
		"\u0000B>\u0001\u0000\u0000\u0000C\u0007\u0001\u0000\u0000\u0000DJ\u0003"+
		"\n\u0005\u0000EF\u0003\n\u0005\u0000FG\u0007\u0002\u0000\u0000GH\u0003"+
		"\n\u0005\u0000HJ\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001"+
		"\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000KQ\u0003\u0010\b\u0000LM"+
		"\u0005\u0002\u0000\u0000MN\u0003\u0006\u0003\u0000NO\u0005\u0003\u0000"+
		"\u0000OQ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000PL\u0001\u0000"+
		"\u0000\u0000Q\u000b\u0001\u0000\u0000\u0000R[\u0005\u0004\u0000\u0000"+
		"SX\u0003\u000e\u0007\u0000TU\u0005\u0005\u0000\u0000UW\u0003\u000e\u0007"+
		"\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[S\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0005\u0006\u0000\u0000^\r\u0001\u0000\u0000"+
		"\u0000_h\u0005\u0004\u0000\u0000`e\u0003\u0010\b\u0000ab\u0005\u0005\u0000"+
		"\u0000bd\u0003\u0010\b\u0000ca\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000h`\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jx\u0005\u0006\u0000\u0000"+
		"kt\u0005\u0004\u0000\u0000lq\u0003\u0012\t\u0000mn\u0005\u0005\u0000\u0000"+
		"np\u0003\u0012\t\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0005\u0006\u0000\u0000w_\u0001"+
		"\u0000\u0000\u0000wk\u0001\u0000\u0000\u0000x\u000f\u0001\u0000\u0000"+
		"\u0000yz\u0007\u0003\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0007"+
		"\u0004\u0000\u0000|\u0013\u0001\u0000\u0000\u0000\u0010\u0015\u001a\'"+
		")3:BIPX[ehqtw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}