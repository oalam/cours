/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;
import testit.*;

/**
 *
 * @author formation
 */
public class HelloWorld {

    public static void fonction1() {


        boolean b = true;

        // types entiers
        short s = 1;
        int i = 0;
        byte by = 45;
        long l = 15L;

        // caractere
        char c = 'a';

        // nombres reels
        float f = 12.2f;
        double d = 12.2;


        



        Integer ii = Integer.getInteger("78998");
        i = ii.intValue();


      //  double d = Double.parseDouble("45.45");


    }

    public static void fonction2(int x, int y) {
        System.out.println("hello");
        int tmp = x;
        x = y;
        y = x;
        x = tmp;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un mot :");
        String str;//= sc.nextLine();

        int a = 1, b = 2;
        System.out.println(a + "   " + b);
        fonction2(a, b);

        System.out.println(a + "   " + b);
        double[] values = {0.0, -0.0};

        for (double v : values) {
            System.out.println(3 / v);
            System.out.println(v / 0.0);
        }


        {
            
            {
                
            }
        }
        System.out.println("Vous avez saisi : " + "ert");


        // int number = Integer.getInteger(str);






        boolean y = true;

        double d = 12.0;
        char t = 'z';


        a = 10;
        b = 78;
        b = a;

        String str2 = "azrzetre";

        if (a < 20) {
            System.out.println(" a inf a 20");
        } else {
            System.out.println(" a sup a 20");
        }

        for (int i = 0; i < 10; i++) {
            String temp = "i = ";
            temp += i;

            System.out.println(temp);
        }

        // premier instruction a =10
        while (a < 100) {
            System.out.println(" a inf a 20");
            a += 2;
        }









        com.atos.formation.sample.Toto toto = null;
        testit.Toto toto2 = null;

        
        ti ttt =  null;
        
        


    }

   
}
