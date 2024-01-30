package array;

public class twoDimensionalArray {

	public static void main(String[] args) {

		// declaring in array
		// approach 1
		// []--row []--coloum

		// int [][]a=new int[3][2];
		// int[]a[]=new int[3][2];

		int a[][] = new int[3][2];

		// approach 2
		int b[][] = { { 100, 200 },
				{ 300, 400 }, 
				{ 500, 600 } };

		// add values in array approach 1
		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		// size in array
		System.out.println("length of rows " + a.length);// 3
		System.out.println("length of colum " + a[0].length);// 2

		// read single value of array
		System.out.println(a[1][0]);// 300
		System.out.println(a[2][1]);// 600

		// read multiple value from array
		// normal for loop
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 2; c++) {
				System.out.println(a[r][c]);
			}
		}

		// for each loop
		for (int arr[] : a) {
			for (int x : arr) {
				System.out.println(x);
			}
		}

	}

}
