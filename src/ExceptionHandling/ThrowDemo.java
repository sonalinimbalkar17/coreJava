package ExceptionHandling;

class MyException extends RuntimeException {
	MyException(String msg) {
		super(msg);
	}
}

public class ThrowDemo {
	public static void main(String[] args) {
		int marks = 20;
		if (marks < 30) {
			throw new MyException("Failed,ince marks< 30. Retry!");
		}
		System.out.println("hello");
	}

}
