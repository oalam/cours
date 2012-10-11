/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.classes;

/**
 *
 * @author adminl
 */
    public class TestPersonne {

    public static void main(String[] args) {

        Personne tom = new Personne("tom");
        
        
        
       
        System.out.println(Personne.getCount());
        
        Personne moussa = new Personne("moussa");

        System.out.println(Personne.getCount());
        
        
        
        tom.presenteToi();
        moussa.presenteToi();
    }
}
