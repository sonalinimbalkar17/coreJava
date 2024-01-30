package coreJava;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// there are three ways of looping
		// 1.for loop
		// 2.while loop
		// 3.do while loop

		// 1.for loop
		// for loop syntax
		// for(intialization;conditionChack;increment/decrement){
		// statements
		// }

		// printing 1 to 10 numbers
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// 2.while loop

		// printing 1 to 10 numbers
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		 //Printing the list of first 10 even numbers 
	    int a=0;
	    while(a<=10) {
	    	System.out.println(a);
	    	a=a+2;
	    }


		// 3.do while loop
		// syntax
//		do {
//		    // Statements
//		}
//		while(conditions)
		
		// printing 1 to 10 numbers
		 int j=1;    
		    do{    
		        System.out.println(j);    
		    j++;    
		    }while(j<=10);    
		    
		    //program 1
//		    int k=0;
//		    do {
//		    	System.out.println("java");//multiple time print java
//		    }
//		    while(true);
		    
		    //program 2
		    int k=0;
		    do {
		    	System.out.println("java");//one time print java
		    }
		    while(false);
		  
		     
		   		}    

	}


