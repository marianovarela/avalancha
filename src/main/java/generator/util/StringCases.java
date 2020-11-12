package main.java.generator.util;

public class StringCases {

	public static String uno = "print A\n "
			+ "print B\n"
			+ "print True\n"
			+ "print False\n"
            + "print Cons(Zero, Cons(Suc(Zero), Cons(Suc(Suc(Zero)), Nil)))";
	
	public static String dos = "fun uno\r\n"
			+ "  -> Suc(Zero)\r\n"
			+ "\r\n"
			+ "fun tres\r\n"
			+ "  -> Suc(Suc(uno()))\r\n"
			+ "\r\n"
			+ "print tres()";
	
	public static String tres = "\r\n"
			+ "fun neg\r\n"
			+ "  True  -> False\r\n"
			+ "  False -> True\r\n"
			+ "\r\n"
			+ "print neg(True)\r\n"
			+ "print neg(False)\r\n";
}
