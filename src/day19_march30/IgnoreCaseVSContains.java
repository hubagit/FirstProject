package day19_march30;

public class IgnoreCaseVSContains {

	public static void main(String[] args) {
		
		String str = "While Loop";
		
		System.out.println(str.equalsIgnoreCase("while loop"));
		System.out.println(str.equalsIgnoreCase("while"));
		System.out.println(str.contains("While"));
		System.out.println(str.contains("while"));
		
		System.out.println(str.toLowerCase().contains("while"));

	}

}
