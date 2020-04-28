package example_1;

public class Admitida implements BookState {
	private Book book;
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Admitida");
	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return book;
	}
	
}
