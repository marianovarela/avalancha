package main.java.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

import javax.lang.model.element.VariableElement;

import org.json.JSONArray;

import main.java.AvalanchaRunner;
import main.java.generator.util.FileUtil;
import main.java.generator.util.StringCases;

public class AvalanchaGenerator {
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	int count = 0;
	static int consCount = 0;
	static int funCount = 0;
	static HashMap<String, Integer> funMap = new HashMap<String, Integer>();
	static String functions = "";
	
	public static void main(String[] args) {
		JSONArray ast = AvalanchaRunner.getASTToJSON(
//				StringCases.uno     // ok
//				StringCases.dos     // ok
//				StringCases.tres    // ok
//				StringCases.cuatro	// ok
				StringCases.cinco
//				StringCases.ocho    // ok 
//				StringCases.nueve   // ok
//				StringCases.diez    // ok
				);
		
		String userFunctions = generateDeclarations(ast);
		String body = generateChecks(ast);//TODO llamar una sola vez y separar declaraciones de chequeos
		
		String program = "";
	
		String header = "#include <iostream> \r\n"
				+ "#include <vector>\r\n"
				+ "#include <iterator> \r\n"
				+ "#include <map> \r\n"
				+ "  \r\n"
				+ "using namespace std; \r\n"
				+ "\r\n"
				+ "   \r\n"
				+ "typedef int Tag;\r\n"
				+ "struct Term {\r\n"
				+ "Tag tag;\r\n"
				+ "vector<Term*> children;\r\n"
				+ "int refcnt;\r\n"
				+ "};";
		
		String prefunction = "    map<string, int> constructorMap;\r\n"
				+ "    int constructorCount = 0; \r\n"
				+ "map<string, int> functionMap;\r\n"
				+ "int functionCount = 0; \r\n"
				+ "\r\n"
				+ "void incref(Term* t) {\r\n"
				+ "    t->refcnt = t->refcnt++;\r\n"
				+ "}\r\n"
				+ "void decref(Term* t) {\r\n"
				+ "    if (t->refcnt == 0) {\r\n"
				+ "        for(int i = 0; i < t->children.size(); i++) {\r\n"
				+ "            decref(t->children[i]);\r\n"
				+ "        }\r\n"
				+ "        delete t;\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "int getSecond(map<string, int> constructorMap, string value){\r\n"
				+ "    for (auto it = constructorMap.begin(); it != constructorMap.end(); ++it)\r\n"
				+ "    if (it->first == value){\r\n"
				+ "         return it->second;\r\n"
				+ "    }     \r\n"
				+ "    return false;\r\n"
				+ "}\r\n"
				+ "void addFunction(string fun){\r\n"
				+ "    bool exists = false;\r\n"
				+ "    for (auto it = functionMap.begin(); it != functionMap.end(); ++it){\r\n"
				+ "        if (it->first == fun){\r\n"
				+ "            exists = true;\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "    if (!exists){\r\n"
				+ "        functionMap.insert(pair<string, int>(fun, constructorCount)); \r\n"
				+ "        functionCount++;\r\n"
				+ "    }  \r\n"
				+ "}\r\n"
				+ "void addConstructor(string constructor){\r\n"
				+ "    bool exists = false;\r\n"
				+ "    for (auto it = constructorMap.begin(); it != constructorMap.end(); ++it){\r\n"
				+ "        if (it->first == constructor){\r\n"
				+ "            exists = true;\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "    if (!exists){\r\n"
				+ "        constructorMap.insert(pair<string, int>(constructor, constructorCount)); \r\n"
				+ "        constructorCount++;\r\n"
				+ "    }  \r\n"
				+ "}"
				+ "\r\n"
				+ "bool eqTerms(Term* t1, Term* t2){\r\n"
				+ "    bool res = true;\r\n"
				+ "    if(t1->tag == t2->tag && t1->children.size() == t2->children.size()){\r\n"
				+ "        for (size_t i = 0; i < t1->children.size(); i++)\r\n"
				+ "        {\r\n"
				+ "            res = eqTerms(t1->children[i], t2->children[i]);\r\n"
				+ "        }\r\n"
				+ "        return res;      \r\n"
				+ "    } else {\r\n"
				+ "        return false;\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "void printTerm(Term* t) {\r\n"
				+ "    for (auto it = constructorMap.begin(); it != constructorMap.end(); ++it){ \r\n"
				+ "        if (it->second == t->tag){\r\n"
				+ "         cout << it->first ;}\r\n"
				+ "    } \r\n"
				+ "    bool isFirst = true; \r\n"
				+ "    if(!t->children.empty()){\r\n"
				+ "        cout << '(';\r\n"
				+ "        \r\n"
				+ "        for (Term* ptr : t->children)\r\n"
				+ "        {\r\n"
				+ "            if(!isFirst){\r\n"
				+ "                cout << \", \" ;        \r\n"
				+ "            } else {\r\n"
				+ "                isFirst = false;\r\n"
				+ "            }\r\n"
				+ "            printTerm(ptr);"
				+ "        }\r\n"
				+ "        cout << \")\" ;\r\n"
				+ "    }    \r\n"
				+ "} "
				+ " \r\n"
				+ "bool exists(map<string, int> constructorMap, string value){\r\n"
				+ "    for (auto it = constructorMap.begin(); it != constructorMap.end(); ++it)\r\n"
				+ "    if (it->first == value){\r\n"
				+ "         return true;\r\n"
				+ "    }     \r\n"
				+ "    return false;\r\n"
				+ "}\r\n";
		
		String main = "int main() {\r\n"
			+ body + "\r\n"
			+ "return 0;\r\n"
			+ "}\r\n";
		
		program += header;
		program += prefunction;
		program += userFunctions;
		program += main;
		
		System.out.println(program);
		
		FileUtil.generateFile("01", program);
	}
	
	private static String getNameFunction(Integer varFun) {
	    for (Entry<String, Integer> entry : funMap.entrySet()) {
	        if (Objects.equals(varFun, entry.getValue())) {
	            return entry.getKey();
	        }
	    }
	    return null;
	}

	private static String generateDeclarations(JSONArray ast) {
		String result = "";
		JSONArray declarations = ast.getJSONArray(1);
		for(int i = 0; i < declarations.length(); i++)
		{
			JSONArray array = declarations.getJSONArray(i);
			String op = array.getString(0);
			if(op.equals("fun")) {
				String id = array.getString(1);
				functions += "addFunction(\"" + id + "\");";
				funMap.put(id, funCount);
				Integer varFun = funCount;
				funCount++;
				JSONArray signature = array.getJSONArray(2);
				JSONArray pre = array.getJSONArray(3);
				JSONArray post = array.getJSONArray(4);
				JSONArray rules = array.getJSONArray(5);
				int arity = getArity(signature);
				String signatureProcessed = makeSignature(arity);
				String params = makeParams(arity);
				result += "void pre_" + varFun + "(" + signatureProcessed + ") {\r\n"
						+ makePreCondition(pre, varFun)
						+ "}\r\n"
						+ "void post_" + varFun + "(" + signatureProcessed + (signatureProcessed.isEmpty() ? "" : ", ") + "Term* res) {\r\n"
						+ makePostCondition(post, varFun)
						+ "}\r\n"
						+ "Term* f_" + varFun + "(" + signatureProcessed + ") {\r\n" 
						+ "pre_" + varFun + "(" + params + ");\r\n";
				String postString = "post_" + varFun + "(" + params + (signatureProcessed.isEmpty() ? "" : ", ") + "res);\r\n";
				result += makeRules(rules, arity, params, postString);		
//			    result += postString + "}\r\n";
//			    		+ "return res;\r\n\"";
				
			}
		}
		
		return result;
		
	}

	private static String makePreCondition(JSONArray pre, Integer varFun) {
		String result = "";
		
		JSONArray ruleArray = pre.getJSONArray(1);
		if(ruleArray.length() >  1) { // solo contiene true 
			String rule = "";
			rule += "eqTerms(" ;
			String var1 = "c_" + (consCount);
			rule += var1 + ", "; 
			result += compileCons(ruleArray.getJSONArray(1), null, null);
			String var2 = "c_" + (consCount);
			rule += var2 + ")"; 
			result += compileCons(ruleArray.getJSONArray(2), null, null);
			
			result += "if (!("
					+ rule
					+ ")) {\r\n"
					+ "cout << \"pre(" + getNameFunction(varFun) + ") failed\";\r\n"
					+ "exit(1);\r\n"
					+ "}\r\n";
		}
		
		return result;
	}
	
	private static String makePostCondition(JSONArray post, Integer varFun) {
		String result = "";
		
		JSONArray ruleArray = post.getJSONArray(1);
		if(ruleArray.length() >  1) { // solo contiene true
			String rule = "";
			rule += "eqTerms(" ;
			String var1 = "c_" + (consCount);
			rule += var1 + ", "; 
			result += compileCons(ruleArray.getJSONArray(1), null, null);
			String var2 = "c_" + (consCount);
			rule += var2 + ")"; 
			result += compileCons(ruleArray.getJSONArray(2), null, null);
	
			result += "if (!("
					+ rule
					+ ")) {\r\n"
					+ "cout << \"post(" + getNameFunction(varFun) + ") failed\";\r\n"
					+ "exit(1);\r\n"
					+ "}\r\n";
		} 
		
		return result;
	}

	private static int getArity(JSONArray signature) {
		return signature.getJSONArray(1).length();
	}
	
	private static String makeParams(int arity) {
		String result = "";
		boolean isFirst = true;
		
		for (int i = 0; i < arity; i++) {
			if(isFirst) {
				result += "x_" + i;
				isFirst = false;
			} else {
				result += ", x_" + i;
			}
		}
		
		return result;
	}

	private static String makeRules(JSONArray rules, int arity, String params, String postString) {
		String result = "";
		if(!rules.isEmpty()) {
			if(arity == 0) {
				JSONArray rule = rules.getJSONArray(0);
				String var = "c_" + consCount;
				result += getEqualExpr(rule.getJSONArray(2), false);
				result += "Term* res = " + var + ";\r\n"
						+ postString
						+ "return res;}\r\n";
			} else if(arity > 0){
				for (int i = 0; i < rules.length(); i++) {
					JSONArray rule = rules.getJSONArray(i);
					boolean isFirst = true;
					List<String> constructors = new ArrayList<String>();
					for (int j = 0; j < rule.getJSONArray(1).length(); j++) {
						String var = "c_" + (consCount);
						constructors.add(var);
						result += compileCons(rule.getJSONArray(1).getJSONArray(j), null, null);
					}
					result += "if("; 
					for (int j = 0; j < arity; j++) {
						if(isFirst) {
							isFirst = false;
							result += "eqTerms(x_" + j + "," + constructors.get(j) +  ")";
						} else {
							result += " && eqTerms(x_" + j + "," + constructors.get(j) +  ")";
						}
					} 
					result += ") {\r\n";
					String varRes = "c_" + consCount;
					result += getEqualExpr(rule.getJSONArray(2), false);
					result += "Term* res = " + varRes + ";\r\n"
							+ postString 
							+ "return res;\r\n"
							+ "}\r\n";
				}
				result += "}\r\n";
			}
		}
		return result;
	}

	private static String makeSignature(int arity) {
		String result = "";
		boolean isFirst = true;
		
		for (int i = 0; i < arity; i++) {
			if(isFirst) {
				result += "Term* x_" + i;
				isFirst = false;
			} else {
				result += ", Term* x_" + i;
			}
		}
		
		return result;
	}

	private static String generateChecks(JSONArray ast) {
		String result = "";
		JSONArray checks = ast.getJSONArray(2);
		for(int i = 0; i < checks.length(); i++)
		{
		      JSONArray list = checks.getJSONArray(i);
				String operation = list.getString(0);
				
				if(operation.equals("print")) {
					System.out.println("es print");
					JSONArray expr = list.getJSONArray(1);
					//eq cons cons
					String op = expr.getString(0);
					if(op.equals("equal")) {
						JSONArray first = expr.getJSONArray(1);
						result += getEqualExpr(first, true);
					}
				} else {
					System.out.println("es otra cosa");
				}
		}
		
		result += "cout << endl;";
		return result;
		
	}

	private static String getEqualExpr(JSONArray first, boolean canPrint) {
		String result = "";
//		JSONArray first = expr.getJSONArray(1);
		if(first.getString(0).equals("cons")) {
			String var = "c_" + (consCount);
			result += compileCons(first, null, null);
			if(canPrint) {
				result += "printTerm(" + var + ");\r\n\r\n";
			}
//			consCount++;
		}else if(first.getString(0).equals("app")) {
			Character firstChar = first.getString(1).charAt(0);
			if(firstChar.isUpperCase(firstChar)) {
				String var = "c_" + consCount;
				result += compileCons(first, null, null);
				consCount++;
				if(canPrint) {
					result += "printTerm(" + var + ");\r\n";
				}
			}else {
				System.out.println("es funcion");
				// es un solo parametro por eso 0
				if(first.getJSONArray(2).isEmpty()) {
					String parameters = makeFunParameters(first.getJSONArray(2));
					result += "printTerm(f_" + funMap.get(first.getString(1)) + "(" + parameters + "));\r\n";
				}else {
					String var = ""; //"c_" + (consCount);
					JSONArray params = first.getJSONArray(2);
					boolean isFirst = true;
					for (int i = 0; i < params.length(); i++) {
						if(isFirst) {
							isFirst = false;
							var += "c_" + (consCount);
						}else {
							var += ", c_" + (consCount);
						}
						result += compileCons(params.getJSONArray(i), null, null);
						
					}
					if(canPrint) {
						result += "printTerm(f_" + funMap.get(first.getString(1)) + "(" + var + "));\r\n";
					}
				}	
			}
		}
		
		return result;
	}

	private static String makeFunParameters(JSONArray parameters) {
		String result = "";
		if(!parameters.isEmpty()) {
			
		}
		return result; 
	}

	private static String compileRecursiveCons(String var, JSONArray recursive) {
		String result = "";
		
//		JSONArray item = recursive.getJSONArray(0);
		JSONArray item = recursive.getJSONArray(0);
		Character firstChar = item.getString(1).charAt(0);
		//me fijo si son construcciones
		if(firstChar.isUpperCase(firstChar)) {
				result += compileCons(item, var, null);
				
				if(recursive.length() > 1) {
					JSONArray recursiveArray = recursive.getJSONArray(1);
					result += compileCons(recursiveArray, var, null);
				}
		}
		else {
			for (int i = 0; i < recursive.length(); i++) {
				
				item = recursive.getJSONArray(i);
				firstChar = item.getString(1).charAt(0);
				if(firstChar.isUpperCase(firstChar)) {
					result += compileCons(item, var, null);
					
					if(recursive.length() > 1) {
						JSONArray recursiveArray = recursive.getJSONArray(1);
						result += compileCons(recursiveArray, var, null);
					}
				} else {
					result += compileFun(item, var, null);
				}
				consCount++;
			}
		}
		
		return result;
	}

	private static String compileFun(JSONArray item, String parentVar, String parentTerm) {
		String result = "";
		
//		JSONArray item = recursive.getJSONArray(0);
		String var = "";
		JSONArray params = item.getJSONArray(2);
		boolean isFirst = true;
		consCount = parentTerm == null ? consCount : consCount + 1;
		for (int i = 0; i < params.length(); i++) {
			if(isFirst) {
				isFirst = false;
				var += "c_" + (consCount);
			}else {
				var += ", c_" + (consCount);
			}
			result += compileCons(params.getJSONArray(i), null, "c_" + consCount);
			
		}
		if(parentTerm != null) {
			result += "Term* " + parentTerm + " = f_" + funMap.get(item.getString(1)) + "(" + var + ");\r\n";
		}else {
			result += "Term* c_" + consCount + " = f_" + funMap.get(item.getString(1)) + "(" + var + ");\r\n";
		}
//		result += "Term* c_" + consCount + " = f_" + funMap.get(first.getString(1)) + "("  + ");\r\n";
		
		if(parentVar != null) {
			result += parentVar + "->children.push_back(c_" + consCount + ");\r\n";
		}
		
		return result;
	}

	private static String compileCons(JSONArray first, String parentVar, String parentTerm) {
		String result = "";
//		if(first.getString(0).equals("app")) {
////			result += "printTerm(f_" + funMap.get(first.getString(1)) + "(" + parameters + "));\r\n";
//			result += "printTerm(f_" + funMap.get(first.getString(1)) + "(" "));\r\n";
//		}else {
		Character firstChar = first.getString(1).charAt(0);
		if(firstChar.isUpperCase(firstChar)) {
			result += "addConstructor(\"" + first.getString(1) + "\");\r\n";
			result += "Term* c_" + consCount + " = new Term;\r\n"
					+ "   c_" + consCount + "->tag = getSecond(constructorMap, \"" + first.getString(1) + "\");\r\n"
					+ "    c_" + consCount + "->refcnt = 0;\r\n"
					+ "    incref(c_" + consCount + ");\r\n";
//				+ "    printTerm(c_" + consCount + ");\r\n"
//				+ "    decref(c_" + consCount + ");";
			
			String var = "c_" + consCount;
			if(parentVar != null) {
				result += parentVar + "->children.push_back(c_" + consCount + ");\r\n";
			}
			consCount++;
			if(!first.getJSONArray(2).isEmpty()) {
				result += compileRecursiveCons(var, first.getJSONArray(2));
			}
		}else {
			result += compileFun(first, parentVar, parentTerm);
		}
		
		return result;
	}

}
