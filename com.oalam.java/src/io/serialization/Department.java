/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.serialization;

import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HumanBooster
 */
public class Department implements Serializable{
    
    public List<Employee> employees = new ArrayList<>();
    public String name;

 
    void clone(Department tmp) {
        
        
        this.name = tmp.name;
      
        for (Employee employee : tmp.employees) {
            this.employees.add(employee);
        }
        
    }
        
    
}
