package day49_may22;

import day49_may22_2ndPackage.EBook;

public class AmazonBooks {

	public static void main(String[] args) {
		
		PaperBook book1 = new PaperBook();
		book1.author = "Mark Twain";
		book1.setTitle("The Adventures of Tom Sawyer");
		book1.chapterCount = 33;
		book1.isHardCover = true;
		book1.price = 19.99;
		book1.pageCount = 274;
		System.out.println(book1);

		// book1 is an instance of Book class
		// because Book is a super class for PaperBook
		// Thus, book1 is an instance of Book too
		// instanceOf this is the keyword that indicates
		// if instance related to the class
		// System.out.println(book1 instanceof Book);
		// System.out.println(Animal instanceOf Animal); //==> BAD CODE!!!

		EBook ebook1 = new EBook();
		ebook1.author = "Walter Savitch";
		// why only author property is available? because this class is in another package
		ebook1.setTitle("Java 8");
		System.out.println(ebook1);
		
	}

}
