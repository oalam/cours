package jpa.entity.inheritance.ex07;

import jpa.entity.AbstractPersistentTest;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 *
 *
 *
 *         --
 */
public class InheritanceTest extends AbstractPersistentTest {

    // ======================================
    // =              Unit tests            =
    // ======================================
    @Test
    public void createItems() throws Exception {

        Book07 book01 = new Book07("H2G2", 21f, "Best IT book", "123-456-789", "Pinguin", 321, false);
        tx.begin();
        em.persist(book01);
        tx.commit();
        assertNotNull("Book1 ID should not be null", book01.getId());
    }
}