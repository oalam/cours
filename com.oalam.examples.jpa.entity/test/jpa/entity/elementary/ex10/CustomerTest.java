package jpa.entity.elementary.ex10;

import jpa.entity.AbstractPersistentTest;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 *
 *
 *
 *         --
 *         Test class that creates a Customer
 */
public class CustomerTest extends AbstractPersistentTest{

    // ======================================
    // =              Unit tests            =
    // ======================================
    @Test
    public void createCustomer() throws Exception {

        CustomerAccess customer = new CustomerAccess("John", "Smith", "jsmith@gmail.com", "1234565");
        tx.begin();
        em.persist(customer);
        tx.commit();
        assertNotNull("ID should not be null", customer.getId());
    }
}