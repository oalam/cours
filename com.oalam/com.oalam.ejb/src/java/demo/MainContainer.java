package demo;



import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class MainContainer {

    // ======================================
    // =           Public Methods           =
    // ======================================

    public static void main(String[] args) {

        // Creates an instance of book
        Book book = new Book();
        book.setTitle("The Hitchhiker's Guide to the Galaxy");
        book.setPrice(12.5F);
        book.setDescription("Science fiction comedy series created by Douglas Adams.");
        book.setIsbn("1-84023-742-2");
        book.setNbOfPage(354);
        book.setIllustrations(false);

        try {
           // EJBContainer ec = EJBContainer.createEJBContainer();
            InitialContext ctx = new InitialContext();
            BookEJBRemote bookEJB = (BookEJBRemote) ctx.lookup("java:global/com.oalam/com.oalam.ejb/BookEJB");

            book = bookEJB.createBook(book);
	    
            book = bookEJB.findBookById(book.getId());
            bookEJB.deleteBook(book);

        } catch (NamingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}