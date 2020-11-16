package main.java.generator;

import org.json.JSONArray;

import main.java.AvalanchaRunner;
import main.java.generator.util.StringCases;

public class GeneratorNueve {

	public static void main(String[] args) {
		JSONArray ast = AvalanchaRunner.getASTToJSON(
				StringCases.nueve);  
		AvalanchaGenerator.getCode(ast, "9");
	}

}
