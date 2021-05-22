package JAVA_Practice.JAVA_Practice;

public class Duplicate_Elements_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = {"java","ruby","c","python","java","javaScript","c"};
		
		//Compare each element
		
		for (int i=0;i<names.length; i++) {
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate elements : " + names[i]);
				}
			}
		}
		
		
		
	}
}