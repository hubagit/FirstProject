package day20_march31;

public class Separator {

	public static void main(String[] args) {

		// java20awesome -->> javaawwsome 20

		String mix = "Aonline132x";

		char c = mix.charAt(0);

		// check whether c is between 0-9
		//if (c >= 32 && c <= 41) 
		
		if (c >= '0' && c <= '9') {
			System.out.println("Number!");

		} else {
			System.out.println("Not a number!");
		}
		if (c >= 'A' && c <= 'Z') {
			System.out.println("Uppercase!");

		} else {
			System.out.println("Not an uppercase!");
		}
	}

}
