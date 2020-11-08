package main.java.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AvalanchaGenerator {

	public static void main(String[] args) {
		String program = "";
	
		String header = "#include <vector>\r\n"
		+ "#include <string>\r\n"
		+ "#include <iostream>\r\n"
		+ "using namespace std;\r\n"
		+ "typedef int Tag;\r\n"
		+ "struct Term {\r\n"
		+ "Tag tag;\r\n"
		+ "vector<Term*> children;\r\n"
		+ "int refcnt;\r\n"
		+ "};\r\n";
		
		String prefunction = "void incref(Term* t) {\r\n"
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
				+ "void printTerm(Term* t) {\r\n"
				+ "    string c;\r\n"
//				+ "    $print\r\n"
				+ "}\r\n";
		
		String main = "int main() {\r\n"
			+ "printf(\"GeeeksforGeeks\");" 
			+ "return 0;\r\n"
			+ "}\r\n";
		
		program += header;
		program += prefunction;
		program += main;
		
		System.out.println(program);
		
		generateFile("01", program);
	}

	private static void generateFile(String filename, String content) {
		try {
			FileWriter myWriter = new FileWriter(filename + ".cpp");
	        myWriter.write(content);
	        myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
