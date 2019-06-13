package day46_may18;

import java.util.ArrayList;
import java.util.Arrays;

public class SlackAction {

	public static void main(String[] args) {

		SlackUser s1 = new SlackUser();
		System.out.println(s1.toString());
		// below code same as above code for compiler
		System.out.println(s1);

		SlackUser s2 = new SlackUser("Mustafa", "mustafa@gmail.com", 123);

		ArrayList<SlackUser> users = new ArrayList<>();
		users.add(s1);
		users.add(s2);

		// users.addAll(Arrays.asList(s1,s2)); ==> how to add one shot
		
		for (SlackUser each : users) {
			System.out.println(each);
			each.sendMessage("group", "Hi everyone!");
		}

	}

}
