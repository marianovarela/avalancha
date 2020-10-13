package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class CheckParser {

	static List<Object> makeChecks(JSONObject checksObject) {
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

	static List<Object> makeFormula(JSONObject formulaObject) {
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
			List<Object> imp = new ArrayList<Object>();
			imp.add(((JSONObject) array.get(1)).get("text")); //and imp or
			imp.add(makeFormulaOrAndNeg( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaOrAndNeg")));
			imp.add(makeFormulaImpOrAndNeg( 
					((JSONObject) array.get(2))
					.getJSONArray("formulaImpOrAndNeg")));
			
			result = imp;
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
			List<Object> or = new ArrayList<Object>();
			or.add(((JSONObject) array.get(1)).get("text")); //and imp or
			or.add(makeFormulaAndNeg( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaAndNeg")));
			or.add(makeFormulaOrAndNeg( 
					((JSONObject) array.get(2))
					.getJSONArray("formulaOrAndNeg")));
			
			result = or;
		}
		
		return result;
	}

	private static Object makeFormulaAndNeg(JSONArray array) {
		Object result = null;
		
		if(array.length() == 1) {
			result = makeFormulaNeg( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaNeg"));
		} else {//length == 3
			List<Object> and = new ArrayList<Object>();
			and.add(((JSONObject) array.get(1)).get("text")); //and imp or
			and.add(makeFormulaNeg( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaNeg")));
			and.add(makeFormulaAndNeg( 
					((JSONObject) array.get(2))
					.getJSONArray("formulaAndNeg")));
			
			result = and;
		}
		return result;
	}

	static Object makeFormulaNeg(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			result = makeFormulaAtomica( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaAtomica"));
		} else {
			List<Object> neg = new ArrayList<Object>();
			neg.add("not");
			neg.add(makeFormulaNeg( // todo
					((JSONObject) array.get(1))
					.getJSONArray("formulaNeg")));
			result = neg;
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
				String operation = (String) formula.getJSONObject(1).get("text");
				if(operation.equals("and")) {
					return makeFormulaAndNeg(formula);
				} else if(operation.equals("or")){
					return makeFormulaOrAndNeg(formula);
				} else if(operation.equals("imp")){
					return makeFormulaImpOrAndNeg(formula);
				} else {
					return makeFormulaAtomica(formula);
				}
			} else {
				//TODO
			}
		} else if(formula.length() == 2){
			if(formula.getJSONObject(1).has("formulaNeg")){
				return makeFormulaNeg(formula);
			}
		}
		JSONObject exp = (JSONObject) formula.get(0);
		
		//first var
		Object first = makeExpresion(exp);
		result = first;
		return result;
	}

	static Object makeExpresion(JSONObject formula) {
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
				JSONArray listaExpresiones = expresionArray.getJSONObject(2).getJSONArray("listaExpresiones");
				if(listaExpresiones.isEmpty()) {
					first.add(new ArrayList<Object>());
				} else {
					first.add(makeListaExpresionesNoVacia(listaExpresiones.getJSONObject(0)));
				}
			} else { // es 1 es una variable
				Object value = expresionArray.getJSONObject(0).get("text");  
				Character firstChar = ((String) value).charAt(0);
				if(firstChar.isUpperCase(firstChar)) {
					first.add("cons");
					first.add(value);
					first.add(new ArrayList<Object>());
				} else {
					first.add("var");
					first.add(expresionArray.getJSONObject(0).get("text"));
				}
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

	static Object makeListaExpresionesNoVacia(JSONObject object) {
		List<Object> result = new ArrayList<Object>();
		JSONArray list = object.getJSONArray("listaExpresionesNoVacia");
		result.add(extractedVar(list, 0));
		if(list.length() == 3) {
			result.addAll((List) makeListaExpresionesNoVacia(list.getJSONObject(2)));
		}
		return result;
	}
	
}
