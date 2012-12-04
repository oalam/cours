/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import com.atos.poo.*;

/**
 *
 * @author formation
 */
public class TestCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {




        PointCollection col = new PointCollection(10);

        Point p1 = new Point();
        p1.setX(12.3);
        p1.setY(78.2);

        Point p2 = new Point();
        p2.setX(12.3);
        p2.setY(78.2);

        p1 = p2;

        if (p1.equals(p2)) {
            System.out.println("egal point");
        }



        String str1 = "plok";
        String str2 = "plok";


        if (str1.equals(str2)) {
            System.out.println("egal");
        }

        col.add(p1);
        col.add(new Point());

        col.delete(5);




    }
}
