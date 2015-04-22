package zeszyt;

public class TypyDanych {

	public static void main(String[] args) {
		
		boolean boolVar = true;
		byte byteVar = 127;
		short shortVar = 32767;
		char charVar ='a';
		String stringVar = "Jestę Stringę";
		int intVar = 2147483647;
		long longVar = 9223372036854775807l;
		float floatVar = 3.4028235e38f;
		double doubleVar = 1.79769313486231570e+308d;
		
		System.out.printf("%d  %n", intVar);
		System.out.printf("%,.3f   %n", doubleVar);

	}
}
