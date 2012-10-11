/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author adminl
 */
public class FileDepartementDao implements DepartementDao {

    @Override
    public void save(Department dep) {

        try {
            FileOutputStream fichier = new FileOutputStream(dep.getName());
            ObjectOutputStream oos = new ObjectOutputStream(fichier);
            oos.writeObject(dep);
            oos.flush();
            oos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load(Department dep) {

        try {
            FileInputStream fichier = new FileInputStream(dep.getName());
            ObjectInputStream ois = new ObjectInputStream(fichier);
            Department tmp = (Department) ois.readObject();
            dep.cloneContent(tmp);
           /* 
            dep = (Department) ois.readObject();*/

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
