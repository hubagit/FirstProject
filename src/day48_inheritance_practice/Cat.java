package day48_inheritance_practice;

//since we know
//that every cat is an animal
//so we can inherit behavior of animal class
public class Cat extends Animal {
//complete void....
//this is class is empty yet

//let's change behavior of sleep method

	@Override
	public void sleep() {
		System.out.println(name + ": Cat is sleeping...");
	}
}