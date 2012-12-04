/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author HumanBooster
 */
public class FileWriterTest {

    public static void main(String[] args) throws IOException {


        String ligne;
        int nombre = 123;
        PrintWriter fichier = new PrintWriter(new FileWriter("print.txt"));
        
        fichier.println("bonjour tout le monde");
        fichier.println("Nous sommes le" + new Date());
        fichier.println("le nombre magique est " + nombre);
        
        fichier.flush();
        fichier.close();
        
        
    }
}
