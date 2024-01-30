package array;

public class singleDimensionalArray {

	public static void main(String[] args) {

//		arrayDefine:array is collection of elements of same data type(homogenios data).
//			syntax:
//			int a[]=new int[5]					
//			types of array:
//			1.single Dimensional array
//			2.two dimensional/multi dimenstional
		
		//1.single Dimensional array
		//declare in array
		//1st approach
		//use fixed length and not changes and add in future
		int a[]=new int[5];
		//2nd approach
		//use not fixed length and any changes in future
		int b[]= {};
		
		//add values in array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//find size on array
		System.out.println(a.length);
		
		//read single value in array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		//read multiple values from array
		//with normal for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//enhanced for loop/for each loop
		for(int x:a) {
			System.out.println(x);
		}
	

	}

}
