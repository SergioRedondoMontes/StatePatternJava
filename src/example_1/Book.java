package example_1;

public class Book {
	private BookState bookState;

	public Book(BookState bookState) {
		super();
		this.bookState = bookState;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		bookState.show();
	}

	public BookState getBookState() {
		return bookState;
	}

	public void setBookState(BookState bookState) {
		this.bookState = bookState;
	}
	
	
}
