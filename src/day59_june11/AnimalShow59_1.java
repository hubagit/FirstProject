package day59_june11;

import day57_june8.ChromeDriver;
import day57_june8.WebDriver;
import day58_june9.*;

public class AnimalShow59_1 {

	public static void main(String[] args) {

		Animal myAnimal = new Dog();
		myAnimal.makeNoise();
		// new Dog().makeNoise();

		myAnimal = new Cat();
		myAnimal.makeNoise();

		myAnimal = new Horse();
		myAnimal.makeNoise();

		// webDriver is an interface that we created
		// ChromeDriver is a class that implements Webdriver

		WebDriver driver = new ChromeDriver();
		driver.navigateTo("google");

		// FireFoxDriver is a class that implements WebDriver

		/*
		 * WebDriver driver = new FireFoxDriver(); driver.navigateTo("google");
		 */

		// this is creating object
		// without storing the address of the object
		// and just using it once == like calling method as below

		// this object is not accessible after this line
		// because we did not write down address
		Animal[] animals = {new Dog(),new Cat()};

	}
}
