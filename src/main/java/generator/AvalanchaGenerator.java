package main.java.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

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
//				StringCases.cinco   // ok
//				StringCases.seis    // ok
				StringCases.siete
//				StringCases.ocho    // ok 
//				StringCases.nueve   // ok
//				StringCases.diez    // ok
//				"fun sum\r\n"
//				+ "  Zero   , y -> y\r\n"
//				+ "  Suc(x) , y -> Suc(sum(x, y))\r\n"
//				+ "fun mul\r\n"
//				+ "  Zero   , _ -> Zero\r\n"
//////				+ "print sum(Suc(Suc(Zero)), Zero)\r\n"
////				+ "print mul(Zero, Zero)\r\n"
//				+ "print mul(Suc(Zero), Zero)\r\n"
				);
		
		getCode(ast, "01");
	}

	static void getCode(JSONArray ast, String filename) {
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
				+ "return t1->tag == t2->tag;\r\n"
//				+ "    bool res = true;\r\n"
//				+ "    if(t1->tag == t2->tag && t1->children.size() == t2->children.size()){\r\n"
//				+ "        for (size_t i = 0; i < t1->children.size(); i++)\r\n"
//				+ "        {\r\n"
//				+ "            res = eqTerms(t1->children[i], t2->children[i]);\r\n"
//				+ "        }\r\n"
//				+ "        return res;      \r\n"
//				+ "    } else {\r\n"
//				+ "        return false;\r\n"
//				+ "    }\r\n"
				+ "}\r\n"
				+ "void printTerm(Term* t) {\r\n"
				+ "incref(t);\r\n"
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
				+ " decref(t);\r\n"
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
		
		FileUtil.generateFile(filename, program);
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
				String postString = "incref(res);\r\n"
						+ "post_" + varFun + "(" + params + (signatureProcessed.isEmpty() ? "" : ", ") + "res);\r\n";
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
			result += compileCons(null, ruleArray.getJSONArray(1), null, null);
			String var2 = "c_" + (consCount);
			rule += var2 + ")"; 
			result += compileCons(null, ruleArray.getJSONArray(2), null, null);
			
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
			result += compileCons(null, ruleArray.getJSONArray(1), null, null);
			String var2 = "c_" + (consCount);
			rule += var2 + ")"; 
			result += compileCons(null, ruleArray.getJSONArray(2), null, null);
	
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
			if(arity == 0 ){
//				if(arity == 0 || arity == 1) {
				JSONArray rule = rules.getJSONArray(0);
				String var = "c_" + consCount;
				JSONArray patterns = rule.getJSONArray(2);
				result += getEqualExpr(patterns, rule.getJSONArray(2), false);
				result += "Term* res = " + var + ";\r\n"
						+ postString
						+ "return res;}\r\n";
			} else if(arity > 0){
				for (int i = 0; i < rules.length(); i++) {
					JSONArray rule = rules.getJSONArray(i);
					boolean isFirst = true;
					List<String> constructors = new ArrayList<String>();
					for (int j = 0; j < rule.getJSONArray(1).length(); j++) {
						if(rule.getJSONArray(1).getJSONArray(j).getString(0).equals("pcons")) { // no es pvar
							String var = "c_" + (consCount);
							constructors.add(var);
							result += compileCons(null , rule.getJSONArray(1).getJSONArray(j), null, null);
						}
					}
					if(constructors.size() > 0) {// hay que hacer pattern matchear
						result += "if("; 
						for (int j = 0; j < arity; j++) {
							//busco si existe el constructor, si no existe significa que la variable fue pvar o pwild
							String constructor = findConstructor(j, constructors);
							if(j < constructors.size()) { //ya chequee todo
								
								if(constructor != null) {
									if(isFirst) {
										isFirst = false;
										result += "eqTerms(x_" + j + "," + constructor +  ")";
									} else {
										result += " && eqTerms(x_" + j + "," + constructor +  ")";
									}
								} else {
									//comparo que no sean ni pvar ni pwild
									String type = rule.getJSONArray(1).getJSONArray(j).getString(0);
									if(type.equals("pcons")) {
										if(isFirst) {
											isFirst = false;
											result += "eqTerms(x_" + j + "," + constructors.get(j) +  ")";
										} else {
											result += " && eqTerms(x_" + j + "," + constructors.get(j) +  ")";
										}
									}else if(type.equals("pvar")) {
										if(isFirst) {
											isFirst = false;
											result += "eqTerms(x_" + j + ", c_" + (consCount - 1) +  ")";
										} else {
											result += " && eqTerms(x_" + j + ", c_" + (consCount - 1) +  ")";
										}
									}
								}
							}
						} 
						result += ") {\r\n";
					}
					String varRes = null;
					String type = rule.getJSONArray(2).getString(0);
					if(type.equals("var")) {
						varRes = getVar(rule.getJSONArray(1), rule.getJSONArray(2).getString(1), rule.getJSONArray(1));
					} else if(type.equals("app")){ // chequear que aca sea app
						varRes = "c_" + consCount;
						
//						varRes = "Term* c_" + consCount + " = f_" + funMap.get(rule.getJSONArray(2).getString(1)) + "(" + "x_1, c_9" + ")";
//						consCount++;
					} else {
						varRes = "c_" + consCount;
					}
					result += getEqualExpr(rule.getJSONArray(1), rule.getJSONArray(2), false);
					if(type.equals("app")){
						consCount++;
						varRes = "c_" + consCount;
//						String params = "x_1, c_9";
						String parameters = getParams(varRes, rule.getJSONArray(2).getJSONArray(2), rule.getJSONArray(1));
						result += "Term* c_" + consCount + " = f_" + funMap.get(rule.getJSONArray(2).getString(1)) + "(" + parameters + ");\r\n";
					}
					result += "Term* res = " + varRes + ";\r\n"
							+ postString 
							+ "return res;\r\n";
					if(constructors.size() > 0) {// hay que hacer pattern matchear	
							result += "}\r\n";
					}			
				}
				result += "}\r\n";
			}
		}
		return result;
	}

	private static String getParams(String varRes, JSONArray params, JSONArray patterns) {
		String var = "";
		boolean isFirst = false;
		//TODO: buscar entre reglas y patrones a cual corresponde 
		for (int i = 0; i < params.length(); i++) {
			JSONArray param = params.getJSONArray(i);
			if(param.getString(1).equals("var")) {
				for (int j = 0; j < patterns.length(); j++) {
					JSONArray pattern = patterns.getJSONArray(j);
					if(pattern.getString(0).equals("pvar")) {
						if(pattern.getString(1).equals(param.getString(1))) {
							if(isFirst) {
								isFirst = true;
								var = "x_" + j;
							}else {
								var = ", x_" + j;
							}
						}
					} else { //es pcons
						
					}
				}
			}else { // app
				if(isFirst) {
					isFirst = true;
					var = "" + (consCount - 1);
				}else {
					var = ", " + (consCount - 1);
				}
			}
		}
		var = "x_1, c_9";
		return var;
	}

	private static String findConstructor(int index, List<String> constructors) {
		for(String constructor : constructors) {
			if(constructor.equals("c_" + index)) {
				return constructor;
			}
		}
		return null;
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
						result += getEqualExpr(null, first, true);
					}
				} else {
					System.out.println("es otra cosa");
				}
		}
		
		result += "cout << endl;";
		return result;
		
	}

	private static String getEqualExpr(JSONArray patterns, JSONArray first, boolean canPrint) {
		String result = "";
//		JSONArray first = expr.getJSONArray(1);
		if(first.getString(0).equals("cons")) {
			String var = "c_" + (consCount);
			result += compileCons(patterns, first, null, null);
			if(canPrint) {
				result += "printTerm(" + var + ");\r\n\r\n";
			}
//			consCount++;
		}else if(first.getString(0).equals("app")) {
			Character firstChar = first.getString(1).charAt(0);
			if(firstChar.isUpperCase(firstChar)) {
				String var = "c_" + consCount;
				result += compileCons(patterns, first, null, null);
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
						result += compileCons(patterns, params.getJSONArray(i), null, null);
						
					}
					if(canPrint) {
						if(first.getJSONArray(2).getJSONArray(0).getString(0).equals("app")) {
							String child = "c_" + consCount;
							consCount++;
							result += "Term* c_" + consCount + " = f_" + funMap.get(first.getString(1)) + "(" + child + ");\r\n";
							result += "printTerm(c_" + consCount + ");\r\n";
						}else {
							result += "printTerm(f_" + funMap.get(first.getString(1)) + "(" + var + "));\r\n";
						}
						consCount++;
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

	private static String compileRecursiveCons(String var, JSONArray patterns, JSONArray recursive) {
		String result = "";
		
		JSONArray item = recursive.getJSONArray(0);
		Character firstChar = item.getString(1).charAt(0);
		//me fijo si son construcciones
		if(firstChar.isUpperCase(firstChar)) {
				result += compileCons(patterns, item, var, null);
				
				if(recursive.length() > 1) {
					JSONArray recursiveArray = recursive.getJSONArray(1);
					result += compileCons(patterns, recursiveArray, var, null);
				}
		}
		else {
			for (int i = 0; i < recursive.length(); i++) {
				
				item = recursive.getJSONArray(i);
				firstChar = item.getString(1).charAt(0);
				if(firstChar.isUpperCase(firstChar)) {
					result += compileCons(patterns, item, var, null);
					
					if(recursive.length() > 1) {
						JSONArray recursiveArray = recursive.getJSONArray(1);
						result += compileCons(patterns, recursiveArray, var, null);
					}
				} else {
					if(item.getString(0).equals("var")) {
						result += var + "->children.push_back(" + getVar(patterns, item.getString(1), recursive) + ");\r\n";
					}else {
						String constructor = item.getString(0);
						if(constructor.equals("pcons") || constructor.equals("app")) {
							result += compileFun(patterns, item, var, null);
						}
					}
				}
				consCount++;
			}
		}
		
		return result;
	}

	private static String getVar(JSONArray patterns, String var, JSONArray recursive) {
		String result = null;
		
		//para construcciones. TODO verificar que sirva en general para sacar el segundo for
		for(int i = 0; i < patterns.length(); i++) {
			JSONArray expr = patterns.getJSONArray(i);
			if(expr.getString(0).equals("pcons")) {
				JSONArray children = expr.getJSONArray(2); 
				for (int j = 0; j < children.length(); j++) {
					JSONArray child = children.getJSONArray(j);
					if(child.getString(0).equals("pvar")) {
						if(child.getString(1).equals(var)) {
							return "x_" + i + "->children[" + j + "]";
						}
					}
				}
			} else {
				if(expr.getString(0).equals("pvar")) {
					if(expr.getString(1).equals(var)) {
						return "x_" + i;
					}
				}
			}
		}
		
		// para variables concretas
		for (int i = 0; i < recursive.length(); i++) {
			if(recursive.getJSONArray(i).length() > 1) { // significa que no es pwild
				if(var.equals(recursive.getJSONArray(i).getString(1))) {
					return "x_" + i;
				}
			}	
		}
		
		return result; 
	}

	private static String compileFun(JSONArray patterns, JSONArray item, String parentVar, String parentTerm) {
		String result = "";
		
		String var = "";
		if(item.length() > 2) {
			JSONArray params = item.getJSONArray(2);
			boolean isFirst = true;
			consCount = parentTerm == null ? consCount : consCount + 1;
			for (int i = 0; i < params.length(); i++) {
				JSONArray param = params.getJSONArray(i);
				if(patterns == null) {
					if(isFirst) {
						isFirst = false;
						var += "c_" + (consCount);
					}else {
						var += ", c_" + (consCount);
					}
				}else {
//					Term* c_9 = f_1(x_0->children[0], x_1);
//					Term* c_10 = f_0(x_1, c_9);  
					for (int j = 0; j < patterns.length(); j++) {
						JSONArray expr = patterns.getJSONArray(i);
						boolean encontre = false;
						if(expr.getString(0).equals("pvar")) {
							if(expr.getString(1).equals(param.getString(1))) {
								if(isFirst) {
									isFirst = false;
									var += "x_" + i;
									encontre = true;
								}else {
									encontre = true;
									var += ", x_" + i;
								}
							}
						}else {//pcons o pwild
							if(expr.getString(0).equals("pcons")) {
								JSONArray children = expr.getJSONArray(2); 
								for (int k = 0; k < children.length(); k++) {
									JSONArray child = children.getJSONArray(k);
									if(child.getString(0).equals("pvar")) {
										if(child.getString(1).equals(param.getString(1))) {
											if(isFirst) {
												isFirst = false;
												var += "x_" + j + "->children[" + k + "]";
												encontre = true;
											}else {
												encontre = true;
												var += ", x_" + j + "->children[" + k + "]";
											}
										}
									}
								}
							}
						}
						if(encontre) {
							break;
						}
					}
				}
				
				result += compileCons(null, param, null, "c_" + consCount);
				
			}
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

    // si patterns es null no necesita patterns
	private static String compileCons(JSONArray patterns, JSONArray first, String parentVar, String parentTerm) {
		String result = "";
//		if(first.getString(0).equals("app")) {
////			result += "printTerm(f_" + funMap.get(first.getString(1)) + "(" + parameters + "));\r\n";
//			result += "printTerm(f_" + funMap.get(first.getString(1)) + "(" "));\r\n";
//		}else {
		if(first.length() == 1) {
			return result;
		}
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
				result += compileRecursiveCons(var, patterns, first.getJSONArray(2));
			}
		}else {
			if(first.getString(0).equals("pvar") || first.getString(0).equals("var")) {
//				System.out.println("es p var");
//				result += "x";
			}else {
				result += compileFun(patterns, first, parentVar, parentTerm);
			}
		}
		
		return result;
	}

}
