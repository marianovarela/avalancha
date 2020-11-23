package main.java.generator;

import org.json.JSONArray;

import main.java.AvalanchaRunner;
import main.java.generator.util.StringCases;

public class MainGenerator {

	public static void main(String[] args) {
		JSONArray ast = AvalanchaRunner.getASTToJSON(
				StringCases.uno);  
		AvalanchaGenerator.getCode(ast, "01");
		JSONArray ast2 = AvalanchaRunner.getASTToJSON(
				StringCases.dos);  
		AvalanchaGenerator.getCode(ast2, "02");
		JSONArray ast3 = AvalanchaRunner.getASTToJSON(
				StringCases.tres);  
		AvalanchaGenerator.getCode(ast3, "03");
		JSONArray ast4 = AvalanchaRunner.getASTToJSON(
				StringCases.cuatro);  
		AvalanchaGenerator.getCode(ast4, "04");
		JSONArray ast5 = AvalanchaRunner.getASTToJSON(
				StringCases.cinco);  
		AvalanchaGenerator.getCode(ast5, "05");
		JSONArray ast6 = AvalanchaRunner.getASTToJSON(
				StringCases.seis);  
		AvalanchaGenerator.getCode(ast6, "06");
		JSONArray ast8 = AvalanchaRunner.getASTToJSON(
				StringCases.ocho);  
		AvalanchaGenerator.getCode(ast8, "08");
		JSONArray ast9 = AvalanchaRunner.getASTToJSON(
				StringCases.nueve);  
		AvalanchaGenerator.getCode(ast9, "09");
		JSONArray ast10 = AvalanchaRunner.getASTToJSON(
				StringCases.diez);  
		AvalanchaGenerator.getCode(ast10, "10");
	}

}
