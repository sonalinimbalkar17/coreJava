package Oops;

public class multilevel_inheritance {
	public static void main(String[] args) {
		Father Dattu=new Father("shiavji","nimbalkar","Dattu");
		Dattu.address();
		System.out.println(Dattu.firstName);
		System.out.println(Dattu.lastName);
		System.out.println(Dattu.fName);
		
		
		son2 Sai=new son2("shivaji","nimbalkar","dattu","sai");
		Sai.address();
		Sai.address2();
		System.out.println(Sai.firstName);
		System.out.println(Sai.lastName);
		System.out.println(Sai.fName);
		System.out.println(Sai.sName);

		

	}

}

class grandFather {
	String firstName;
	String lastName;

	public grandFather(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void address() {
		System.out.println("vaijapur");
	}
}

class Father extends grandFather {
	String fName;

	public Father(String fn, String ln, String ffn) {
		super(fn, ln);
		this.fName = ffn;
	}

}

class son2 extends Father {
	String sName;

	public son2(String fn, String ln, String ffn, String sn) {
		super(fn, ln, ffn);
		this.sName = sn;
	}

	public void address2() {
		System.out.println("pune");
	}

}