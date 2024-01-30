package string;

public class reverseString {

	public static void main(String[] args) {

		//logic base----most imp
		//Approach 1-----length(),charAt()
		
		String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is:"+rev);
		
		
		//Approach 2-----without using string method
		
		String s1="selenium";
		String reve="";
		//convert string to array use toCharArray() method
		char a[]=s1.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			reve=reve+a[i];
		}
		System.out.println("reverse string is:"+reve);
		
		//Approach 3------using StringBuffer class
		
		StringBuffer sb=new StringBuffer("welcome");
		System.out.println("reverse string is:"+sb.reverse());
		
		//Approach 4---using StringBuilder class
		StringBuilder SB=new StringBuilder("selenium");
		System.out.println("reverse string is:"+SB.reverse());
		

		
		
	}

}
