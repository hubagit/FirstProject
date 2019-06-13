package day43_may12;

public class Vehicle {

	private String make;
	private String model;
	private int speed;

	// right click, select source, select generate getters and setters
	// check the check box for the field you want to generate
	// then click generate

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

//	public void setMake(String newMake) {
//		this.make = newMake;
//
//	}
//
//	public String getMake() {
//
//		return make;
//	}
//
//	// <this> keyword can be used to address
//	// the current object|instance being worked
//	public void setModel(String model) {
//		this.model = model;
//
//	}
//
//	public String getModel() {
//
//		return model;
//	}
//
//	public void setSpeed(int speed) {
//		this.speed = speed;
//
//	}
//
//	public int getSpeed() {
//		// this.speed ==>optional
//		return speed;
//	}
//
		public void increaseSpeed(int increaseBy) {
		// speed = speed+increaseBy;

		for (int i = 1; i <= increaseBy; i++) {
			speed++;
			System.out.print(speed + "=>");
		}
		System.out.println();

	
}
	public void decreaseSpeed(int decreaseBy) {
		// speed = speed-decreaseBy;
		for (int i = 1; i <= decreaseBy; i++) {
			speed--;
			System.out.print(speed + "=>");
		}
		System.out.println();

	}
//
//	public void stop() {
//		speed = 0; //direct way 
//		this.speed = 0;//using this keyword
//		setSpeed(0);
//		this.setSpeed(0);
//	}

}
