package jpa.entity.inheritance.ex02;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "inheritance_ex02_cd")
public class CD02 extends Item02 {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String musicCompany;
    private Integer numberOfCDs;
    private Float totalDuration;
    private String gender;

    // ======================================
    // =            Constructors            =
    // ======================================

    public CD02() {
    }

    public CD02(String title, Float price, String description, String musicCompany, Integer numberOfCDs, Float totalDuration, String gender) {
        super(title, price, description);
        this.musicCompany = musicCompany;
        this.numberOfCDs = numberOfCDs;
        this.totalDuration = totalDuration;
        this.gender = gender;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getMusicCompany() {
        return musicCompany;
    }

    public void setMusicCompany(String musicCompany) {
        this.musicCompany = musicCompany;
    }

    public Integer getNumberOfCDs() {
        return numberOfCDs;
    }

    public void setNumberOfCDs(Integer numberOfCDs) {
        this.numberOfCDs = numberOfCDs;
    }

    public Float getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Float totalDuration) {
        this.totalDuration = totalDuration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}