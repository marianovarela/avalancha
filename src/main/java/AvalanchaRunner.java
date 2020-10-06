package main.java;
 import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.json.JSONArray;
import org.json.JSONObject;
    
@SuppressWarnings("deprecation")
public class AvalanchaRunner 
{
	public static void main( String[] args) throws Exception 
	{
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		AvalanchaLexer lexer = new AvalanchaLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		AvalanchaParser parser = new AvalanchaParser(tokens);
		ParseTree tree = parser.programa();
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		AST ast = new AST(tree);

        System.out.println(ast);
        
        String strJson = Examples.toJson(tree);
        
        System.out.println(strJson);
        
        JSONObject jsonObject = new JSONObject(strJson);
        
        List<Object> programs = getProgram(jsonObject);
        
        System.out.println("*******************************************************");
        System.out.println("Programa a imprimir");
        System.out.println(new JSONArray(programs));
//		String content = "check true";
//		getAST(content);
        
	}
	
	public static String getAST(String content) {
		CharStream input = new ANTLRInputStream(content);
		AvalanchaLexer lexer = new AvalanchaLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
	
		AvalanchaParser parser = new AvalanchaParser(tokens);
		ParseTree tree = parser.programa();
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		AST ast = new AST(tree);
	
	    System.out.println(ast);
	    
	    String strJson = Examples.toJson(tree);
	    
	    System.out.println(strJson);
	    
	    JSONObject jsonObject = new JSONObject(strJson);
	    
	    List<Object> programs = getProgram(jsonObject);
	    
	    System.out.println("*******************************************************");
	    System.out.println("Programa a imprimir");
	    String astString = new JSONArray(programs).toString();
	    System.out.println(astString);
	    return astString;
	}

	private static List<Object> getProgram(JSONObject jsonObject) {
		List<Object> programs = new ArrayList<Object>();
		
		for (String s : jsonObject.keySet()) {
			System.out.println(s);
		}
		programs.add("program");
		
		JSONArray program = jsonObject.getJSONArray("programa");
		
		JSONObject declarationsObject = program.getJSONObject(0);
		JSONObject checksObject = program.getJSONObject(1);
		
		List<Object> declarations = makeDeclarations(declarationsObject);
		List<Object> checks = makeChecks(checksObject);
		
		programs.add(declarations);
		programs.add(checks);
		
		return programs;
	}

	private static List<Object> makeChecks(JSONObject checksObject) {
		List<Object> checks = new ArrayList<Object>();
		
		System.out.println(checksObject);
		
		
		JSONArray checkArray = checksObject.getJSONArray("chequeos");
		if(!checkArray.isEmpty()) {
			List<Object> check = makeCheck((JSONObject) checkArray.get(0));
			checks.add(check);
			List<Object> nextChecks = makeChecks((JSONObject) checkArray.get(1));
			checks.addAll(nextChecks);
		}
		
		return checks;
	}

	private static List<Object> makeCheck(JSONObject object) {
		List<Object> check = new ArrayList<Object>();
		check.add("check");
		JSONArray checkArray = object.getJSONArray("chequeo");
		List<Object> formula = makeFormula((JSONObject) checkArray.get(1));
		check.add(formula);
		return check;
	}

	private static List<Object> makeFormula(JSONObject formulaObject) {
		// hay que contemplar 7 casos
		List<Object> formula = new ArrayList<Object>();
		JSONArray formulaArray = formulaObject.getJSONArray("formula");
		// devuelve un objecto porque puede ser un simple string o una lista de una construcion 
		Object formulaResult = makeFormulaImpOrAndNeg(
				((JSONObject) formulaArray.get(0))
				.getJSONArray("formulaImpOrAndNeg"));
		// valida el tipo de objeto que retorno
		if (formulaResult instanceof Collection<?>){
			formula.addAll((List) formulaResult);
		} else {
			formula.add(formulaResult);
		}
		return formula;
	}

	private static Object makeFormulaImpOrAndNeg(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			result = makeFormulaOrAndNeg( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaOrAndNeg"));
		} else {
			// formulaOrAndNegi hIMPi formulaImpOrAndNegi
		}
		
		return result;
	}

	private static Object makeFormulaOrAndNeg(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			result = makeFormulaAndNeg( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaAndNeg"));
		} else {
			// formulaOrAndNegi hIMPi formulaImpOrAndNegi
		}
		
		return result;
	}

	private static Object makeFormulaAndNeg(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			result = makeFormulaNeg( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaNeg"));
		} else {
			// formulaOrAndNegi hIMPi formulaImpOrAndNegi
		}
		
		return result;
	}

	private static Object makeFormulaNeg(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			result = makeFormulaAtomica( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaAtomica"));
		} else {
			// formulaOrAndNegi hIMPi formulaImpOrAndNegi
		}
		
		return result;
	}

	private static Object makeFormulaAtomica(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			JSONObject formula = (JSONObject) array.get(0); 
			result = makeExpresion(formula);
		} else {
			JSONObject firstExp = ((JSONObject) array.get(0));
			JSONObject thirdExp = ((JSONObject) array.get(2));
			if(firstExp.has("text") && firstExp.get("text").equals("(") && thirdExp.has("text") && thirdExp.get("text").equals(")")) {
				result = resolveParentesis(array);
			}else {
				JSONObject expresion = ((JSONObject) array.get(1));
				if(expresion.get("text").equals("==")) {
					List<Object> listResult = new ArrayList<Object>();
					listResult.add("equal");
					//first var
					List<Object> first = extractedVar(array, 0);
					//second var
					List<Object> second = extractedVar(array, 2);
					
					listResult.add(first);
					listResult.add(second);
					result = listResult;
				}
			}
		}
		
		return result;
	}

	private static Object resolveParentesis(JSONArray array) { //caso output 6
		Object result;
		JSONObject secondExp = ((JSONObject) array.get(1));
		JSONArray formula = (JSONArray) Extractor.getFormulaAtomica((JSONObject) array.get(1));
		if(formula.length() == 3) {
			if(formula.getJSONObject(1).has("formula")) {
				return resolveParentesis(formula);
			} else if(formula.getJSONObject(1).has("text")){
				return makeFormulaAtomica(formula);
			}else {
				//TODO
			}
		}		
		JSONObject exp = (JSONObject) formula.get(0);
		
		//first var
		Object first = makeExpresion(exp);
		result = first;
		return result;
	}

	private static Object makeExpresion(JSONObject formula) {
		Object result = null;
		if(formula.opt("text") != null) {
			result = formula.get("text");
		} else if(formula.opt("expresion") != null){ // caso output 5
			JSONArray expresionArray = formula.getJSONArray("expresion");
			List<Object> equals = new ArrayList<Object>();
			equals.add("equal");
			List<Object> first = new ArrayList<Object>();
			if(expresionArray.length() == 4) {
				first.add("app");
				first.add(expresionArray.getJSONObject(0).get("text"));
				first.add(new ArrayList<Object>());
			} else { // es 1 es una variable
				first.add("var");
				first.add(expresionArray.getJSONObject(0).get("text"));
			}
			List<Object> second = new ArrayList<Object>();
			second.add("cons");
			second.add("True");
			second.add(new ArrayList<Object>());
			
			equals.add(first);
			equals.add(second);
			result = equals;
		}
		
		return result;
	}

	private static List<Object> extractedVar(JSONArray array, int index) {
		List<Object> result = new ArrayList<Object>();
		JSONArray expArray = ((JSONObject) array.get(index)).getJSONArray("expresion");
		Object value = ((JSONObject)
				((JSONObject) array.get(index)).getJSONArray("expresion")
				.get(0)).get("text"); // es un string
		Character firstChar = ((String) value).charAt(0);
		if(firstChar.isUpperCase(firstChar)) {
			JSONArray expresion = ((JSONObject) array.get(index)).getJSONArray("expresion");
			System.out.println(expresion.length());
			result.add("cons");
			result.add(value);
			if(expArray.length() == 1) {
				result.add(new ArrayList<Object>());
			} else {
				JSONArray listaExpresiones = expresion.getJSONObject(2).getJSONArray("listaExpresiones");
				if(listaExpresiones.isEmpty()) {
					result.add(new ArrayList<Object>());
				} else {
					result.add(makeListaExpresionesNoVacia(listaExpresiones.getJSONObject(0)));
				}
			}
		} else {
			if(expArray.length() == 4) {
				result.add("app");
				result.add(value);
				JSONArray listaExpresiones = expArray.getJSONObject(2).getJSONArray("listaExpresiones");
				if(listaExpresiones.isEmpty()) {
					result.add(new ArrayList<Object>());
				} else {
					result.add(makeListaExpresionesNoVacia(listaExpresiones.getJSONObject(0)));
				}
			} else { // solo es una variable
				result.add("var");
				result.add(value);
			}
		}
		return result;
	}

	private static Object makeListaExpresionesNoVacia(JSONObject object) {
		List<Object> result = new ArrayList<Object>();
		JSONArray list = object.getJSONArray("listaExpresionesNoVacia");
		result.add(extractedVar(list, 0));
		if(list.length() == 3) {
			result.addAll((List) makeListaExpresionesNoVacia(list.getJSONObject(2)));
		}
		return result;
	}

	private static List<Object> makeDeclarations(JSONObject declarationsObject) {
		List<Object> declarations = new ArrayList<Object>();
		
		System.out.println(declarationsObject);
		
		return declarations;
	}
	
}
