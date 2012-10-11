/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author adminl
 */
public class FileCopier {

    public static void bufferedCopy(String sourceFile, String destinationFile, int bufferSize) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(destinationFile);

        // buffer initialisation
        byte[] buffer = new byte[bufferSize];
        int byteRead;

        // load buffer until byteRead = -1
        while ((byteRead = fis.read(buffer)) != -1) {
            fos.write(buffer);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        long start = System.nanoTime();
        bufferedCopy("Desert.jpg", "Desert2.jpg", 4096);
        long elapsed = System.nanoTime() - start;
        System.out.println("copied in " + elapsed  + " ns");
        
        start = System.nanoTime();
        bufferedCopy("Desert.jpg", "Desert2.jpg", 1);
        elapsed = System.nanoTime() - start;
        System.out.println("copied in " + elapsed  + " ns");
       
    }
    
}
