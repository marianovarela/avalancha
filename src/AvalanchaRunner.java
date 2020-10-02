 import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.json.JSONArray;
import org.json.JSONObject;
    
public class AvalanchaRunner 
{
	public static void main( String[] args) throws Exception 
	{

		@SuppressWarnings("deprecation")
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		AvalanchaLexer lexer = new AvalanchaLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		AvalanchaParser parser = new AvalanchaParser(tokens);
		ParseTree tree = parser.programa();
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		AST ast = new AST(tree);

        System.out.println(ast);
        
        String strJson = Examples.toJson(tree);
        
        System.out.println(strJson);
        
        JSONObject jsonObject = new JSONObject(strJson);
        
        List programs = getProgram(jsonObject);
        
	}

	private static List getProgram(JSONObject jsonObject) {
		List programs = new ArrayList<String>();
		
		for (String s : jsonObject.keySet()) {
			System.out.println(s);
		}
		programs.add("program");
		
		JSONArray program = jsonObject.getJSONArray("programa");
		
		JSONObject declarationsObject = program.getJSONObject(0);
		JSONObject checksObject = program.getJSONObject(1);
		
		List declarations = makeDeclarations(declarationsObject);
		List checks = makeChecks(checksObject);
		
		return programs;
	}

	private static List makeChecks(JSONObject checksObject) {
		System.out.println(checksObject);
		return null;
	}

	private static List makeDeclarations(JSONObject declarationsObject) {
		
		return null;
	}
}
