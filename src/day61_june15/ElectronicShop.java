package day61_june15;

public class ElectronicShop {

	public static void main(String[] args) {

		Electronic item1 = new Computer();
		item1.turnOn();

		if (item1 instanceof Computer) {
			Computer cp = (Computer) item1;
			cp.code();
			// below code is combining above to lines
			// without saving it into reference variable cp
			// ((Computer) item1).code();
		}

		item1 = new AirConditioner();
		item1.turnOn();

		// ((Computer) item1).code(); //==> can compile but gives you a class exception at runtime.
		AirConditioner ac = (AirConditioner) item1;
		ac.controlTemp();

		// ((AirConditioner) item1).controlTemp();

	}

}
