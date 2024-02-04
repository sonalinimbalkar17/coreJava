package Oops;

//class in employee
//class---->collection of variable and object , blue print of object
public class Employee {

	//variables
	int id;
	String name;
	String job;
	int salary;
	
	//methods
	void display(){ //void is not a return type
		System.out.println(id);
		System.out.println(name);
		System.out.println(job);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		//object
		//object create only main method
		Employee emp1=new Employee();
		emp1.id=100;
		emp1.name="sonali";
		emp1.job="testing";
		emp1.salary=30000;
		emp1.display();
		System.out.println(emp1.name);
		
		Employee emp2=new Employee();
		emp2.id=101;
		emp2.name="aarti";
		emp2.job="manager";
		emp2.salary=40000;
		emp2.display();
		
		
	}
}
