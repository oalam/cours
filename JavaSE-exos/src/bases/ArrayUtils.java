/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.util.Scanner;

/**
 *
 * @author adminl
 */
public class ArrayUtils {

    public static boolean regulier(double[][] tab) {

        int length = tab[0].length;

        for (double[] ds : tab) {
            if (length != ds.length) {
                return false;
            }
        }

        return true;
    }

    public static boolean intervallContains(int low, int high, int n) {
        return n >= low && n <= high;
    }

    public static void affiche(double[][] tab) {

        for (double[] ds : tab) {
            affiche(ds);
        }
    }

    public static void affiche(double[] tab) {

        System.out.print("| ");
        for (double d : tab) {
            System.out.print(d + " | ");
        }
        System.out.println();
    }

    public static double[][] randomTab() {
        int n = 1 + (int) (9.0 * Math.random());
        int m = 1 + (int) (9.0 * Math.random());

        double[][] tab = new double[n][m];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = Math.random() * 100.0;
            }
        }

        return tab;
    }

    public static void main(String[] args) {
        double[] tab1 = {1.2, 5.98, -78.56};
        double[] tab2 = {0.2, 512.98, -278.56, 45.2};

        double[][] tab = {tab1, tab2};

        //  affiche(tab1);
        affiche(randomTab());

        if (regulier(tab)) {
            System.out.println("tab est régulier");
        } else {
            System.out.println("tab est irrégulier");
        }
    }
}