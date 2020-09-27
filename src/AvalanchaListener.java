// Generated from Avalancha.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AvalanchaParser}.
 */
public interface AvalanchaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(AvalanchaParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(AvalanchaParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AvalanchaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AvalanchaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(AvalanchaParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(AvalanchaParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#chequeos}.
	 * @param ctx the parse tree
	 */
	void enterChequeos(AvalanchaParser.ChequeosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#chequeos}.
	 * @param ctx the parse tree
	 */
	void exitChequeos(AvalanchaParser.ChequeosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(AvalanchaParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(AvalanchaParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#chequeo}.
	 * @param ctx the parse tree
	 */
	void enterChequeo(AvalanchaParser.ChequeoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#chequeo}.
	 * @param ctx the parse tree
	 */
	void exitChequeo(AvalanchaParser.ChequeoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#signatura}.
	 * @param ctx the parse tree
	 */
	void enterSignatura(AvalanchaParser.SignaturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#signatura}.
	 * @param ctx the parse tree
	 */
	void exitSignatura(AvalanchaParser.SignaturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#precondicion}.
	 * @param ctx the parse tree
	 */
	void enterPrecondicion(AvalanchaParser.PrecondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#precondicion}.
	 * @param ctx the parse tree
	 */
	void exitPrecondicion(AvalanchaParser.PrecondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#postcondicion}.
	 * @param ctx the parse tree
	 */
	void enterPostcondicion(AvalanchaParser.PostcondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#postcondicion}.
	 * @param ctx the parse tree
	 */
	void exitPostcondicion(AvalanchaParser.PostcondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(AvalanchaParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(AvalanchaParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#listaParametrosNoVacia}.
	 * @param ctx the parse tree
	 */
	void enterListaParametrosNoVacia(AvalanchaParser.ListaParametrosNoVaciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#listaParametrosNoVacia}.
	 * @param ctx the parse tree
	 */
	void exitListaParametrosNoVacia(AvalanchaParser.ListaParametrosNoVaciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(AvalanchaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(AvalanchaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#reglas}.
	 * @param ctx the parse tree
	 */
	void enterReglas(AvalanchaParser.ReglasContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#reglas}.
	 * @param ctx the parse tree
	 */
	void exitReglas(AvalanchaParser.ReglasContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterRegla(AvalanchaParser.ReglaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitRegla(AvalanchaParser.ReglaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#patron}.
	 * @param ctx the parse tree
	 */
	void enterPatron(AvalanchaParser.PatronContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#patron}.
	 * @param ctx the parse tree
	 */
	void exitPatron(AvalanchaParser.PatronContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#listaPatrones}.
	 * @param ctx the parse tree
	 */
	void enterListaPatrones(AvalanchaParser.ListaPatronesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#listaPatrones}.
	 * @param ctx the parse tree
	 */
	void exitListaPatrones(AvalanchaParser.ListaPatronesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#listaPatronesNoVacia}.
	 * @param ctx the parse tree
	 */
	void enterListaPatronesNoVacia(AvalanchaParser.ListaPatronesNoVaciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#listaPatronesNoVacia}.
	 * @param ctx the parse tree
	 */
	void exitListaPatronesNoVacia(AvalanchaParser.ListaPatronesNoVaciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(AvalanchaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(AvalanchaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#listaExpresiones}.
	 * @param ctx the parse tree
	 */
	void enterListaExpresiones(AvalanchaParser.ListaExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#listaExpresiones}.
	 * @param ctx the parse tree
	 */
	void exitListaExpresiones(AvalanchaParser.ListaExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#listaExpresionesNoVacia}.
	 * @param ctx the parse tree
	 */
	void enterListaExpresionesNoVacia(AvalanchaParser.ListaExpresionesNoVaciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#listaExpresionesNoVacia}.
	 * @param ctx the parse tree
	 */
	void exitListaExpresionesNoVacia(AvalanchaParser.ListaExpresionesNoVaciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(AvalanchaParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(AvalanchaParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#formulaImpOrAndNeg}.
	 * @param ctx the parse tree
	 */
	void enterFormulaImpOrAndNeg(AvalanchaParser.FormulaImpOrAndNegContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#formulaImpOrAndNeg}.
	 * @param ctx the parse tree
	 */
	void exitFormulaImpOrAndNeg(AvalanchaParser.FormulaImpOrAndNegContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#formulaOrAndNeg}.
	 * @param ctx the parse tree
	 */
	void enterFormulaOrAndNeg(AvalanchaParser.FormulaOrAndNegContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#formulaOrAndNeg}.
	 * @param ctx the parse tree
	 */
	void exitFormulaOrAndNeg(AvalanchaParser.FormulaOrAndNegContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#formulaAndNeg}.
	 * @param ctx the parse tree
	 */
	void enterFormulaAndNeg(AvalanchaParser.FormulaAndNegContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#formulaAndNeg}.
	 * @param ctx the parse tree
	 */
	void exitFormulaAndNeg(AvalanchaParser.FormulaAndNegContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#formulaNeg}.
	 * @param ctx the parse tree
	 */
	void enterFormulaNeg(AvalanchaParser.FormulaNegContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#formulaNeg}.
	 * @param ctx the parse tree
	 */
	void exitFormulaNeg(AvalanchaParser.FormulaNegContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvalanchaParser#formulaAtomica}.
	 * @param ctx the parse tree
	 */
	void enterFormulaAtomica(AvalanchaParser.FormulaAtomicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvalanchaParser#formulaAtomica}.
	 * @param ctx the parse tree
	 */
	void exitFormulaAtomica(AvalanchaParser.FormulaAtomicaContext ctx);
}