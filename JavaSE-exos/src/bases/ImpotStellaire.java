/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.util.Scanner;

/**
 *
 * Les habitants de Zorglub paient l’impôt selon les règles suivantes : - les
 * hommes de plus de 20 ans paient l’impôt - les femmes paient l’impôt si elles
 * ont entre 18 et 35 ans - les autres ne paient pas d’impôt
 *
 * Le programme demandera donc l’âge et le sexe du Zorglubien, et se prononcera
 * donc ensuite sur le fait que l’habitant est imposable
 */
public class ImpotStellaire {

    public static void main(String[] args) {

        // Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Sexe : ");
        String sexe = sc.nextLine();

        boolean imposable = false;

        if (sexe.equalsIgnoreCase("h")) {
            if (age > 20) {
                imposable = true;
            }
        } else {
            if (age > 18 && age < 352) {
                imposable = true;
            }
        }

        System.out.println("imposable = " + imposable);
    }
}
