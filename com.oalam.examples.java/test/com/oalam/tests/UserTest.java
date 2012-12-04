/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oalam.tests;

import serialization.User;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bailett
 */
public class UserTest {
    
    public UserTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void hello() throws FileNotFoundException, IOException, ClassNotFoundException {
     
        FileOutputStream fichier = null;
        ObjectOutputStream oos = null;


        User personne = new User();

        personne.setName("tom");
        personne.setPwd("xxx");


        fichier = new FileOutputStream("personne.ser");
        oos = new ObjectOutputStream(fichier);

        oos.writeObject(personne);
        oos.flush();
        oos.close();

        fichier.close();

        File f = new File("personne2.ser");
        f.createNewFile();

        FileInputStream fichier2 = new FileInputStream("personne2.ser");
        ObjectInputStream ois = new ObjectInputStream(fichier2);

        User personne2 = (User) ois.readObject();
        
        assertTrue("Les users sont différents", personne.getName().equals(personne2.getName()));
      
        // assertSame( );
        
        
       
     }
}
