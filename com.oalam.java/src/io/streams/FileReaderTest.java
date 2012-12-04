/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HumanBooster
 */
public class FileReaderTest {

    public static void main(String[] args) {


        try (BufferedReader fichier = new BufferedReader(new FileReader("build.xml"))) {
            
            String ligne;
            while ((ligne = fichier.readLine()) != null) {
                System.out.println(ligne);
            }


        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReaderTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReaderTest.class.getName()).log(Level.SEVERE, null, ex);
        } 

        
        
        
        

    }
}
