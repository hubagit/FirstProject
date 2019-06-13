package day19_march30;

import java.util.Scanner;

public class LoopPracticeClassword {

	public static void main(String[] args) {

		// USING ABOVE CODE --> CREATE A PROGRAM
		// TO CHECK WHETHER A WORD IS PALINDROM
		// ANA --> REVERSE -- ANA
		// CIVIC --> REVERSE -- CIVIC

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = s.next();

		int count = word.length();
		String newWord = "";
		
		//in order reverse a String, we can start getting the chars and
		//reverse the order
		//by using charAt method
		//since the order is decrementing, we use --
		//in order to save the reversed word, wee need a container
		//before we reverse the word, just put empty value in container
		// while we're looping through each char, concatenate the char
		//to the variable value
		//after the loop we will have the word stored in reversed order
		while (count  > 0) {
			
			count--;
			newWord =newWord+word.charAt(count);
			//newWord += charAt(count);
			//System.out.println(newWord);
		}
		//System.out.println(newWord);
		if (word.equals(newWord)) {
			System.out.println(word + " is a Palindrom");
		} else {
			System.out.println(word + " is not a Palindrom");
		}

	}

}
