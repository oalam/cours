/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.serialization;

import java.io.*;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HumanBooster
 */
public class DepartmentDao {

    private String fileName = "dept.txt";

    @Deprecated
    public void load(Department dep) {

        try (
                FileInputStream fichier = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fichier);) {
            
            // paranormal activity
            // dep = (Department) ois.readObject();


            Department tmp = (Department) ois.readObject();
            dep.clone(tmp);




        } catch (FileNotFoundException ex) {
            Logger.getLogger(DepartmentDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DepartmentDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartmentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void save(Department dep) {

        try (
                FileOutputStream fichier = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fichier);) {

            oos.writeObject(dep);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DepartmentDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DepartmentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        Department dep = new Department();

        dep.name = "Regus";
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.name = "tom";
        emp2.email = "tom@zer.com";
        dep.employees.add(emp1);
        dep.employees.add(emp2);

        DepartmentDao dao = new DepartmentDao();

        dao.save(dep);
        Department dep2 = new Department();

        dao.load(dep2);

        System.out.println("dep2.name = " + dep2.name);
        for (Employee emp : dep2.employees) {
            System.out.println("emp = " + emp.name + " _ " + emp.email);
        }

    }
}
