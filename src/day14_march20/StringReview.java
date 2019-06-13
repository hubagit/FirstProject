package day14_march20;

public class StringReview {

	public static void main(String[] args) {

		String name = "Sungur";

		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
//		//last char -->>>>>>>>
		
		int lastIndex = name.length()-1;
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.charAt(lastIndex));
//		
//		//equality -->>>>>>>>>>
		System.out.println(name.equals("Sungur"));
		System.out.println(name.equalsIgnoreCase("SUNGUR"));

		// contain or not method -->>>>>>>>>>>>>
		
		
		
		boolean containOrNot = name.contains("ur");
		System.out.println(containOrNot);

		// indexOf -->>>>>>>>>>>>>>>
		// returns the first of occurrence of the string given
		// if it does not exist it will return -1!!!!
		
		System.out.println(name.lastIndexOf("ur")); //4
		System.out.println(name.indexOf("u")); //1
		System.out.println(name.indexOf("tungur")); // -1
		System.out.println(name.indexOf("Sungur")); //0
		System.out.println(name.indexOf("sungur")); //-1

		String uName = name.toUpperCase();
		System.out.println(uName.indexOf("SUNGUR"));

		System.out.println(name.toUpperCase().indexOf("SU"));

		// System.out.println( name.length().indexOf("MA") ) ; BAD EXAMPLE!!!
		
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
	
				

				/*
				 *  length()  taking no external data 
				 *  		and returning a number 
				 *  
				 *  first character index is always 0 
				 *  last character index is always one less than 
				 *  	actual count of character 
				 *  int lastIndex	= str.length()-1
				 *  
				 *  
				 *  charAt(1)  taking 1 external data / argument
				 *  	 and returning a character 
				 *  
				 *  str.charAt(lastIndex) ; 
				 *  
				 * */


	}

}
