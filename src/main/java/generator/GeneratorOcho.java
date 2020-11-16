package main.java.generator;

import org.json.JSONArray;

import main.java.AvalanchaRunner;
import main.java.generator.util.StringCases;

public class GeneratorOcho {

	public static void main(String[] args) {
		JSONArray ast = AvalanchaRunner.getASTToJSON(
				StringCases.ocho);  
		AvalanchaGenerator.getCode(ast, "08");
	}

}
