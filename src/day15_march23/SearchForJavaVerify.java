package day15_march23;

public class SearchForJavaVerify {

	public static void main(String[] args) {

		// About 745,000,000 results (0.50 seconds)
		// store above String and validate
		// it starts with about, and it contains word result

		String str = "About 745,000,000 result (0.50 seconds)";

		// how to get certain part of String

//		if (str.indexOf("About") == 0){
//			System.out.println("It started with about");
//		}else {
//			System.out.println("It didn't start with about");
//		}
//		if (str.indexOf("results") >= 0) {
//			System.out.println("It contains results");
//		}else {
//			System.out.println("no results");
//		}

		if (str.substring(0, 5).equals("About") && str.contains("results")) {
			System.out.println("It passes");

		} else {
			
			if(! str.substring(0, 5).equals("About")) {
				System.out.println("about is not at the beginning");
			}else if(! str.contains("results")) {
				System.out.println("It does not contain word result");
			}
			
			System.out.println("It fails");
		}

	}

}
