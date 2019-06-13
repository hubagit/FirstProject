package day60_june12;

import day58_june9.*;

public class ShapeUtility {

	public static void main(String[] args) {

		describeTheShape(new Triangle("red", 12, 10));

		Shape s1 = new Triangle("red", 12, 10);
		describeTheShape(s1);

		describeTheShape(new Square("blue", 5));

		// something ridiculous but focus on concept itself
		describeTheShape(new Dog());

		Shape myShape = getAnyShape();
		myShape.draw();

		Drawable myDrawable = getAnyDrawable();
		myDrawable.drawLine(2);
	}

	public static Drawable getAnyDrawable() {

		Drawable d1 = new Triangle("red", 120, 100);

		return d1;

		// return new Triangle( "red", 12, 10);

	}

	public static Shape getAnyShape() {
		Shape s1 = new Square("blue", 5);
		return s1 ;
		//return new Square("blue", 5);
	}

	// we don't want to create object while calling this utility
	// method so we just made it static
	public static void describeTheShape(Shape anyShape) {
		System.out.println("calling describeTheShape(Shape anyShape)");
		anyShape.draw();
	}

	// create another method that accepts Triangle object only

	public static void describeTheShape(Triangle anyTriangle) {
		System.out.println("calling describeTheShape(Triangle anyTriangle)");
		anyTriangle.draw();
	}

	// do not get fooled by the name
	// it accepts any type of Object
	public static void describeTheShape(Object anyObject) {
		System.out.println("calling describeTheShape(Triangle anyTriangle)");
		// anyObject.draw();
		// anyObject.makeNoise();
	}

}
