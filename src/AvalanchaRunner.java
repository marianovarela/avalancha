 import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.json.JSONArray;
import org.json.JSONObject;
    
@SuppressWarnings("deprecation")
public class AvalanchaRunner 
{
	public static void main( String[] args) throws Exception 
	{

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
        
        List<Object> programs = getProgram(jsonObject);
        
        System.out.println("*******************************************************");
        System.out.println("Programa a imprimir");
        System.out.println(new JSONArray(programs));
        
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
		
		List<Object> declarations = makeDeclarations(declarationsObject);
		List<Object> checks = makeChecks(checksObject);
		
		programs.add(declarations);
		programs.add(checks);
		
		return programs;
	}

	private static List<Object> makeChecks(JSONObject checksObject) {
		List<Object> checks = new ArrayList<Object>();
		
		System.out.println(checksObject);
		
		
		JSONArray checkArray = checksObject.getJSONArray("chequeos");
		if(!checkArray.isEmpty()) {
			List<Object> check = makeCheck((JSONObject) checkArray.get(0));
			checks.add(check);
			List<Object> nextChecks = makeChecks((JSONObject) checkArray.get(1));
			checks.addAll(nextChecks);
		}
		
		return checks;
	}

	private static List<Object> makeRecursiveChecks(JSONObject checksObject) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Object> makeCheck(JSONObject object) {
		List<Object> check = new ArrayList<Object>();
		check.add("check");
		JSONArray checkArray = object.getJSONArray("chequeo");
		List<Object> formula =  makeFormula((JSONObject) checkArray.get(1));
		check.add(formula);
		return check;
	}

	private static List<Object> makeFormula(JSONObject formulaObject) {
		// hay que contemplar 7 casos
		List<Object> formula = new ArrayList<Object>();
		JSONArray formulaArray = formulaObject.getJSONArray("formula");
		// devuelve un objecto porque puede ser un simple string o una lista de una construcion 
		Object formulaResult = makeFormulaImpOrAndNeg(
				((JSONObject) formulaArray.get(0))
				.getJSONArray("formulaImpOrAndNeg"));
		formula.add(formulaResult);
		return formula;
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
			result = makeFormulaAtomica( 
					((JSONObject) array.get(0))
					.getJSONArray("formulaAtomica"));
		} else {
			// formulaOrAndNegi hIMPi formulaImpOrAndNegi
		}
		
		return result;
	}

	private static Object makeFormulaAtomica(JSONArray array) {
		Object result = null;
		if(array.length() == 1) {
			JSONObject formula = (JSONObject) array.get(0); 
			result = formula.get("text");
		} else {
			// formulaOrAndNegi hIMPi formulaImpOrAndNegi
		}
		
		return result;
	}

	private static List<Object> makeDeclarations(JSONObject declarationsObject) {
		List<Object> declarations = new ArrayList<Object>();
		
		System.out.println(declarationsObject);
		
		return declarations;
	}
	
	
}
