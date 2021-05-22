package JAVA_Practice.JAVA_Practice;

public class Missing_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,6,7,8};
		
		int sum = 0;
		for (int i=0; i<a.length;i++) {
			sum = sum + a [i];
		}
		System.out.println(sum);
		int sum1 = 0;
		for (int j=1; j<=a.length+1; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println( "Missing Num is" + (sum1-sum));
	}
	
	

}
