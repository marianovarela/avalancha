package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
			result = 
					((JSONObject) array.get(0))
					.getJSONArray("formulaAtomica");
		} else {
			// formulaOrAndNegi hIMPi formulaImpOrAndNegi
		}
		
		return result;
	}
	
	

}
