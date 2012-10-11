/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.abstraction;

/**
 *
 * @author adminl
 */
abstract class FormeGeometrique {

    static final double PI = 3.14159;

    abstract double surface();
    
    public void afficher(){
        System.out.println("this = " + this);
    }
}
