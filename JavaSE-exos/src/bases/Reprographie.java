/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.util.Scanner;

/**
 *
 * Un magasin de reprographie facture 0,10 E les dix premières photocopies, 0,09
 * E les vingt suivantes et 0,08 E au-delà. Ecrivez un algorithme qui demande à
 * l’utilisateur le nombre de photocopies effectuées et qui affiche la facture
 * correspondante.
 */
public class Reprographie {

    private static int getNbPhotocopies() {
        // Initialisation du Scanner
        Scanner sc = new Scanner(System.in);
Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Nombre de photocopies : ");
        return sc.nextInt();
    }

    private static double calculTotal(int nbPhotocopies) {
        double total = 0.0;
  
        
        if(nbPhotocopies <=10 ){
            total = nbPhotocopies *0.1;
        } else if(nbPhotocopies <=30 ){
            total = 1.0 + (nbPhotocopies-10) *0.09;
        } else {
            total = 1.9 + (nbPhotocopies-30) *0.08;
        }
  
        return total;
    }

    public static void main(String[] args) {
        double total = calculTotal(getNbPhotocopies());
        System.out.println("total = " + total);

        String s ="toto";
        
        boolean egal = s.equals("toto");
    }
}
