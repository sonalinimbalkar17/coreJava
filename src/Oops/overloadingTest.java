package Oops;


public class overloadingTest {
	public void s1() {
		System.out.println("no arg method");
	}
	public void s1(int x) {
		System.out.println("int arg method");
	}
	public void s1(float f) {
		System.out.println("float arg method");
	}
	public void s1(int x ,float f) {
		System.out.println("int and float arg method");
	}
	public void s1(Object o) {
		System.out.println("object method called");
	}
	public void s1(String s) {
		System.out.println("string method called");
	}
	public void s1(StringBuffer sb) {
		System.out.println("string buffer method called");
	}

public static void main(String[] args) {
	overloadingTest test=new overloadingTest();
	test.s1();
	test.s1(100);
	test.s1(55.5f);
	test.s1(100, 5.5f);
	test.s1('s');//int arg method
	test.s1(2133545768754l);//float arg method
	test.s1(new Object());
	test.s1("String");
	test.s1(new StringBuffer("sn"));

}

}

