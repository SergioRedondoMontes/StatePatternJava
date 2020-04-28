package example_1;

public interface BookState {
	public void show();
	public void next(BookState bookState);
	public Book getBook();
}
