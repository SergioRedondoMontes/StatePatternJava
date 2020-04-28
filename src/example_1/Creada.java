package example_1;

public class Creada implements BookState {
	private Book book;
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Creada");
	}
	
	@Override
	public void next(BookState bookState) {
		// TODO Auto-generated method stub
		this.book.setBookState(bookState);
	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return book;
	}

	

}
