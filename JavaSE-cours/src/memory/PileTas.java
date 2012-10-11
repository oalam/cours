/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author adminl
 */
public class PileTas {

    static void swap(double a, double b) {
        double tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static void swapQuiMarchePas(Point a, Point b) {
        Point tmp = a;
        a = b;
        b = tmp;

        System.out.println("during swap qui marche pas");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static void swap(Point a, Point b) {
        int tmp = a.x;
        a.x = b.x;
        b.x = tmp;


        tmp = a.y;
        a.y = b.y;
        b.y = tmp;

        System.out.println("during swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        int i = 3;
        int j = i;

        j = 4;
        System.out.println("j = " + j);
        System.out.println("i = " + i);


        Point p1 = new Point();
        Point p2 = p1;

        p1.x = -78;
        p1.y = -7;
        System.out.println("p2.x = " + p2.x);




        double d1 = 12.5;
        double d2 = 78.3;

        swap(d1, d2);
        System.out.println("after swap");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);



        Point p3 = new Point();
        p3.x = 5;
        p3.y = 7;

        System.out.println("before swap");
        System.out.println("p1 = " + p1);
        System.out.println("p3 = " + p3);
        swap(p1, p3);
        /* System.out.println("p3.x = " + p3.x);
         System.out.println("p3.y = " + p3.y);*/
        System.out.println("after swap");
        System.out.println("p1 = " + p1);
        System.out.println("p3 = " + p3);




        String s = "hello";
        String s2 = "hello";
        String s3 = new String(s);
        System.out.println(s == s2);
        System.out.println(s == s3);




    }
}
