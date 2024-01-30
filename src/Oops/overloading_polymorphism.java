package Oops;

public class overloading_polymorphism {
	public static void main(String[] args) {

		
		add(5,5);
		add(5,5,5);
		add(5,5,5,5);
		
		studentInfo("sonali");
		studentInfo(23);
		studentInfo(100);
	}


//example 1
public static void add(int a,int b) {
	System.out.println(a+b);
}
public static void add(int a,int b, int c) {
	System.out.println(a+b+c);
}
public static void add(int a,int b,int c,int d) {
	System.out.println(a+b+c+d);
}

//example 2
public static void studentInfo(String name) {
	System.out.println("my name");
}

public static void studentInfo(int age) {
	System.out.println("my age");
}

public static void studentInfo(boolean rollNo) {
	System.out.println("my rollNo");
}
}