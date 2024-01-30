package Oops;

public class hierarchical_inheritance {
	public static void main(String[] args) {
		
		
		
		SonA sai=new SonA("nirmala","nimbalkar","sai");
		sai.displayMName();
		sai.displaySName();
		System.out.println(sai.firstName);
		System.out.println(sai.lastName);
		System.out.println(sai.sName);
		
		Daughter disha=new Daughter("nirmala","nimbalkar","disha");
		disha.displayMName();
		disha.displayDName();
		System.out.println(disha.firstName);
		System.out.println(disha.lastName);
		System.out.println(disha.dName);


	}

}
class mother{
	String firstName;
	String lastName;
	
	public mother(String fn,String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	public void displayMName() {
		System.out.println(this.firstName+this.lastName);
	}
}

class SonA extends mother{
	String sName;
	public SonA(String fn,String ln,String sn) {
		super(fn,ln);
		this.sName=sn;
	}
	public void displaySName() {
		System.out.println(this.sName+this.lastName);
	}
}

class Daughter extends mother{
	String dName;
	public Daughter(String fn,String ln,String dn) {
		super(fn,ln);
		this.dName=dn;
	}
	public void displayDName() {
		System.out.println(this.dName+this.firstName);
	}
}
