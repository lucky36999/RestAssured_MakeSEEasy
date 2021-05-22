package JAVA_Practice.JAVA_Practice;

public class JunkChar_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		String Junk = "*&#^&645gfhg#%$^#ER3";
		//Using Regular expression[^a-z,A-Z,0-9]
		
		Junk = Junk.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(Junk);
	}

}
