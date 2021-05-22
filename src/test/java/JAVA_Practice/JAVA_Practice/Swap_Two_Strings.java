package JAVA_Practice.JAVA_Practice;

public class Swap_Two_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "Hello";
		String y = "world";
		String z;
		System.out.println("Before swapping a " +x);
		System.out.println("Before swapping b " +y);
		z=x;
		x=y;
		y=z;
		System.out.println("after swapping a " +x);
		System.out.println("after swapping b " +z);
	}

}
