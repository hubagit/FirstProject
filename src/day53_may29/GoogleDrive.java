package day53_may29;

public class GoogleDrive extends CloudStorage {

	private boolean hasGmail;
	
	public static String region;
	
	public GoogleDrive(int capacity, double price, String username, String password,boolean hasGmail) {
		super(capacity, price, username, password);
		this.hasGmail = hasGmail;
	}
	
	final public void printInfo(int a) { // not overriding any more, because original method has
										// different signature
		System.out.println("Info about cloud storage.."); //it is not overloading, just a different method
		
	}
	public static void changeRegion(String region) {
		System.out.println("Google Drive class!");
		CloudStorage.region = region;
	}

	@Override
	public String toString() {
		return "GoogleDrive [hasGmail=" + hasGmail + ", getCapacity()=" + getCapacity() + ", getPrice()=" + getPrice()
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + "]";
	}
	

}
