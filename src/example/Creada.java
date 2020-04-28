package example;

public class Creada implements BookState {
	private Book book;
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Creada");
	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		return book;
	}

}
