package day34_april27;

public class VarArgs2 {

	public static void main(String[] args) {

		System.out.println(sentenceBuilder("Mustafa", "Sungur"));
		
		//System.out.println(wordbuilder("Mustafa","Sungur"));
		
//		String dog = null;
//		System.out.println(dog.length());
		
		
		
		
		printNames("Mustafa", "Sungur", "Zuha", "Zehra", "Nurbanu");

		printNames("Zehra");
		
		printNames();
		printNames(null, "not empty", "");
		
		// we can pass as many arguemnt as possible for varArgs
		// including null for any reference
		//String[] magics = {null,null,null};
		//printNames(null); wrong!!!
	}

	public static void printNames(String... names) {

		// String[] names = (null, "not empty", ""); 
		// names are treated as String[] that has
		// whatever variable numbers of arguments from method call

		// System.out.println(names[0]); --> wrong!!!
		// System.out.println(names[3]); --> wrong!!!

		System.out.println("You passes " + names.length + " arguments");
		

		for (String string : names) {
			System.out.println(string);
		}
	}


	public static String sentenceBuilder(String... words) {
		String names = "";
		for (int j = 0; j < words.length; j++) {
			names += words[j]+" ";
		}
		return names;
	}

	public static String wordbuilder(String... words) {
		
		String names = "";
		for (int i = 0; i < words.length; i++) {
			names+=words[words[i].length()-1]+" ";
		}
		return names;
		
		
		
		
	}

}
