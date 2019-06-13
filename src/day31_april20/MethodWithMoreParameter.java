package day31_april20;

public class MethodWithMoreParameter {

	public static void main(String[] args) {

		// create a static method called login 
		/* 
		 * it returns nothing
		 * It takes 3 parameters : 
		 * 		user as String , password as String, 
		 * 		rememberMe as boolean
		 * inside body 
		 * 		You entered username : ----
		 * 		You entered password : ----
		 * 		print you checked remeberMe checkbox if it's true 
		 * 		print you did not check remeberMe checkbox if it's false
		 * */
		login("spartan", "s300", true);
		
		System.out.println("==========1==========");
		
		login("horse", "h300", false);
		
		System.out.println("==========2==========");
		
		String user = "abc";
		String pass = "efg";
		boolean isChecked = false;
		login(user, pass, isChecked);

	}

	public static void login(String user, String password, boolean rememberMe) {

		System.out.println("You entered username: " + user);
		System.out.println("You entered password: " + password);
		if (rememberMe==true) {
			System.out.println("You checked rememberMe checkbox");
		} else {
			System.out.println("You didn't check rememberMe checkbox");
		}
	}

}
