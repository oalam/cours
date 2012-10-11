/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.heritage;

/**
 *
 * @author adminl
 */
public class TestCercle {

    public static void main(String[] args) {

        // instanciation d'une ellipse
        Ellipse e = new Ellipse(2.5, 3.8);
        // calcul de sa surface
        double surface1 = e.surface();
        System.out.println("surface1 = " + surface1);

        // instanciation d'un cercle
        Ellipse c = new Cercle(8.2);
        // calcul de sa surface via la methode de la classe mere
        double surface2 = c.surface();
        System.out.println("surface2 = " + surface2);

        // !!! warning unsafe cast
        if (e instanceof Cercle) {
            Cercle c2 = (Cercle) e;
            double surface3 = c2.surface(true);
            System.out.println("surface3 = " + surface3);

        }

        System.out.println(e instanceof Cercle);   //false 
        System.out.println(e instanceof Ellipse);  //true
        System.out.println(c instanceof Cercle);   //true
        System.out.println(c instanceof Ellipse);  //true




    }
}
