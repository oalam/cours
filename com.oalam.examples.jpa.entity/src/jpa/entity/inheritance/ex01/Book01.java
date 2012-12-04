package jpa.entity.inheritance.ex01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;


@Entity
@DiscriminatorValue("B")
public class Book01 extends Item01 {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String isbn;
    private String publisher;
    private Integer nbOfPage;
    private Boolean illustrations;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Book01() {
    }

    public Book01(String title, Float price, String description, String isbn, String publisher, Integer nbOfPage, Boolean illustrations) {
        super(title, price, description);
        this.isbn = isbn;
        this.publisher = publisher;
        this.nbOfPage = nbOfPage;
        this.illustrations = illustrations;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }
}