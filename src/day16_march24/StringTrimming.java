package day16_march24;

public class StringTrimming {

	public static void main(String[] args) {
		
		String str = "   GOO   JAVA SPARTAN";
		System.out.println(str);
		
		//get JAVA SPARTAN from above String
		
		int IndexO = str.lastIndexOf("O");
		
		String part = str.substring(IndexO+1);
		System.out.println(part.trim());
		
		System.out.println(str.substring(IndexO+1));
		System.out.println(str.substring(IndexO+1).trim());
		//str.length.trim() ===>>>>>BAD!!!
		
		
		
		
		
		
		
		

	}

}
