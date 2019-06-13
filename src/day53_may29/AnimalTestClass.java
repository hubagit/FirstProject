package day53_may29;

public class AnimalTestClass {

	public static void main(String[] args) {
		 Dog dog1 = new Dog();
		    dog1.run();
		    //in the Dog class
		    //we have same static method
		    //that means m1() from Animal class
		    //is hidden
		    Dog.m1(); 
		    Dog.m2();
	}

}
