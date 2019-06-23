package day62_june22;

public class DangerZone {

	public static void main(String[] args) {
		// CALLING A METHOD THAT MIGHT THROW A CHECKED EXCEPTION

		for (int i = 1; i <= 10; i++) {

			System.out.println("i is  " + i);
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println("caught");
			}

		}

		System.out.println("Ending");

	}

}
