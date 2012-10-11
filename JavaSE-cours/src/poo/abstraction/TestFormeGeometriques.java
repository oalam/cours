/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.abstraction;

/**
 *
 * @author adminl
 */
public class TestFormeGeometriques {
    
    
    public static void main(String[] args) {
        
        FormeGeometrique f1 = new Cercle();
        FormeGeometrique f2 = new Rectangle();
        
        f1.surface();
        f2.surface();
        
        
        
        FormeGeometrique [] formes = {f1, f2};
        for (FormeGeometrique f : formes) {
            f.surface();
        }
        
    }
}
