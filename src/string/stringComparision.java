package string;

public class stringComparision {

	public static void main(String[] args) {

		// two questions(imp)
		//  == & equals()
		
		//case 1--imp
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		//case 2--imp
		String a1=new String("hello");
		String a2=new String("hello");
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1==a2);//false-----to compare the object
		System.out.println(a1.equals(a2));//true----to compare the values of object

		//case 3
		String b1="selenium";
		String b2=new String("selenium");
		System.out.println(b1==b2);//false
		System.out.println(b1.equals(b2));//true
		
		//case 4
		String c1="hey";
		String c2=new String("hey");
		String c3=c2;
		
		System.out.println(c1==c2);//false---objects are different
		System.out.println(c1.equals(c2));//true
		System.out.println(c2==c3);//true----objects are equal
		System.out.println(c2.equals(c3));//true
		System.out.println(c1==c3);//false
		System.out.println(c1.equals(c3));//true
		
		
		
		
		
		
	}

}
