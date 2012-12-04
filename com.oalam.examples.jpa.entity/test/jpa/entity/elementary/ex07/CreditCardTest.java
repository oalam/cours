package jpa.entity.elementary.ex07;

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
 *         Test class that creates a Customer
 */
public class CreditCardTest {

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
    public void createCreditCard() throws Exception {

        CreditCard creditCard = new CreditCard("123412341234", "12/12", 1253, CreditCardType.AMERICAN_EXPRESS);
        tx.begin();
        em.persist(creditCard);
        tx.commit();
        assertNotNull("ID should not be null", creditCard.getNumber());
    }
}