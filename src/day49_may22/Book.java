package day49_may22;

public class Book {

	/*
	 * Please create a class called Book. This class has 5 instance variables:
	 * author, pageCount, price, chapterCount, title Then, based on Book class, we
	 * need to create a class called AudioBook in this class we need to create a few
	 * instance variables: length (double). size (double) One more class that
	 * extends Book class, PaperBook with instance variables: isHardcover (boolean),
	 * weight.
	 * //make all instance variables public.
	 */
	protected String author;
	int pageCount;
	double price;
	int chapterCount;
	private String title;
	
	
	public Book(String author, int pageCount, double price, int chapterCount, String title) {
		super();
		this.author = author;
		this.pageCount = pageCount;
		this.price = price;
		this.chapterCount = chapterCount;
		this.title = title;
		System.out.println("Book constructor with all args!");
	}
	public Book() {
		System.out.println("Book constructor with no args");
	}
	public void setAuthor(String author) {
		this.author= author;
		System.out.println();
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", pageCount=" + pageCount + ", price=" + price + ", chapterCount="
				+ chapterCount + ", title=" + title + "]";
	}

}
