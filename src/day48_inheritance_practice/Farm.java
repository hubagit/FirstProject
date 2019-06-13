package day48_inheritance_practice;

public class Farm {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		Cat smoky = new Cat();
		smoky.name = "Smoky";
		smoky.eat();
		smoky.drink();
		smoky.sleep();
		smoky.eat();
		System.out.println("=======DOG AREA=============");
		Dog karabas = new Dog();
		karabas.sleep();
		karabas.drink();
		
		Chihuahua tuzik = new Chihuahua();
		System.out.println(tuzik.breed);
		tuzik.sleep();
	}

}
