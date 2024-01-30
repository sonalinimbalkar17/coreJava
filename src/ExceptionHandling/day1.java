package ExceptionHandling;

public class day1 {

	public static int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
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
