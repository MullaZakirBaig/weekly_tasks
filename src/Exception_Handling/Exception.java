package Exception_Handling;

import java.lang.*;

public class Exception {

	// Null pointer Exception--------------
	private static void E1() {
		String s = null;

		System.out.println(s.length());
	}

	// Arithmetic Exception--------------
	private static void E2() {
		int x = 10;
		int y = 0;

		System.out.println(x / y);
	}

	// Array Index Out Of Bounds Exception--------------
	private static void E3() {
		int x[] = { 10, 12, 12, 23, 34 };

		System.out.println(x[7]);
	}

	// Number Format Exception --------------
	public static void E4() {
		String s = "zakir";
		int x = Integer.parseInt(s);
		int p = 10 + x;
		System.out.println(p);
	}
	
	public void raju(String str) {
		int y = Integer.parseInt(str);
		int l = 10+y;
		System.out.println(l);
	}

	public static void main(String[] args) {

		// E1();
		// E2();
		// E3();
		// E4();
		
		Exception exc = new Exception();
		exc.raju("dd");

	}

}
