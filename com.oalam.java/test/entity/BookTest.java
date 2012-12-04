/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author HumanBooster
 */
public class BookTest {

    public BookTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDescription method, of class Book.
     */
    @Test
    public void testPresist() {
        System.out.println("getDescription");

        // 1. Création d’une instance de l’entité Book.
        Book book = new Book();
        book.setId(1234L);
        book.setTitle("The Hitchhiker’s Guide to the Galaxy");
        book.setPrice(12.5F);
        book.setDescription("Science fiction by Douglas Adams.");
        book.setIsbn("1-84023-742-2");
        book.setNbOfPage(354);
        book.setIllustrations(false);
        
        // 2. Création d’un gestionnaire d’entités et d’une
        // transaction.
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("bookstorePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(book);
        tx.commit();
        
        // 4. Récupération du livre par son identifiant.
        book = em.find(Book.class, 1234L);
        System.out.println(book);
        
        assertNotNull(book);
        em.close();
        emf.close();
    }
}
