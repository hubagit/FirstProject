package day9_march12;

import java.util.Scanner;

public class CW {

	public static void main(String[] args) {
		
		String RealUserName = "abc";
		String RealPassword = "123";
		String admin = "abc";
		
		System.out.println("Enter username and password: ");
		Scanner sc = new Scanner(System.in);
		
		String userName = sc.next();
		String password = sc.next();
		
		
		if (((userName.equals(RealUserName)) && (password.equals(RealPassword))) || userName.equals(admin) ) {
			System.out.println("Log-in succesful");
		}else {
			System.out.println("Log-in failed!");
		}
		  
		
		
		

	}

}
