
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBook() {
		Book book = new Book("Feeling Blue", "Henry Stutter", "93029384756");
		
		assertEquals("Feeling Blue", book.getTitle());
		assertEquals("Henry Stutter", book.getAuthor());
		assertEquals("93029384756", book .getIsbn());		
	}

	
}
