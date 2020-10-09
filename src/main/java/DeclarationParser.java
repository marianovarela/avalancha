package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class DeclarationParser {

	public static List<Object> makeDeclarations(JSONObject declarationsObject) {
		List<Object> declarations = new ArrayList<Object>();
		
		System.out.println(declarationsObject);
		JSONArray declarationArray = declarationsObject.getJSONArray("declaraciones");
		if(!declarationArray.isEmpty()) {
			List<Object> declaration = makeDeclaration((JSONObject) declarationArray.get(0));
			declarations.add(declaration);
			List<Object> nextDeclarations = makeDeclarations((JSONObject) declarationArray.get(1));
			declarations.addAll(nextDeclarations);
		}
		
		return declarations;
	}

	private static List<Object> makeDeclaration(JSONObject object) {
		List<Object> declaration = new ArrayList<Object>();
		declaration.add("fun");
		JSONArray declarationArray = object.getJSONArray("declaracion");
		declaration.add(declarationArray.getJSONObject(1).get("text"));
		declaration.add(makeSignature(declarationArray.getJSONObject(2)));
		declaration.add(makePrecondition(declarationArray.getJSONObject(3)));
		declaration.add(makePostcondition(declarationArray.getJSONObject(4)));
		declaration.add(makeRules(declarationArray.getJSONObject(5)));
		
		return declaration;
	}

	private static List<Object> makeRules(JSONObject jsonObject) {
		List<Object> rules = new ArrayList<Object>();
		JSONArray ruleArray = jsonObject.getJSONArray("reglas");
		if(!ruleArray.isEmpty()) {
			
		}
		
		return rules;
	}

	private static List<Object> makePostcondition(JSONObject jsonObject) {
		List<Object> postcondition = new ArrayList<Object>();
		JSONArray postconditionArray = jsonObject.getJSONArray("postcondicion");
		postcondition.add("post");
		if(postconditionArray.isEmpty()) {
			List<Object> list = new ArrayList<Object>();
			list.add("true");
			postcondition.add(list);
		}
		
		return postcondition;
	}

	private static List<Object> makePrecondition(JSONObject jsonObject) {
		List<Object> precondition = new ArrayList<Object>();
		JSONArray preconditionArray = jsonObject.getJSONArray("precondicion");
		precondition.add("pre");
		if(preconditionArray.isEmpty()) {
			List<Object> list = new ArrayList<Object>();
			list.add("true");
			precondition.add(list);
		}
		
		return precondition;
	}

	private static List<Object> makeSignature(JSONObject jsonObject) {
		List<Object> signature = new ArrayList<Object>();
		signature.add("sig");
		JSONArray signatureArray = jsonObject.getJSONArray("signatura");
		List<Object> secondParam = new ArrayList<Object>();
		if(signatureArray.isEmpty()) {
			signature.add(secondParam);
			signature.add("_");
		} else {
			JSONArray listaParametros = signatureArray.getJSONObject(1).getJSONArray("listaParametros");
			if(!listaParametros.isEmpty()) {
				// modifica el array de parametros
				makeParams(listaParametros.getJSONObject(0).getJSONArray("listaParametrosNoVacia"), secondParam);
			}
			signature.add(secondParam);
			JSONArray parametro = signatureArray.getJSONObject(3).getJSONArray("parametro");
			Object value = parametro.getJSONObject(0).get("text");
			if(!parametro.isEmpty()) {
				signature.add(value);
			}
		}
		
		return signature;
	}

	private static List<Object> makeParams(JSONArray jsonArray, List<Object> accumulator) {
		JSONArray params = jsonArray.getJSONObject(0).getJSONArray("parametro");
		accumulator.add(params.getJSONObject(0).get("text"));
		if(jsonArray.length() == 3) {
			JSONArray list = jsonArray.getJSONObject(2).getJSONArray("listaParametrosNoVacia");
			return makeParams(list, accumulator);
			
		}
		return accumulator;
	}

}
