package jpa.manager.jpql;

import javax.persistence.*;


@Entity
@Table(name = "jpql_ex01_customer")
@NamedQueries({
        @NamedQuery(name = "findAll", query="select c from Customer03 c"),
        @NamedQuery(name = Customer03.FIND_ALL, query="select c from Customer03 c"),
        @NamedQuery(name = "findVincent", query="select c from Customer03 c where c.firstName = 'Vincent'"),
        @NamedQuery(name = "findWithParam", query="select c from Customer03 c where c.firstName = :fname")
})
@NamedNativeQueries({
        @NamedNativeQuery(name = "findAllNative", query="select * from JPQL_EX01_CUSTOMER", resultClass = Customer03.class)
})
public class Customer03 {

    public static final String FIND_ALL = "Customer.findAll";

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    @OneToOne (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "address_fk")
    private Address03 address;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Customer03() {
    }

    public Customer03(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address03 getAddress() {
        return address;
    }

    public void setAddress(Address03 address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}