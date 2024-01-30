package Oops;

//class 1
class pen{
	String color;
	int prize;
	public void write() {
		System.out.println("i am writing");
	}
	public void displayColor() {
		System.out.println(this.color);
	}
}

//class 2
class student{
	String name;
	int rollNo;
	public void displayName() {
		System.out.println(this.name);
	}
}

public class classObject2 {
public static void main(String[] args) {
	//object 1
			pen pen1=new pen();
			pen1.color="black";
			pen1.prize=50;
			pen1.write();
			pen1.displayColor();
			
			//object 2
			student sonali=new student();
			sonali.name="sonali";
			sonali.rollNo=10;
			sonali.displayName();
	
}
	
	
		
	}

