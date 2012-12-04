package jpa.entity.relationship.ex03fk;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "relationship_ex03fk_order")
public class Order14Fk {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_fk")
    private List<OrderLine14Fk> orderLines;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Order14Fk() {
        this.creationDate = new Date();
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<OrderLine14Fk> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine14Fk> orderLines) {
        this.orderLines = orderLines;
    }
}