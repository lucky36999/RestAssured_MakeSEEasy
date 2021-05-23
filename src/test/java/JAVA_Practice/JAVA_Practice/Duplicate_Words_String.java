package JAVA_Practice.JAVA_Practice;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_Words_String {

	public static void main(String[] args) {
		
		findDuplicateWords("Hey Java is Java best language is Java");
		
	}
	public static void findDuplicateWords(String inputString) {
		
		String words[] = inputString.split(" ");
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//to check the word in given array
		for(String word : words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);				
			}
			else {
				wordCount.put(word, 1);
			}
		}	
	}
}