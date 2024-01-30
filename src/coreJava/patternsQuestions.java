package coreJava;

public class patternsQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. print the pattern
		// solid rectangle
		// *****
		// *****
		// *****
		// *****
		// nested loop
		// outer loop
		for (int i = 1; i <= 4; i++) {
			// inner loop
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2.print the pattern
		// hollow rectangle
		// *****
		// * *
		// * *
		// *****
		int n = 4;
		int m = 5;
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}

		// 3.print the pattern
		// half pyramid
		// *
		// **
		// ***
		// ****

		int a = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 4.print the pattern
		// inverted half pyramid
		// ****
		// ***
		// **
		// *
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 5.print the pattern
		// *
		// **
		// ***
		// ****
		int x = 4;
		for (int i = 1; i <= x; i++) {
			// inner loop--space print
			for (int j = 1; j <= x - 1; j++) {
				System.out.print("");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 6.print the pattern
		// half pyramid with numbers
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5

		int y = 5;
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// 7.print the pattern
		//inverted half pyramid with numbers
		//1 2 3 4 5
		//1 2 3 4
		//1 2 3
		//1 2 
		//1
		int z=5;
		for(int i=1;i<=z;i++) {
			for(int j=1;j<=z-i+1;j++) {
				System.out.print(j+" " );
			}
			System.out.println();
		}
		
		
		//8.print the pattern
		//1 
		//2 3
		//4 5 6
		//7 8 9 10
		//11 12 13 14 15
		int aa=5;
		int number=1;
		for(int i=1;i<=aa;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
		
		//print the pattern
		//1
		//0 1
		//1 0 1
		//0 1 0 1
		//1 0 1 0 1
		
		int bb=5;
		for(int i=1;i<=bb;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum %2==0) {//even
					System.out.print("1 ");
				}
				else {//odd
					System.out.print("0 ");

				}
			}
			System.out.println();
		}



	}

}
