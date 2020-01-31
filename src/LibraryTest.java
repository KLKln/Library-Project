import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	MyBooks myBooks = new MyBooks();
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMain() {
		Book book1 = new Book("Silver", "Janet Yanesh", "00900876");
		myBooks.addBook(book1);
				
		assertTrue(book1.getTitle() == "Silver");
		assertTrue(book1.getAuthor() == "Janet Yanesh");
		assertTrue(book1.getIsbn() == "00900876");
		
		Book book2 = new Book("Gold", "Corey Janske", "938273645683");
		myBooks.addBook(book2);
		
		assertFalse(book2.getTitle() == "Silver");
		assertFalse(book2.getAuthor() == "Janet Yanesh");
		assertFalse(book2.getIsbn() == "00900876");
	}
	
	

}
