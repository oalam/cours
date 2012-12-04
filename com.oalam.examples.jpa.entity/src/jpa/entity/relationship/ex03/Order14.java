package jpa.entity.relationship.ex03;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "relationship_ex03_order")
public class Order14 {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "relationship_ex04_jnd_ord_line", joinColumns = @JoinColumn(name = "order_fk"), inverseJoinColumns = @JoinColumn(name = "order_line_fk"))
    private List<OrderLine14> orderLines;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Order14() {
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

    public List<OrderLine14> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine14> orderLines) {
        this.orderLines = orderLines;
    }
}