package day41_may8;

public class AirConditioner {

	// we have to provide instance variables
	// that will describe AC
	// instance variables

	String brand;
	float temperature;
	String mode = "cool";
	String color;
	boolean remoteControl;
	float price;
	boolean isOn;
	int ecoLevel;

	// this is an instance method
	public void displayBrand() {
		System.out.println("the brand is: " + brand);
	}

	public void showCurrentTemperature() {
		System.out.println("Current tempearture: " + temperature);
	}

	public void increaseTemperature(float temp) {
		temperature += temp;

	}

	public void decreaseTemperature(float temp) {
		temperature -= temp;

	}

	public void turnOn() {
		if (isOn == false) {
			// changing status...
			// set it to true, make it on
			System.out.println("AC is on");
		} else {
			// it's already on, no need to turn it on again
			System.out.println("AC is already on!!!");
		}
	}

	public void turnOff() {
		if (isOn == true) {
			// changing status...
			// set it to false, make it off
			System.out.println("AC is off");
		} else {
			// it's already off, no need to turn it off again
			System.out.println("AC is already off!!!");
		}
	}

	public void getEcoLevel() {
		System.out.println("Eco level is: " + ecoLevel);
	}

	public void displayPrice() {

		System.out.println("Price: " + price);

	}

	public void remoteControlAvailability() {

		System.out.println("Remote control: " + remoteControl);
	}

	public void setMode(String season) {
		switch (season) {
		case "Summer":
			mode = "cool";
			System.out.println("@@@Summer mode!@@@@");
			break;
		case "Winter":
			mode = "hot";
			System.out.println("****Winter mode****");
			break;
		default:
			System.out.println("Wrong mode!");
		}

	}

	public void printInfo() {
		// this method will provide full description about AC
		System.out.println("Brand: " + brand + ", current temperature: " + temperature + ", mode: " + mode + ", color "
				+ color + ",\n eco level: " + ecoLevel + "price: " + price + ", has remote? " + remoteControl
				+ ", is on? " + isOn);

	}
}
