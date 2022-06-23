import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Book b1 = new Book("My", "Kul");
		Book b2 = new Book ("You", "Prok");
		Book b3 = new Book ("We", "Lov");
		
		List <Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(b1);
		listOfBooks.add(b2);
		listOfBooks.add(b3);
		
		Library bochumLibr = new Library(listOfBooks);
		
		List <Book> booksList = bochumLibr.getTtlBooks();
		
		for(Book bk : booksList) {
			System.out.println(bk.title + bk.author);
		}
		
		 
		
		//// fm me)))
		
	 
		
		for(Book bk2 : listOfBooks) {
			System.out.println(bk2.title + bk2.author);
		}

	}
 
 

}
