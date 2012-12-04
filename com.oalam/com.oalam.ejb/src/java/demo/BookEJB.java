package demo;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Stateless
public class BookEJB implements BookEJBRemote {

    // ======================================
    // =             Attributes             =
    // ======================================

    @PersistenceContext(unitName = "com.oalam.ejbPU")
    private EntityManager em;

    // ======================================
    // =           Public Methods           =
    // ======================================

    public List<Book> findBooks() {
        Query query = em.createNamedQuery("findAllBooks");
        return query.getResultList();
    }

    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }

    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }

    public void deleteBook(Book book) {
        em.remove(em.merge(book));
    }

    public Book updateBook(Book book) {
        return em.merge(book);
    }
}