/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.demo;

import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tom
 */
public class BookTest {

    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction tx;

    public BookTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        emf = Persistence.createEntityManagerFactory("jpaPU");
        em = emf.createEntityManager();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        em.close();
        emf.close();
    }

    @Before
    public void setUp() {
        tx = em.getTransaction();
    }


    /**
     * Test of getId method, of class Book.
     */
    @Test
    public void testGetId() {
        // Creates an instance of book
        Book00 book = new Book00();
        book.setTitle("The Hitchhiker's Guide to the Galaxy");
        book.setPrice(12.5F);
        book.setDescription("Science fiction comedy series created by Douglas Adams.");
        book.setIsbn("1-84023-742-2");
        book.setNbOfPage(354);
        book.setIllustrations(false);

        // Persists the book to the database
        tx.begin();
        em.persist(book);
        tx.commit();
        
        assertNotNull("ID shoud not be null", book.getId());
        
        List<Book00> books = em.createNamedQuery("findAllBooks").getResultList();
        assertNotNull(books);
    }
}
