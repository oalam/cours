package jpa.entity.relationship.ex05;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "relationship_ex06_country")
public class Country16 {

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    @GeneratedValue
    private String isoCode;
    private String country;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Country16() {
    }

    public Country16(String isoCode, String country) {
        this.isoCode = isoCode;
        this.country = country;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
