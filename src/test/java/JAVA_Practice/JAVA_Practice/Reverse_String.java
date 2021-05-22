package JAVA_Practice.JAVA_Practice;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "selenium"; // String is immutable
		int len = s.length();//8
		
		String rev ="";
		
		for (int i=len-1; i>=0; i--) {
		rev = rev +	s.charAt(i);
		}
		//System.out.println(rev);
	}
	
}
