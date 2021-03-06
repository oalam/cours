package entity.manager;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;


public class AbstractPersistentTest {

    // ======================================
    // =             Attributes             =
    // ======================================
    protected static EntityManagerFactory emf;
    protected static EntityManager em;
    protected static EntityTransaction tx;

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

    @BeforeClass
    public static void initEntityManager() throws Exception {
        emf = Persistence.createEntityManagerFactory("bookstorePU");
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
}