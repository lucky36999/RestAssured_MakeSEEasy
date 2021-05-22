package JAVA_Practice.JAVA_Practice;

public class Largest_Smallest_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {5, 7, 90, 87, -50, 99, -10,998,-9};
		int larget = num[0];
		int smallest = num[0];
		for(int i = 1; i<num.length;i++) {
			
			if(num[i]> larget) {
				larget = num[i];
				
			}
			
			else if (num[i]<smallest) {
				smallest = num[i];
				
			}
		}
		
	System.out.println("Largest num : " +larget);
	System.out.println("Smallest num : "+ smallest );

	}
}