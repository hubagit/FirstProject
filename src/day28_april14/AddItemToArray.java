package day28_april14;

import java.util.Arrays;
import java.util.Scanner;

public class AddItemToArray {

	public static void main(String[] args) {

		// CREATE A PROGRAM TO ADD ITEMS TO AN ARRAY BY USERS INPUT
		// {1,23,4,5,6} ,17 ---> {{1,23,4,5,6,17}
		
		String[] words = { "coding", "start", "to", "Day", "Perfect", "Sunday" };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word to be added: ");
		String usersWord = scan.next();

		String[] newWords = Arrays.copyOf(words, words.length + 1);
		//System.out.println(Arrays.toString(newWords));

		int lastSpotIndex = newWords.length - 1;
		newWords[lastSpotIndex] = usersWord;
		System.out.println(Arrays.toString(newWords));

	}

}
