/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author HumanBooster
 */
@Entity
@Table(name = "credit_card")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    private Integer controlNumber;
    @Enumerated(EnumType.STRING)
    private CreditCardType creditCardType;
// Constructeurs, getters et setters

    public CreditCard() {
    }

    public Integer getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(Integer controlNumber) {
        this.controlNumber = controlNumber;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public static void main(String[] args) {
        CreditCard cc = new CreditCard();

        cc.setControlNumber(234);
        cc.setCreditCardType(CreditCardType.VISA);
        cc.setExpiryDate(new Date());


        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("bookstorePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(cc);
        tx.commit();


        em.close();
        emf.close();


    }
}
