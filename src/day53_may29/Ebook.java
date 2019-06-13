package day53_may29;

public class Ebook extends Book {
	public String author = "J. K. Rowling";
	public String title = "Harry Potter and the Chamber of Secrets";

	public static void main(String[] args) {
		Ebook b1 = new Ebook();
		b1.printInfo();
		//Book.title??? //NOOOOO it is not a static field
		System.out.println("Price: "+Book.price);
		Ebook.read();
	
	}
	public static void read() {
		System.out.println("reading a Ebook");
		
	}
	public void printInfo() {
		System.out.println("Author: " + super.author);//super. calls instance variable/or methods of parent class
		
		System.out.println("Title: " + super.title); // in case of static it doesn't work, we have to use class name
		
	}
}

class Book {

	public String author = "J. K. Rowling";
	public String title = "Harry Potter and the Philosopher's Stone";
	public static int price = 30;
	
	public static void read() {
		System.out.println("reading a book");
		
	}

}