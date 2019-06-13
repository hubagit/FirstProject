package day51_may26;

public class AdminUser extends SlackUser {

	/*
	 * String displayName;
	 * 
	 * int timeZone;
	 * 
	 * String status;
	 */
	int adminLevel;

	public AdminUser(String displayName, String status, int timeZone, int adminLevel) {
		super(displayName, timeZone, status);
		this.adminLevel = adminLevel;
	}

	// optional annotation to make sure
	// you are overriding it correctly
	@Override
	public void sendMessage(String message) {

		System.out.println("@channel Dear good peaople of Sparta");
		//System.out.println("<" + displayName + "> is sending <" + message + ">");
		System.out.println("asdsffafghfhlf;hm");
		System.out.println("rebellios kids");
	}

	public static void main(String[] args) {

		AdminUser a1 = new AdminUser("B11", "fully charged", 5, 1);
		a1.sendMessage("Abc");

	}

}
