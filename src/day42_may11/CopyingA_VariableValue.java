package day42_may11;

public class CopyingA_VariableValue {

	public static void main(String[] args) {

		int i = 10;
		int j = i;
		j = 100;
		System.out.println(i);// 10

		Dog d1 = new Dog();
		d1.name = "puppy";
		d1.breed = "pitbull";

		Dog d2 = d1;
		d2.name = "yumak";

		System.out.println(d1.name);

		d2 = new Dog();
		d2.name = "Mila";

		System.out.println(d1.name);

		System.out.println("======Practice=======");
		Dog d3 = new Dog();
		d3.breed = "gangal";

		Dog d4 = d3;
		d4.breed = "Kurt Kopegi";

		System.out.println(d3.breed);
		
		d4 = new Dog();
		d4.breed = "Doberman";
		
		System.out.println(d3.breed);
		System.out.println(d4.breed);

	}

}
