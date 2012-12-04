package demo;






import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import javax.naming.InitialContext;


public class BookEJBTest {



    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

    @BeforeClass
    public static void initContainer() throws Exception {
      //  ec = EJBContainer.createEJBContainer();
       // ctx = ec.getContext();
    }

    @AfterClass
    public static void closeContainer() throws Exception {
        //ec.close();
    }

    // ======================================
    // =              Unit tests            =
    // ======================================

    @Test
    public void createBook() throws Exception {

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
         //   BookEJB bookEJB = (BookEJB) ctx.lookup("java:global/com.oalam/com.oalam.ejb/BookEJB");
	           
        BookEJBRemote bookEJB = (BookEJBRemote) ctx.lookup("java:global/com.oalam/com.oalam.ejb/BookEJB");
	
        // Persists the book to the database
        book = bookEJB.createBook(book);
        assertNotNull("ID should not be null", book.getId());

        // Retrieves all the books from the database
        List<Book> books = bookEJB.findBooks();
        assertNotNull(books);
    }

   
}