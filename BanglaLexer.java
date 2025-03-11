// Generated from Bangla.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BanglaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, IF=2, NOT=3, AND=4, OR=5, EQ=6, COMMA=7, LPAREN=8, RPAREN=9, 
		LCURLY=10, RCURLY=11, INT=12, ID=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTEGER", "IF", "NOT", "AND", "OR", "EQ", "COMMA", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "INT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u09AA\\u09C2\\u09B0\\u09CD\\u09A3\\u09B8\\u0982\\u0996\\u09CD\\u09AF\\u09BE'", 
			"'\\u09AF\\u09A6\\u09BF'", "'\\u09A8\\u09BE'", "'\\u098F\\u09AC\\u0982'", 
			"'\\u0985\\u09A5\\u09AC\\u09BE'", "'='", "','", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER", "IF", "NOT", "AND", "OR", "EQ", "COMMA", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "INT", "ID", "WS"
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


	public BanglaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bangla.g4"; }

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
		"\u0004\u0000\u000eX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bG\b\u000b\u000b\u000b\f\u000bH\u0001\f\u0001\f\u0005"+
		"\fM\b\f\n\f\f\fP\t\f\u0001\r\u0004\rS\b\r\u000b\r\f\rT\u0001\r\u0001\r"+
		"\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u0001\u0000\u0004\u0001\u0000\u09e6\u09ef\u0002\u0000_"+
		"_\u0985\u09df\u0003\u0000__\u0985\u09df\u09e6\u09ef\u0003\u0000\t\n\r"+
		"\r  Z\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001"+
		"\u001d\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005-\u0001"+
		"\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000"+
		"\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f"+
		"=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013A\u0001"+
		"\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017F\u0001\u0000\u0000"+
		"\u0000\u0019J\u0001\u0000\u0000\u0000\u001bR\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\u09aa\u0000\u0000\u001e\u001f\u0005\u09c2\u0000\u0000\u001f"+
		" \u0005\u09b0\u0000\u0000 !\u0005\u09cd\u0000\u0000!\"\u0005\u09a3\u0000"+
		"\u0000\"#\u0005\u09b8\u0000\u0000#$\u0005\u0982\u0000\u0000$%\u0005\u0996"+
		"\u0000\u0000%&\u0005\u09cd\u0000\u0000&\'\u0005\u09af\u0000\u0000\'(\u0005"+
		"\u09be\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005\u09af\u0000"+
		"\u0000*+\u0005\u09a6\u0000\u0000+,\u0005\u09bf\u0000\u0000,\u0004\u0001"+
		"\u0000\u0000\u0000-.\u0005\u09a8\u0000\u0000./\u0005\u09be\u0000\u0000"+
		"/\u0006\u0001\u0000\u0000\u000001\u0005\u098f\u0000\u000012\u0005\u09ac"+
		"\u0000\u000023\u0005\u0982\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005"+
		"\u0985\u0000\u000056\u0005\u09a5\u0000\u000067\u0005\u09ac\u0000\u0000"+
		"78\u0005\u09be\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005=\u0000\u0000"+
		":\f\u0001\u0000\u0000\u0000;<\u0005,\u0000\u0000<\u000e\u0001\u0000\u0000"+
		"\u0000=>\u0005(\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005)\u0000"+
		"\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0005{\u0000\u0000B\u0014\u0001"+
		"\u0000\u0000\u0000CD\u0005}\u0000\u0000D\u0016\u0001\u0000\u0000\u0000"+
		"EG\u0007\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0018\u0001"+
		"\u0000\u0000\u0000JN\u0007\u0001\u0000\u0000KM\u0007\u0002\u0000\u0000"+
		"LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000O\u001a\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QS\u0007\u0003\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0006\r\u0000\u0000W\u001c\u0001\u0000"+
		"\u0000\u0000\u0004\u0000HNT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}