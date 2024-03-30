// Generated from gramatyka.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramatykaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INPUT=7, OUTPUT=8, AND=9, 
		OR=10, XOR=11, NEG=12, BOOLEAN=13, ID=14, REAL=15, INT=16, ADD=17, MULTIPLY=18, 
		MINUS=19, DIVIDE=20, STRING=21, NEWLINE=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INPUT", "OUTPUT", "AND", 
			"OR", "XOR", "NEG", "BOOLEAN", "ID", "REAL", "INT", "ADD", "MULTIPLY", 
			"MINUS", "DIVIDE", "STRING", "NEWLINE", "WS"
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


	public gramatykaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatyka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f[\b\f\u0001"+
		"\r\u0004\r^\b\r\u000b\r\f\r_\u0001\u000e\u0004\u000ec\b\u000e\u000b\u000e"+
		"\f\u000ed\u0001\u000e\u0001\u000e\u0004\u000ei\b\u000e\u000b\u000e\f\u000e"+
		"j\u0001\u000f\u0004\u000fn\b\u000f\u000b\u000f\f\u000fo\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0005\u0014|\b\u0014\n\u0014\f\u0014\u007f"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u0084\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u0089\b\u0016\u000b\u0016"+
		"\f\u0016\u008a\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0003\u0002"+
		"\u0000AZaz\u0002\u0000\"\"\\\\\u0002\u0000\t\t  \u0095\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000"+
		"\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00075"+
		"\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000"+
		"\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000\u0000"+
		"\u0011B\u0001\u0000\u0000\u0000\u0013F\u0001\u0000\u0000\u0000\u0015I"+
		"\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000\u0000\u0019Z\u0001\u0000"+
		"\u0000\u0000\u001b]\u0001\u0000\u0000\u0000\u001db\u0001\u0000\u0000\u0000"+
		"\u001fm\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000#s\u0001\u0000"+
		"\u0000\u0000%u\u0001\u0000\u0000\u0000\'w\u0001\u0000\u0000\u0000)y\u0001"+
		"\u0000\u0000\u0000+\u0083\u0001\u0000\u0000\u0000-\u0088\u0001\u0000\u0000"+
		"\u0000/0\u0005=\u0000\u00000\u0002\u0001\u0000\u0000\u000012\u0005(\u0000"+
		"\u00002\u0004\u0001\u0000\u0000\u000034\u0005)\u0000\u00004\u0006\u0001"+
		"\u0000\u0000\u000056\u0005[\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005"+
		",\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005]\u0000\u0000:\f\u0001"+
		"\u0000\u0000\u0000;<\u0005i\u0000\u0000<=\u0005n\u0000\u0000=\u000e\u0001"+
		"\u0000\u0000\u0000>?\u0005o\u0000\u0000?@\u0005u\u0000\u0000@A\u0005t"+
		"\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005a\u0000\u0000CD\u0005"+
		"n\u0000\u0000DE\u0005d\u0000\u0000E\u0012\u0001\u0000\u0000\u0000FG\u0005"+
		"o\u0000\u0000GH\u0005r\u0000\u0000H\u0014\u0001\u0000\u0000\u0000IJ\u0005"+
		"x\u0000\u0000JK\u0005o\u0000\u0000KL\u0005r\u0000\u0000L\u0016\u0001\u0000"+
		"\u0000\u0000MN\u0005n\u0000\u0000NO\u0005e\u0000\u0000OP\u0005g\u0000"+
		"\u0000P\u0018\u0001\u0000\u0000\u0000QR\u0005t\u0000\u0000RS\u0005r\u0000"+
		"\u0000ST\u0005u\u0000\u0000T[\u0005e\u0000\u0000UV\u0005f\u0000\u0000"+
		"VW\u0005a\u0000\u0000WX\u0005l\u0000\u0000XY\u0005s\u0000\u0000Y[\u0005"+
		"e\u0000\u0000ZQ\u0001\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000[\u001a"+
		"\u0001\u0000\u0000\u0000\\^\u0007\u0000\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`\u001c\u0001\u0000\u0000\u0000ac\u000209\u0000ba\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0005.\u0000\u0000gi\u0002"+
		"09\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000k\u001e\u0001\u0000\u0000\u0000"+
		"ln\u000209\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o"+
		"m\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p \u0001\u0000\u0000"+
		"\u0000qr\u0005+\u0000\u0000r\"\u0001\u0000\u0000\u0000st\u0005*\u0000"+
		"\u0000t$\u0001\u0000\u0000\u0000uv\u0005-\u0000\u0000v&\u0001\u0000\u0000"+
		"\u0000wx\u0005/\u0000\u0000x(\u0001\u0000\u0000\u0000y}\u0005\"\u0000"+
		"\u0000z|\b\u0001\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\"\u0000\u0000\u0081*\u0001\u0000\u0000\u0000\u0082\u0084\u0005\r\u0000"+
		"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005\n\u0000\u0000"+
		"\u0086,\u0001\u0000\u0000\u0000\u0087\u0089\u0007\u0002\u0000\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0006\u0016\u0000\u0000\u008d"+
		".\u0001\u0000\u0000\u0000\t\u0000Z_djo}\u0083\u008a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}