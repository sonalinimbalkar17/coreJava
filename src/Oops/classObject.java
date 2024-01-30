package Oops;

public class classObject {

	public static void main(String[] args) {
		// object----extends in class
		Friends shweta = new Friends();
		shweta.displayCity();//pune
		System.out.println(shweta.name);
		
		
		Friend kalyani=new Friend("kalyani","mumbai");
		kalyani.displayName();
		System.out.println(kalyani.city);

	}

}

//class ----blueprint of object
class Friends {
	String name = "shweta";
	String city = "pune";

	public void displayCity() {
		System.out.println(this.city);
	}

}

//class with constructor
class Friend{
	String name;
	String city;
	
	public Friend(String n,String c) {
		this.name=n;
		this.city=c;
	}
	public void displayName(){
		System.out.println(this.name);
	}
}