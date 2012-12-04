package jpa.manager.concurrency;

import jpa.manager.AbstractPersistentTest;
import static org.junit.Assert.*;
import org.junit.Test;

import javax.persistence.OptimisticLockException;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class ConcurrencyTest extends AbstractPersistentTest {

    // ======================================
    // =              Constants             =
    // ======================================
    private static final int ALL = 6;

    // ======================================
    // =              Unit tests            =
    // ======================================

    @Test
    public void persistAndFindBook() throws Exception {

        // Finds an unknown book
        Book03 book = em.find(Book03.class, 1234L);
        assertNull(book);

        // Instanciates a book object
        book = new Book03(1234L, "H2G2", 21f, "Best IT book", "123-456-789", 321, false);
        assertFalse(em.contains(book));

        // Persist the object
        tx.begin();
        em.persist(book);
        tx.commit();
        assertTrue(em.contains(book));
        assertEquals(new Integer(1), book.getVersion());

        // Finds the book
        book = em.find(Book03.class, 1234L);
        assertNotNull(book);
        assertTrue(em.contains(book));

        // Gets a reference
        book = em.getReference(Book03.class, 1234L);
        assertNotNull(book);
        assertTrue(em.contains(book));
        tx.begin();
        book.setPrice(555f);
        tx.commit();
        assertEquals(new Integer(2), book.getVersion());

        // Removes the entity
        tx.begin();
        em.remove(book);
        tx.commit();
        assertFalse(em.contains(book));
    }

}