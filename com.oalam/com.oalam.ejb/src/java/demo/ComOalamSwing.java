package demo;


import demo.Book;
import demo.Book;
import demo.BookEJB;
import demo.BookEJBRemote;
import demo.BookEJBRemote;
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
public class ComOalamSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	try {
	    Book book = new Book();
	    book.setTitle("The Hitchhiker's Guide to the Galaxy");
	    book.setPrice(12.5F);
	    book.setDescription("Science fiction comedy book");
	    book.setIsbn("1-84023-742-2");  
	    book.setNbOfPage(354);
	    book.setIllustrations(false);

	    // Looks up for the EJB
	    InitialContext ctx = new InitialContext();

	    BookEJBRemote bookEJB = (BookEJBRemote) ctx.lookup("java:global/com.oalam/com.oalam.ejb/BookEJB");

	    
	    // Persists the book to the database
	    book = bookEJB.createBook(book);
	} catch (NamingException ex) {
	    Logger.getLogger(ComOalamSwing.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
}
