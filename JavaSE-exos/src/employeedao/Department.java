/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedao;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adminl
 */
public class Department implements Serializable {

    String name;
    Set<Employee> employees = new HashSet<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    

    public Employee addEmployee(String name,
            String address, double salary) {

        Employee e = new Employee(name, address, salary);
        employees.add(e);

        return e;
    }

    public void removeEmployee(String employeeName) {
        Employee e = find( employeeName);
        if (e != null) {
            employees.remove(e);
        }

    }

    public Employee find( String employeeName) {


        for (Employee employee : employees) {
            if (employee.getName().equals(employeeName)) {

                return employee;
            }
        }
        return null;

    }

    void cloneContent(Department tmp) {
         for (Employee employee : tmp.employees) {
            employees.add(employee);
        }
    }
}
