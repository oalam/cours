/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaces;


/**
 *
 * @author adminl
 */
public class TestImprimables {
    
    public static void main(String[] args) {
        
        Imprimable [] formes = { new Photo(), new Fichier(), new Photo() };
        
        
        
        for (Imprimable f : formes) {
            f.imprimer();
        }
        
    }
}
