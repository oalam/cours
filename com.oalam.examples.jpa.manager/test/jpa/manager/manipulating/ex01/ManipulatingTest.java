package jpa.manager.manipulating.ex01;

import jpa.manager.manipulating.ex01.Book02;
import jpa.manager.manipulating.ex01.Book02Auto;
import jpa.manager.AbstractPersistentTest;
import static org.junit.Assert.*;
import org.junit.Test;

import javax.persistence.EntityNotFoundException;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class ManipulatingTest extends AbstractPersistentTest {

    // ======================================
    // =              Unit tests            =
    // ======================================
    @Test
    public void persistAndFindBook() throws Exception {

        // Finds an unknown book
        Book02 book = em.find(Book02.class, 1234L);
        assertNull(book);

        // Instanciates a book object
        book = new Book02(1234L, "H2G2", 21f, "Best IT book", "123-456-789", 321, false);
        assertFalse(em.contains(book));

        // Persist the object
        tx.begin();
        em.persist(book);
        tx.commit();
        assertTrue(em.contains(book));

        // Finds the book
        book = em.find(Book02.class, 1234L);
        assertNotNull(book);
        assertTrue(em.contains(book));

        // Gets a reference
        book = em.getReference(Book02.class, 1234L);
        assertNotNull(book);
        assertTrue(em.contains(book));

        // Removes the entity
        tx.begin();
        em.remove(book);
        tx.commit();
        assertFalse(em.contains(book));
    }

    @Test
    public void refreshBook() throws Exception {

        // Instanciates a book object
        Book02 book = new Book02(12345L, "H2G2", 21f, "Best IT book", "123-456-789", 321, false);
        assertFalse(em.contains(book));

        // Persist the object
        tx.begin();
        em.persist(book);
        tx.commit();
        assertTrue(em.contains(book));

        // Finds the book
        book = em.find(Book02.class, 12345L);
        assertNotNull(book);
        assertTrue(em.contains(book));
        assertEquals(book.getTitle(), "H2G2");

        // Updates the entity
        book.setTitle("New Title");

        // Finds the book
        book = em.find(Book02.class, 12345L);
        assertEquals(book.getTitle(), "New Title");

        // Clears the entity
        em.clear();
        assertFalse(em.contains(book));

        // Updates the detached entity
        book.setTitle("Detached Title");

        // Merge the entity
        em.merge(book);

        // Finds the book
        book = em.find(Book02.class, 12345L);
        assertNotNull(book);
        assertTrue(em.contains(book));
        assertEquals(book.getTitle(), "Detached Title");

        // Removes the entity
        tx.begin();
        em.remove(book);
        tx.commit();
        assertFalse(em.contains(book));
    }

    @Test
    public void doesNotFindBook() throws Exception {
        Book02 book = em.find(Book02.class, 999999L);
        assertNull(book);
    }

    @Test(expected = EntityNotFoundException.class)
    public void doesNotGetReference() throws Exception {
        em.getReference(Book02.class, 999999L);
    }

    @Test
    public void persistAutoBook() throws Exception {

        // Instanciates a book object
        Book02Auto book = new Book02Auto("H2G2", 21f, "Best IT book", "123-456-789", 321, false);
        assertFalse(em.contains(book));
        assertNull(book.getId());

        // Persist the object
        tx.begin();
        em.persist(book);
        tx.commit();
        assertNotNull(book.getId());
        assertTrue(em.contains(book));

        // Removes the entity
        tx.begin();
        em.remove(book);
        tx.commit();
        assertFalse(em.contains(book));
    }

    @Test
    public void flushAutoBook() throws Exception {

        // Instanciates a book object
        Book02Auto book = new Book02Auto("H2G2", 21f, "Best IT book", "123-456-789", 321, false);
        assertFalse(em.contains(book));
        assertNull(book.getId());

        // Persist the object
        tx.begin();
        em.persist(book);
        assertNotNull(book.getId());
        assertTrue(em.contains(book));

        // Finds the book
        book = em.find(Book02Auto.class, book.getId());
        assertNotNull(book);
        assertTrue(em.contains(book));

        em.flush();

        tx.commit();
    }
}