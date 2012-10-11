/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adminl
 */
public class BufferedFileReader {

    public static void main(String[] args) {

        BufferedReader fichier = null;

        try {
            String ligne;
            fichier = new BufferedReader(new FileReader("input.txt"));
            while ((ligne = fichier.readLine()) != null) {
                System.out.println(ligne);
            }
            fichier.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fichier.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferedFileReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


        PrintWriter fichier2 = null;

        try {
            int nombre = 123;
            fichier2 = new PrintWriter(new FileWriter("print.txt"));
            fichier2.println("bonjour tout le monde");
            fichier2.println("Nous sommes le " + new Date());
            fichier2.println("le nombre magique est " + nombre);
            fichier2.flush();

        } catch (IOException ex) {
            Logger.getLogger(BufferedFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            fichier2.close();

        }

    }
}
