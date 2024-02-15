package ExceptionHandling;

public class tryCatchFinallyDemo {

	public static void main(String[] args) {
		//int num[] = { 10, 20, 30, 40 };
		//System.out.println(num[1]);// 20
		//System.out.println(num[5]);// error
		//System.out.println("hello");
		
//if an error occurs,we can use try-catch --to catch the error and execute some code to handle it
//the finally statement lets you execute code ,after try-catch

		try {
			int num[] = { 10, 20, 30, 40 };
			System.out.println(num[5]);
		} catch (Exception e) {
			System.out.println("something went wrong");
		} finally {
			System.out.println("finally error is occured");
		}

		System.out.println("hello");

	}

}
