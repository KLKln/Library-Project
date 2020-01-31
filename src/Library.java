import java.util.Scanner;

public class Library {
	
	public static void main(String[] args) {
		//Scanner scan = new Scanner (System.in);
		
		MyBooks bookShelf = new MyBooks();
		
		/*System.out.println("Enter title of the book: ");
		String title = scan.nextLine();
		
		System.out.println("Enter author of the book: ");
		String author = scan.nextLine();
		
		System.out.println("Enter the ISBN of the book");
		int isbn = scan.nextInt();
		
		Book newBook = new Book(title, author, isbn);
		
		bookShelf.addBook(newBook);*/
		
		Book book1 = new Book("Survivor", "Chuck Palahniuk", "0385498721");
		bookShelf.addBook(book1);
		
		Book book2 = new Book("Jack the Bodiless", "Julian May", "9780679409502");
		bookShelf.addBook(book2);
		
		for(Book book: bookShelf.bookList()) {
		System.out.println(book.getTitle() +", " + book.getAuthor() + ", " + book.getIsbn());
		}
		
		
		//scan.close();
	}

	
	
	
}
