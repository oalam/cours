package entity.manager;



import java.util.List;
import javax.persistence.Query;
import jpa.manager.jpql.*;
import org.junit.*;
import static org.junit.Assert.*;


public class JPQLTest extends AbstractPersistentTest {

    // ======================================
    // =              Constants             =
    // ======================================
    private static final int ALL = 6;

    // ======================================
    // =              Unit tests            =
    // ======================================

    @Test
    public void dynamicQueries() throws Exception {

        Customer03 customer01 = new Customer03("Antony", "Balla", "tballa@mail.com", 14);
        Address03 address01 = new Address03("Procession St", "Paris", "75015", "FR");
        customer01.setAddress(address01);

        Customer03 customer02 = new Customer03("Vincent", "Johnson", "vj@mail.com", 45);
        Address03 address02 = new Address03("Ritherdon Rd", "London", "8QE", "UK");
        customer02.setAddress(address02);

        Customer03 customer03 = new Customer03("Sebastian", "Twenty", "seb@yamail.com", 58);
        Address03 address03 = new Address03("Inacio Alfama", "Lisbon", "A54", "PT");
        customer03.setAddress(address03);

        Customer03 customer04 = new Customer03("Frederic", "Riou", "fred@carmail.com", 41);
        Address03 address04 = new Address03("Jardins", "Sao Paulo", "345678", "BR");
        customer04.setAddress(address04);

        Customer03 customer05 = new Customer03("Vincent", "Dubosc", "vd@yahoo.com", 14);
        Address03 address05 = new Address03("Coffey", "Perth", "654F543", "AU");
        customer05.setAddress(address05);

        Customer03 customer06 = new Customer03("David", "Chene", "dch@yahoo.com", 89);
        Address03 address06 = new Address03("Harbour Bridge", "Sydney", "JHG3", "AU");
        customer06.setAddress(address06);

        // Persist the object
        tx.begin();
        em.persist(customer01);
        em.persist(customer02);
        em.persist(customer03);
        em.persist(customer04);
        em.persist(customer05);
        em.persist(customer06);
        tx.commit();

        Query query = em.createQuery("select c from Customer03 c");
        List<Customer03> customers = query.getResultList();
        assertEquals(ALL, customers.size());

        query = em.createQuery("select c from Customer03 c");
        query.setMaxResults(3);
        assertEquals(3, query.getResultList().size());

        boolean someCriteria = true;
        String jpqlQuery = "select c from Customer03 c";
        if (someCriteria)
            jpqlQuery += " where c.firstName = 'Vincent'";
        query = em.createQuery(jpqlQuery);
        assertEquals(2, query.getResultList().size());

        jpqlQuery = "select c from Customer03 c";
        if (someCriteria)
            jpqlQuery += " where c.firstName = :fname";
        query = em.createQuery(jpqlQuery);
        query.setParameter("fname", "Vincent");
        assertEquals(2, query.getResultList().size());

        jpqlQuery = "select c from Customer03 c";
        if (someCriteria)
            jpqlQuery += " where c.firstName = ?1";
        query = em.createQuery(jpqlQuery);
        query.setParameter(1, "Vincent");
        assertEquals(2, query.getResultList().size());

        query = em.createQuery("select c from Customer03 c  where c.firstName = :fname");
        query.setParameter("fname", "Vincent");
        query.setMaxResults(1);
        assertEquals(1, query.getResultList().size());

        query = em.createQuery("select c from Customer03 c  where c.firstName = :fname").setParameter("fname", "Vincent").setMaxResults(1);
        assertEquals(1, query.getResultList().size());

        // Remove objects
        tx.begin();
        em.remove(customer01);
        em.remove(customer02);
        em.remove(customer03);
        em.remove(customer04);
        em.remove(customer05);
        em.remove(customer06);
        tx.commit();

    }

    @Test
    public void namedQueries() throws Exception {

        Customer03 customer01 = new Customer03("Antony", "Balla", "tballa@mail.com", 14);
        Address03 address01 = new Address03("Procession St", "Paris", "75015", "FR");
        customer01.setAddress(address01);

        Customer03 customer02 = new Customer03("Vincent", "Johnson", "vj@mail.com", 45);
        Address03 address02 = new Address03("Ritherdon Rd", "London", "8QE", "UK");
        customer02.setAddress(address02);

        Customer03 customer03 = new Customer03("Sebastian", "Twenty", "seb@yamail.com", 58);
        Address03 address03 = new Address03("Inacio Alfama", "Lisbon", "A54", "PT");
        customer03.setAddress(address03);

        Customer03 customer04 = new Customer03("Frederic", "Riou", "fred@carmail.com", 41);
        Address03 address04 = new Address03("Jardins", "Sao Paulo", "345678", "BR");
        customer04.setAddress(address04);

        Customer03 customer05 = new Customer03("Vincent", "Dubosc", "vd@yahoo.com", 14);
        Address03 address05 = new Address03("Coffey", "Perth", "654F543", "AU");
        customer05.setAddress(address05);

        Customer03 customer06 = new Customer03("David", "Chene", "dch@yahoo.com", 89);
        Address03 address06 = new Address03("Harbour Bridge", "Sydney", "JHG3", "AU");
        customer06.setAddress(address06);

        // Persist the object
        tx.begin();
        em.persist(customer01);
        em.persist(customer02);
        em.persist(customer03);
        em.persist(customer04);
        em.persist(customer05);
        em.persist(customer06);
        tx.commit();

        Query query = em.createNamedQuery("findAll");
        List<Customer03> customers = query.getResultList();
        assertEquals(ALL, customers.size());

        query = em.createNamedQuery(Customer03.FIND_ALL);
        assertEquals(ALL, query.getResultList().size());

        query = em.createNamedQuery("findAll");
        query.setMaxResults(3);
        assertEquals(3, query.getResultList().size());

        query = em.createNamedQuery("findVincent");
        assertEquals(2, query.getResultList().size());

        query = em.createNamedQuery("findWithParam");
        query.setParameter("fname", "Vincent");
        assertEquals(2, query.getResultList().size());

        // Remove objects
        tx.begin();
        em.remove(customer01);
        em.remove(customer02);
        em.remove(customer03);
        em.remove(customer04);
        em.remove(customer05);
        em.remove(customer06);
        tx.commit();
    }

    @Test
    public void nativeQueries() throws Exception {

        Customer03 customer01 = new Customer03("Antony", "Balla", "tballa@mail.com", 14);
        Address03 address01 = new Address03("Procession St", "Paris", "75015", "FR");
        customer01.setAddress(address01);

        Customer03 customer02 = new Customer03("Vincent", "Johnson", "vj@mail.com", 45);
        Address03 address02 = new Address03("Ritherdon Rd", "London", "8QE", "UK");
        customer02.setAddress(address02);

        Customer03 customer03 = new Customer03("Sebastian", "Twenty", "seb@yamail.com", 58);
        Address03 address03 = new Address03("Inacio Alfama", "Lisbon", "A54", "PT");
        customer03.setAddress(address03);

        Customer03 customer04 = new Customer03("Frederic", "Riou", "fred@carmail.com", 41);
        Address03 address04 = new Address03("Jardins", "Sao Paulo", "345678", "BR");
        customer04.setAddress(address04);

        Customer03 customer05 = new Customer03("Vincent", "Dubosc", "vd@yahoo.com", 14);
        Address03 address05 = new Address03("Coffey", "Perth", "654F543", "AU");
        customer05.setAddress(address05);

        Customer03 customer06 = new Customer03("David", "Chene", "dch@yahoo.com", 89);
        Address03 address06 = new Address03("Harbour Bridge", "Sydney", "JHG3", "AU");
        customer06.setAddress(address06);

        // Persist the object
        tx.begin();
        em.persist(customer01);
        em.persist(customer02);
        em.persist(customer03);
        em.persist(customer04);
        em.persist(customer05);
        em.persist(customer06);
        tx.commit();

        Query query = em.createNativeQuery("select * from JPQL_EX01_CUSTOMER", Customer03.class);
        List<Customer03> customers = query.getResultList();
        assertEquals(ALL, customers.size());

//        query = em.createNativeQuery("findAllNative");
//        customers = query.getResultList();
//        assertEquals(ALL, customers.size());
//
//        query = em.createNativeQuery("select lastname from JPQL_EX01_CUSTOMER", String.class);
//        List<String> customersNames = query.getResultList();
//        assertEquals(ALL, customersNames.size());

        // Remove objects
        tx.begin();
        em.remove(customer01);
        em.remove(customer02);
        em.remove(customer03);
        em.remove(customer04);
        em.remove(customer05);
        em.remove(customer06);
        tx.commit();
    }

    @Test
    public void queries() throws Exception {

        Customer03 customer01 = new Customer03("Antony", "Balla", "tballa@mail.com", 14);
        Address03 address01 = new Address03("Procession St", "Paris", "75015", "FR");
        customer01.setAddress(address01);

        Customer03 customer02 = new Customer03("Vincent", "Johnson", "vj@mail.com", 45);
        Address03 address02 = new Address03("Ritherdon Rd", "London", "8QE", "UK");
        customer02.setAddress(address02);

        Customer03 customer03 = new Customer03("Sebastian", "Twenty", "seb@yamail.com", 58);
        Address03 address03 = new Address03("Inacio Alfama", "Lisbon", "A54", "PT");
        customer03.setAddress(address03);

        Customer03 customer04 = new Customer03("Frederic", "Riou", "fred@carmail.com", 41);
        Address03 address04 = new Address03("Jardins", "Sao Paulo", "345678", "BR");
        customer04.setAddress(address04);

        Customer03 customer05 = new Customer03("Vincent", "Dubosc", "vd@yahoo.com", 14);
        Address03 address05 = new Address03("Coffey", "Perth", "654F543", "AU");
        customer05.setAddress(address05);

        Customer03 customer06 = new Customer03("David", "Chene", "dch@yahoo.com", 89);
        Address03 address06 = new Address03("Harbour Bridge", "Sydney", "JHG3", "AU");
        customer06.setAddress(address06);

        // Persist the object
        tx.begin();
        em.persist(customer01);
        em.persist(customer02);
        em.persist(customer03);
        em.persist(customer04);
        em.persist(customer05);
        em.persist(customer06);
        tx.commit();

        Query query = em.createQuery("select c from Customer03 c");
        assertEquals(ALL, query.getResultList().size());

        query = em.createQuery("select c.firstName from Customer03 c");
        assertEquals(ALL, query.getResultList().size());

//TODO        query = em.createQuery("select LOWER(c.firstName) from Customer03 c");
//        assertEquals(ALL, query.getResultList().size());

        query = em.createQuery("select c.firstName, c.lastName  from Customer03 c");
        assertEquals(ALL, query.getResultList().size());

        query = em.createQuery("select distinct c.firstName from Customer03 c");
        assertEquals(ALL - 1, query.getResultList().size());

        query = em.createQuery("select c from Customer03 c where c.firstName = 'Vincent'");
        assertEquals(2, query.getResultList().size());

        query = em.createQuery("select c.address from Customer03 c where c.firstName = 'Vincent'");
        assertEquals(2, query.getResultList().size());

        query = em.createQuery("select c from Customer03 c where c.address.country = 'AU'");
        assertEquals(2, query.getResultList().size());

        query = em.createQuery("select new jpa.manager.jpql.CustomerDTO(c.firstName, c.lastName, c.address.country) from Customer03 c where c.firstName = 'Vincent'");
        assertEquals(2, query.getResultList().size());

        query = em.createQuery("select count(c) from Customer03 c where c.firstName = 'Vincent'");
        assertEquals(2L, query.getSingleResult());

        query = em.createQuery("select c from Customer03 c where c.age > 40");
        assertEquals(4, query.getResultList().size());

        query = em.createQuery("select c from Customer03 c where c.age between 40 and 50");
        assertEquals(2, query.getResultList().size());

        query = em.createQuery("select c from Customer03 c where c.age not between 40 and 50");
        assertEquals(4, query.getResultList().size());

        query = em.createQuery("select c from Customer03 c where c.address.country in ('UK', 'FR')");
        assertEquals(2, query.getResultList().size());

        query = em.createQuery("select c from Customer03 c where c.email like '%mail.com'");
        assertEquals(4, query.getResultList().size());

        query = em.createQuery("select min(c.age) from Customer03 c");
        assertEquals(14, query.getSingleResult());

        query = em.createQuery("select c.address.country, count(c) from Customer03 c group by c.address.country");
        assertEquals(5, query.getResultList().size());

//        query = em.createQuery("select c.address.country, count(c) from Customer03 c group by c.address.country having count(c) > 1");
//         assertEquals(1, query.getResultList().size());

//        query = em.createQuery("select c from Customer03 c where c.age = (select min(c.age) from Customer03 c)");
//        assertEquals(2, query.getResultList().size());

        tx.begin();
        query = em.createQuery("update Customer03 c set c.firstName = 'TOO YOUNG' where c.age < 18");
        assertEquals(2, query.executeUpdate());
        tx.commit();

        tx.begin();
        query = em.createQuery("delete from Customer03 c where c.age < 18");
        assertEquals(2, query.executeUpdate());
        tx.commit();

        // Remove objects
        tx.begin();
        em.remove(customer01);
        em.remove(customer02);
        em.remove(customer03);
        em.remove(customer04);
        em.remove(customer05);
        em.remove(customer06);
        tx.commit();

    }
}

