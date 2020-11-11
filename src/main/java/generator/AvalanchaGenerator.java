package main.java.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.json.JSONArray;

import main.java.AvalanchaRunner;
import main.java.generator.util.FileUtil;

public class AvalanchaGenerator {
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	int count = 0;
	static int consCount = 0;
	
	public static void main(String[] args) {
		JSONArray ast = AvalanchaRunner.getASTToJSON(
//				"print A\n "
//				+ "print B\n"
//				+ "print True\n"
//				+ "print False\n"
//				+
"print Cons(Zero, Cons(Suc(Zero), Cons(Suc(Suc(Zero)), Nil)))");
		
		String body = generateBody(ast);
		
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
				+ "}";
		
		String main = "int main() {\r\n"
			+ body + "\r\n"
			+ "return 0;\r\n"
			+ "}\r\n";
		
		program += header;
		program += prefunction;
		program += main;
		
		System.out.println(program);
		
		FileUtil.generateFile("01", program);
	}

	private static String generateBody(JSONArray ast) {
		String result = "";
		JSONArray declarations = ast.getJSONArray(1);
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
						result += getEqualExpr(expr);
					}
				} else {
					System.out.println("es otra cosa");
				}
		}
		
		result += "cout << endl;";
		return result;
		
	}

	private static String getEqualExpr(JSONArray expr) {
		String result = "";
		JSONArray first = expr.getJSONArray(1);
		if(first.getString(0).equals("cons")) {
			result += compileCons(first, null);
			String var = "c_" + consCount;
			consCount++;
		}else if(first.getString(0).equals("app")) {
			Character firstChar = first.getString(1).charAt(0);
			if(firstChar.isUpperCase(firstChar)) {
				String var = "c_" + consCount;
				result += compileCons(first, null);
				consCount++;
				JSONArray recursive = first.getJSONArray(2); 
				result += "printTerm(" + var + ");\r\n";
			}else {
				System.out.println("es funcion");
			}
		}
		
		JSONArray second = expr.getJSONArray(2);
		return result;
	}

	private static String compileRecursiveCons(String var, JSONArray recursive) {
		String result = "";
		JSONArray item = recursive.getJSONArray(0);
		result += compileCons(item, var);
		
		if(recursive.length() > 1) {
			JSONArray recursiveArray = recursive.getJSONArray(1);
			result += compileCons(recursiveArray, var);
		}
		
		return result;
	}

	private static String compileCons(JSONArray first, String parentVar) {
		String result = "";
		result += "addConstructor(\"" + first.getString(1) + "\");\r\n"
				+ "Term* c_" + consCount + " = new Term;\r\n"
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
		
		return result;
	}

}
