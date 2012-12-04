/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

/**
 *
 * @author formation
 */
public class IODemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 = Paths.get("c:workspace");

        if (Files.exists(p1)) {
            System.out.println("existe");
        }

        Path file = Paths.get("c:\\"
                + "workspace");
        //  Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-rw-rw-");
        // FileAttribute<Set<PosixFilePermission>> attrs = PosixFilePermissions.asFileAttribute(perms);

        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
                // plik plok pluk
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


        System.out.println(p1.toString());
        System.out.println(p1.getParent());


        Charset charset = Charset.forName("US-ASCII");
        String s = "zarzerzer\nzerzerzer";

        try (BufferedWriter writer = Files.newBufferedWriter(p1, charset)) {
            writer.write(s, 0, s.length());

        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }




        try (BufferedReader reader = Files.newBufferedReader(p1, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

    
    }
}
        
