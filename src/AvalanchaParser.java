// Generated from Avalancha.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AvalanchaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, WS=3, LINE_COMMENT=4, LOWERID=5, UPPERID=6, FUN=7, CHECK=8, 
		IMP=9, AND=10, OR=11, NOT=12, TRUE=13, FALSE=14, LPAREN=15, RPAREN=16, 
		COMMA=17, ARROW=18, UNDERSCORE=19, COLON=20, QUESTION=21, BANG=22, EQ=23;
	public static final int
		RULE_r = 0, RULE_programa = 1, RULE_declaraciones = 2, RULE_chequeos = 3, 
		RULE_declaracion = 4, RULE_chequeo = 5, RULE_signatura = 6, RULE_precondicion = 7, 
		RULE_postcondicion = 8, RULE_listaParametros = 9, RULE_listaParametrosNoVacia = 10, 
		RULE_parametro = 11, RULE_reglas = 12, RULE_regla = 13, RULE_patron = 14, 
		RULE_listaPatrones = 15, RULE_listaPatronesNoVacia = 16, RULE_expresion = 17, 
		RULE_listaExpresiones = 18, RULE_listaExpresionesNoVacia = 19, RULE_formula = 20, 
		RULE_formulaImpOrAndNeg = 21, RULE_formulaOrAndNeg = 22, RULE_formulaAndNeg = 23, 
		RULE_formulaNeg = 24, RULE_formulaAtomica = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "programa", "declaraciones", "chequeos", "declaracion", "chequeo", 
			"signatura", "precondicion", "postcondicion", "listaParametros", "listaParametrosNoVacia", 
			"parametro", "reglas", "regla", "patron", "listaPatrones", "listaPatronesNoVacia", 
			"expresion", "listaExpresiones", "listaExpresionesNoVacia", "formula", 
			"formulaImpOrAndNeg", "formulaOrAndNeg", "formulaAndNeg", "formulaNeg", 
			"formulaAtomica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hello'", null, null, null, null, null, "'fun'", "'check'", "'imp'", 
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

	@Override
	public String getGrammarFileName() { return "Avalancha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AvalanchaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AvalanchaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AvalanchaParser.ID, i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__0);
				setState(53);
				match(ID);
				setState(54);
				match(ID);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public ChequeosContext chequeos() {
			return getRuleContext(ChequeosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			declaraciones();
			setState(59);
			chequeos();
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitDeclaraciones(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaraciones);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				declaracion();
				setState(63);
				declaraciones();
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

	public static class ChequeosContext extends ParserRuleContext {
		public ChequeoContext chequeo() {
			return getRuleContext(ChequeoContext.class,0);
		}
		public ChequeosContext chequeos() {
			return getRuleContext(ChequeosContext.class,0);
		}
		public ChequeosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chequeos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterChequeos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitChequeos(this);
		}
	}

	public final ChequeosContext chequeos() throws RecognitionException {
		ChequeosContext _localctx = new ChequeosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_chequeos);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				chequeo();
				setState(69);
				chequeos();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(AvalanchaParser.FUN, 0); }
		public TerminalNode LOWERID() { return getToken(AvalanchaParser.LOWERID, 0); }
		public SignaturaContext signatura() {
			return getRuleContext(SignaturaContext.class,0);
		}
		public PrecondicionContext precondicion() {
			return getRuleContext(PrecondicionContext.class,0);
		}
		public PostcondicionContext postcondicion() {
			return getRuleContext(PostcondicionContext.class,0);
		}
		public ReglasContext reglas() {
			return getRuleContext(ReglasContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FUN);
			setState(74);
			match(LOWERID);
			setState(75);
			signatura();
			setState(76);
			precondicion();
			setState(77);
			postcondicion();
			setState(78);
			reglas();
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

	public static class ChequeoContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(AvalanchaParser.CHECK, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ChequeoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chequeo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterChequeo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitChequeo(this);
		}
	}

	public final ChequeoContext chequeo() throws RecognitionException {
		ChequeoContext _localctx = new ChequeoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chequeo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(CHECK);
			setState(81);
			formula();
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

	public static class SignaturaContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AvalanchaParser.COLON, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AvalanchaParser.ARROW, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public SignaturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterSignatura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitSignatura(this);
		}
	}

	public final SignaturaContext signatura() throws RecognitionException {
		SignaturaContext _localctx = new SignaturaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_signatura);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case LOWERID:
			case UPPERID:
			case FUN:
			case CHECK:
			case ARROW:
			case QUESTION:
			case BANG:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(COLON);
				setState(85);
				listaParametros();
				setState(86);
				match(ARROW);
				setState(87);
				parametro();
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

	public static class PrecondicionContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(AvalanchaParser.QUESTION, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PrecondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterPrecondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitPrecondicion(this);
		}
	}

	public final PrecondicionContext precondicion() throws RecognitionException {
		PrecondicionContext _localctx = new PrecondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_precondicion);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case LOWERID:
			case UPPERID:
			case FUN:
			case CHECK:
			case ARROW:
			case BANG:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(QUESTION);
				setState(93);
				formula();
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

	public static class PostcondicionContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(AvalanchaParser.BANG, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PostcondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postcondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterPostcondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitPostcondicion(this);
		}
	}

	public final PostcondicionContext postcondicion() throws RecognitionException {
		PostcondicionContext _localctx = new PostcondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_postcondicion);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case LOWERID:
			case UPPERID:
			case FUN:
			case CHECK:
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(BANG);
				setState(98);
				formula();
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

	public static class ListaParametrosContext extends ParserRuleContext {
		public ListaParametrosNoVaciaContext listaParametrosNoVacia() {
			return getRuleContext(ListaParametrosNoVaciaContext.class,0);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitListaParametros(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaParametros);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LOWERID:
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				listaParametrosNoVacia();
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

	public static class ListaParametrosNoVaciaContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AvalanchaParser.COMMA, 0); }
		public ListaParametrosNoVaciaContext listaParametrosNoVacia() {
			return getRuleContext(ListaParametrosNoVaciaContext.class,0);
		}
		public ListaParametrosNoVaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametrosNoVacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterListaParametrosNoVacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitListaParametrosNoVacia(this);
		}
	}

	public final ListaParametrosNoVaciaContext listaParametrosNoVacia() throws RecognitionException {
		ListaParametrosNoVaciaContext _localctx = new ListaParametrosNoVaciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaParametrosNoVacia);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				parametro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				parametro();
				setState(107);
				match(COMMA);
				setState(108);
				listaParametrosNoVacia();
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(AvalanchaParser.UNDERSCORE, 0); }
		public TerminalNode LOWERID() { return getToken(AvalanchaParser.LOWERID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==LOWERID || _la==UNDERSCORE) ) {
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

	public static class ReglasContext extends ParserRuleContext {
		public ReglaContext regla() {
			return getRuleContext(ReglaContext.class,0);
		}
		public ReglasContext reglas() {
			return getRuleContext(ReglasContext.class,0);
		}
		public ReglasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reglas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterReglas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitReglas(this);
		}
	}

	public final ReglasContext reglas() throws RecognitionException {
		ReglasContext _localctx = new ReglasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_reglas);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LOWERID:
			case UPPERID:
			case ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				regla();
				setState(116);
				reglas();
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

	public static class ReglaContext extends ParserRuleContext {
		public ListaPatronesContext listaPatrones() {
			return getRuleContext(ListaPatronesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AvalanchaParser.ARROW, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterRegla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitRegla(this);
		}
	}

	public final ReglaContext regla() throws RecognitionException {
		ReglaContext _localctx = new ReglaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_regla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			listaPatrones();
			setState(121);
			match(ARROW);
			setState(122);
			expresion();
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

	public static class PatronContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(AvalanchaParser.UNDERSCORE, 0); }
		public TerminalNode LOWERID() { return getToken(AvalanchaParser.LOWERID, 0); }
		public TerminalNode UPPERID() { return getToken(AvalanchaParser.UPPERID, 0); }
		public TerminalNode LPAREN() { return getToken(AvalanchaParser.LPAREN, 0); }
		public ListaPatronesContext listaPatrones() {
			return getRuleContext(ListaPatronesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AvalanchaParser.RPAREN, 0); }
		public PatronContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patron; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterPatron(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitPatron(this);
		}
	}

	public final PatronContext patron() throws RecognitionException {
		PatronContext _localctx = new PatronContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_patron);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(UNDERSCORE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(LOWERID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(UPPERID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(UPPERID);
				setState(128);
				match(LPAREN);
				setState(129);
				listaPatrones();
				setState(130);
				match(RPAREN);
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

	public static class ListaPatronesContext extends ParserRuleContext {
		public ListaPatronesNoVaciaContext listaPatronesNoVacia() {
			return getRuleContext(ListaPatronesNoVaciaContext.class,0);
		}
		public ListaPatronesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPatrones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterListaPatrones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitListaPatrones(this);
		}
	}

	public final ListaPatronesContext listaPatrones() throws RecognitionException {
		ListaPatronesContext _localctx = new ListaPatronesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listaPatrones);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				listaPatronesNoVacia();
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

	public static class ListaPatronesNoVaciaContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AvalanchaParser.COMMA, 0); }
		public ListaPatronesNoVaciaContext listaPatronesNoVacia() {
			return getRuleContext(ListaPatronesNoVaciaContext.class,0);
		}
		public ListaPatronesNoVaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPatronesNoVacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterListaPatronesNoVacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitListaPatronesNoVacia(this);
		}
	}

	public final ListaPatronesNoVaciaContext listaPatronesNoVacia() throws RecognitionException {
		ListaPatronesNoVaciaContext _localctx = new ListaPatronesNoVaciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listaPatronesNoVacia);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				expresion();
				setState(140);
				match(COMMA);
				setState(141);
				listaPatronesNoVacia();
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode LOWERID() { return getToken(AvalanchaParser.LOWERID, 0); }
		public TerminalNode LPAREN() { return getToken(AvalanchaParser.LPAREN, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AvalanchaParser.RPAREN, 0); }
		public TerminalNode UPPERID() { return getToken(AvalanchaParser.UPPERID, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresion);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(LOWERID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(LOWERID);
				setState(147);
				match(LPAREN);
				setState(148);
				listaExpresiones();
				setState(149);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(UPPERID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(UPPERID);
				setState(153);
				match(LPAREN);
				setState(154);
				listaExpresiones();
				setState(155);
				match(RPAREN);
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

	public static class ListaExpresionesContext extends ParserRuleContext {
		public ListaExpresionesNoVaciaContext listaExpresionesNoVacia() {
			return getRuleContext(ListaExpresionesNoVaciaContext.class,0);
		}
		public ListaExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterListaExpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitListaExpresiones(this);
		}
	}

	public final ListaExpresionesContext listaExpresiones() throws RecognitionException {
		ListaExpresionesContext _localctx = new ListaExpresionesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaExpresiones);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				listaExpresionesNoVacia();
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

	public static class ListaExpresionesNoVaciaContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AvalanchaParser.COMMA, 0); }
		public ListaExpresionesNoVaciaContext listaExpresionesNoVacia() {
			return getRuleContext(ListaExpresionesNoVaciaContext.class,0);
		}
		public ListaExpresionesNoVaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpresionesNoVacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterListaExpresionesNoVacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitListaExpresionesNoVacia(this);
		}
	}

	public final ListaExpresionesNoVaciaContext listaExpresionesNoVacia() throws RecognitionException {
		ListaExpresionesNoVaciaContext _localctx = new ListaExpresionesNoVaciaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listaExpresionesNoVacia);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				expresion();
				setState(165);
				match(COMMA);
				setState(166);
				listaExpresionesNoVacia();
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

	public static class FormulaContext extends ParserRuleContext {
		public FormulaImpOrAndNegContext formulaImpOrAndNeg() {
			return getRuleContext(FormulaImpOrAndNegContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			formulaImpOrAndNeg();
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

	public static class FormulaImpOrAndNegContext extends ParserRuleContext {
		public FormulaOrAndNegContext formulaOrAndNeg() {
			return getRuleContext(FormulaOrAndNegContext.class,0);
		}
		public TerminalNode IMP() { return getToken(AvalanchaParser.IMP, 0); }
		public FormulaImpOrAndNegContext formulaImpOrAndNeg() {
			return getRuleContext(FormulaImpOrAndNegContext.class,0);
		}
		public FormulaImpOrAndNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaImpOrAndNeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterFormulaImpOrAndNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitFormulaImpOrAndNeg(this);
		}
	}

	public final FormulaImpOrAndNegContext formulaImpOrAndNeg() throws RecognitionException {
		FormulaImpOrAndNegContext _localctx = new FormulaImpOrAndNegContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formulaImpOrAndNeg);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				formulaOrAndNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				formulaOrAndNeg();
				setState(174);
				match(IMP);
				setState(175);
				formulaImpOrAndNeg();
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

	public static class FormulaOrAndNegContext extends ParserRuleContext {
		public FormulaAndNegContext formulaAndNeg() {
			return getRuleContext(FormulaAndNegContext.class,0);
		}
		public TerminalNode OR() { return getToken(AvalanchaParser.OR, 0); }
		public FormulaOrAndNegContext formulaOrAndNeg() {
			return getRuleContext(FormulaOrAndNegContext.class,0);
		}
		public FormulaOrAndNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaOrAndNeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterFormulaOrAndNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitFormulaOrAndNeg(this);
		}
	}

	public final FormulaOrAndNegContext formulaOrAndNeg() throws RecognitionException {
		FormulaOrAndNegContext _localctx = new FormulaOrAndNegContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formulaOrAndNeg);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				formulaAndNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				formulaAndNeg();
				setState(181);
				match(OR);
				setState(182);
				formulaOrAndNeg();
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

	public static class FormulaAndNegContext extends ParserRuleContext {
		public FormulaNegContext formulaNeg() {
			return getRuleContext(FormulaNegContext.class,0);
		}
		public TerminalNode AND() { return getToken(AvalanchaParser.AND, 0); }
		public FormulaAndNegContext formulaAndNeg() {
			return getRuleContext(FormulaAndNegContext.class,0);
		}
		public FormulaAndNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaAndNeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterFormulaAndNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitFormulaAndNeg(this);
		}
	}

	public final FormulaAndNegContext formulaAndNeg() throws RecognitionException {
		FormulaAndNegContext _localctx = new FormulaAndNegContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formulaAndNeg);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				formulaNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				formulaNeg();
				setState(188);
				match(AND);
				setState(189);
				formulaAndNeg();
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

	public static class FormulaNegContext extends ParserRuleContext {
		public FormulaAtomicaContext formulaAtomica() {
			return getRuleContext(FormulaAtomicaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(AvalanchaParser.NOT, 0); }
		public FormulaNegContext formulaNeg() {
			return getRuleContext(FormulaNegContext.class,0);
		}
		public FormulaNegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaNeg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterFormulaNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitFormulaNeg(this);
		}
	}

	public final FormulaNegContext formulaNeg() throws RecognitionException {
		FormulaNegContext _localctx = new FormulaNegContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formulaNeg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			formulaAtomica();
			setState(194);
			match(NOT);
			setState(195);
			formulaNeg();
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

	public static class FormulaAtomicaContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AvalanchaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AvalanchaParser.FALSE, 0); }
		public TerminalNode LPAREN() { return getToken(AvalanchaParser.LPAREN, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AvalanchaParser.RPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(AvalanchaParser.EQ, 0); }
		public FormulaAtomicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaAtomica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).enterFormulaAtomica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvalanchaListener ) ((AvalanchaListener)listener).exitFormulaAtomica(this);
		}
	}

	public final FormulaAtomicaContext formulaAtomica() throws RecognitionException {
		FormulaAtomicaContext _localctx = new FormulaAtomicaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formulaAtomica);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(LPAREN);
				setState(200);
				formula();
				setState(201);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				expresion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				expresion();
				setState(205);
				match(EQ);
				setState(206);
				expresion();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4D\n\4\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\5\ta\n\t\3\n\3"+
		"\n\3\n\5\nf\n\n\3\13\3\13\5\13j\n\13\3\f\3\f\3\f\3\f\3\f\5\fq\n\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\5\16y\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0087\n\20\3\21\3\21\5\21\u008b\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0092\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a0\n\23\3\24\3\24\5\24\u00a4\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\5\25\u00ab\n\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00b4\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00bb\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u00c2\n\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d3\n\33\3\33\2\2"+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\4\2\7"+
		"\7\25\25\2\u00d4\2:\3\2\2\2\4<\3\2\2\2\6C\3\2\2\2\bI\3\2\2\2\nK\3\2\2"+
		"\2\fR\3\2\2\2\16[\3\2\2\2\20`\3\2\2\2\22e\3\2\2\2\24i\3\2\2\2\26p\3\2"+
		"\2\2\30r\3\2\2\2\32x\3\2\2\2\34z\3\2\2\2\36\u0086\3\2\2\2 \u008a\3\2\2"+
		"\2\"\u0091\3\2\2\2$\u009f\3\2\2\2&\u00a3\3\2\2\2(\u00aa\3\2\2\2*\u00ac"+
		"\3\2\2\2,\u00b3\3\2\2\2.\u00ba\3\2\2\2\60\u00c1\3\2\2\2\62\u00c3\3\2\2"+
		"\2\64\u00d2\3\2\2\2\66\67\7\3\2\2\678\7\4\2\28;\7\4\2\29;\3\2\2\2:\66"+
		"\3\2\2\2:9\3\2\2\2;\3\3\2\2\2<=\5\6\4\2=>\5\b\5\2>\5\3\2\2\2?D\3\2\2\2"+
		"@A\5\n\6\2AB\5\6\4\2BD\3\2\2\2C?\3\2\2\2C@\3\2\2\2D\7\3\2\2\2EJ\3\2\2"+
		"\2FG\5\f\7\2GH\5\b\5\2HJ\3\2\2\2IE\3\2\2\2IF\3\2\2\2J\t\3\2\2\2KL\7\t"+
		"\2\2LM\7\7\2\2MN\5\16\b\2NO\5\20\t\2OP\5\22\n\2PQ\5\32\16\2Q\13\3\2\2"+
		"\2RS\7\n\2\2ST\5*\26\2T\r\3\2\2\2U\\\3\2\2\2VW\7\26\2\2WX\5\24\13\2XY"+
		"\7\24\2\2YZ\5\30\r\2Z\\\3\2\2\2[U\3\2\2\2[V\3\2\2\2\\\17\3\2\2\2]a\3\2"+
		"\2\2^_\7\27\2\2_a\5*\26\2`]\3\2\2\2`^\3\2\2\2a\21\3\2\2\2bf\3\2\2\2cd"+
		"\7\30\2\2df\5*\26\2eb\3\2\2\2ec\3\2\2\2f\23\3\2\2\2gj\3\2\2\2hj\5\26\f"+
		"\2ig\3\2\2\2ih\3\2\2\2j\25\3\2\2\2kq\5\30\r\2lm\5\30\r\2mn\7\23\2\2no"+
		"\5\26\f\2oq\3\2\2\2pk\3\2\2\2pl\3\2\2\2q\27\3\2\2\2rs\t\2\2\2s\31\3\2"+
		"\2\2ty\3\2\2\2uv\5\34\17\2vw\5\32\16\2wy\3\2\2\2xt\3\2\2\2xu\3\2\2\2y"+
		"\33\3\2\2\2z{\5 \21\2{|\7\24\2\2|}\5$\23\2}\35\3\2\2\2~\u0087\7\25\2\2"+
		"\177\u0087\7\7\2\2\u0080\u0087\7\b\2\2\u0081\u0082\7\b\2\2\u0082\u0083"+
		"\7\21\2\2\u0083\u0084\5 \21\2\u0084\u0085\7\22\2\2\u0085\u0087\3\2\2\2"+
		"\u0086~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2"+
		"\2\2\u0087\37\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008b\5\"\22\2\u008a\u0088"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b!\3\2\2\2\u008c\u0092\5$\23\2\u008d"+
		"\u008e\5$\23\2\u008e\u008f\7\23\2\2\u008f\u0090\5\"\22\2\u0090\u0092\3"+
		"\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0092#\3\2\2\2\u0093\u00a0"+
		"\7\7\2\2\u0094\u0095\7\7\2\2\u0095\u0096\7\21\2\2\u0096\u0097\5&\24\2"+
		"\u0097\u0098\7\22\2\2\u0098\u00a0\3\2\2\2\u0099\u00a0\7\b\2\2\u009a\u009b"+
		"\7\b\2\2\u009b\u009c\7\21\2\2\u009c\u009d\5&\24\2\u009d\u009e\7\22\2\2"+
		"\u009e\u00a0\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0094\3\2\2\2\u009f\u0099"+
		"\3\2\2\2\u009f\u009a\3\2\2\2\u00a0%\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a4\5(\25\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\'\3\2\2\2"+
		"\u00a5\u00ab\5$\23\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9"+
		"\5(\25\2\u00a9\u00ab\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab"+
		")\3\2\2\2\u00ac\u00ad\5,\27\2\u00ad+\3\2\2\2\u00ae\u00b4\5.\30\2\u00af"+
		"\u00b0\5.\30\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b4\3"+
		"\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4-\3\2\2\2\u00b5\u00bb"+
		"\5\60\31\2\u00b6\u00b7\5\60\31\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\5.\30"+
		"\2\u00b9\u00bb\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb/"+
		"\3\2\2\2\u00bc\u00c2\5\62\32\2\u00bd\u00be\5\62\32\2\u00be\u00bf\7\f\2"+
		"\2\u00bf\u00c0\5\60\31\2\u00c0\u00c2\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c2\61\3\2\2\2\u00c3\u00c4\5\64\33\2\u00c4\u00c5\7\16"+
		"\2\2\u00c5\u00c6\5\62\32\2\u00c6\63\3\2\2\2\u00c7\u00d3\7\17\2\2\u00c8"+
		"\u00d3\7\20\2\2\u00c9\u00ca\7\21\2\2\u00ca\u00cb\5*\26\2\u00cb\u00cc\7"+
		"\22\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00d3\5$\23\2\u00ce\u00cf\5$\23\2\u00cf"+
		"\u00d0\7\31\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d3\3\2\2\2\u00d2\u00c7\3"+
		"\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d3\65\3\2\2\2\25:CI[`eipx\u0086\u008a\u0091\u009f\u00a3"+
		"\u00aa\u00b3\u00ba\u00c1\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}