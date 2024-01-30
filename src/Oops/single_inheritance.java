package Oops;

public class single_inheritance {
	public static void main(String[] args) {
		TeacherZ sahil=new TeacherZ("sahil","nimbalkar",20,40000);
		sahil.displaySalary();
		sahil.university();
		System.out.println(sahil.firstName);
		System.out.println(sahil.lastName);
		System.out.println(sahil.rollNo);
		
		TeacherZ megha=new TeacherZ("megha","raut",10,30000);
		megha.displaySalary();
		megha.university();
		System.out.println(megha.firstName);

	}

}

class StudentZ {
	String firstName;
	String lastName;
	int rollNo;

	public StudentZ(String fn, String ln, int rn) {
		this.firstName = fn;
		this.lastName = ln;
		this.rollNo = rn;
	}

	public void university() {
		System.out.println("bamu university");
	}

}

class TeacherZ extends StudentZ {
	int salary;

	public TeacherZ(String fn, String ln, int rn, int sal) {
		super(fn, ln, rn);
		this.salary = sal;
	}

	public void displaySalary() {
		System.out.println(this.salary);
	}

}
