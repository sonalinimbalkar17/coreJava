package coreJava;

public class even_odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 11;
		if (num % 2 == 0) {
			System.out.println("num is even");
		} else {
			System.out.println("num is odd");
		}

		// generate odd numbers which are divisible by 5 and greater than 100 and less
		// than 150
		for (int i = 0; i < 500; i++) {
			if (i > 100 && i < 150) {
				if (i % 5 == 0) {
					System.out.println("numbers divisible 5..." + i);
				}
			}
		}

		// short
		for (int i = 100; i < 150; i = i + 5) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}
