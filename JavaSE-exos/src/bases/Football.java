/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.util.Scanner;

/**
 *
 * Ecrire un algorithme qui demande l’âge d’un enfant à l’utilisateur. Ensuite,
 * il l’informe de sa catégorie : - “Poussin” de 6 à 7 ans - “Pupille” de 8 à 9
 * ans - “Minime” de 10 à 11 ans - “Cadet” après 12 ans
 *
 * Peut-on concevoir plusieurs algorithmes équivalents menant à ce résultat ?
 */
public class Football {

    public static void main(String[] args) {
// Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Votre age : ");
        int age = sc.nextInt();

        if (age < 6) {
            System.out.println("va jouer aux billes");
        } else {
            switch (age) {
                case 6:
                case 7:
                    System.out.println("poussin");
                    break;
                case 8:
                case 9:
                    System.out.println("Pupille");
                    break;
                case 10:
                case 11:
                    System.out.println("Minime");
                    break;
                default:
                    System.out.println("Cadet");
            }
        }
        
      

    }
}
