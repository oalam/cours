/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.util.Scanner;

/**
 * programme qui lit le prix HT d’un article, le nombre d’articles et le taux de
 * TVA, et qui fournit le prix total TTC correspondant. Faire en sorte que des
 * libellés apparaissent clairement.
 */
public class Tva {

    public static void main(String[] args) {

        // Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Prix de l'article : ");
        float prix = sc.nextFloat();

        System.out.println("Nombre d'articles : ");
        int nbArticles = sc.nextInt();

        System.out.println("Taux de tva (%): ");
        float tva = sc.nextFloat() / 100.0f;

        float totalTTC = nbArticles * prix * (1.0f - tva);
        System.out.println( "Total TTC : " + totalTTC );
       
    }
}
