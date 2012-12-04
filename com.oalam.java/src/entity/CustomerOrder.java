/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author HumanBooster
 */
@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(fetch = FetchType.EAGER,
    cascade = CascadeType.ALL)
    @JoinColumn(name = "order_fk")
    private List<OrderItem> orderItems;
// Constructeurs, getters, setters

    public CustomerOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public static void main(String[] args) {
        CustomerOrder o = new CustomerOrder();

        OrderItem oi1 = new OrderItem();
        OrderItem oi2 = new OrderItem();

        oi1.setItem("plik");
        oi1.setQuantity(2);
        oi1.setUnitPrice(12.8);


        oi2.setItem("plok");
        oi2.setQuantity(5);
        oi2.setUnitPrice(1.8);

        List<OrderItem> items = new ArrayList<OrderItem>();
        items.add(oi2);
        items.add(oi1);

        o.setOrderItems(items);



        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("bookstorePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


        tx.begin();
        // em.persist(oi2);
        //em.persist(oi1);

        em.persist(o);

        tx.commit();


        em.close();
        emf.close();


    }
}