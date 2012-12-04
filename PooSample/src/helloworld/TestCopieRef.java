/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author formation
 */
public class TestCopieRef {

    public static void main(String[] args) {

        int a1 = -8, b1 = 9;

        System.out.println(a1 + ", " + b1);
        exchange(a1, b1);
        System.out.println(a1 + ", " + b1);



        IntHolder ih1 = new IntHolder();
        IntHolder ih2 = new IntHolder();

        /*  ih1.setI(-8);
        ih2.i = 9;
        
        
        
        
        System.out.println(ih1.i + ", " + ih2.i);
        exchange(ih1, ih2);
        System.out.println(ih1.i + ", " + ih2.i);
        
        ih1 = ih2;
         */


        // non static = object
        ih1.print();

        // static = class
        IntHolder.staticPrint();
        IntHolder.count++;



    }

    public static void exchange(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    public static void exchange(IntHolder a, IntHolder b) {
        /*  int c = a.i;
        a.i = b.i;
        b.i = c;*/
    }
}
