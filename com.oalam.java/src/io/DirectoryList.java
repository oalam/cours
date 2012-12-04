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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HumanBooster
 */
public class DirectoryList {

    public static void main(String[] args) {




        Path path = Paths.get("C:\\Users\\Public\\Documents\\com.oalam.examples.java");
        String tmpPath = "c:\\Users\\HumanBooster\\tmp\\" + new Date().getTime() + "\\";
        Path backupPath = Paths.get(tmpPath);
        try {
            // create dir only if not exists
            Files.createDirectory(backupPath);

        } catch (IOException ex) {
            Logger.getLogger(DirectoryList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        copyDir(path, tmpPath);

    }

    private static void copyDir(Path path, String tmpPath) {
        // Lister les fichiers d'un répertoire
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path source : stream) {
                // fabraique le chemin de destination
                Path dest = Paths.get(tmpPath + source.getFileName());

                // copie physique
                Files.copy(source, dest);
                
                // copie les fichiers du sous repertoire
                if(Files.isDirectory(source))
                    copyDir(source, dest.toString() + "\\");
            }
        } catch (IOException | DirectoryIteratorException x) {
// IOException can never be thrown by the iteration.
// In this snippet, it can only be thrown by newDirecto
            System.err.println(x);
        }
    }
}
