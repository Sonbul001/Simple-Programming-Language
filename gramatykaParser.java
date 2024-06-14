// Generated from ./gramatyka.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, GLOBAL=9, 
		FUNCTION=10, ENDFUNCTION=11, BIGGER=12, SMALLER=13, EQUAL=14, NOTEQUAL=15, 
		REPEAT=16, ENDREPEAT=17, INPUT=18, OUTPUT=19, AND=20, OR=21, XOR=22, NEG=23, 
		FLOAT=24, DOUBLE=25, STRINGTYPE=26, INTTYPE=27, BOOLTYPE=28, BOOLEAN=29, 
		ID=30, REAL=31, INT=32, ADD=33, MULTIPLY=34, MINUS=35, DIVIDE=36, STRING=37, 
		NEWLINE=38, WS=39;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_function = 2, RULE_fblock = 3, RULE_stat = 4, 
		RULE_repetitions = 5, RULE_condition = 6, RULE_expr_logic = 7, RULE_expr1 = 8, 
		RULE_expr2 = 9, RULE_expr3 = 10, RULE_matrix = 11, RULE_array = 12, RULE_value = 13, 
		RULE_logic_value = 14, RULE_fparam = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "function", "fblock", "stat", "repetitions", "condition", 
			"expr_logic", "expr1", "expr2", "expr3", "matrix", "array", "value", 
			"logic_value", "fparam"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'if'", "'endif'", "'('", "')'", "'['", "','", "']'", "'global'", 
			"'function'", "'endfunction'", "'>'", "'<'", "'=='", "'!='", "'repeat'", 
			"'endrepeat'", "'in'", "'out'", "'and'", "'or'", "'xor'", "'neg'", "'(float)'", 
			"'(double)'", "'(string)'", "'(int)'", "'(bool)'", null, null, null, 
			null, "'+'", "'*'", "'-'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "GLOBAL", "FUNCTION", 
			"ENDFUNCTION", "BIGGER", "SMALLER", "EQUAL", "NOTEQUAL", "REPEAT", "ENDREPEAT", 
			"INPUT", "OUTPUT", "AND", "OR", "XOR", "NEG", "FLOAT", "DOUBLE", "STRINGTYPE", 
			"INTTYPE", "BOOLTYPE", "BOOLEAN", "ID", "REAL", "INT", "ADD", "MULTIPLY", 
			"MINUS", "DIVIDE", "STRING", "NEWLINE", "WS"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			block();
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
	public static class BlockContext extends ParserRuleContext {
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275952502276L) != 0)) {
				{
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case GLOBAL:
				case REPEAT:
				case INPUT:
				case OUTPUT:
				case ID:
					{
					setState(34);
					stat();
					}
					break;
				case FUNCTION:
					{
					setState(35);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(38);
				match(NEWLINE);
				}
				}
				setState(43);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(gramatykaParser.FUNCTION, 0); }
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(gramatykaParser.ENDFUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(FUNCTION);
			setState(45);
			fparam();
			setState(46);
			fblock();
			setState(47);
			match(ENDFUNCTION);
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
	public static class FblockContext extends ParserRuleContext {
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
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitFblock(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275952501252L) != 0)) {
				{
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074594308L) != 0)) {
					{
					setState(49);
					stat();
					}
				}

				setState(52);
				match(NEWLINE);
				}
				}
				setState(57);
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
	public static class CallContext extends StatContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public CallContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends StatContext {
		public TerminalNode INPUT() { return getToken(gramatykaParser.INPUT, 0); }
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public TerminalNode INTTYPE() { return getToken(gramatykaParser.INTTYPE, 0); }
		public TerminalNode FLOAT() { return getToken(gramatykaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(gramatykaParser.DOUBLE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(gramatykaParser.BOOLTYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(gramatykaParser.STRINGTYPE, 0); }
		public TerminalNode GLOBAL() { return getToken(gramatykaParser.GLOBAL, 0); }
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
	public static class RepeatContext extends StatContext {
		public TerminalNode REPEAT() { return getToken(gramatykaParser.REPEAT, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ENDREPEAT() { return getToken(gramatykaParser.ENDREPEAT, 0); }
		public RepeatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitRepeat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends StatContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitIf(this);
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
		public TerminalNode GLOBAL() { return getToken(gramatykaParser.GLOBAL, 0); }
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
		enterRule(_localctx, 8, RULE_stat);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(58);
					match(GLOBAL);
					}
				}

				setState(61);
				match(INPUT);
				setState(62);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 520093696L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				match(ID);
				}
				break;
			case 2:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(OUTPUT);
				setState(65);
				match(ID);
				}
				break;
			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(66);
					match(GLOBAL);
					}
				}

				setState(69);
				match(ID);
				setState(70);
				match(T__0);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(71);
					array();
					}
					break;
				case 2:
					{
					setState(72);
					expr1();
					}
					break;
				case 3:
					{
					setState(73);
					expr_logic(0);
					}
					break;
				case 4:
					{
					setState(74);
					matrix();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(REPEAT);
				setState(78);
				repetitions();
				setState(79);
				block();
				setState(80);
				match(ENDREPEAT);
				}
				break;
			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(T__1);
				setState(83);
				condition();
				setState(84);
				block();
				setState(85);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(ID);
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
	public static class RepetitionsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramatykaParser.INT, 0); }
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitRepetitions(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repetitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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
	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gramatykaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gramatykaParser.ID, i);
		}
		public TerminalNode BIGGER() { return getToken(gramatykaParser.BIGGER, 0); }
		public TerminalNode SMALLER() { return getToken(gramatykaParser.SMALLER, 0); }
		public TerminalNode EQUAL() { return getToken(gramatykaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(gramatykaParser.NOTEQUAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
			match(ID);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr_logic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				match(NEG);
				setState(98);
				expr_logic(3);
				}
				break;
			case BOOLEAN:
			case ID:
				{
				_localctx = new Logic_valContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				logic_value();
				}
				break;
			case T__3:
				{
				_localctx = new Logic_parContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(T__3);
				setState(101);
				expr_logic(0);
				setState(102);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_oppContext(new Expr_logicContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_logic);
					setState(106);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(107);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(108);
					expr_logic(5);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 16, RULE_expr1);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				expr2();
				}
				break;
			case 2:
				_localctx = new PlusminusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				expr2();
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
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
		enterRule(_localctx, 18, RULE_expr2);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Single2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				expr3();
				}
				break;
			case 2:
				_localctx = new MultidivideContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				expr3();
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
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
		enterRule(_localctx, 20, RULE_expr3);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case DOUBLE:
			case ID:
			case INT:
			case STRING:
				_localctx = new Single4Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				value();
				}
				break;
			case T__3:
				_localctx = new Expr_parContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__3);
				setState(130);
				expr1();
				setState(131);
				match(T__4);
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
		enterRule(_localctx, 22, RULE_matrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__5);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(136);
				array();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(137);
					match(T__6);
					setState(138);
					array();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146);
			match(T__7);
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
		public Token size;
		public List<TerminalNode> INT() { return getTokens(gramatykaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(gramatykaParser.INT, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__5);
			setState(149);
			((ArrayContext)_localctx).size = match(INT);
			setState(150);
			match(T__7);
			setState(151);
			match(T__5);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(152);
				match(INT);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(153);
					match(T__6);
					setState(154);
					match(INT);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(162);
			match(T__7);
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
		public TerminalNode FLOAT() { return getToken(gramatykaParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(gramatykaParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(gramatykaParser.DOUBLE, 0); }
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
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(INT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(STRING);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(FLOAT);
				setState(168);
				match(REAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(DOUBLE);
				setState(170);
				match(REAL);
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
		enterRule(_localctx, 28, RULE_logic_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FparamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramatykaParser.ID, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitFparam(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
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
		case 7:
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
		"\u0004\u0001\'\u00b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003"+
		"3\b\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t\u0003\u0001"+
		"\u0004\u0003\u0004<\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004D\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004L\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004Y\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007i\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007n\b\u0007\n\u0007\f\u0007q\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bx\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u007f\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0086\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u008c\b\u000b\n\u000b\f\u000b\u008f\t\u000b\u0003\u000b"+
		"\u0091\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u009c\b\f\n\f\f\f\u009f\t\f\u0003\f\u00a1"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00ac\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0000\u0001\u000e\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0007\u0001\u0000\u0018"+
		"\u001c\u0002\u0000\u001e\u001e  \u0001\u0000\f\u000f\u0001\u0000\u0014"+
		"\u0016\u0002\u0000!!##\u0002\u0000\"\"$$\u0001\u0000\u001d\u001e\u00be"+
		"\u0000 \u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004,"+
		"\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\bX\u0001\u0000"+
		"\u0000\u0000\nZ\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000e"+
		"h\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012~\u0001"+
		"\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0087\u0001"+
		"\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u00ab\u0001"+
		"\u0000\u0000\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e\u00af\u0001"+
		"\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\u0001\u0001\u0000\u0000"+
		"\u0000\"%\u0003\b\u0004\u0000#%\u0003\u0004\u0002\u0000$\"\u0001\u0000"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&(\u0005&\u0000\u0000\'$\u0001\u0000\u0000\u0000(+\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*\u0003\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\n\u0000"+
		"\u0000-.\u0003\u001e\u000f\u0000./\u0003\u0006\u0003\u0000/0\u0005\u000b"+
		"\u0000\u00000\u0005\u0001\u0000\u0000\u000013\u0003\b\u0004\u000021\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"46\u0005&\u0000\u000052\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0007\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:<\u0005\t\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0012\u0000\u0000>?\u0007\u0000\u0000\u0000?Y\u0005\u001e\u0000\u0000"+
		"@A\u0005\u0013\u0000\u0000AY\u0005\u001e\u0000\u0000BD\u0005\t\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0005\u001e\u0000\u0000FK\u0005\u0001\u0000\u0000GL\u0003\u0018"+
		"\f\u0000HL\u0003\u0010\b\u0000IL\u0003\u000e\u0007\u0000JL\u0003\u0016"+
		"\u000b\u0000KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LY\u0001\u0000\u0000\u0000"+
		"MN\u0005\u0010\u0000\u0000NO\u0003\n\u0005\u0000OP\u0003\u0002\u0001\u0000"+
		"PQ\u0005\u0011\u0000\u0000QY\u0001\u0000\u0000\u0000RS\u0005\u0002\u0000"+
		"\u0000ST\u0003\f\u0006\u0000TU\u0003\u0002\u0001\u0000UV\u0005\u0003\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WY\u0005\u001e\u0000\u0000X;\u0001\u0000"+
		"\u0000\u0000X@\u0001\u0000\u0000\u0000XC\u0001\u0000\u0000\u0000XM\u0001"+
		"\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\t\u0001\u0000\u0000\u0000Z[\u0007\u0001\u0000\u0000[\u000b\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u001e\u0000\u0000]^\u0007\u0002\u0000\u0000^_\u0005"+
		"\u001e\u0000\u0000_\r\u0001\u0000\u0000\u0000`a\u0006\u0007\uffff\uffff"+
		"\u0000ab\u0005\u0017\u0000\u0000bi\u0003\u000e\u0007\u0003ci\u0003\u001c"+
		"\u000e\u0000de\u0005\u0004\u0000\u0000ef\u0003\u000e\u0007\u0000fg\u0005"+
		"\u0005\u0000\u0000gi\u0001\u0000\u0000\u0000h`\u0001\u0000\u0000\u0000"+
		"hc\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000io\u0001\u0000\u0000"+
		"\u0000jk\n\u0004\u0000\u0000kl\u0007\u0003\u0000\u0000ln\u0003\u000e\u0007"+
		"\u0005mj\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\u000f\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rx\u0003\u0012\t\u0000st\u0003\u0012\t\u0000"+
		"tu\u0007\u0004\u0000\u0000uv\u0003\u0012\t\u0000vx\u0001\u0000\u0000\u0000"+
		"wr\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000x\u0011\u0001\u0000"+
		"\u0000\u0000y\u007f\u0003\u0014\n\u0000z{\u0003\u0014\n\u0000{|\u0007"+
		"\u0005\u0000\u0000|}\u0003\u0014\n\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000\u007f\u0013\u0001"+
		"\u0000\u0000\u0000\u0080\u0086\u0003\u001a\r\u0000\u0081\u0082\u0005\u0004"+
		"\u0000\u0000\u0082\u0083\u0003\u0010\b\u0000\u0083\u0084\u0005\u0005\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000"+
		"\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0086\u0015\u0001\u0000\u0000"+
		"\u0000\u0087\u0090\u0005\u0006\u0000\u0000\u0088\u008d\u0003\u0018\f\u0000"+
		"\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u008c\u0003\u0018\f\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0088\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u0017"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095\u0096"+
		"\u0005 \u0000\u0000\u0096\u0097\u0005\b\u0000\u0000\u0097\u00a0\u0005"+
		"\u0006\u0000\u0000\u0098\u009d\u0005 \u0000\u0000\u0099\u009a\u0005\u0007"+
		"\u0000\u0000\u009a\u009c\u0005 \u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\b\u0000\u0000\u00a3\u0019\u0001\u0000\u0000\u0000"+
		"\u00a4\u00ac\u0005\u001e\u0000\u0000\u00a5\u00ac\u0005 \u0000\u0000\u00a6"+
		"\u00ac\u0005%\u0000\u0000\u00a7\u00a8\u0005\u0018\u0000\u0000\u00a8\u00ac"+
		"\u0005\u001f\u0000\u0000\u00a9\u00aa\u0005\u0019\u0000\u0000\u00aa\u00ac"+
		"\u0005\u001f\u0000\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a5"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u001b"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\u0006\u0000\u0000\u00ae\u001d"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u001e\u0000\u0000\u00b0\u001f"+
		"\u0001\u0000\u0000\u0000\u0012$)27;CKXhow~\u0085\u008d\u0090\u009d\u00a0"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}