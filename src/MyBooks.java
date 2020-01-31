import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyBooks {
	
	private final List<Book> myBooks = new ArrayList<Book>();
	
	public void addBook(Book book) {
		myBooks.add(book);	
		
	}
	
	public List<Book> bookList(){
		return myBooks.stream().sorted((book1, book2)->{
			return book1.getTitle().compareTo(book2.getAuthor());
		}).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "MyBooks [myBooks=" + myBooks + "]";
	}

	
		
		
		
		
	

	
	

}
