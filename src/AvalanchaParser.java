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
		WS=1, LINE_COMMENT=2, FUN=3, CHECK=4, IMP=5, AND=6, OR=7, NOT=8, TRUE=9, 
		FALSE=10, LPAREN=11, RPAREN=12, COMMA=13, ARROW=14, UNDERSCORE=15, COLON=16, 
		QUESTION=17, BANG=18, EQ=19, LOWERID=20, UPPERID=21;
	public static final int
		RULE_programa = 0, RULE_declaraciones = 1, RULE_chequeos = 2, RULE_declaracion = 3, 
		RULE_chequeo = 4, RULE_signatura = 5, RULE_precondicion = 6, RULE_postcondicion = 7, 
		RULE_listaParametros = 8, RULE_listaParametrosNoVacia = 9, RULE_parametro = 10, 
		RULE_reglas = 11, RULE_regla = 12, RULE_patron = 13, RULE_listaPatrones = 14, 
		RULE_listaPatronesNoVacia = 15, RULE_expresion = 16, RULE_listaExpresiones = 17, 
		RULE_listaExpresionesNoVacia = 18, RULE_formula = 19, RULE_formulaImpOrAndNeg = 20, 
		RULE_formulaOrAndNeg = 21, RULE_formulaAndNeg = 22, RULE_formulaNeg = 23, 
		RULE_formulaAtomica = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaraciones", "chequeos", "declaracion", "chequeo", "signatura", 
			"precondicion", "postcondicion", "listaParametros", "listaParametrosNoVacia", 
			"parametro", "reglas", "regla", "patron", "listaPatrones", "listaPatronesNoVacia", 
			"expresion", "listaExpresiones", "listaExpresionesNoVacia", "formula", 
			"formulaImpOrAndNeg", "formulaOrAndNeg", "formulaAndNeg", "formulaNeg", 
			"formulaAtomica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'fun'", "'check'", "'imp'", "'and'", "'or'", "'not'", 
			null, null, "'('", "')'", "','", "'->'", "'_'", "':'", "'?'", "'!'", 
			"'=='"
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
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			declaraciones();
			setState(51);
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
		enterRule(_localctx, 2, RULE_declaraciones);
		try {
			setState(57);
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
				setState(54);
				declaracion();
				setState(55);
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
		enterRule(_localctx, 4, RULE_chequeos);
		try {
			setState(63);
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
				setState(60);
				chequeo();
				setState(61);
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
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(FUN);
			setState(66);
			match(LOWERID);
			setState(67);
			signatura();
			setState(68);
			precondicion();
			setState(69);
			postcondicion();
			setState(70);
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
		enterRule(_localctx, 8, RULE_chequeo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CHECK);
			setState(73);
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
		enterRule(_localctx, 10, RULE_signatura);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
			case ARROW:
			case QUESTION:
			case BANG:
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(COLON);
				setState(77);
				listaParametros();
				setState(78);
				match(ARROW);
				setState(79);
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
		enterRule(_localctx, 12, RULE_precondicion);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
			case ARROW:
			case BANG:
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(QUESTION);
				setState(85);
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
		enterRule(_localctx, 14, RULE_postcondicion);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
			case ARROW:
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(BANG);
				setState(90);
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
		enterRule(_localctx, 16, RULE_listaParametros);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case UNDERSCORE:
			case LOWERID:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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
		enterRule(_localctx, 18, RULE_listaParametrosNoVacia);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				parametro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				parametro();
				setState(99);
				match(COMMA);
				setState(100);
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
		enterRule(_localctx, 20, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==UNDERSCORE || _la==LOWERID) ) {
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
		enterRule(_localctx, 22, RULE_reglas);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ARROW:
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				regla();
				setState(108);
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
		enterRule(_localctx, 24, RULE_regla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			listaPatrones();
			setState(113);
			match(ARROW);
			setState(114);
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
		enterRule(_localctx, 26, RULE_patron);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(UNDERSCORE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(LOWERID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(UPPERID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(UPPERID);
				setState(120);
				match(LPAREN);
				setState(121);
				listaPatrones();
				setState(122);
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
		enterRule(_localctx, 28, RULE_listaPatrones);
		try {
			setState(128);
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
				setState(127);
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
		enterRule(_localctx, 30, RULE_listaPatronesNoVacia);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				expresion();
				setState(132);
				match(COMMA);
				setState(133);
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
		enterRule(_localctx, 32, RULE_expresion);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(LOWERID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(LOWERID);
				setState(139);
				match(LPAREN);
				setState(140);
				listaExpresiones();
				setState(141);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(UPPERID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(UPPERID);
				setState(145);
				match(LPAREN);
				setState(146);
				listaExpresiones();
				setState(147);
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
		enterRule(_localctx, 34, RULE_listaExpresiones);
		try {
			setState(153);
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
				setState(152);
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
		enterRule(_localctx, 36, RULE_listaExpresionesNoVacia);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				expresion();
				setState(157);
				match(COMMA);
				setState(158);
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
		enterRule(_localctx, 38, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		enterRule(_localctx, 40, RULE_formulaImpOrAndNeg);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				formulaOrAndNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				formulaOrAndNeg();
				setState(166);
				match(IMP);
				setState(167);
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
		enterRule(_localctx, 42, RULE_formulaOrAndNeg);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				formulaAndNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				formulaAndNeg();
				setState(173);
				match(OR);
				setState(174);
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
		enterRule(_localctx, 44, RULE_formulaAndNeg);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				formulaNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				formulaNeg();
				setState(180);
				match(AND);
				setState(181);
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
		enterRule(_localctx, 46, RULE_formulaNeg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			formulaAtomica();
			setState(186);
			match(NOT);
			setState(187);
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
		enterRule(_localctx, 48, RULE_formulaAtomica);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(LPAREN);
				setState(192);
				formula();
				setState(193);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				expresion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				expresion();
				setState(197);
				match(EQ);
				setState(198);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\5\4B\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"T\n\7\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\5\nb\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\r\3\r\3\r\3\r\5\rq\n\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\177\n\17"+
		"\3\20\3\20\5\20\u0083\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u008a\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0098"+
		"\n\22\3\23\3\23\5\23\u009c\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00a3\n"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00ac\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00b3\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00ba\n\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u00cb\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\2\3\4\2\21\21\26\26\2\u00cc\2\64\3\2\2\2\4;\3\2\2\2\6"+
		"A\3\2\2\2\bC\3\2\2\2\nJ\3\2\2\2\fS\3\2\2\2\16X\3\2\2\2\20]\3\2\2\2\22"+
		"a\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30p\3\2\2\2\32r\3\2\2\2\34~\3\2\2\2"+
		"\36\u0082\3\2\2\2 \u0089\3\2\2\2\"\u0097\3\2\2\2$\u009b\3\2\2\2&\u00a2"+
		"\3\2\2\2(\u00a4\3\2\2\2*\u00ab\3\2\2\2,\u00b2\3\2\2\2.\u00b9\3\2\2\2\60"+
		"\u00bb\3\2\2\2\62\u00ca\3\2\2\2\64\65\5\4\3\2\65\66\5\6\4\2\66\3\3\2\2"+
		"\2\67<\3\2\2\289\5\b\5\29:\5\4\3\2:<\3\2\2\2;\67\3\2\2\2;8\3\2\2\2<\5"+
		"\3\2\2\2=B\3\2\2\2>?\5\n\6\2?@\5\6\4\2@B\3\2\2\2A=\3\2\2\2A>\3\2\2\2B"+
		"\7\3\2\2\2CD\7\5\2\2DE\7\26\2\2EF\5\f\7\2FG\5\16\b\2GH\5\20\t\2HI\5\30"+
		"\r\2I\t\3\2\2\2JK\7\6\2\2KL\5(\25\2L\13\3\2\2\2MT\3\2\2\2NO\7\22\2\2O"+
		"P\5\22\n\2PQ\7\20\2\2QR\5\26\f\2RT\3\2\2\2SM\3\2\2\2SN\3\2\2\2T\r\3\2"+
		"\2\2UY\3\2\2\2VW\7\23\2\2WY\5(\25\2XU\3\2\2\2XV\3\2\2\2Y\17\3\2\2\2Z^"+
		"\3\2\2\2[\\\7\24\2\2\\^\5(\25\2]Z\3\2\2\2][\3\2\2\2^\21\3\2\2\2_b\3\2"+
		"\2\2`b\5\24\13\2a_\3\2\2\2a`\3\2\2\2b\23\3\2\2\2ci\5\26\f\2de\5\26\f\2"+
		"ef\7\17\2\2fg\5\24\13\2gi\3\2\2\2hc\3\2\2\2hd\3\2\2\2i\25\3\2\2\2jk\t"+
		"\2\2\2k\27\3\2\2\2lq\3\2\2\2mn\5\32\16\2no\5\30\r\2oq\3\2\2\2pl\3\2\2"+
		"\2pm\3\2\2\2q\31\3\2\2\2rs\5\36\20\2st\7\20\2\2tu\5\"\22\2u\33\3\2\2\2"+
		"v\177\7\21\2\2w\177\7\26\2\2x\177\7\27\2\2yz\7\27\2\2z{\7\r\2\2{|\5\36"+
		"\20\2|}\7\16\2\2}\177\3\2\2\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2"+
		"\177\35\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0083\5 \21\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0081\3\2\2\2\u0083\37\3\2\2\2\u0084\u008a\5\"\22\2\u0085"+
		"\u0086\5\"\22\2\u0086\u0087\7\17\2\2\u0087\u0088\5 \21\2\u0088\u008a\3"+
		"\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u008a!\3\2\2\2\u008b\u0098"+
		"\7\26\2\2\u008c\u008d\7\26\2\2\u008d\u008e\7\r\2\2\u008e\u008f\5$\23\2"+
		"\u008f\u0090\7\16\2\2\u0090\u0098\3\2\2\2\u0091\u0098\7\27\2\2\u0092\u0093"+
		"\7\27\2\2\u0093\u0094\7\r\2\2\u0094\u0095\5$\23\2\u0095\u0096\7\16\2\2"+
		"\u0096\u0098\3\2\2\2\u0097\u008b\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u0091"+
		"\3\2\2\2\u0097\u0092\3\2\2\2\u0098#\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u009c\5&\24\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c%\3\2\2\2"+
		"\u009d\u00a3\5\"\22\2\u009e\u009f\5\"\22\2\u009f\u00a0\7\17\2\2\u00a0"+
		"\u00a1\5&\24\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2"+
		"\2\2\u00a3\'\3\2\2\2\u00a4\u00a5\5*\26\2\u00a5)\3\2\2\2\u00a6\u00ac\5"+
		",\27\2\u00a7\u00a8\5,\27\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\5*\26\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac+\3\2\2\2"+
		"\u00ad\u00b3\5.\30\2\u00ae\u00af\5.\30\2\u00af\u00b0\7\t\2\2\u00b0\u00b1"+
		"\5,\27\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		"-\3\2\2\2\u00b4\u00ba\5\60\31\2\u00b5\u00b6\5\60\31\2\u00b6\u00b7\7\b"+
		"\2\2\u00b7\u00b8\5.\30\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9"+
		"\u00b5\3\2\2\2\u00ba/\3\2\2\2\u00bb\u00bc\5\62\32\2\u00bc\u00bd\7\n\2"+
		"\2\u00bd\u00be\5\60\31\2\u00be\61\3\2\2\2\u00bf\u00cb\7\13\2\2\u00c0\u00cb"+
		"\7\f\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\7\16\2\2"+
		"\u00c4\u00cb\3\2\2\2\u00c5\u00cb\5\"\22\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8"+
		"\7\25\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00cb\3\2\2\2\u00ca\u00bf\3\2\2\2"+
		"\u00ca\u00c0\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6"+
		"\3\2\2\2\u00cb\63\3\2\2\2\24;ASX]ahp~\u0082\u0089\u0097\u009b\u00a2\u00ab"+
		"\u00b2\u00b9\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}