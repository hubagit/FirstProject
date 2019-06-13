package day43_may12;

public class RaceGround {

	public static void main(String[] args) {

		Vehicle car1 = new Vehicle();
		car1.setMake("Tesla");
		car1.setModel("Model X");
		car1.setSpeed(100);

		System.out.println(car1.getMake());
		System.out.println(car1.getModel());

		car1.increaseSpeed(6);
		car1.decreaseSpeed(100);
		
		System.out.println("====================");

		Vehicle car2 = new Vehicle();
		car2.setMake("BMW");
		car2.setModel("X3");
		car2.setSpeed(10);

		System.out.println(car2.getMake());
		System.out.println(car2.getModel());

		car2.decreaseSpeed(60);
		car2.decreaseSpeed(10);
		
		System.out.println(car2.getSpeed());

		
		
		
		
		
//		System.out.println("==========Practice==========");
//		int speed = 10;
//		int increaseBy = 5;

		// 11==12==13
//		for (int i = speed; i <= speed + increaseBy; i++) {
//			System.out.print(i + "=>");
//
//		}
//		System.out.println();
//		System.out.println(speed);

//		for (int i = 1; i <= increaseBy; i++) {
//			speed = speed + 1;
//			System.out.print(speed + "=>");
//		}
//		System.out.println();
//		System.out.println(speed);

//		for (int i = 1; i <= increaseBy; i++) {
//			speed--;
//			System.out.print(speed + "=>");
//		}
//		System.out.println();
//		System.out.println(speed);
	}

}
