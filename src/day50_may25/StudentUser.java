package day50_may25;

public class StudentUser extends SlackUser {
	/*
	 * String displayName;
	 * 
	 * int timeZone;
	 * 
	 * String status;
	 */
	int groupNumber;

	public static void main(String[] args) {

//		StudentUser s1 = new StudentUser();
//		System.out.println(s1);
//		System.out.println("=============");
//		s1.changeStatus("relax");
//		System.out.println(s1);

	    StudentUser s2 = new StudentUser("Sumeyye",6,"available",26);
	    System.out.println(s2);
	    s2.sendMessage("Hello");
	    s2.changeStatus("relax");
	    System.out.println(s2.status);

	}

	public StudentUser() {
		// super();
		// SET DEFAULT VALUE FOR //displayName,timeZone,status
		/// ----- this is what we would do , if we want to do it directly
//	    this.displayName = "Spartan";
//	    this.status = "I CAN DO IT !!"; 
//	    this.timeZone = 5 ; 

		// ---- -this is how we borrowed from same class's constructor fucntionlity
//	    this("spartan", 5, "I can do it",0); 
		// --- and eventually this is how we call super class's 3 args constructor to
		// set the values

		super("spartan", 5, "I can do it");
		System.out.println("Student User no arg");
	}

	public StudentUser(String displayName, int timeZone, String status, int groupNumber) {
		// super();
		/// ----- this is what we would do , if we want to do it directly

//	      this.displayName = displayName;
//	      this.timeZone = timeZone;
//	      this.status = status;

		// --- and eventually this is how we call
		// super class's 3 args constructor to set the values
		super(displayName, timeZone, status);
		this.groupNumber = groupNumber;
		System.out.println("Student user 4 args is being called");
	}

	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}

	/*
	 * public void sendMessage(String message) {
	 * 
	 * System.out.println("<"+displayName+"> is sending <" + message+">" );
	 * 
	 * }
	 * 
	 * public void changeStatus(String status) { this.status = status; }
	 */

}
