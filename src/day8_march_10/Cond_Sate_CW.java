package day8_march_10;

public class Cond_Sate_CW {

	public static void main(String[] args) {

		boolean isTimeToEndClass = true;

		boolean isTopicFinished = false;

		if (isTimeToEndClass && isTopicFinished) {
			System.out.println("Let's end the class!");
		} else {
			System.out.println("hang on tight!");
		}
		if (isTopicFinished == false) {
			System.out.println("Can we finish it in a few minutes?");
		} else {
			System.out.println("ok, we can go now!");
		}
	
	
	
	    

}

}
