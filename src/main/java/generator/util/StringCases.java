package main.java.generator.util;

public class StringCases {

	public static String uno = 
	"print A\n "
			+ "print B\n"
			+ "print True\n"
			+ "print False\n"
            + 
"print Cons(Zero, Cons(Suc(Zero), Cons(Suc(Suc(Zero)), Nil)))";
	
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
	
	public static String cuatro = "\r\n"
			+ "fun and_\r\n"
			+ "  True  , True  -> True\r\n"
			+ "  True  , False -> False\r\n"
			+ "  False , True  -> False\r\n"
			+ "  False , False -> False\r\n"
			+ "\r\n"
			+ "fun or_\r\n"
			+ "  True  , True  -> True\r\n"
			+ "  True  , False -> True\r\n"
			+ "  False , True  -> True\r\n"
			+ "  False , False -> False\r\n"
			+ "\r\n"
			+ "fun siguiente\r\n"
			+ "  Norte -> Este\r\n"
			+ "  Este  -> Sur\r\n"
			+ "  Sur   -> Oeste\r\n"
			+ "  Oeste -> Norte\r\n"
			+ "\r\n"
			+ "print and_(True, True)\r\n"
			+ "print and_(True, False)\r\n"
			+ "print and_(False, True)\r\n"
			+ "print and_(False, False)\r\n"
			+ "\r\n"
			+ "print or_(True, True)\r\n"
			+ "print or_(True, False)\r\n"
			+ "print or_(False, True)\r\n"
			+ "print or_(False, False)\r\n"
			+ "\r\n"
			+ "print Q(\r\n"
			+ "        siguiente(Norte),\r\n"
			+ "        siguiente(siguiente(Norte)),\r\n"
			+ "        siguiente(siguiente(siguiente(Norte))),\r\n"
			+ "        siguiente(siguiente(siguiente(siguiente(Norte))))\r\n"
			+ "      )\r\n"
			+ "\r\n"
			+ "";
	
	public static String cinco = ""
			+ "fun sucsuc\r\n"
			+ "  x -> Suc(Suc(x))\r\n"
//			+ "\r\n"
//			+ "fun if\r\n"
//			+ "  True,  x, _ -> x\r\n"
//			+ "  False, _, y -> y\r\n"
			+ "\r\n"
			+ "print sucsuc(sucsuc(Zero))\r\n"
//			+ "print if(True, A, B)\r\n"
//			+ "print if(False, A, B)"
			; 
	
	public static String ocho = 
			"fun foo\r\n"
			+ "  ? True\r\n"
			+ "  ! True\r\n"
			+ "  -> A\r\n"
			+ "\r\n"
			+ "print foo()\r\n"
			;
	
	public static String nueve =
			"fun foo\r\n"
			+ "  ? False\r\n"
			+ "  ! True\r\n"
			+ "  -> A\r\n"
			+ "\r\n"
			+ "print foo()\r\n"
			;
	
	public static String diez =
			"\r\n"
			+ "fun foo\r\n"
			+ "  ? True\r\n"
			+ "  ! False\r\n"
			+ "  -> A\r\n"
			+ "\r\n"
			+ "print foo()\r\n"
			;
}
