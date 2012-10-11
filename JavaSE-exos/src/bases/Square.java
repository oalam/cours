/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.util.Scanner;

/**
 *
 * Programme qui demande un nombre à l’utilisateur,
 * puis qui calcule et affiche le carré de ce nombre.
 */
public class Square {

    public static void main(String[] args) {
        // Initialisation du Scanner
        Scanner sc = new Scanner(System.in);
        
        // Lecture du nombre
        System.out.println("Donnez un nombre entier svp");
        int nb = sc.nextInt();
        
        // Calcul du carré
        int nbSquare = nb * nb;
        System.out.println("Le carré de " + nb + " est " + nbSquare);
    }
}
