package jpa.entity.inheritance.ex01;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name="disc", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("I")
@Table(name = "inheritance_ex01_item")
public class Item01 {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Id
    @GeneratedValue
    protected Long id;
    protected String title;
    protected Float price;
    protected String description;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Item01() {
    }

    public Item01(String title, Float price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}