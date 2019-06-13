package day45_may15;

public class BestBuy {

	public static void main(String[] args) {

		Computer computer1 = new Computer("Asus", "Intel Core i9 9980", 1000, 15.6, 32, true, "Windows 10", 2000);
		// toString() method calls automatically.
		System.out.println(computer1);
		System.out.println("***************");
	    Computer computer2 = new Computer();    
	    System.out.println(computer2);

	}

}
