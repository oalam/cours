package jpa.entity.inheritance.ex05;
import javax.persistence.*;

public class Item05 {

    // ======================================
    // =             Attributes             =
    // ======================================

    protected String title;
    protected Float price;
    protected String description;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Item05() {
    }

    public Item05(String title, Float price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

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