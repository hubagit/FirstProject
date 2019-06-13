package day17_march26;

import java.util.Scanner;

public class WarmupRepl74 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String sender;
		String phoneNumber;
		String messageBody;
		int firstV = message.indexOf("<");
		int secondV = message.indexOf("[");
		int thirdV = message.indexOf("{");
		sender = message.substring(firstV + 1, message.indexOf(">"));
		phoneNumber = message.substring(secondV + 1, message.indexOf("]"));
		messageBody = message.substring(thirdV + 1, message.indexOf("}"));

		System.out.println("Sender: " + sender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Message body: " + messageBody);

	}

}
