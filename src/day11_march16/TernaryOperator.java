package day11_march16;

public class TernaryOperator {

	public static void main(String[] args) {

//		int score = 98;
//		String abc = "";
//
////		if (score > 75)
////			abc = "pass";
////		else
////			abc = "fail";
//
//		abc = (score > 75) ? "pass" : "fail";
//		
//		System.out.println(abc);

		double price = 122;
		String label;

		label = (price > 100) ? "expensive" : "cheap";

		

//		int x ;
//		String quality = "good";
//		
//		x = (quality.equals("good") ) ? 100 : 0;
//		
//		System.out.println(x);

		label = (price>100) ? "expensive" :  (price>90) ? "moderate" : "cheap";
		// String label2 = (price<=100 && price>90) ? "moderate" : "cheapOrExp";
		System.out.println(label);
		
		
		
		
	}

}
