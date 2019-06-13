package day46_may18;

public class SlackUser {

	private String name;
	private String email;
	private int groupNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}

	public SlackUser(String name, String email, int groupNum) {

		this.name = name;
		this.email = email;
		this.groupNum = groupNum;
	}

	public SlackUser() {
		this("NoName", "noemail@gmail.com", 38);

	}

	// special method that is for getting String represenatation of an object
	// it will be automatically called when object is being printed using sysout.
	public String toString() {
		return "SlackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
	}

	public void sendMessage(String channel, String content) {

		System.out.println(name +" sending message "+ content +" to "+ channel);

	}
	/*
	 * WARM UP TASK 1 :
	 * 
	 * Create a class called SlackUser private fields name , email , groupNum
	 * 
	 * provide getters and setters for above fields
	 * 
	 * create 3 args constructor to set all the field value
	 * 
	 * create no arg constructor to set default value by calling 3 args constructor
	 * you may set default value to your own info
	 * 
	 * create toString method accept no arg return info about the slack user object
	 * 
	 * create a method called sendMessage accept two parameters channel as string ,
	 * content as String it just prints out User <your name> sent message <content>
	 * to channel <channel>
	 * 
	 * 
	 * Create another class called SlackAction create few objects , call their
	 * methods
	 * 
	 * optionally , create an ArrayList of SlackUser add all the objetcs loop
	 * through each item and print out and call sendMessage on each of them
	 * 
	 */

}
