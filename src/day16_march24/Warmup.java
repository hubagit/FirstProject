package day16_march24;

public class Warmup {

	public static void main(String[] args) {
		
		
		/*
		 * create a String variable str
		 * 
		 * assign value of -> Sunday is Java Day
		 * 
		 * 1, make it all upper case 
		 * 2, get last two characters 
		 * 3, get the position of is 
		 * 4, check whether word Java exists in this Str 
		 * OPTIONAL : 5, get the index
		 * of 3rd word(without knowing)
		 */
		            //012345678901234567
		String str = "Sunday is Java Day";
		String up = str.toUpperCase();
		int count = str.length();
		
		System.out.println(up);
		char last = str.charAt(count-1);
		char beforeLast = str.charAt(count-2);
		
		System.out.println(beforeLast+""+last);
		System.out.println(str.substring(count-2));
		
		
		System.out.println(str.indexOf("is"));
		
//		int x = str.indexOf(97);
//		System.out.println(x);
		
		System.out.println(str.contains("Java"));
		
		
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Java")>-1);
		
		
		//2nd word (without knowing)
		//"Sunday is Java day"
		
		int indexOFSpace1= str.indexOf(" ");
		System.out.println(indexOFSpace1);
		
		String word2 = str.substring(indexOFSpace1+1,indexOFSpace1+3);
		System.out.println(word2);
		
		int indexOFSpace2= str.indexOf(" ",indexOFSpace1+1);
		int indexOFSpace3= str.indexOf(" ",indexOFSpace2+1);
		String word3 = str.substring(indexOFSpace2+1,indexOFSpace3);
		
		System.out.println(word3);
		
	}

}
