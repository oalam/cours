package jpa.manager.manipulating.ex02;

import jpa.manager.manipulating.ex02.Customer01;
import jpa.manager.manipulating.ex02.Address01;
import jpa.manager.AbstractPersistentTest;
import static org.junit.Assert.*;
import org.junit.Test;

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
    public void persistCustomerNoSetAddress() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");
        Address01 address = new Address01("Ritherdon Rd", "London", "8QE", "UK");

        // Persist the object
        tx.begin();
        em.persist(customer);
        em.persist(address);
        tx.commit();

        assertNotNull(customer.getId());
        assertNotNull(address.getId());
    }

    @Test
    public void persistCustomerSetAddress() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");
        Address01 address = new Address01("Ritherdon Rd", "London", "8QE", "UK");
        customer.setAddress(address);

        // Persist the object
        tx.begin();
        em.persist(customer);
        em.persist(address);
        tx.commit();

        assertNotNull(customer.getId());
        assertNotNull(address.getId());
    }

    @Test
    public void refreshCustomer() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");
        Address01 address = new Address01("Ritherdon Rd", "London", "8QE", "UK");
        customer.setAddress(address);

        // Persist the object
        tx.begin();
        em.persist(customer);
        em.persist(address);
        tx.commit();

        assertNotNull(customer.getId());
        assertNotNull(address.getId());

        customer = em.find(Customer01.class, customer.getId());
        assertNotNull(customer);
        assertEquals(customer.getFirstName(), "Antony");

        customer.setFirstName("New first name");
        assertEquals(customer.getFirstName(), "New first name");

        em.refresh(customer);
        assertEquals(customer.getFirstName(), "Antony");
    }

    @Test
    public void removeCustomer() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");
        Address01 address = new Address01("Ritherdon Rd", "London", "8QE", "UK");
        customer.setAddress(address);

        // Persist the object
        tx.begin();
        em.persist(customer);
        em.persist(address);
        tx.commit();

        assertNotNull(customer.getId());
        assertNotNull(address.getId());

        // Removes the object
        tx.begin();
        em.remove(customer);
        em.remove(address);
        tx.commit();

        assertEquals(customer.getFirstName(), "Antony");
        assertEquals(address.getCity(), "London");

        customer = em.find(Customer01.class, customer.getId());
        assertNull(customer);
        address = em.find(Address01.class, address.getId());
        assertNull(address);
    }

    @Test
    public void updateCustomer() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");

        // Persist the object
        tx.begin();
        em.persist(customer);

        assertNotNull(customer.getId());
        assertEquals(customer.getFirstName(), "Antony");

        customer.setFirstName("Williman");
        assertEquals(customer.getFirstName(), "Williman");

        tx.commit();
    }

    @Test
    public void updateCustomerWithClear() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");

        // Persist the object
        tx.begin();
        em.persist(customer);
        tx.commit();
        assertTrue(em.contains(customer));

        em.clear();
        assertFalse(em.contains(customer));

        customer = em.find(Customer01.class, customer.getId());
        assertEquals(customer.getFirstName(), "Antony");
        assertTrue(em.contains(customer));

    }

    @Test
    public void mergingCustomer() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");

        // Persist the object
        tx.begin();
        em.persist(customer);
        tx.commit();
        assertTrue(em.contains(customer));

        em.clear();
        assertFalse(em.contains(customer));

        customer.setFirstName("William");
        tx.begin();
        em.merge(customer);
        tx.commit();

        em.clear();
        assertFalse(em.contains(customer));

        customer = em.find(Customer01.class, customer.getId());
        assertEquals(customer.getFirstName(), "William");
        assertTrue(em.contains(customer));

    }

    @Test
    public void containsCustomer() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");

        // Persist the object
        tx.begin();
        em.persist(customer);
        tx.commit();

        assertTrue(em.contains(customer));

        // Removes the object
        tx.begin();
        em.remove(customer);
        tx.commit();

        assertFalse(em.contains(customer));
    }

    @Test
    public void persistCustomer() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");

        // Persist the object
        tx.begin();
        em.persist(customer);
        tx.commit();

        assertNotNull(customer.getId());
    }

    @Test
    public void persistAddress() throws Exception {

        Address01 address = new Address01("Ritherdon Rd", "London", "8QE", "UK");

        // Persist the object
        tx.begin();
        em.persist(address);
        tx.commit();

        assertNotNull(address.getId());
    }

    @Test
    public void findCustomer() throws Exception {

        Customer01 customer = new Customer01("Antony", "Balla", "tballa@mail.com");
        Address01 address = new Address01("Ritherdon Rd", "London", "8QE", "UK");
        customer.setAddress(address);

        // Persist the object
        tx.begin();
        em.persist(customer);
        em.persist(address);
        tx.commit();

        assertNotNull(customer.getId());
        assertNotNull(address.getId());

        // Clear
        em.clear();

        customer = em.find(Customer01.class, customer.getId());
        assertNotNull(customer);
    }
}