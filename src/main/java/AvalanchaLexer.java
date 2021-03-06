package main.java;
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
		WS=1, LINE_COMMENT=2, FUN=3, CHECK=4, IMP=5, AND=6, OR=7, NOT=8, TRUE=9, 
		FALSE=10, LPAREN=11, RPAREN=12, COMMA=13, ARROW=14, UNDERSCORE=15, COLON=16, 
		QUESTION=17, BANG=18, EQ=19, LOWERID=20, UPPERID=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LINE_COMMENT", "FUN", "CHECK", "IMP", "AND", "OR", "NOT", "TRUE", 
			"FALSE", "LPAREN", "RPAREN", "COMMA", "ARROW", "UNDERSCORE", "COLON", 
			"QUESTION", "BANG", "EQ", "LOWERID", "UPPERID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'fun'", "'check'", "'imp'", "'and'", "'or'", "'not'", 
			"'true'", "'false'", "'('", "')'", "','", "'->'", "'_'", "':'", "'?'", 
			"'!'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "FUN", "CHECK", "IMP", "AND", "OR", "NOT", 
			"TRUE", "FALSE", "LPAREN", "RPAREN", "COMMA", "ARROW", "UNDERSCORE", 
			"COLON", "QUESTION", "BANG", "EQ", "LOWERID", "UPPERID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\7\25z\n\25\f\25\16\25}\13\25\3\26\3"+
		"\26\7\26\u0081\n\26\f\26\16\26\u0084\13\26\2\2\27\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27\3\2\7\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2c|\6\2\62;C\\aac|\3"+
		"\2C\\\2\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3.\3\2\2"+
		"\2\5\64\3\2\2\2\7?\3\2\2\2\tC\3\2\2\2\13I\3\2\2\2\rM\3\2\2\2\17Q\3\2\2"+
		"\2\21T\3\2\2\2\23X\3\2\2\2\25]\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33g\3\2"+
		"\2\2\35i\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'t\3\2\2\2"+
		")w\3\2\2\2+~\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\b\2\2\2\63\4\3\2\2\2\64\65\7/\2\2\65\66\7"+
		"/\2\2\66:\3\2\2\2\679\n\3\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;=\3\2\2\2<:\3\2\2\2=>\b\3\2\2>\6\3\2\2\2?@\7h\2\2@A\7w\2\2AB\7p\2\2"+
		"B\b\3\2\2\2CD\7e\2\2DE\7j\2\2EF\7g\2\2FG\7e\2\2GH\7m\2\2H\n\3\2\2\2IJ"+
		"\7k\2\2JK\7o\2\2KL\7r\2\2L\f\3\2\2\2MN\7c\2\2NO\7p\2\2OP\7f\2\2P\16\3"+
		"\2\2\2QR\7q\2\2RS\7t\2\2S\20\3\2\2\2TU\7p\2\2UV\7q\2\2VW\7v\2\2W\22\3"+
		"\2\2\2XY\7v\2\2YZ\7t\2\2Z[\7w\2\2[\\\7g\2\2\\\24\3\2\2\2]^\7h\2\2^_\7"+
		"c\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2b\26\3\2\2\2cd\7*\2\2d\30\3\2\2\2ef\7"+
		"+\2\2f\32\3\2\2\2gh\7.\2\2h\34\3\2\2\2ij\7/\2\2jk\7@\2\2k\36\3\2\2\2l"+
		"m\7a\2\2m \3\2\2\2no\7<\2\2o\"\3\2\2\2pq\7A\2\2q$\3\2\2\2rs\7#\2\2s&\3"+
		"\2\2\2tu\7?\2\2uv\7?\2\2v(\3\2\2\2w{\t\4\2\2xz\t\5\2\2yx\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|*\3\2\2\2}{\3\2\2\2~\u0082\t\6\2\2\177\u0081"+
		"\t\5\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083,\3\2\2\2\u0084\u0082\3\2\2\2\7\2\60:{\u0082\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}