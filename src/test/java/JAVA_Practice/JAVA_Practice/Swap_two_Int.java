package JAVA_Practice.JAVA_Practice;

public class Swap_two_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using third variable
		
		int x = 5;
		int y = 10;
		/*int z;
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("x value is "+x);
		System.out.println("x value is "+y);*/
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("x value is "+x);
		System.out.println("x value is "+y);
		
		
	}

}
