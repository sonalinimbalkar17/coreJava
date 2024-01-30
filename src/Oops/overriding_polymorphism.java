package Oops;

public class overriding_polymorphism {
	public static void main(String[] args) {

		IDBI idbi=new IDBI();
		idbi.loan();
		
		SBI sbi=new SBI();
		sbi.loan();
	}
}

class bankOfIndia {
	public void loan() {
		System.out.println("i am loan in bank of india");
	}
}

class IDBI extends bankOfIndia {
	public void loan() {
		System.out.println("i am loan in idbi");
	}
}

class SBI extends bankOfIndia {
	public void loan() {
		System.out.println("i am loan in sbi");
	}
}
