package jpa.entity.elementary.ex03;

import static jpa.entity.Constants.PERSISTENCE_UNIT_NAME;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;

/**
 *
 *
 *
 *
 *         --
 *         Test class that creates a News (using the IdClass annotation)
 */
public class NewsTest {

    // ======================================
    // =             Attributes             =
    // ======================================
    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction tx;

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================
    @BeforeClass
    public static void initEntityManager() throws Exception {
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = emf.createEntityManager();
    }

    @AfterClass
    public static void closeEntityManager() throws SQLException {
        em.close();
        emf.close();
    }

    @Before
    public void initTransaction() {
        tx = em.getTransaction();
    }

    // ======================================
    // =              Unit tests            =
    // ======================================
    @Test
    public void createNews() throws Exception {

        NewsIdClass news = new NewsIdClass("Richard Wright has died", "EN", "The keyboard of Pink Floyd has died today");
        tx.begin();
        em.persist(news);
        tx.commit();
        assertNotNull("ID should not be null", news.getTitle());
    }
}