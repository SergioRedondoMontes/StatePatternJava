package example_1;

public class Cursada implements BookState {
	private Book book;
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Cursada");
	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return book;
	}

}
