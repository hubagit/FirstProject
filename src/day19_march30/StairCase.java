package day19_march30;

public class StairCase {

	public static void main(String[] args) {

		String star = "*";

		// use while loop to generate
		// *
		// **
		// ***
		// ****
		// *****

		int x = 0;
		while (x < 5) {
			System.out.println(star);
			star += "*";
			x++;

		}

//		int x = 0;
//		String allStar = "";
//		while (x < 5) {
//			allStar = allStar + star;
//			System.out.println(allStar);
//			x++;
//
//		}

		// System.out.println("number of starts: "+allStar);

		

		

	}

}
