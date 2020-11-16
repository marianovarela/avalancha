package main.java.generator;

import org.json.JSONArray;

import main.java.AvalanchaRunner;
import main.java.generator.util.StringCases;

public class GeneratorTres {

	public static void main(String[] args) {
		JSONArray ast = AvalanchaRunner.getASTToJSON(
				StringCases.tres);  
		AvalanchaGenerator.getCode(ast, "03");
	}

}
