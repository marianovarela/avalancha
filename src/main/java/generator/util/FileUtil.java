package main.java.generator.util;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	public static void generateFile(String filename, String content) {
		try {
			FileWriter myWriter = new FileWriter(filename + ".cpp");
	        myWriter.write(content);
	        myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
