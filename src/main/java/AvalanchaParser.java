package main.java;
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
		FALSE=10, PRINT=11, LPAREN=12, RPAREN=13, COMMA=14, ARROW=15, UNDERSCORE=16, 
		COLON=17, QUESTION=18, BANG=19, EQ=20, LOWERID=21, UPPERID=22;
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
			"'true'", "'false'", "'print'", "'('", "')'", "','", "'->'", "'_'", "':'", 
			"'?'", "'!'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "FUN", "CHECK", "IMP", "AND", "OR", "NOT", 
			"TRUE", "FALSE", "PRINT", "LPAREN", "RPAREN", "COMMA", "ARROW", "UNDERSCORE", 
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
			case PRINT:
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
			case PRINT:
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
		public TerminalNode PRINT() { return getToken(AvalanchaParser.PRINT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(CHECK);
				setState(73);
				formula();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(PRINT);
				setState(75);
				expresion();
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
			case PRINT:
			case ARROW:
			case UNDERSCORE:
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
				setState(79);
				match(COLON);
				setState(80);
				listaParametros();
				setState(81);
				match(ARROW);
				setState(82);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
			case PRINT:
			case ARROW:
			case UNDERSCORE:
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
				setState(87);
				match(QUESTION);
				setState(88);
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
			case PRINT:
			case ARROW:
			case UNDERSCORE:
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(BANG);
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
			setState(98);
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
				setState(97);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				parametro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				parametro();
				setState(102);
				match(COMMA);
				setState(103);
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
			setState(107);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case CHECK:
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ARROW:
			case UNDERSCORE:
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				regla();
				setState(111);
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
			setState(115);
			listaPatrones();
			setState(116);
			match(ARROW);
			setState(117);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(UNDERSCORE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(LOWERID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(UPPERID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(UPPERID);
				setState(123);
				match(LPAREN);
				setState(124);
				listaPatrones();
				setState(125);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case UNDERSCORE:
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
		public PatronContext patron() {
			return getRuleContext(PatronContext.class,0);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				patron();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				patron();
				setState(135);
				match(COMMA);
				setState(136);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(LOWERID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(LOWERID);
				setState(142);
				match(LPAREN);
				setState(143);
				listaExpresiones();
				setState(144);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(UPPERID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(UPPERID);
				setState(148);
				match(LPAREN);
				setState(149);
				listaExpresiones();
				setState(150);
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
			setState(156);
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
				setState(155);
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				expresion();
				setState(160);
				match(COMMA);
				setState(161);
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
			setState(165);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				formulaOrAndNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				formulaOrAndNeg();
				setState(169);
				match(IMP);
				setState(170);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				formulaAndNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				formulaAndNeg();
				setState(176);
				match(OR);
				setState(177);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				formulaNeg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				formulaNeg();
				setState(183);
				match(AND);
				setState(184);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case LPAREN:
			case LOWERID:
			case UPPERID:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				formulaAtomica();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(NOT);
				setState(190);
				formulaNeg();
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(LPAREN);
				setState(196);
				formula();
				setState(197);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				expresion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				expresion();
				setState(201);
				match(EQ);
				setState(202);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\5\4B\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7W\n\7\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\5\ta\n\t\3\n\3\n"+
		"\5\ne\n\n\3\13\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\5\rt\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0082\n\17\3\20\3\20\5\20\u0086\n\20\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u008d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u009b\n\22\3\23\3\23\5\23\u009f\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u00a6\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00af\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00b6\n\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00bd\n\30\3\31\3\31\3\31\5\31\u00c2\n\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u00cf\n\32\3\32\2\2\33\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\4\2\22\22\27\27\2\u00d2\2"+
		"\64\3\2\2\2\4;\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nN\3\2\2\2\fV\3\2\2\2\16"+
		"[\3\2\2\2\20`\3\2\2\2\22d\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30s\3\2\2\2"+
		"\32u\3\2\2\2\34\u0081\3\2\2\2\36\u0085\3\2\2\2 \u008c\3\2\2\2\"\u009a"+
		"\3\2\2\2$\u009e\3\2\2\2&\u00a5\3\2\2\2(\u00a7\3\2\2\2*\u00ae\3\2\2\2,"+
		"\u00b5\3\2\2\2.\u00bc\3\2\2\2\60\u00c1\3\2\2\2\62\u00ce\3\2\2\2\64\65"+
		"\5\4\3\2\65\66\5\6\4\2\66\3\3\2\2\2\67<\3\2\2\289\5\b\5\29:\5\4\3\2:<"+
		"\3\2\2\2;\67\3\2\2\2;8\3\2\2\2<\5\3\2\2\2=B\3\2\2\2>?\5\n\6\2?@\5\6\4"+
		"\2@B\3\2\2\2A=\3\2\2\2A>\3\2\2\2B\7\3\2\2\2CD\7\5\2\2DE\7\27\2\2EF\5\f"+
		"\7\2FG\5\16\b\2GH\5\20\t\2HI\5\30\r\2I\t\3\2\2\2JK\7\6\2\2KO\5(\25\2L"+
		"M\7\r\2\2MO\5\"\22\2NJ\3\2\2\2NL\3\2\2\2O\13\3\2\2\2PW\3\2\2\2QR\7\23"+
		"\2\2RS\5\22\n\2ST\7\21\2\2TU\5\26\f\2UW\3\2\2\2VP\3\2\2\2VQ\3\2\2\2W\r"+
		"\3\2\2\2X\\\3\2\2\2YZ\7\24\2\2Z\\\5(\25\2[X\3\2\2\2[Y\3\2\2\2\\\17\3\2"+
		"\2\2]a\3\2\2\2^_\7\25\2\2_a\5(\25\2`]\3\2\2\2`^\3\2\2\2a\21\3\2\2\2be"+
		"\3\2\2\2ce\5\24\13\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fl\5\26\f\2gh\5\26"+
		"\f\2hi\7\20\2\2ij\5\24\13\2jl\3\2\2\2kf\3\2\2\2kg\3\2\2\2l\25\3\2\2\2"+
		"mn\t\2\2\2n\27\3\2\2\2ot\3\2\2\2pq\5\32\16\2qr\5\30\r\2rt\3\2\2\2so\3"+
		"\2\2\2sp\3\2\2\2t\31\3\2\2\2uv\5\36\20\2vw\7\21\2\2wx\5\"\22\2x\33\3\2"+
		"\2\2y\u0082\7\22\2\2z\u0082\7\27\2\2{\u0082\7\30\2\2|}\7\30\2\2}~\7\16"+
		"\2\2~\177\5\36\20\2\177\u0080\7\17\2\2\u0080\u0082\3\2\2\2\u0081y\3\2"+
		"\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0082\35\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0086\5 \21\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\37\3\2\2\2\u0087\u008d\5\34\17\2\u0088\u0089\5\34\17\2\u0089"+
		"\u008a\7\20\2\2\u008a\u008b\5 \21\2\u008b\u008d\3\2\2\2\u008c\u0087\3"+
		"\2\2\2\u008c\u0088\3\2\2\2\u008d!\3\2\2\2\u008e\u009b\7\27\2\2\u008f\u0090"+
		"\7\27\2\2\u0090\u0091\7\16\2\2\u0091\u0092\5$\23\2\u0092\u0093\7\17\2"+
		"\2\u0093\u009b\3\2\2\2\u0094\u009b\7\30\2\2\u0095\u0096\7\30\2\2\u0096"+
		"\u0097\7\16\2\2\u0097\u0098\5$\23\2\u0098\u0099\7\17\2\2\u0099\u009b\3"+
		"\2\2\2\u009a\u008e\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u0094\3\2\2\2\u009a"+
		"\u0095\3\2\2\2\u009b#\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009f\5&\24\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f%\3\2\2\2\u00a0\u00a6\5"+
		"\"\22\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\5&\24\2"+
		"\u00a4\u00a6\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\'\3"+
		"\2\2\2\u00a7\u00a8\5*\26\2\u00a8)\3\2\2\2\u00a9\u00af\5,\27\2\u00aa\u00ab"+
		"\5,\27\2\u00ab\u00ac\7\7\2\2\u00ac\u00ad\5*\26\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af+\3\2\2\2\u00b0\u00b6\5.\30\2"+
		"\u00b1\u00b2\5.\30\2\u00b2\u00b3\7\t\2\2\u00b3\u00b4\5,\27\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6-\3\2\2\2\u00b7"+
		"\u00bd\5\60\31\2\u00b8\u00b9\5\60\31\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb"+
		"\5.\30\2\u00bb\u00bd\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd"+
		"/\3\2\2\2\u00be\u00c2\5\62\32\2\u00bf\u00c0\7\n\2\2\u00c0\u00c2\5\60\31"+
		"\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\61\3\2\2\2\u00c3\u00cf"+
		"\7\13\2\2\u00c4\u00cf\7\f\2\2\u00c5\u00c6\7\16\2\2\u00c6\u00c7\5(\25\2"+
		"\u00c7\u00c8\7\17\2\2\u00c8\u00cf\3\2\2\2\u00c9\u00cf\5\"\22\2\u00ca\u00cb"+
		"\5\"\22\2\u00cb\u00cc\7\26\2\2\u00cc\u00cd\5\"\22\2\u00cd\u00cf\3\2\2"+
		"\2\u00ce\u00c3\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c9"+
		"\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\63\3\2\2\2\26;ANV[`dks\u0081\u0085"+
		"\u008c\u009a\u009e\u00a5\u00ae\u00b5\u00bc\u00c1\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}