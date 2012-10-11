/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.abstraction;

/**
 *
 * @author adminl
 */
public class Cercle extends FormeGeometrique {

    float rayon;

    @Override
    public double surface() {
        return FormeGeometrique.PI * rayon * rayon;
    }
}
