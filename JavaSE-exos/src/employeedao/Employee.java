/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedao;

import java.io.Serializable;

/**
 *
 * @author adminl
 */
public class Employee implements Serializable {

    String name;
    String address;
    double salary;

    public Employee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }
    
    
}
