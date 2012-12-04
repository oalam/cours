package jpa.entity.relationship.ex03fk;

import jpa.entity.AbstractPersistentTest;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.ArrayList;

/**
 *
 *
 *
 *
 *         --
 *         Test class that creates a Customer
 */
public class OrderTest extends AbstractPersistentTest {

    // ======================================
    // =              Unit tests            =
    // ======================================
    @Test
    public void createOrder() throws Exception {

        Order14Fk order = new Order14Fk();
        OrderLine14Fk ol1 = new OrderLine14Fk("H2G2", 12d, 1);
        OrderLine14Fk ol2 = new OrderLine14Fk("The White Album", 14.5d, 2);
        List<OrderLine14Fk> orderLines = new ArrayList<OrderLine14Fk>();
        orderLines.add(ol1);
        orderLines.add(ol2);
        order.setOrderLines(orderLines);
        tx.begin();
        em.persist(order);
        em.persist(ol1);
        em.persist(ol2);
        tx.commit();
        assertNotNull("Order ID should not be null", order.getId());
        assertNotNull("OL1 ID should not be null", ol1.getId());
        assertNotNull("OL1 ID should not be null", ol2.getId());

        order = em.find(Order14Fk.class, order.getId());
        assertNotNull("OrderLines should not be null", order.getOrderLines());
        assertEquals("Should have 2 order lines", order.getOrderLines().size(), 2);
    }
}