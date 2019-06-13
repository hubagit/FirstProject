package day34_april27;

public class VarArgs3 {

	public static void main(String[] args) {

		// Task 4
		// create a static method sentenceBuilder
		// take string vararg words as parameter
		// return the concatenation of all the arguments user passed
		// call this method to see your result

		// Task 5
		// create a static method wordBuilder
		// take string vararg words as parameter
		// return the concatenation of last character
		// from all the words user passed
		// call this method to see your result
		System.out.println(sentenceBuilder("Mustafa", "Sungur"));

		System.out.println(wordbuilder("Mustafa", "Sungur"));
		
		System.out.println(myMethod("Ali","Veli","kirk","Dokuz","Deli"));
		
		String newWords = myMethod("Ali","Veli","kirk","Dokuz","Deli");
		System.out.println(newWords);
		
		String[] myWords = {"neyse", "o","u"};
		
		System.out.println(myMethod(myWords));

	}

	public static String sentenceBuilder(String... words) {
		String names = "";
		for (int j = 0; j < words.length; j++) {
			names += words[j] + " ";
		}
		return names;
	}

	public static String wordbuilder(String... words) {

		String names = "";
		for (int i = 0; i < words.length; i++) {
			names += words[i].charAt(words[i].length()-1);
		}
		return names;

	}

	public static String myMethod(String... names) {
		
		String myWords = "";
		
		for (int i = 0; i < names.length; i++) {
			myWords += names[i]+" ";
		}
		
		
		return myWords;
		
		
		
	}
}
