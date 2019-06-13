package day35_april28;

public class Warmup {
	/*
     * // Warm up Create a static method called findLongestWord this method has one
     * parameter as String vararg and return the longest word as String
     */
	public static void main(String[] args) {
		System.out.println(findLongestWord("Mustafa", "Sungur", "java", "Cybertek"));

		String[] myWords = {"Ahmed","Mahmud","Muhammed","Mustafa"};
		System.out.println(findLongestWord(myWords));
		
		String longestWord = myWords[0];
		for(String eachWord:myWords) {
			if(eachWord.length()>=myWords[0].length()) {
				longestWord = eachWord;
			}
			
			
		}
	
	}
	

	public static String findLongestWord(String... words) {

		String longestWord = words[0];
		for (int i = 0; i < words.length; i++) {
			if (longestWord.length() < words[i].length())
				longestWord = words[i];

		}

		return longestWord;

	}
}
