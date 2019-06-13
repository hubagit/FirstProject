package day11_march16;

public class Nestedif {

	public static void main(String[] args) {
	
		String username = "user";
		String password = "pas";

		if (username.equals("user") && password.equals("pass")) {
			System.out.println("\"login successful\"");
		}else {
			if (! username.equals("user")  ) {
				System.out.println("username not found");
			}else {
				System.out.println("password not correct");
			}
		}
		
		
	}

}
