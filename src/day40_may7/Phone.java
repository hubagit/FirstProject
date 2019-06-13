package day40_may7;

public class Phone {
	// these parameters will be accessed only through the object
	// if you're outside the class
	// these are the instance variable
	String brand;
	String model;
	String OS;
	int storageSize;
	double screenSize;
	int ram;
	int camera;
	double price;
	String color;
	boolean isWaterResistant;
	boolean support5G;
	String cpu;
	long imei;

	public void call() {
		System.out.println("Phone is calling");

	}

	public void ring() {

		System.out.println("Phone is ringing");

	}

	public void dial(long phoneNumber) {
		System.out.println("Dialing..." + phoneNumber);

	}

	public void sendSMS(String sms, long phoneNumber) {
		System.out.println("Sending sms: " + sms + ", to " + phoneNumber);
	}

	public void printInfo() {
		System.out.println(brand + " : " + model);

	}
}
