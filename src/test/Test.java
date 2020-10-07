package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import main.java.AvalanchaRunner;

public class Test {

	@org.junit.jupiter.api.Test
	void test0() throws IOException {		
		String content = getContent("src/test/resources/test00.input");
		String expected = getContent("src/test/resources/test00.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test1() throws IOException {		
		String content = getContent("src/test/resources/test01.input");
		String expected = getContent("src/test/resources/test01.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test2() throws IOException {		
		String content = getContent("src/test/resources/test02.input");
		String expected = getContent("src/test/resources/test02.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test3() throws IOException {		
		String content = getContent("src/test/resources/test03.input");
		String expected = getContent("src/test/resources/test03.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}

	@org.junit.jupiter.api.Test
	void test4() throws IOException {		
		String content = getContent("src/test/resources/test04.input");
		String expected = getContent("src/test/resources/test04.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test5() throws IOException {		
		String content = getContent("src/test/resources/test05.input");
		String expected = getContent("src/test/resources/test05.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test6() throws IOException {		
		String content = getContent("src/test/resources/test06.input");
		String expected = getContent("src/test/resources/test06.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test7() throws IOException {		
		String content = getContent("src/test/resources/test07.input");
		String expected = getContent("src/test/resources/test07.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test8() throws IOException {		
		String content = getContent("src/test/resources/test08.input");
		String expected = getContent("src/test/resources/test08.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test9() throws IOException {		
		String content = getContent("src/test/resources/test09.input");
		String expected = getContent("src/test/resources/test09.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test10() throws IOException {		
		String content = getContent("src/test/resources/test10.input");
		String expected = getContent("src/test/resources/test10.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	@org.junit.jupiter.api.Test
	void test11() throws IOException {		
		String content = getContent("src/test/resources/test11.input");
		String expected = getContent("src/test/resources/test11.expected");
		System.out.println(content);
		String astResult = AvalanchaRunner.getAST(content);
		assertEquals(expected.replaceAll("\\s",""), astResult);
	}
	
	private String getContent(String path) throws FileNotFoundException, IOException {
		//pat example "src/test/resources/test00.input"
		BufferedReader reader = new BufferedReader(new FileReader(path));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		String ls = System.getProperty("line.separator");
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		// delete the last new line separator
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		reader.close();
		
		String content = stringBuilder.toString();
		return content;
	}

}
