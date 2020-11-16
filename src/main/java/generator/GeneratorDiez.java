package main.java.generator;

import org.json.JSONArray;

import main.java.AvalanchaRunner;
import main.java.generator.util.StringCases;

public class GeneratorDiez {

	public static void main(String[] args) {
		JSONArray ast = AvalanchaRunner.getASTToJSON(
				StringCases.diez);  
		AvalanchaGenerator.getCode(ast, "10");
	}

}
