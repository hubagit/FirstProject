package day9_march12;

public class MultiBranchIfStatIntro {

	public static void main(String[] args) {
		
		int score = 89;
		
		if (score>=90) {
			System.out.println("You got an \"A\".");
		}else if (score>=80 && score<90) {
			System.out.println("You got a \"B\".");
		}else if (score>=70 && score<80) {
			System.out.println("You got a \"C\"");
		}else {
			System.out.println("Study harder!");
		}

	}

}
