/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.abstraction;

/**
 *
 * @author adminl
 */
class Rectangle extends FormeGeometrique {

    float largeur, hauteur;

    @Override
    public double surface() {
        return largeur * hauteur;
    }
}
