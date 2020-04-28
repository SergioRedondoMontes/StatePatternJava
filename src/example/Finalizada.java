package example;

public class Finalizada implements BookState {
	private Book book;
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Finalizada");
	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return book;
	}

}
