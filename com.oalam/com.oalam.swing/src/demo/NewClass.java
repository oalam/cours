package demo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tom
 */
public class NewClass {
    public static void main(String[] args) {
	try {
	    String tel = "+33";
	    if (!tel.startsWith("+")) {

	    }

	    // Creates an instance of book
	    Book book = new Book();
	    book.setTitle("The Hitchhiker's Guide to the Galaxy");
	    book.setPrice(12.5F);
	    book.setDescription("Science fiction comedy book");
	    book.setIsbn("1-84023-742-2");
	    book.setNbOfPage(354);
	    book.setIllustrations(false);

	    // Looks up for the EJB
	    InitialContext ctx = new InitialContext();
	    //  BookEJB bookEJB = (BookEJB) ctx.lookup("java:global/com.oalam/com.oalam.ejb/BookEJB");
		       
	      BookEJBRemote bookEJB = (BookEJBRemote) ctx.lookup("java:global/com.oalam/com.oalam.ejb/BookEJB");
	    
	    // Persists the book to the database
	    book = bookEJB.createBook(book);
	  //  assertNotNull("ID should not be null", book.getId());

	    // Retrieves all the books from the database
	    List<Book> books = bookEJB.findBooks();
	  //  assertNotNull(books);
	} catch (NamingException ex) {
	    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
}
