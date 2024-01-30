package string;

import java.util.Arrays;

public class string {

	public static void main(String[] args) {

		//string is immutable---we can not change
		//methods of string
		//there are two ways define string
		String s1="welcome";
		String s2=new String("welcome");//object of string
		System.out.println(s1);//welcome
		System.out.println(s2);//welcome
		
		//length---returns length of string(no of characters)
		String s="welcome";
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		//concat---joining strings
		String ss1="welcome";
		String ss2="to java";
		System.out.println(ss1+ss2);
		System.out.println(ss1.concat(ss2));
		System.out.println("welcome".concat("to java"));
		// 3 string concat
		String a1="hey";
		String a2="am";
		String a3="sonali";
		System.out.println(a1+a2+a3);
		System.out.println(a1.concat(a2).concat(a3));
		System.out.println(a1.concat(a2+a3));
		System.out.println("hey".concat("am").concat("sonali"));
		
		//charAt----return character in given index
		String a="welcome";
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(3));
		
		//contains---return true/false
		//check string is part of main string
		System.out.println(a.contains("wel"));
		System.out.println(a.contains("come"));
		System.out.println(a.contains("Wel"));
		System.out.println(a.contains("wele"));
		
		//trim---remove space right and left
		String b1="  hello  ";
		System.out.println(b1.length());//9
		System.out.println(b1.trim().length());//5
		
		//equals , equalsIgnored----compare string
		String p1="mumbai";
		String p2="mumbai";
		System.out.println(p1==p2);//comparison operator
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("mumbai"));
		System.out.println(p1.equals("Mumbai"));
		System.out.println(p1.equalsIgnoreCase("Mumbai"));
		
		//replace---replace single/multiple(sequence) of character in a string
		String d="i am learning java,java is a programing lanugage";
		System.out.println(d.replace("a", "A"));
		System.out.println(d.replace("java","python"));
		
		//substring----extract substring from the main string
		//starting index - 0
		//ending index - 1
		String q="selenium";
		System.out.println(q.substring(1));//elenium
		System.out.println(q.substring(1, 4));//ele
		
		//toUpperCase
		System.out.println(q.toUpperCase());
		
		//toLowerCase
		String q1="Java";
		System.out.println(q1.toLowerCase());
		
		//split---split the string into multiple parts based on delimeter
		String x="abc@gmail.com";
		String h[]=x.split("@");
		System.out.println(h[0]);//abc
		System.out.println(h[1]);//gmail.com
		System.out.println(Arrays.toString(h));//[abc, gmail.com]
		
		
		



		
		
		
		
		

		
		

	
		
		
		
		
		

	}

}
