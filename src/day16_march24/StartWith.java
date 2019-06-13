package day16_march24;

public class StartWith {

	public static void main(String[] args) {
		
	// str.indexOf("bc")==0   =====>>>>> str.startsWith("bc")
		String str = "Mustafa";
		
		System.out.println(str.startsWith("M"));
		System.out.println(str.startsWith("ABC"));
		
		boolean b = str.startsWith("Mu");
		
		if (b) {
			System.out.println("Successful");
		}else {
			System.out.println("Not a BU");
		}

	}

}
