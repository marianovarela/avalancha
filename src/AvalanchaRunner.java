 import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
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
        
        List programs = new ArrayList<String>(); 
        
	}
}
