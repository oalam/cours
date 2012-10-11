/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.data;

import dp.dao.data.BookDao;
import dp.dao.data.BookDaoFactory;
import dp.dao.business.Book;
import dp.dao.data.BookDaoFactory.BOOK_DAO_TYPE;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adminl
 */
public class BookDaoTest {

    public BookDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of read method, of class InMemoryBookDao.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        Book b = new Book("99921-58-10-7", "Mon chien stupide", "John FANTE");
        BookDao dao = BookDaoFactory.getDao();
        dao.create(b);

        Book b2 = new Book("99921-58-10-7");
        assertNull(b2.getTitle());
        dao.read(b2);
        assertEquals("Mon chien stupide", b.getTitle());
    }

    /**
     * Test of update method, of class InMemoryBookDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Book b = new Book("99921-58-10-7", "Mon chien stupide", "John FANTE");
        BookDao dao = BookDaoFactory.getDao();

        dao.create(b);
        b.setISBN("99921-58-10-78");
        dao.update(b);
        Book b2 = new Book("99921-58-10-78");
        dao.read(b2);
        assertEquals("Mon chien stupide", b2.getTitle());

    }

    /**
     * Test of delete method, of class InMemoryBookDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Book b = new Book("99921-58-10-78", "Mon chien stupide", "John FANTE");
        BookDao dao = BookDaoFactory.getDao( BOOK_DAO_TYPE.IN_MEMORY_EMPTY );

        dao.create(b);
        Book b3 = new Book("99921-58-10-78");
        dao.read(b3);
        assertNotNull(b3.getAuthor());

        dao.delete(b);
        Book b2 = new Book("99921-58-10-78");
        dao.read(b2);
        assertNull(b2.getAuthor());

    }

    @Test
    public void testSearch() {
        System.out.println("search");

        BookDao dao = BookDaoFactory.getDao( BOOK_DAO_TYPE.IN_MEMORY_FANTE );




        List<Book> fanteBooks = dao.findByAuthor("John Fante");
        assertEquals(3, fanteBooks.size());

        for (Book book : fanteBooks) {
            assertEquals("John Fante", book.getAuthor().getName());
        }

    }
}
