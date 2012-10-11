/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adminl
 */
public class NioApiSample {

    public static void main(String[] args) {

        // Creer un Path
        Path p1 = Paths.get("/tmp/foo");
        
       
        try {
            // Creer une hiérachie de répertoires
            Files.createDirectories(Paths.get("D:\\tmp\\plik\\plok"));

        } catch (IOException ex) {
            Logger.getLogger(NioApiSample.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Lister les fichiers d'un répertoire
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("D:\\workspace"))) {
            for (Path file : stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
        }
    }
}
