package day24_april7;

public class ArrayPractice {

	public static void main(String[] args) {
		
		String names[] = {"Ahmet", "Betul", "Jovidon", "Emine","Munire"};
		
		System.out.println(names[2]);
		
		System.out.println(names[names.length-1]);
		System.out.println(names[4]);
	
		names[2] = "Mubarek";
		int count = names[2].length();
		
		System.out.println(names[2]);
	
	
	}

}
