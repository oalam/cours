/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;

/**
 *
 * @author adminl
 */
public class IoApiSample {

    static void dumpFile(String nomFichier) {
        File fichier = new File(nomFichier);

        if (!fichier.exists()) {
            System.out.println("le fichier " + nomFichier + "n'existe pas");
            return;
        }

        System.out.println(" Nom du fichier    : " + fichier.getName());
        System.out.println(" Chemin du fichier : " + fichier.getPath());
        System.out.println(" Chemin absolu     : " + fichier.getAbsolutePath());
        System.out.println(" Droit de lecture  : " + fichier.canRead());
        System.out.println(" Droit d'ecriture  : " + fichier.canWrite());

        if (fichier.isDirectory()) {
            System.out.println(" contenu du repertoire ");
            String fichiers[] = fichier.list();
            for (int i = 0; i < fichiers.length; i++) {
                System.out.println("  " + fichiers[i]);
            }
        }
    }

    public static void main(String[] args) {
        dumpFile("D:\\workspace\\CoursJava\\");
     
        dumpFile("input.txt");
        dumpFile("..");
    }
}
