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
//		System.out.println("Inserte aqui:");
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		AvalanchaLexer lexer = new AvalanchaLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		AvalanchaParser parser = new AvalanchaParser(tokens);
		ParseTree tree = parser.programa();
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		AST ast = new AST(tree);

        System.out.println(ast);
        
        String strJson = Transformer.toJson(tree);
        
        System.out.println(strJson);
        
        JSONObject jsonObject = new JSONObject(strJson);
        
        List<Object> programs = getProgram(jsonObject);
        
        System.out.println("*******************************************************");
        System.out.println("Programa a imprimir");
        System.out.println(new JSONArray(programs));
//		String content = "check true";
//		getAST(content);
        
	}
	
	public static JSONArray getASTToJSON(String content) {
		CharStream input = new ANTLRInputStream(content);
		AvalanchaLexer lexer = new AvalanchaLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
	
		AvalanchaParser parser = new AvalanchaParser(tokens);
		ParseTree tree = parser.programa();
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		AST ast = new AST(tree);
	
	    System.out.println(ast);
	    
	    String strJson = Transformer.toJson(tree);
	    
	    System.out.println(strJson);
	    
	    JSONObject jsonObject = new JSONObject(strJson);
	    
	    List<Object> programs = getProgram(jsonObject);
	    
	    System.out.println("*******************************************************");
	    System.out.println("Programa a imprimir");
	    return new JSONArray(programs);
	}
	
	public static String getAST(String content) {
	    String astString = getASTToJSON(content).toString();
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
		
		List<Object> declarations = DeclarationParser.makeDeclarations(declarationsObject);
		List<Object> checks = CheckParser.makeChecks(checksObject);
		
		programs.add(declarations);
		programs.add(checks);
		
		return programs;
	}

	
	
}
