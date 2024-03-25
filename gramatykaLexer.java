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
		T__0=1, T__1=2, T__2=3, WRITE=4, READ=5, AND=6, OR=7, XOR=8, NEG=9, ID=10, 
		REAL=11, INT=12, ADD=13, MULTIPLY=14, MINUS=15, DIVIDE=16, STRING=17, 
		NEWLINE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WRITE", "READ", "AND", "OR", "XOR", "NEG", "ID", 
			"REAL", "INT", "ADD", "MULTIPLY", "MINUS", "DIVIDE", "STRING", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'write'", "'read'", "'and'", "'or'", "'xor'", 
			"'neg'", null, null, null, "'+'", "'*'", "'-'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WRITE", "READ", "AND", "OR", "XOR", "NEG", "ID", 
			"REAL", "INT", "ADD", "MULTIPLY", "MINUS", "DIVIDE", "STRING", "NEWLINE", 
			"WS"
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
		"\u0004\u0000\u0013y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\tI\b\t\u000b\t\f\tJ\u0001\n\u0004"+
		"\nN\b\n\u000b\n\f\nO\u0001\n\u0001\n\u0004\nT\b\n\u000b\n\f\nU\u0001\u000b"+
		"\u0004\u000bY\b\u000b\u000b\u000b\f\u000bZ\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010g\b\u0010\n\u0010\f\u0010j\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0003\u0011o\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0004\u0012t\b\u0012\u000b\u0012\f\u0012u\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0003"+
		"\u0002\u0000AZaz\u0002\u0000\"\"\\\\\u0002\u0000\t\t  \u007f\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001"+
		"\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001"+
		"\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000"+
		"\u0000\u000b8\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f"+
		"?\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000\u0013H\u0001"+
		"\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017X\u0001\u0000\u0000"+
		"\u0000\u0019\\\u0001\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000"+
		"\u001d`\u0001\u0000\u0000\u0000\u001fb\u0001\u0000\u0000\u0000!d\u0001"+
		"\u0000\u0000\u0000#n\u0001\u0000\u0000\u0000%s\u0001\u0000\u0000\u0000"+
		"\'(\u0005=\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005(\u0000\u0000"+
		"*\u0004\u0001\u0000\u0000\u0000+,\u0005)\u0000\u0000,\u0006\u0001\u0000"+
		"\u0000\u0000-.\u0005w\u0000\u0000./\u0005r\u0000\u0000/0\u0005i\u0000"+
		"\u000001\u0005t\u0000\u000012\u0005e\u0000\u00002\b\u0001\u0000\u0000"+
		"\u000034\u0005r\u0000\u000045\u0005e\u0000\u000056\u0005a\u0000\u0000"+
		"67\u0005d\u0000\u00007\n\u0001\u0000\u0000\u000089\u0005a\u0000\u0000"+
		"9:\u0005n\u0000\u0000:;\u0005d\u0000\u0000;\f\u0001\u0000\u0000\u0000"+
		"<=\u0005o\u0000\u0000=>\u0005r\u0000\u0000>\u000e\u0001\u0000\u0000\u0000"+
		"?@\u0005x\u0000\u0000@A\u0005o\u0000\u0000AB\u0005r\u0000\u0000B\u0010"+
		"\u0001\u0000\u0000\u0000CD\u0005n\u0000\u0000DE\u0005e\u0000\u0000EF\u0005"+
		"g\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GI\u0007\u0000\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\u0014\u0001\u0000\u0000\u0000LN\u0002"+
		"09\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0005"+
		".\u0000\u0000RT\u000209\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0016"+
		"\u0001\u0000\u0000\u0000WY\u000209\u0000XW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\u0018\u0001\u0000\u0000\u0000\\]\u0005+\u0000\u0000]\u001a\u0001\u0000"+
		"\u0000\u0000^_\u0005*\u0000\u0000_\u001c\u0001\u0000\u0000\u0000`a\u0005"+
		"-\u0000\u0000a\u001e\u0001\u0000\u0000\u0000bc\u0005/\u0000\u0000c \u0001"+
		"\u0000\u0000\u0000dh\u0005\"\u0000\u0000eg\b\u0001\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000kl\u0005\"\u0000\u0000l\"\u0001\u0000\u0000\u0000mo\u0005\r\u0000"+
		"\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0005\n\u0000\u0000q$\u0001\u0000\u0000\u0000rt\u0007\u0002"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0006\u0012\u0000\u0000x&\u0001\u0000\u0000\u0000\b\u0000JOUZhnu\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}