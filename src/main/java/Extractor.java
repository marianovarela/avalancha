package main.java;

import org.json.JSONArray;
import org.json.JSONObject;

public class Extractor {

	public static JSONArray getFormulaAtomica(JSONObject jsonObject) {
		JSONArray formulaArray = jsonObject.getJSONArray("formula");
		Object formulaResult = makeFormulaImpOrAndNeg(
				((JSONObject) formulaArray.get(0))
				.getJSONArray("formulaImpOrAndNeg"));
		// valida el tipo de objeto que retorno
		return ((JSONArray) formulaResult);
	}

	private static Object makeFormulaImpOrAndNeg(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			result = makeFormulaOrAndNeg( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaOrAndNeg"));
		} else {
			return array;
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
			return array;
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
			return array;
		}
		
		return result;
	}

	private static Object makeFormulaNeg(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			result = 
					((JSONObject) array.get(0))
					.getJSONArray("formulaAtomica");
		} else {
			System.out.println("hay que devolver el not");
//			
//			List<Object> neg = new ArrayList<Object>();
//			neg.add("not");
//			neg.add(makeFormulaNeg( // todo
//					((JSONObject) array.get(1))
//					.getJSONArray("formulaNeg")));
//			result = neg;
			//result = AvalanchaRunner.makeFormulaNeg(((JSONObject) array.get(1)).getJSONArray("formulaNeg"));
//			result = ((JSONObject) array.get(1)).getJSONArray("formulaNeg");
			return array;
			
		}
		
		return result;
	}
	
	

}
