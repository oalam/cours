/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.adapter;

/**
 * Implémente l'interface "Standard".
 */
public class ImplStandard implements Standard {

    @Override
    public void operation(int pNombre1, int pNombre2) {
        System.out.println("Standard : Le nombre est : " + (pNombre1 * pNombre2));
    }
}
