package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class day1 {

	public static int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {

		// checked exception (compile time error)
		// solve in try catch
		try {
			FileInputStream file = new FileInputStream("E://MyFile.txt");
		} catch (FileNotFoundException ex) {
			System.out.println(ex + "file is not present...");
		}

		// unchecked exception (run time error)
		try {
			String s = null;
			System.out.println(s.length());// null pointer exception
		} catch (NullPointerException ep) {
			System.out.println(ep);
		}

		System.out.println("my code begins...!");
		// handling Exception error with try catch block
		int res = 0;
		try {
			res = divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println(e);// java.lang.ArithmeticException: / by zero
			System.out.println("please enter correct values..");

		}
		System.out.println(res);// 0

		System.out.println("my code ends..!");

	}
}
