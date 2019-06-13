package day40_may7;

public class ComputerFactory2 {

	public static void main(String[] args) {
		
		Computer2 iMac = new Computer2();
		Computer2 MacBookPro = new Computer2();
		Computer2 dell = new Computer2();
		
		// they are not equal because they are 2 different objects
		System.out.println(iMac == MacBookPro);
		System.out.println("-------IMAC------");
		iMac.color = "Silver";
		System.out.println(iMac.type);
		iMac.type ="IMAC 27'";
		System.out.println(iMac.type);
		//null is default value for String 
		System.out.println(iMac.OS);
		//0.0 is a default value for floats
		System.out.println(iMac.screenSize);
		iMac.OS = "macOS Mojave";
		iMac.isPersonal = true;
		iMac.screenSize = 21;
		iMac.ram = 16;
		System.out.println("********");
		System.out.println(iMac.OS);
		System.out.println("********");
		iMac.printInfo();
		System.out.println("********");
		dell.printInfo();
		dell.color = "Black";
		dell.isPersonal = false;
		dell.OS = "Windows 10";
		dell.ram = 32;
		dell.type = "Dell XPS";
		dell.screenSize = 15;
		System.out.println("********");
		//we will print values again after setting all values 
		dell.printInfo();
	}

}
