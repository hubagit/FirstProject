package day57_june8;

import java.util.ArrayList;

public class ChromeDriver implements WebDriver {

	int screenSize;
	double positionX;
	
	// any time i create a ChromeDriver Object 
	// it should automatically open the browser
	
	public ChromeDriver(int screenSize, double positionX) {
		this.screenSize = screenSize;
		this.positionX = positionX;
		openBrowser();
	}
	
	public ChromeDriver() {
		System.out.println("Creating ChromeDriver with no arg");
		openBrowser();
	}

	public static void main(String[] args) {
		
//		ChromeDriver driver1 = new ChromeDriver(); 
//		driver1.quit();
		
		
		ChromeDriver driver2 = new ChromeDriver(5, 100); 
//		driver2.navigateTo("www.cybertekschool.com");
//		driver2.findElementByID(100); 
//
//		ArrayList<String> allElms =  driver2.findElementByTagName("p"); 
//		System.out.println(allElms);
		
		//driver2.clickButton("abc");
		//driver2.clickButtonAndEnterText();
		
		
		
		WebDriver.showPurpose();
	
		
		
	}
	
//    public void clickButtonAndEnterText(){
//   	 
//   	 clickButton("MY BLUE BUTTON"); 
//   	 //System.out.println("clickButtonAndEnterText DO YOUR IMPLEMENTATION WITHOUT BREAKING");
//		 System.out.println("Entering Cybertek");
//		 quit(); 
//		 
//	 } 
	
	
	
	
	
	
	
	@Override
	public void clickButton(String name) {
		
		System.out.println("Clicking button "+ name);
		
	}
	
	
	@Override
	public void openBrowser() {
	
		System.out.println("Opening browswer");
		
	}

	@Override
	public void navigateTo(String url) {
		System.out.println("navigating To URL "+ url);
	}

	@Override
	public void quit() {
		System.out.println("Closing browswer");
	}

	@Override
	public String findElementByID(int id) {
		System.out.println("looking for element hard with id "+ id);
		return "my Element";
	}
 
	@Override
	public ArrayList<String> findElementByTagName(String tagName) {
		
		System.out.println("looking for"
				+ "all the elements with tagName "+ tagName);
		
		ArrayList<String> allElements = new ArrayList<String>(); 
		allElements.add("first checkbox"); 
		allElements.add("another textbox");
		allElements.add("sign up link");
		
		return allElements; 
		
	}

	
	
}
