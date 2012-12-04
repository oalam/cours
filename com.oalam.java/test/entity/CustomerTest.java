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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {

        
        Customer c = new Customer();
        Address a = new Address();
        
        c.setAddress(a);
        c.setEmail("plik@zer.com");
        c.setFirstName("tom");
        c.setLastName("b");
        c.setPhoneNumber("8989898989");
        
        a.setCity("marseille");
        a.setZipcode("12345");
        
        // 2. Création d’un gestionnaire d’entités et d’une
        // transaction.
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("bookstorePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(c);
      //  em.persist(a);
        tx.commit();
        
        // 4. Récupération du livre par son identifiant.
        Customer c2 = em.find(Customer.class, c.getId());
        
        assertNotNull(c2);
        em.close();
        emf.close();
    }

}
