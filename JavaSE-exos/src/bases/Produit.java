/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.util.Scanner;

/**
 *
 * Ecrire un algorithme qui demande deux nombres à l’utilisateur et l’informe
 * ensuite si leur produit est négatif ou positif (on laisse de côté le cas où
 * le produit est nul). Attention toutefois : on ne doit pas calculer le produit
 * des deux nombres.
 */
public class Produit {

    public static void main(String[] args) {

        // Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre 1 : ");
        int n1 = sc.nextInt();

        System.out.println("Nombre 2 : ");
        int n2 = sc.nextInt();


        if ((n1 > 0 && n2 > 0)
                || (n1 < 0 && n2 < 0)) {
            System.out.println("Produit positif");
        } else {
            System.out.println("Produit négatif");
        }

    }
}
