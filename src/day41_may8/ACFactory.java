package day41_may8;

public class ACFactory {

	public static void main(String[] args) {

		// we are creating a new object
		AirConditioner ac1 = new AirConditioner();
		ac1.brand = "Samsung";
		ac1.color = "White";
		ac1.ecoLevel = 10;
		ac1.price = 2500;
		ac1.printInfo();
		System.out.println("====================");
		ac1.mode = null;
		ac1.printInfo();

		ac1.turnOn();
		ac1.turnOn();
		ac1.turnOff();
		// we are setting temperature
		ac1.temperature = 75; // this is not possible with properly encapsulate class

		ac1.showCurrentTemperature();
		// let's increase temperature
		ac1.increaseTemperature(5);
		// let's check temperature after increasing
		ac1.showCurrentTemperature();

		ac1.setMode("Winter");
		ac1.printInfo();

	}

}
