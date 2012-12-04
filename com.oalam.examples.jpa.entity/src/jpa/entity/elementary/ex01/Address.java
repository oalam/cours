package jpa.entity.elementary.ex01;

import javax.persistence.*;

@Entity
@Table(name = "elementary_ex01_address")
@SecondaryTables({
        @SecondaryTable(name = "elementary_ex01_city"),
        @SecondaryTable(name = "elementary_ex01_country")
})
public class Address {

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    private Long id;
    private String street1;
    private String street2;
    @Column(table = "elementary_ex01_city")
    private String city;
    @Column(table = "elementary_ex01_city")
    private String state;
    @Column(table = "elementary_ex01_city")
    private String zipcode;
    @Column(table = "elementary_ex01_country")
    private String country;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Address() {
    }

    public Address(Long id, String street1, String street2, String city, String state, String zipcode, String country) {
        this.id = id;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}