package string;

public class diffStringStringBufferStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string
		String p1 = "hello";
		p1.concat("sonali");
		System.out.println(p1);// hello---immutable,cannot change original value

		// StringBuffer
		StringBuffer p2 = new StringBuffer("hello");
		p2.append("sonali");
		System.out.println(p2);// hellosonali---mutable ,we can change original value

		// StringBuilder
		StringBuilder p3 = new StringBuilder("hello");
		p3.append("sonali");
		System.out.println(p3);// hellosonali---mutable, we can change original value
	}

}
