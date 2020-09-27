// Generated from Avalancha.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AvalanchaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, WS=3, LINE_COMMENT=4, LOWERID=5, UPPERID=6, FUN=7, CHECK=8, 
		IMP=9, AND=10, OR=11, NOT=12, TRUE=13, FALSE=14, LPAREN=15, RPAREN=16, 
		COMMA=17, ARROW=18, UNDERSCORE=19, COLON=20, QUESTION=21, BANG=22, EQ=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ID", "WS", "LINE_COMMENT", "LOWERID", "UPPERID", "FUN", "CHECK", 
			"IMP", "AND", "OR", "NOT", "TRUE", "FALSE", "LPAREN", "RPAREN", "COMMA", 
			"ARROW", "UNDERSCORE", "COLON", "QUESTION", "BANG", "EQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hello'", null, null, null, null, null, "'fun'", "'CHECK'", "'imp'", 
			"'and'", "'or'", "'not'", null, null, "'('", "')'", "','", "'->'", "'_'", 
			"':'", "'?'", "'!'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ID", "WS", "LINE_COMMENT", "LOWERID", "UPPERID", "FUN", 
			"CHECK", "IMP", "AND", "OR", "NOT", "TRUE", "FALSE", "LPAREN", "RPAREN", 
			"COMMA", "ARROW", "UNDERSCORE", "COLON", "QUESTION", "BANG", "EQ"
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


	public AvalanchaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Avalancha.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\6\39\n\3\r\3\16\3:\3\4\6\4>\n\4\r\4\16\4?\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\6\3\6\7\6Q\n\6"+
		"\f\6\16\6T\13\6\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\3\2\7\3\2c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2\62;C\\aac|\3\2C\\\2"+
		"\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\3\61\3\2\2\2\58\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13N\3\2\2\2\r"+
		"U\3\2\2\2\17\\\3\2\2\2\21`\3\2\2\2\23f\3\2\2\2\25j\3\2\2\2\27n\3\2\2\2"+
		"\31q\3\2\2\2\33~\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2"+
		"\2\2#\u0090\3\2\2\2%\u0092\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+\u0099"+
		"\3\2\2\2-\u009b\3\2\2\2/\u009d\3\2\2\2\61\62\7j\2\2\62\63\7g\2\2\63\64"+
		"\7n\2\2\64\65\7n\2\2\65\66\7q\2\2\66\4\3\2\2\2\679\t\2\2\28\67\3\2\2\2"+
		"9:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\6\3\2\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2"+
		"\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\4\2\2B\b\3\2\2\2CD\7/\2\2DE\7/\2"+
		"\2EI\3\2\2\2FH\n\4\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2"+
		"\2KI\3\2\2\2LM\b\5\2\2M\n\3\2\2\2NR\t\2\2\2OQ\t\5\2\2PO\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2S\f\3\2\2\2TR\3\2\2\2UY\t\6\2\2VX\t\5\2\2WV\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\16\3\2\2\2[Y\3\2\2\2\\]\7h\2\2]"+
		"^\7w\2\2^_\7p\2\2_\20\3\2\2\2`a\7E\2\2ab\7J\2\2bc\7G\2\2cd\7E\2\2de\7"+
		"M\2\2e\22\3\2\2\2fg\7k\2\2gh\7o\2\2hi\7r\2\2i\24\3\2\2\2jk\7c\2\2kl\7"+
		"p\2\2lm\7f\2\2m\26\3\2\2\2no\7q\2\2op\7t\2\2p\30\3\2\2\2qr\7p\2\2rs\7"+
		"q\2\2st\7v\2\2t\32\3\2\2\2uv\7V\2\2vw\7t\2\2wx\7w\2\2xy\7g\2\2y\177\7"+
		"\"\2\2z{\7v\2\2{|\7t\2\2|}\7w\2\2}\177\7g\2\2~u\3\2\2\2~z\3\2\2\2\177"+
		"\34\3\2\2\2\u0080\u0081\7H\2\2\u0081\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083"+
		"\u0084\7u\2\2\u0084\u008b\7g\2\2\u0085\u0086\7h\2\2\u0086\u0087\7c\2\2"+
		"\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089\u008b\7g\2\2\u008a\u0080"+
		"\3\2\2\2\u008a\u0085\3\2\2\2\u008b\36\3\2\2\2\u008c\u008d\7*\2\2\u008d"+
		" \3\2\2\2\u008e\u008f\7+\2\2\u008f\"\3\2\2\2\u0090\u0091\7.\2\2\u0091"+
		"$\3\2\2\2\u0092\u0093\7/\2\2\u0093\u0094\7@\2\2\u0094&\3\2\2\2\u0095\u0096"+
		"\7a\2\2\u0096(\3\2\2\2\u0097\u0098\7<\2\2\u0098*\3\2\2\2\u0099\u009a\7"+
		"A\2\2\u009a,\3\2\2\2\u009b\u009c\7#\2\2\u009c.\3\2\2\2\u009d\u009e\7?"+
		"\2\2\u009e\u009f\7?\2\2\u009f\60\3\2\2\2\n\2:?IRY~\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}