package demo;



import javax.ejb.Remote;
import java.util.List;


@Remote
public interface BookEJBRemote {

    // ======================================
    // =           Public Methods           =
    // ======================================

    public List<Book> findBooks();

    public Book findBookById(Long id);

    public Book createBook(Book book);

    public void deleteBook(Book book);

    public Book updateBook(Book book);
}